/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface DeleteCollectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.DeleteCollectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * number of live sources owned by this collection which were deleted
   * </pre>
   *
   * <code>uint32 sources_deleted = 1 [json_name = "sourcesDeleted", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The sourcesDeleted.
   */
  int getSourcesDeleted();

  /**
   * <pre>
   * number of projects owned by this collection which were deleted
   * </pre>
   *
   * <code>uint32 projects_deleted = 2 [json_name = "projectsDeleted", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The projectsDeleted.
   */
  int getProjectsDeleted();

  /**
   * <pre>
   * project ids owned by this collection whose broadcasts were stopped
   * </pre>
   *
   * <code>repeated string project_ids_stopped = 3 [json_name = "projectIdsStopped", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return A list containing the projectIdsStopped.
   */
  java.util.List<java.lang.String>
      getProjectIdsStoppedList();
  /**
   * <pre>
   * project ids owned by this collection whose broadcasts were stopped
   * </pre>
   *
   * <code>repeated string project_ids_stopped = 3 [json_name = "projectIdsStopped", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The count of projectIdsStopped.
   */
  int getProjectIdsStoppedCount();
  /**
   * <pre>
   * project ids owned by this collection whose broadcasts were stopped
   * </pre>
   *
   * <code>repeated string project_ids_stopped = 3 [json_name = "projectIdsStopped", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The projectIdsStopped at the given index.
   */
  java.lang.String getProjectIdsStopped(int index);
  /**
   * <pre>
   * project ids owned by this collection whose broadcasts were stopped
   * </pre>
   *
   * <code>repeated string project_ids_stopped = 3 [json_name = "projectIdsStopped", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the projectIdsStopped at the given index.
   */
  com.google.protobuf.ByteString
      getProjectIdsStoppedBytes(int index);
}
