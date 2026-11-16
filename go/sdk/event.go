/*
---------------------------------------------------------------------------------------------
Copyright (c) Infiniscene, Inc. All rights reserved.
Licensed under the MIT License. See License.txt in the project root for license information.
---------------------------------------------------------------------------------------------
*/
package sdk

import (
	"errors"

	eventv2 "github.com/golightstream/api.stream-sdk/go/sdk/proto/apis/event/v2"
	"google.golang.org/grpc"
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

	if eventApi.config.APIKey == "" {
		eventApi.webhook = nil
		eventApi.history = nil
	}
}

func newAPIStreamEventAPI(config APIStreamConfig, dialer *grpc.ClientConn) *APIStreamEventAPI {
	return &APIStreamEventAPI{
		config: config,
		dialer: dialer,
	}
}
