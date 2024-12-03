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
	layoutv2 "github.com/golightstream/api.stream-sdk/go/sdk/proto/apis/layout/v2"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/credentials/insecure"
	"google.golang.org/grpc/metadata"
	"log"
	"strings"
)

type APIStreamLayoutAPI struct {
	config APIStreamConfig
	dialer *grpc.ClientConn

	layout *layoutv2.LayoutServiceClient
	layer  *layoutv2.LayerServiceClient
}

// GetLayoutService returns an instance of the layout service. This requires an access token for authentication.
func (layoutApi *APIStreamLayoutAPI) GetLayoutService() (layoutv2.LayoutServiceClient, error) {
	if !hasAccessToken(layoutApi.config) {
		return nil, errors.New("missing api.stream access token")
	}

	if layoutApi.layout == nil {
		client := layoutv2.NewLayoutServiceClient(layoutApi.dialer)
		layoutApi.layout = &client

	}

	return *layoutApi.layout, nil
}

// GetLayerService returns an instance of the layer service. This requires an access token for authentication.
func (layoutApi *APIStreamLayoutAPI) GetLayerService() (layoutv2.LayerServiceClient, error) {
	if !hasAccessToken(layoutApi.config) {
		return nil, errors.New("missing api.stream access token")
	}

	if layoutApi.layer == nil {
		client := layoutv2.NewLayerServiceClient(layoutApi.dialer)
		layoutApi.layer = &client

	}

	return *layoutApi.layer, nil
}

func (layoutApi *APIStreamLayoutAPI) reload(config APIStreamConfig) {
	layoutApi.config = config

	// cleanup access token clients that once existed
	if layoutApi.config.AccessToken == "" {
		layoutApi.layout = nil
		layoutApi.layer = nil
	}
}

func newAPIStreamLayoutAPI(config APIStreamConfig) *APIStreamLayoutAPI {
	api := &APIStreamLayoutAPI{
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

				// Only send the API key for relevant services
				if api.config.AccessToken != "" {
					mtd.Append("authorization", "Bearer "+api.config.AccessToken)
				}

				mtd.Append("ClientType", "golang")
				if config.clientVersion != "" {
					mtd.Append("Version", config.clientVersion)
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
