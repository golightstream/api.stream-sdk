/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface CreateGuestAccessTokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.CreateGuestAccessTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id of the collection this token is allowed to access
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * id of the collection this token is allowed to access
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * id of the project this token is allowed to access
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * id of the project this token is allowed to access
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * requested duration (ms) of token before it expires
   * </pre>
   *
   * <code>optional uint32 max_duration = 3 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the maxDuration field is set.
   */
  boolean hasMaxDuration();
  /**
   * <pre>
   * requested duration (ms) of token before it expires
   * </pre>
   *
   * <code>optional uint32 max_duration = 3 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The maxDuration.
   */
  int getMaxDuration();

  /**
   * <pre>
   * the requested role of the guest
   * </pre>
   *
   * <code>.live.v21.Role role = 4 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <pre>
   * the requested role of the guest
   * </pre>
   *
   * <code>.live.v21.Role role = 4 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The role.
   */
  stream.api.live.Role getRole();

  /**
   * <pre>
   * the type of token
   * </pre>
   *
   * <code>.live.v21.GuestAccessToken token = 5 [json_name = "token", (.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <pre>
   * the type of token
   * </pre>
   *
   * <code>.live.v21.GuestAccessToken token = 5 [json_name = "token", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The token.
   */
  stream.api.live.GuestAccessToken getToken();
  /**
   * <pre>
   * the type of token
   * </pre>
   *
   * <code>.live.v21.GuestAccessToken token = 5 [json_name = "token", (.google.api.field_behavior) = REQUIRED];</code>
   */
  stream.api.live.GuestAccessTokenOrBuilder getTokenOrBuilder();

  /**
   * <pre>
   * request a shortened url
   * </pre>
   *
   * <code>optional string url = 6 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * request a shortened url
   * </pre>
   *
   * <code>optional string url = 6 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * request a shortened url
   * </pre>
   *
   * <code>optional string url = 6 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
