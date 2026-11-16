/*
---------------------------------------------------------------------------------------------
Copyright (c) Infiniscene, Inc. All rights reserved.
Licensed under the MIT License. See License.txt in the project root for license information.
---------------------------------------------------------------------------------------------
*/
package sdk

import (
	layoutv2 "github.com/golightstream/api.stream-sdk/go/sdk/proto/apis/layout/v2"
	"google.golang.org/grpc"
)

type APIStreamLayoutAPI struct {
	config APIStreamConfig
	dialer *grpc.ClientConn

	layout *layoutv2.LayoutServiceClient
	layer  *layoutv2.LayerServiceClient
}

// GetLayoutService returns an instance of the layout service. This requires an access token for authentication.
func (layoutApi *APIStreamLayoutAPI) GetLayoutService() (layoutv2.LayoutServiceClient, error) {
	if layoutApi.layout == nil {
		client := layoutv2.NewLayoutServiceClient(layoutApi.dialer)
		layoutApi.layout = &client

	}

	return *layoutApi.layout, nil
}

// GetLayerService returns an instance of the layer service. This requires an access token for authentication.
func (layoutApi *APIStreamLayoutAPI) GetLayerService() (layoutv2.LayerServiceClient, error) {
	if layoutApi.layer == nil {
		client := layoutv2.NewLayerServiceClient(layoutApi.dialer)
		layoutApi.layer = &client

	}

	return *layoutApi.layer, nil
}

func (layoutApi *APIStreamLayoutAPI) reload(config APIStreamConfig) {
	layoutApi.config = config
}

func newAPIStreamLayoutAPI(config APIStreamConfig, dialer *grpc.ClientConn) *APIStreamLayoutAPI {
	return &APIStreamLayoutAPI{
		config: config,
		dialer: dialer,
	}
}
