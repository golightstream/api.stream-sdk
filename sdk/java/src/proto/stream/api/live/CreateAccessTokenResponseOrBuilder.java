/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface CreateAccessTokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.CreateAccessTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * access token for owner to be asserted in subsequent Video and Layout API
   * calls
   * </pre>
   *
   * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <pre>
   * access token for owner to be asserted in subsequent Video and Layout API
   * calls
   * </pre>
   *
   * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();
}
