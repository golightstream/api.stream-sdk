/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface SourceCreateEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.SourceCreateEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * collection which owns the source
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * collection which owns the source
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * source id
   * </pre>
   *
   * <code>string source_id = 2 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   * <pre>
   * source id
   * </pre>
   *
   * <code>string source_id = 2 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString
      getSourceIdBytes();

  /**
   * <code>.live.v21.Source source = 3 [json_name = "source"];</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>.live.v21.Source source = 3 [json_name = "source"];</code>
   * @return The source.
   */
  stream.api.live.Source getSource();
  /**
   * <code>.live.v21.Source source = 3 [json_name = "source"];</code>
   */
  stream.api.live.SourceOrBuilder getSourceOrBuilder();
}