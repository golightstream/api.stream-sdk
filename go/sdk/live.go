/*
---------------------------------------------------------------------------------------------
Copyright (c) Infiniscene, Inc. All rights reserved.
Licensed under the MIT License. See License.txt in the project root for license information.
---------------------------------------------------------------------------------------------
*/
package sdk

import (
	"errors"

	livev21 "github.com/golightstream/api.stream-sdk/go/sdk/proto/live/v21"
	"google.golang.org/grpc"
)

type APIStreamLiveAPI struct {
	config APIStreamConfig
	dialer *grpc.ClientConn

	// API Key
	account               *livev21.AccountServiceClient
	publicAuthentication  *livev21.PublicAuthenticationServiceClient
	backendAuthentication *livev21.BackendAuthenticationServiceClient
	accountConfiguration  *livev21.AccountConfigurationServiceClient

	// Access Token
	collection     *livev21.CollectionServiceClient
	project        *livev21.ProjectServiceClient
	source         *livev21.SourceServiceClient
	destination    *livev21.DestinationServiceClient
	authentication *livev21.AuthenticationServiceClient
}

// GetAccountService returns an instance of account service. This requires API Key authentication
func (liveApi *APIStreamLiveAPI) GetAccountService() (livev21.AccountServiceClient, error) {
	if !hasAPIKey(liveApi.config) {
		return nil, errors.New("missing api.stream api key")
	}

	if liveApi.account == nil {
		client := livev21.NewAccountServiceClient(liveApi.dialer)
		liveApi.account = &client

	}

	return *liveApi.account, nil
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

// GetAccountConfigurationService returns an instance of the account configuration service. This requires API Key authentication
func (liveApi *APIStreamLiveAPI) GetAccountConfigurationService() (livev21.AccountConfigurationServiceClient, error) {
	if !hasAPIKey(liveApi.config) {
		return nil, errors.New("missing api.stream api key")
	}

	if liveApi.publicAuthentication == nil {
		client := livev21.NewAccountConfigurationServiceClient(liveApi.dialer)
		liveApi.accountConfiguration = &client

	}

	return *liveApi.accountConfiguration, nil
}

// GetCollectionService returns an instance of the collection service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetCollectionService() (livev21.CollectionServiceClient, error) {
	if liveApi.collection == nil {
		client := livev21.NewCollectionServiceClient(liveApi.dialer)
		liveApi.collection = &client

	}

	return *liveApi.collection, nil
}

// GetProjectService returns an instance of the project service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetProjectService() (livev21.ProjectServiceClient, error) {
	if liveApi.project == nil {
		client := livev21.NewProjectServiceClient(liveApi.dialer)
		liveApi.project = &client

	}

	return *liveApi.project, nil
}

// GetSourceService returns an instance of the source service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetSourceService() (livev21.SourceServiceClient, error) {
	if liveApi.source == nil {
		client := livev21.NewSourceServiceClient(liveApi.dialer)
		liveApi.source = &client
	}

	return *liveApi.source, nil
}

// GetDestinationService returns an instance of the destination service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetDestinationService() (livev21.DestinationServiceClient, error) {
	if liveApi.destination == nil {
		client := livev21.NewDestinationServiceClient(liveApi.dialer)
		liveApi.destination = &client
	}

	return *liveApi.destination, nil
}

// GetAuthenticationService returns an instance of the authentication service. This requires an access token for authentication.
func (liveApi *APIStreamLiveAPI) GetAuthenticationService() (livev21.AuthenticationServiceClient, error) {
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
		liveApi.accountConfiguration = nil
		liveApi.account = nil
	}
}

func newAPIStreamLiveAPI(config APIStreamConfig, dialer *grpc.ClientConn) *APIStreamLiveAPI {
	return &APIStreamLiveAPI{
		config: config,
		dialer: dialer,
	}
}
