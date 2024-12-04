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
	"log"
	"strings"

	eventv2 "github.com/golightstream/api.stream-sdk/go/sdk/proto/apis/event/v2"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/credentials/insecure"
	"google.golang.org/grpc/metadata"
)

type APIStreamEventAPI struct {
	config APIStreamConfig
	dialer *grpc.ClientConn

	event   *eventv2.EventServiceClient
	history *eventv2.HistoryServiceClient
	webhook *eventv2.WebhookServiceClient
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

// GetWebhookService returns an instance of the webhook service. This requires an apikey for authentication.
func (eventApi *APIStreamEventAPI) GetWebhookService() (eventv2.WebhookServiceClient, error) {
	if !hasAPIKey(eventApi.config) {
		return nil, errors.New("missing api.stream api key")
	}

	if eventApi.webhook == nil {
		client := eventv2.NewWebhookServiceClient(eventApi.dialer)
		eventApi.webhook = &client

	}

	return *eventApi.webhook, nil
}

// GetHistoryService returns an instance of the event history service. This requires an apikey for authentication.
func (eventApi *APIStreamEventAPI) GetHistoryService() (eventv2.HistoryServiceClient, error) {
	if !hasAPIKey(eventApi.config) {
		return nil, errors.New("missing api.stream api key")
	}

	if eventApi.webhook == nil {
		client := eventv2.NewHistoryServiceClient(eventApi.dialer)
		eventApi.history = &client

	}

	return *eventApi.history, nil
}

func (eventApi *APIStreamEventAPI) reload(config APIStreamConfig) {
	eventApi.config = config

	// cleanup access token clients that once existed
	if eventApi.config.AccessToken == "" {
		eventApi.event = nil
	}

	if eventApi.config.APIKey == "" {
		eventApi.webhook = nil
		eventApi.history = nil
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
			return config.UnaryInterceptor(ctx, method, req, reply, cc, func(ctx context.Context, method string, req, reply any, cc *grpc.ClientConn, opts ...grpc.CallOption) error {
				mtd, hasCtx := metadata.FromOutgoingContext(ctx)

				if !hasCtx {
					mtd = metadata.New(map[string]string{})
				}

				if api.config.APIKey != "" {
					mtd.Append("x-api-key", api.config.APIKey)
				}

				if api.config.AccessToken != "" {
					mtd.Append("authorization", "Bearer "+api.config.AccessToken)
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
				return invoker(metadata.NewOutgoingContext(ctx, mtd), method, req, reply, cc, opts...)
			}, opts...)
		}),
	)

	if err != nil {
		log.Println(err, "unable to create dialer")
	}

	api.dialer = dial

	return api
}
