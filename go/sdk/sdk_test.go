package sdk

import (
	"context"
	"net"
	"strings"
	"sync/atomic"
	"testing"

	eventv2 "github.com/golightstream/api.stream-sdk/go/sdk/proto/apis/event/v2"
	layoutv2 "github.com/golightstream/api.stream-sdk/go/sdk/proto/apis/layout/v2"
	livev21 "github.com/golightstream/api.stream-sdk/go/sdk/proto/live/v21"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/metadata"
	"google.golang.org/grpc/status"
)

type countingListener struct {
	net.Listener
	accepted atomic.Int32
}

func (l *countingListener) Accept() (net.Conn, error) {
	conn, err := l.Listener.Accept()
	if err == nil {
		l.accepted.Add(1)
	}

	return conn, err
}

type recordingProjectServer struct {
	livev21.UnimplementedProjectServiceServer
	metadata chan metadata.MD
}

func (s *recordingProjectServer) GetProjectBroadcastStatus(ctx context.Context, _ *livev21.GetProjectBroadcastStatusRequest) (*livev21.GetProjectBroadcastStatusResponse, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	s.metadata <- md

	return &livev21.GetProjectBroadcastStatusResponse{}, nil
}

type recordingEventServer struct {
	eventv2.UnimplementedEventServiceServer
	metadata chan metadata.MD
}

func (s *recordingEventServer) Stream(stream eventv2.EventService_StreamServer) error {
	md, _ := metadata.FromIncomingContext(stream.Context())
	s.metadata <- md

	return nil
}

func startServer(t *testing.T) (*countingListener, *recordingProjectServer) {
	t.Helper()

	inner, err := net.Listen("tcp", "127.0.0.1:0")
	if err != nil {
		t.Fatal(err)
	}

	lis := &countingListener{Listener: inner}
	recorder := &recordingProjectServer{metadata: make(chan metadata.MD, 1)}
	server := grpc.NewServer()
	livev21.RegisterProjectServiceServer(server, recorder)
	eventv2.RegisterEventServiceServer(server, &recordingEventServer{metadata: recorder.metadata})
	go server.Serve(lis)
	t.Cleanup(server.Stop)

	return lis, recorder
}

func newTestClient(t *testing.T, lis net.Listener, config APIStreamConfig) *APIStreamClient {
	t.Helper()

	config.OverrideEndpoint.LiveAPIServer = lis.Addr().String()
	client := NewAPIStreamClient(config)
	t.Cleanup(func() { client.Close() })

	return client
}

func getBroadcastStatus(t *testing.T, client *APIStreamClient, ctx context.Context) error {
	t.Helper()

	project, err := client.GetLiveAPI().GetProjectService()
	if err != nil {
		t.Fatal(err)
	}

	_, err = project.GetProjectBroadcastStatus(ctx, &livev21.GetProjectBroadcastStatusRequest{})

	return err
}

func TestClientSharesOneConnectionOpenedOnFirstCall(t *testing.T) {
	lis, recorder := startServer(t)
	client := newTestClient(t, lis, APIStreamConfig{AccessToken: "token"})

	if got := lis.accepted.Load(); got != 0 {
		t.Fatalf("connections before the first call = %d, want 0", got)
	}

	if err := getBroadcastStatus(t, client, context.Background()); err != nil {
		t.Fatal(err)
	}
	<-recorder.metadata

	layout, err := client.GetLayoutAPI().GetLayoutService()
	if err != nil {
		t.Fatal(err)
	}

	if _, err := layout.ListLayouts(context.Background(), &layoutv2.ListLayoutsRequest{}); status.Code(err) != codes.Unimplemented {
		t.Fatalf("layout call error = %v, want Unimplemented", err)
	}

	if got := lis.accepted.Load(); got != 1 {
		t.Fatalf("connections after live and layout calls = %d, want 1", got)
	}

	if err := client.Close(); err != nil {
		t.Fatal(err)
	}

	if err := getBroadcastStatus(t, client, context.Background()); status.Code(err) != codes.Canceled {
		t.Fatalf("call after Close error = %v, want Canceled", err)
	}
}

func TestAccessTokenIsSentOncePerCall(t *testing.T) {
	lis, recorder := startServer(t)

	tests := []struct {
		name        string
		configToken string
		ctx         context.Context
		want        string
	}{
		{
			name:        "config token",
			configToken: "config-token",
			ctx:         context.Background(),
			want:        "Bearer config-token",
		},
		{
			name: "per-call token without a config token",
			ctx:  WithAccessToken(context.Background(), "call-token"),
			want: "Bearer call-token",
		},
		{
			name:        "per-call token replaces the config token",
			configToken: "config-token",
			ctx:         WithAccessToken(context.Background(), "call-token"),
			want:        "Bearer call-token",
		},
		{
			name:        "existing authorization header replaces the config token",
			configToken: "config-token",
			ctx:         metadata.AppendToOutgoingContext(context.Background(), "authorization", "Bearer header-token"),
			want:        "Bearer header-token",
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			client := newTestClient(t, lis, APIStreamConfig{AccessToken: tt.configToken})

			if err := getBroadcastStatus(t, client, tt.ctx); err != nil {
				t.Fatal(err)
			}

			if got := (<-recorder.metadata).Get("authorization"); len(got) != 1 || got[0] != tt.want {
				t.Fatalf("authorization = %q, want [%q]", got, tt.want)
			}
		})
	}
}

func TestDialOptionsKeepTheSDKHeaders(t *testing.T) {
	lis, recorder := startServer(t)

	var intercepted atomic.Int32
	client := newTestClient(t, lis, APIStreamConfig{
		DialOptions: []grpc.DialOption{
			grpc.WithUserAgent("custom-agent"),
			grpc.WithUnaryInterceptor(func(ctx context.Context, method string, req, reply any, cc *grpc.ClientConn, invoker grpc.UnaryInvoker, opts ...grpc.CallOption) error {
				intercepted.Add(1)
				return invoker(ctx, method, req, reply, cc, opts...)
			}),
		},
	})

	if err := getBroadcastStatus(t, client, WithAccessToken(context.Background(), "token")); err != nil {
		t.Fatal(err)
	}

	md := <-recorder.metadata

	if got := md.Get("user-agent"); len(got) != 1 || !strings.HasPrefix(got[0], "custom-agent") {
		t.Fatalf("user-agent = %q, want prefix custom-agent", got)
	}

	if got := md.Get("authorization"); len(got) != 1 || got[0] != "Bearer token" {
		t.Fatalf("authorization = %q, want [\"Bearer token\"]", got)
	}

	if got := intercepted.Load(); got != 1 {
		t.Fatalf("caller interceptor calls = %d, want 1", got)
	}
}

func TestStreamsSendTheSDKHeaders(t *testing.T) {
	lis, recorder := startServer(t)
	client := newTestClient(t, lis, APIStreamConfig{APIKey: "key"})

	events, err := client.GetEventAPI().GetEventService()
	if err != nil {
		t.Fatal(err)
	}

	stream, err := events.Stream(WithAccessToken(context.Background(), "token"))
	if err != nil {
		t.Fatal(err)
	}
	stream.Recv()

	md := <-recorder.metadata

	if got := md.Get("authorization"); len(got) != 1 || got[0] != "Bearer token" {
		t.Fatalf("authorization = %q, want [\"Bearer token\"]", got)
	}

	if got := md.Get("x-api-key"); len(got) != 1 || got[0] != "key" {
		t.Fatalf("x-api-key = %q, want [\"key\"]", got)
	}
}
