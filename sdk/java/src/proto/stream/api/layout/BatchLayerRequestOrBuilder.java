/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

public interface BatchLayerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apis.layout.v2.BatchLayerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The layout all requests interact with.
   * </pre>
   *
   * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The layoutId.
   */
  java.lang.String getLayoutId();
  /**
   * <pre>
   * The layout all requests interact with.
   * </pre>
   *
   * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for layoutId.
   */
  com.google.protobuf.ByteString
      getLayoutIdBytes();

  /**
   * <pre>
   * List of layers to update
   * </pre>
   *
   * <code>repeated .apis.layout.v2.BatchLayerRequest.BatchItem layers = 2 [json_name = "layers"];</code>
   */
  java.util.List<stream.api.layout.BatchLayerRequest.BatchItem> 
      getLayersList();
  /**
   * <pre>
   * List of layers to update
   * </pre>
   *
   * <code>repeated .apis.layout.v2.BatchLayerRequest.BatchItem layers = 2 [json_name = "layers"];</code>
   */
  stream.api.layout.BatchLayerRequest.BatchItem getLayers(int index);
  /**
   * <pre>
   * List of layers to update
   * </pre>
   *
   * <code>repeated .apis.layout.v2.BatchLayerRequest.BatchItem layers = 2 [json_name = "layers"];</code>
   */
  int getLayersCount();
  /**
   * <pre>
   * List of layers to update
   * </pre>
   *
   * <code>repeated .apis.layout.v2.BatchLayerRequest.BatchItem layers = 2 [json_name = "layers"];</code>
   */
  java.util.List<? extends stream.api.layout.BatchLayerRequest.BatchItemOrBuilder> 
      getLayersOrBuilderList();
  /**
   * <pre>
   * List of layers to update
   * </pre>
   *
   * <code>repeated .apis.layout.v2.BatchLayerRequest.BatchItem layers = 2 [json_name = "layers"];</code>
   */
  stream.api.layout.BatchLayerRequest.BatchItemOrBuilder getLayersOrBuilder(
      int index);

  /**
   * <pre>
   * Metadata sent with the request
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 100 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   * <pre>
   * Metadata sent with the request
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 100 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The requestMetadata.
   */
  com.google.protobuf.Value getRequestMetadata();
  /**
   * <pre>
   * Metadata sent with the request
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 100 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.ValueOrBuilder getRequestMetadataOrBuilder();

  /**
   * <pre>
   * Order in which layer animations are applied in the batch.
   * </pre>
   *
   * <code>optional .apis.layout.v2.RequestAnimationMode request_animation_mode = 101 [json_name = "requestAnimationMode"];</code>
   * @return Whether the requestAnimationMode field is set.
   */
  boolean hasRequestAnimationMode();
  /**
   * <pre>
   * Order in which layer animations are applied in the batch.
   * </pre>
   *
   * <code>optional .apis.layout.v2.RequestAnimationMode request_animation_mode = 101 [json_name = "requestAnimationMode"];</code>
   * @return The enum numeric value on the wire for requestAnimationMode.
   */
  int getRequestAnimationModeValue();
  /**
   * <pre>
   * Order in which layer animations are applied in the batch.
   * </pre>
   *
   * <code>optional .apis.layout.v2.RequestAnimationMode request_animation_mode = 101 [json_name = "requestAnimationMode"];</code>
   * @return The requestAnimationMode.
   */
  stream.api.layout.RequestAnimationMode getRequestAnimationMode();
}
