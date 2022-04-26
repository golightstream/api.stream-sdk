/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface SrtPushAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.SrtPushAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * enable source srt push address
   * </pre>
   *
   * <code>optional bool enabled = 1 [json_name = "enabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * enable source srt push address
   * </pre>
   *
   * <code>optional bool enabled = 1 [json_name = "enabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * assigned srt streamid
   * </pre>
   *
   * <code>optional string stream_id = 2 [json_name = "streamId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the streamId field is set.
   */
  boolean hasStreamId();
  /**
   * <pre>
   * assigned srt streamid
   * </pre>
   *
   * <code>optional string stream_id = 2 [json_name = "streamId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The streamId.
   */
  java.lang.String getStreamId();
  /**
   * <pre>
   * assigned srt streamid
   * </pre>
   *
   * <code>optional string stream_id = 2 [json_name = "streamId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for streamId.
   */
  com.google.protobuf.ByteString
      getStreamIdBytes();

  /**
   * <pre>
   * assigned srt destination url
   * </pre>
   *
   * <code>optional string url = 3 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * assigned srt destination url
   * </pre>
   *
   * <code>optional string url = 3 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * assigned srt destination url
   * </pre>
   *
   * <code>optional string url = 3 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * base_url without streamid
   * </pre>
   *
   * <code>optional string base_url = 4 [json_name = "baseUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the baseUrl field is set.
   */
  boolean hasBaseUrl();
  /**
   * <pre>
   * base_url without streamid
   * </pre>
   *
   * <code>optional string base_url = 4 [json_name = "baseUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The baseUrl.
   */
  java.lang.String getBaseUrl();
  /**
   * <pre>
   * base_url without streamid
   * </pre>
   *
   * <code>optional string base_url = 4 [json_name = "baseUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for baseUrl.
   */
  com.google.protobuf.ByteString
      getBaseUrlBytes();
}
