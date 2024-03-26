/*
---------------------------------------------------------------------------------------------
Copyright (c) Infiniscene, Inc. All rights reserved.
Licensed under the MIT License. See License.txt in the project root for license information.
---------------------------------------------------------------------------------------------
*/
package sdk

import (
	"context"
	"errors"
	livev21 "github.com/golightstream/api.stream-sdk/go/sdk/proto/live/v21"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials/insecure"
	"google.golang.org/grpc/metadata"
	"log"
	"strings"
)

type APIStreamLiveAPI struct {
	config APIStreamConfig
	dialer *grpc.ClientConn

	// API Key
	publicAuthentication  *livev21.PublicAuthenticationServiceClient
	backendAuthentication *livev21.BackendAuthenticationServiceClient

	// Access Token
	collection     *livev21.CollectionServiceClient
	project        *livev21.ProjectServiceClient
	source         *livev21.SourceServiceClient
	destination    *livev21.DestinationServiceClient
	authentication *livev21.AuthenticationServiceClient
}

// GetPublicAuthenticationService returns an instance of the public authentication service. This requires API Key authentication
func (liveApi *APIStreamLiveAPI) GetPublicAuthenticationService() (livev21.PublicAuthenticationServiceClient, error) {
	if !hasAPIKey(liveApi.config) {
		return nil, errors.New("missing api.stream api key")
	}

	if liveApi.publicAuthentication == nil {
		client := livev21.NewPublicAuthenticationServiceClient(liveApi.dialer)
		liveApi.publicAuthentication = &client

	}

	return *liveApi.publicAuthentication, nil
}

// GetBackendAuthenticationService returns an instance of the backend authentication service. This requires API Key authentication
func (liveApi *APIStreamLiveAPI) GetBackendAuthenticationService() (livev21.BackendAuthenticationServiceClient, error) {
	if !hasAPIKey(liveApi.config) {
		return nil, errors.New("missing api.stream api key")
	}

	if liveApi.publicAuthentication == nil {
		client := livev21.NewBackendAuthenticationServiceClient(liveApi.dialer)
		liveApi.backendAuthentication = &client

	}

	return *liveApi.backendAuthentication, nil
}

// GetCollectionService returns an instance of the collection service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetCollectionService() (livev21.CollectionServiceClient, error) {
	if !hasAccessToken(liveApi.config) {
		return nil, errors.New("missing api.stream access token")
	}

	if liveApi.collection == nil {
		client := livev21.NewCollectionServiceClient(liveApi.dialer)
		liveApi.collection = &client

	}

	return *liveApi.collection, nil
}

// GetProjectService returns an instance of the project service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetProjectService() (livev21.ProjectServiceClient, error) {
	if !hasAccessToken(liveApi.config) {
		return nil, errors.New("missing api.stream access token")
	}

	if liveApi.project == nil {
		client := livev21.NewProjectServiceClient(liveApi.dialer)
		liveApi.project = &client

	}

	return *liveApi.project, nil
}

// GetSourceService returns an instance of the source service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetSourceService() (livev21.SourceServiceClient, error) {
	if !hasAccessToken(liveApi.config) {
		return nil, errors.New("missing api.stream access token")
	}

	if liveApi.source == nil {
		client := livev21.NewSourceServiceClient(liveApi.dialer)
		liveApi.source = &client
	}

	return *liveApi.source, nil
}

// GetDestinationService returns an instance of the destination service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetDestinationService() (livev21.DestinationServiceClient, error) {
	if !hasAccessToken(liveApi.config) {
		return nil, errors.New("missing api.stream access token")
	}

	if liveApi.destination == nil {
		client := livev21.NewDestinationServiceClient(liveApi.dialer)
		liveApi.destination = &client
	}

	return *liveApi.destination, nil
}

// GetAuthenticationService returns an instance of the authentication service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetAuthenticationService() (livev21.AuthenticationServiceClient, error) {
	if !hasAccessToken(liveApi.config) {
		return nil, errors.New("missing api.stream access token")
	}

	if liveApi.authentication == nil {
		client := livev21.NewAuthenticationServiceClient(liveApi.dialer)
		liveApi.authentication = &client

	}

	return *liveApi.authentication, nil
}

func (liveApi *APIStreamLiveAPI) reload(config APIStreamConfig) {
	liveApi.config = config

	// cleanup apikey clients that once existed
	if liveApi.config.APIKey == "" {
		liveApi.publicAuthentication = nil
		liveApi.backendAuthentication = nil
	}

	// cleanup access token clients that once existed
	if liveApi.config.AccessToken == "" {
		liveApi.collection = nil
		liveApi.project = nil
		liveApi.source = nil
		liveApi.destination = nil
		liveApi.authentication = nil
	}
}

func newAPIStreamLiveAPI(config APIStreamConfig) *APIStreamLiveAPI {
	api := &APIStreamLiveAPI{
		config: config,
	}

	dial, err := grpc.Dial(
		getLiveApiServer(config),
		grpc.WithTransportCredentials(insecure.NewCredentials()),
		grpc.WithUnaryInterceptor(func(ctx context.Context, method string, req, reply any, cc *grpc.ClientConn, invoker grpc.UnaryInvoker, opts ...grpc.CallOption) error {
			mtd, hasCtx := metadata.FromOutgoingContext(ctx)

			if !hasCtx {
				mtd = metadata.New(map[string]string{})
			}

			// Only send the API key for relevant services
			if strings.Contains(method, "BackendAuthentication") || strings.Contains(method, "PublicAuthentication") {
				if api.config.APIKey != "" {
					mtd.Append("x-api-key", api.config.APIKey)
				}
			} else {
				if api.config.AccessToken != "" {
					mtd.Append("authorization", "Bearer "+api.config.AccessToken)
				}
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
