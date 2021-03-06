/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

public interface PartialLayoutOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apis.layout.v2.PartialLayout)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * width of the layer in pixels
   * </pre>
   *
   * <code>optional int32 width = 2 [json_name = "width", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the width field is set.
   */
  boolean hasWidth();
  /**
   * <pre>
   * width of the layer in pixels
   * </pre>
   *
   * <code>optional int32 width = 2 [json_name = "width", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <pre>
   * height of the layer in pixels
   * </pre>
   *
   * <code>optional int32 height = 3 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the height field is set.
   */
  boolean hasHeight();
  /**
   * <pre>
   * height of the layer in pixels
   * </pre>
   *
   * <code>optional int32 height = 3 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The height.
   */
  int getHeight();

  /**
   * <pre>
   * Metadata associated with a layout. This is freeform JSON.
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 6 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Metadata associated with a layout. This is freeform JSON.
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 6 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The metadata.
   */
  com.google.protobuf.Value getMetadata();
  /**
   * <pre>
   * Metadata associated with a layout. This is freeform JSON.
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 6 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.ValueOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Project ID from the Live API for the layout
   * note: this cannot be changed for existing layouts.
   * </pre>
   *
   * <code>optional string project_id = 7 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the projectId field is set.
   */
  boolean hasProjectId();
  /**
   * <pre>
   * Project ID from the Live API for the layout
   * note: this cannot be changed for existing layouts.
   * </pre>
   *
   * <code>optional string project_id = 7 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Project ID from the Live API for the layout
   * note: this cannot be changed for existing layouts.
   * </pre>
   *
   * <code>optional string project_id = 7 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Collection ID from the Live API for the layout
   * note: this cannot be changed once set.
   * </pre>
   *
   * <code>optional string collection_id = 8 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the collectionId field is set.
   */
  boolean hasCollectionId();
  /**
   * <pre>
   * Collection ID from the Live API for the layout
   * note: this cannot be changed once set.
   * </pre>
   *
   * <code>optional string collection_id = 8 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * Collection ID from the Live API for the layout
   * note: this cannot be changed once set.
   * </pre>
   *
   * <code>optional string collection_id = 8 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * The type of layout to use.
   * Typically you should use LAYOUT_TYPE_SCENE to manage layouts via the API. This automatically
   * creates a "root" layer for all layers to be under.
   * LAYOUT_TYPE_SCENELESS is used for layouts managed by the Studio SDK.
   * </pre>
   *
   * <code>optional .apis.layout.v2.LayoutType type = 9 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The type of layout to use.
   * Typically you should use LAYOUT_TYPE_SCENE to manage layouts via the API. This automatically
   * creates a "root" layer for all layers to be under.
   * LAYOUT_TYPE_SCENELESS is used for layouts managed by the Studio SDK.
   * </pre>
   *
   * <code>optional .apis.layout.v2.LayoutType type = 9 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of layout to use.
   * Typically you should use LAYOUT_TYPE_SCENE to manage layouts via the API. This automatically
   * creates a "root" layer for all layers to be under.
   * LAYOUT_TYPE_SCENELESS is used for layouts managed by the Studio SDK.
   * </pre>
   *
   * <code>optional .apis.layout.v2.LayoutType type = 9 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The type.
   */
  stream.api.layout.LayoutType getType();

  /**
   * <pre>
   * Transitions to apply when switching to this scene from another
   * note: this is only available for layouts of type `LAYOUT_TYPE_SCENE`.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Transition transitions = 10 [json_name = "transitions"];</code>
   */
  java.util.List<stream.api.layout.Transition> 
      getTransitionsList();
  /**
   * <pre>
   * Transitions to apply when switching to this scene from another
   * note: this is only available for layouts of type `LAYOUT_TYPE_SCENE`.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Transition transitions = 10 [json_name = "transitions"];</code>
   */
  stream.api.layout.Transition getTransitions(int index);
  /**
   * <pre>
   * Transitions to apply when switching to this scene from another
   * note: this is only available for layouts of type `LAYOUT_TYPE_SCENE`.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Transition transitions = 10 [json_name = "transitions"];</code>
   */
  int getTransitionsCount();
  /**
   * <pre>
   * Transitions to apply when switching to this scene from another
   * note: this is only available for layouts of type `LAYOUT_TYPE_SCENE`.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Transition transitions = 10 [json_name = "transitions"];</code>
   */
  java.util.List<? extends stream.api.layout.TransitionOrBuilder> 
      getTransitionsOrBuilderList();
  /**
   * <pre>
   * Transitions to apply when switching to this scene from another
   * note: this is only available for layouts of type `LAYOUT_TYPE_SCENE`.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Transition transitions = 10 [json_name = "transitions"];</code>
   */
  stream.api.layout.TransitionOrBuilder getTransitionsOrBuilder(
      int index);

  /**
   * <pre>
   * Metadata associated with the publishing of the event
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 101 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   * <pre>
   * Metadata associated with the publishing of the event
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 101 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The requestMetadata.
   */
  com.google.protobuf.Value getRequestMetadata();
  /**
   * <pre>
   * Metadata associated with the publishing of the event
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 101 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.ValueOrBuilder getRequestMetadataOrBuilder();
}
