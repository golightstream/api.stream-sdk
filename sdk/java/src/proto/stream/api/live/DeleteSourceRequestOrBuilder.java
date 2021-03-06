/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface DeleteSourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.DeleteSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * collection which owns the live source
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * collection which owns the live source
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * live source id
   * </pre>
   *
   * <code>string source_id = 2 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   * <pre>
   * live source id
   * </pre>
   *
   * <code>string source_id = 2 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString
      getSourceIdBytes();

  /**
   * <pre>
   * delete a live source even if it is in use in a broadcast
   * </pre>
   *
   * <code>optional bool force = 3 [json_name = "force", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the force field is set.
   */
  boolean hasForce();
  /**
   * <pre>
   * delete a live source even if it is in use in a broadcast
   * </pre>
   *
   * <code>optional bool force = 3 [json_name = "force", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The force.
   */
  boolean getForce();
}
