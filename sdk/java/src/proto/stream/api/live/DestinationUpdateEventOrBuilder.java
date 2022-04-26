/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface DestinationUpdateEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.DestinationUpdateEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * collection which owns the project which owns the destination
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * collection which owns the project which owns the destination
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * project which owns the destination
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * project which owns the destination
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * destination id
   * </pre>
   *
   * <code>string destination_id = 3 [json_name = "destinationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The destinationId.
   */
  java.lang.String getDestinationId();
  /**
   * <pre>
   * destination id
   * </pre>
   *
   * <code>string destination_id = 3 [json_name = "destinationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for destinationId.
   */
  com.google.protobuf.ByteString
      getDestinationIdBytes();

  /**
   * <pre>
   * changed fields
   * </pre>
   *
   * <code>repeated string update_mask = 4 [json_name = "updateMask"];</code>
   * @return A list containing the updateMask.
   */
  java.util.List<java.lang.String>
      getUpdateMaskList();
  /**
   * <pre>
   * changed fields
   * </pre>
   *
   * <code>repeated string update_mask = 4 [json_name = "updateMask"];</code>
   * @return The count of updateMask.
   */
  int getUpdateMaskCount();
  /**
   * <pre>
   * changed fields
   * </pre>
   *
   * <code>repeated string update_mask = 4 [json_name = "updateMask"];</code>
   * @param index The index of the element to return.
   * @return The updateMask at the given index.
   */
  java.lang.String getUpdateMask(int index);
  /**
   * <pre>
   * changed fields
   * </pre>
   *
   * <code>repeated string update_mask = 4 [json_name = "updateMask"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the updateMask at the given index.
   */
  com.google.protobuf.ByteString
      getUpdateMaskBytes(int index);

  /**
   * <pre>
   * the updated destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 5 [json_name = "destination"];</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   * the updated destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 5 [json_name = "destination"];</code>
   * @return The destination.
   */
  stream.api.live.Destination getDestination();
  /**
   * <pre>
   * the updated destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 5 [json_name = "destination"];</code>
   */
  stream.api.live.DestinationOrBuilder getDestinationOrBuilder();
}
