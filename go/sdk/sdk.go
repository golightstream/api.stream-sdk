/*
---------------------------------------------------------------------------------------------
Copyright (c) Infiniscene, Inc. All rights reserved.
Licensed under the MIT License. See License.txt in the project root for license information.
---------------------------------------------------------------------------------------------
*/
package sdk

import (
	"context"
	"google.golang.org/grpc"
	"runtime/debug"
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
}

type APIStreamClient struct {
	config    APIStreamConfig
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

	return &APIStreamClient{config: config, liveApi: newAPIStreamLiveAPI(config), layoutApi: newAPIStreamLayoutAPI(config), eventApi: newAPIStreamEventAPI(config)}
}
