/*
---------------------------------------------------------------------------------------------
Copyright (c) Infiniscene, Inc. All rights reserved.
Licensed under the MIT License. See License.txt in the project root for license information.
---------------------------------------------------------------------------------------------
*/
package sdk

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
}

type APIStreamClient struct {
	config  APIStreamConfig
	liveApi *APIStreamLiveAPI
}

func (client *APIStreamClient) GetLiveAPI() *APIStreamLiveAPI {
	return client.liveApi
}

func (client *APIStreamClient) Load(token string) {
	client.config.AccessToken = token
	client.liveApi.reload(client.config)
}

// NewAPIStreamClient returns a new instance of the API.stream client
func NewAPIStreamClient(config APIStreamConfig) *APIStreamClient {
	if config.Env == "" {
		config.Env = "prod"
	}

	return &APIStreamClient{config: config, liveApi: newAPIStreamLiveAPI(config)}
}
