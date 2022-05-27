/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface PreviewHlsPullAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.PreviewHlsPullAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * request hls preview
   * </pre>
   *
   * <code>optional bool enabled = 1 [json_name = "enabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * request hls preview
   * </pre>
   *
   * <code>optional bool enabled = 1 [json_name = "enabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * hls manifest url
   * </pre>
   *
   * <code>optional string url = 2 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * hls manifest url
   * </pre>
   *
   * <code>optional string url = 2 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * hls manifest url
   * </pre>
   *
   * <code>optional string url = 2 [json_name = "url", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}