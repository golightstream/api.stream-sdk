/*
---------------------------------------------------------------------------------------------
Copyright (c) Infiniscene, Inc. All rights reserved.
Licensed under the MIT License. See License.txt in the project root for license information.
---------------------------------------------------------------------------------------------
*/
package sdk

var LiveAPIServers = map[Environment]string{
	"local": "localhost:8090",
	"stage": "live.silly.horse:443",
	"prod":  "live.api.stream:443",
}

func hasAPIKey(config APIStreamConfig) bool {
	return config.APIKey != ""
}

func hasAccessToken(config APIStreamConfig) bool {
	return config.AccessToken != ""
}

func getLiveApiServer(config APIStreamConfig) string {
	if config.OverrideEndpoint.LiveAPIServer != "" {
		return config.OverrideEndpoint.LiveAPIServer
	}

	if val, ok := LiveAPIServers[config.Env]; ok {
		return val
	}

	return LiveAPIServers["prod"]
}
