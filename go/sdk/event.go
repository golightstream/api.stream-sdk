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
	"errors"
	eventv2 "github.com/golightstream/api.stream-sdk/go/sdk/proto/apis/event/v2"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/credentials/insecure"
	"google.golang.org/grpc/metadata"
	"log"
	"strings"
)

type APIStreamEventAPI struct {
	config APIStreamConfig
	dialer *grpc.ClientConn

	event *eventv2.EventServiceClient
}

// GetEventService returns an instance of the event service. This requires an access token for authentication.
func (eventApi *APIStreamEventAPI) GetEventService() (eventv2.EventServiceClient, error) {
	if !hasAccessToken(eventApi.config) {
		return nil, errors.New("missing api.stream access token")
	}

	if eventApi.event == nil {
		client := eventv2.NewEventServiceClient(eventApi.dialer)
		eventApi.event = &client

	}

	return *eventApi.event, nil
}

func (eventApi *APIStreamEventAPI) reload(config APIStreamConfig) {
	eventApi.config = config

	// cleanup access token clients that once existed
	if eventApi.config.AccessToken == "" {
		eventApi.event = nil
	}
}

func newAPIStreamEventAPI(config APIStreamConfig) *APIStreamEventAPI {
	api := &APIStreamEventAPI{
		config: config,
	}

	transport := insecure.NewCredentials()

	// If port 443 is used, enforce tls
	if strings.Contains(getLiveApiServer(config), ":443") {
		transport = credentials.NewTLS(&tls.Config{})
	}

	dial, err := grpc.Dial(
		getLiveApiServer(config),
		grpc.WithTransportCredentials(transport),
		grpc.WithUnaryInterceptor(func(ctx context.Context, method string, req, reply any, cc *grpc.ClientConn, invoker grpc.UnaryInvoker, opts ...grpc.CallOption) error {
			mtd, hasCtx := metadata.FromOutgoingContext(ctx)

			if !hasCtx {
				mtd = metadata.New(map[string]string{})
			}

			// Only send the API key for relevant services
			if api.config.AccessToken != "" {
				mtd.Append("authorization", "Bearer "+api.config.AccessToken)
			}

			return invoker(metadata.NewOutgoingContext(ctx, mtd), method, req, reply, cc, opts...)
		}),
	)

	if err != nil {
		log.Println(err, "unable to create dialer")
	}

	api.dialer = dial

	return api
}
