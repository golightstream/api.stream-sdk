/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface CreateProjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.CreateProjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * collection which will own this project
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * collection which will own this project
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * arbitrary metadata to associate with this project
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 2 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * arbitrary metadata to associate with this project
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 2 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The metadata.
   */
  com.google.protobuf.Value getMetadata();
  /**
   * <pre>
   * arbitrary metadata to associate with this project
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 2 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.ValueOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * composition parameters
   * </pre>
   *
   * <code>optional .live.v21.Rendering rendering = 3 [json_name = "rendering", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the rendering field is set.
   */
  boolean hasRendering();
  /**
   * <pre>
   * composition parameters
   * </pre>
   *
   * <code>optional .live.v21.Rendering rendering = 3 [json_name = "rendering", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The rendering.
   */
  stream.api.live.Rendering getRendering();
  /**
   * <pre>
   * composition parameters
   * </pre>
   *
   * <code>optional .live.v21.Rendering rendering = 3 [json_name = "rendering", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  stream.api.live.RenderingOrBuilder getRenderingOrBuilder();

  /**
   * <pre>
   * encoding parameters
   * </pre>
   *
   * <code>optional .live.v21.Encoding encoding = 4 [json_name = "encoding", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the encoding field is set.
   */
  boolean hasEncoding();
  /**
   * <pre>
   * encoding parameters
   * </pre>
   *
   * <code>optional .live.v21.Encoding encoding = 4 [json_name = "encoding", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The encoding.
   */
  stream.api.live.Encoding getEncoding();
  /**
   * <pre>
   * encoding parameters
   * </pre>
   *
   * <code>optional .live.v21.Encoding encoding = 4 [json_name = "encoding", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  stream.api.live.EncodingOrBuilder getEncodingOrBuilder();

  /**
   * <pre>
   * composition/layout source of the broadcast
   * </pre>
   *
   * <code>.live.v21.Composition composition = 5 [json_name = "composition", (.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the composition field is set.
   */
  boolean hasComposition();
  /**
   * <pre>
   * composition/layout source of the broadcast
   * </pre>
   *
   * <code>.live.v21.Composition composition = 5 [json_name = "composition", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The composition.
   */
  stream.api.live.Composition getComposition();
  /**
   * <pre>
   * composition/layout source of the broadcast
   * </pre>
   *
   * <code>.live.v21.Composition composition = 5 [json_name = "composition", (.google.api.field_behavior) = REQUIRED];</code>
   */
  stream.api.live.CompositionOrBuilder getCompositionOrBuilder();

  /**
   * <pre>
   * maximum duration of project broadcasts (ms)
   * </pre>
   *
   * <code>optional uint32 max_duration = 6 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the maxDuration field is set.
   */
  boolean hasMaxDuration();
  /**
   * <pre>
   * maximum duration of project broadcasts (ms)
   * </pre>
   *
   * <code>optional uint32 max_duration = 6 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The maxDuration.
   */
  int getMaxDuration();

  /**
   * <pre>
   * request webrtc services
   * </pre>
   *
   * <code>optional .live.v21.WebRtc webrtc = 7 [json_name = "webrtc"];</code>
   * @return Whether the webrtc field is set.
   */
  boolean hasWebrtc();
  /**
   * <pre>
   * request webrtc services
   * </pre>
   *
   * <code>optional .live.v21.WebRtc webrtc = 7 [json_name = "webrtc"];</code>
   * @return The webrtc.
   */
  stream.api.live.WebRtc getWebrtc();
  /**
   * <pre>
   * request webrtc services
   * </pre>
   *
   * <code>optional .live.v21.WebRtc webrtc = 7 [json_name = "webrtc"];</code>
   */
  stream.api.live.WebRtcOrBuilder getWebrtcOrBuilder();

  /**
   * <pre>
   * optimal broadcast location (for routing and delay)
   * </pre>
   *
   * <code>optional .live.v21.LatLong location = 9 [json_name = "location"];</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * optimal broadcast location (for routing and delay)
   * </pre>
   *
   * <code>optional .live.v21.LatLong location = 9 [json_name = "location"];</code>
   * @return The location.
   */
  stream.api.live.LatLong getLocation();
  /**
   * <pre>
   * optimal broadcast location (for routing and delay)
   * </pre>
   *
   * <code>optional .live.v21.LatLong location = 9 [json_name = "location"];</code>
   */
  stream.api.live.LatLongOrBuilder getLocationOrBuilder();
}
