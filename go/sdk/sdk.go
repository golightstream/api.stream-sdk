/*
---------------------------------------------------------------------------------------------
Copyright (c) Infiniscene, Inc. All rights reserved.
Licensed under the MIT License. See License.txt in the project root for license information.
---------------------------------------------------------------------------------------------
*/
package sdk

import (
	"context"
	"crypto/tls"
	"log"
	"runtime/debug"
	"strings"

	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/credentials/insecure"
	"google.golang.org/grpc/metadata"
)

type Environment string

const (
	EnvStage Environment = "stage"
	EnvProd  Environment = "prod"
	EnvDev   Environment = "dev"
)

type APIStreamConfigOverrides struct {
	LiveAPIServer string
}

type APIStreamConfig struct {
	// The API key to use, only required if completing actions requiring API Key access.
	APIKey      string
	AccessToken string

	// The environment to uss, defaults to prod
	Env Environment

	OverrideEndpoint APIStreamConfigOverrides

	// A list of feature overrides to enable within the target api.
	FeatureOverrides []string

	clientVersion string

	// Optional: An interceptor to apply for unary grpc requests. This can be used to enable tracing.
	UnaryInterceptor grpc.UnaryClientInterceptor

	DialOptions []grpc.DialOption
}

type APIStreamClient struct {
	config    APIStreamConfig
	conn      *grpc.ClientConn
	liveApi   *APIStreamLiveAPI
	layoutApi *APIStreamLayoutAPI
	eventApi  *APIStreamEventAPI
}

func (client *APIStreamClient) GetLiveAPI() *APIStreamLiveAPI {
	return client.liveApi
}

func (client *APIStreamClient) GetEventAPI() *APIStreamEventAPI {
	return client.eventApi
}

func (client *APIStreamClient) GetLayoutAPI() *APIStreamLayoutAPI {
	return client.layoutApi
}

func (client *APIStreamClient) Load(token string) {
	client.config.AccessToken = token
	client.eventApi.reload(client.config)
	client.layoutApi.reload(client.config)
	client.liveApi.reload(client.config)
}

func (client *APIStreamClient) Close() error {
	if client.conn == nil {
		return nil
	}

	return client.conn.Close()
}

type accessTokenKey struct{}

func WithAccessToken(ctx context.Context, token string) context.Context {
	return context.WithValue(ctx, accessTokenKey{}, token)
}

// NewAPIStreamClient returns a new instance of the API.stream client
func NewAPIStreamClient(config APIStreamConfig) *APIStreamClient {
	if config.Env == "" {
		config.Env = "prod"
	}

	if config.FeatureOverrides == nil {
		config.FeatureOverrides = []string{}
	}

	if config.UnaryInterceptor == nil {
		config.UnaryInterceptor = func(ctx context.Context, method string, req, reply interface{}, cc *grpc.ClientConn, invoker grpc.UnaryInvoker, opts ...grpc.CallOption) error {
			return invoker(ctx, method, req, reply, cc, opts...)
		}
	}

	bi, ok := debug.ReadBuildInfo()

	if ok {
		config.clientVersion = bi.Main.Version
	}

	client := &APIStreamClient{config: config}
	client.conn = client.connect()
	client.liveApi = newAPIStreamLiveAPI(config, client.conn)
	client.layoutApi = newAPIStreamLayoutAPI(config, client.conn)
	client.eventApi = newAPIStreamEventAPI(config, client.conn)

	return client
}

func (client *APIStreamClient) connect() *grpc.ClientConn {
	server := getLiveApiServer(client.config)
	transport := insecure.NewCredentials()

	if strings.Contains(server, ":443") {
		transport = credentials.NewTLS(&tls.Config{})
	}

	options := append([]grpc.DialOption{
		grpc.WithTransportCredentials(transport),
		grpc.WithChainUnaryInterceptor(client.intercept),
		grpc.WithChainStreamInterceptor(client.interceptStream),
	}, client.config.DialOptions...)

	conn, err := grpc.NewClient(server, options...)
	if err != nil {
		log.Println(err, "unable to create dialer")
	}

	return conn
}

func (client *APIStreamClient) intercept(ctx context.Context, method string, req, reply any, cc *grpc.ClientConn, invoker grpc.UnaryInvoker, opts ...grpc.CallOption) error {
	return client.config.UnaryInterceptor(ctx, method, req, reply, cc, func(ctx context.Context, method string, req, reply any, cc *grpc.ClientConn, opts ...grpc.CallOption) error {
		return invoker(client.withHeaders(ctx), method, req, reply, cc, opts...)
	}, opts...)
}

func (client *APIStreamClient) interceptStream(ctx context.Context, desc *grpc.StreamDesc, cc *grpc.ClientConn, method string, streamer grpc.Streamer, opts ...grpc.CallOption) (grpc.ClientStream, error) {
	return streamer(client.withHeaders(ctx), desc, cc, method, opts...)
}

func (client *APIStreamClient) withHeaders(ctx context.Context) context.Context {
	config := client.config
	mtd, hasCtx := metadata.FromOutgoingContext(ctx)

	if !hasCtx {
		mtd = metadata.New(map[string]string{})
	}

	if config.APIKey != "" {
		mtd.Append("x-api-key", config.APIKey)
	}

	if token, ok := ctx.Value(accessTokenKey{}).(string); ok && token != "" {
		mtd.Set("authorization", "Bearer "+token)
	} else if config.AccessToken != "" && len(mtd.Get("authorization")) == 0 {
		mtd.Append("authorization", "Bearer "+config.AccessToken)
	}

	mtd.Append("ClientType", "golang")
	mtd.Append("apistream-sdk-type", "golang")

	if config.clientVersion != "" {
		mtd.Append("Version", config.clientVersion)
		mtd.Append("apistream-sdk-version", config.clientVersion)
	}

	if len(config.FeatureOverrides) > 0 {
		mtd.Append("apistream-feature-overrides", config.FeatureOverrides...)
	}

	return metadata.NewOutgoingContext(ctx, mtd)
}
