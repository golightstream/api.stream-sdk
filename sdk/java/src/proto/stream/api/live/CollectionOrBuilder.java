/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface CollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.Collection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * collection id
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * collection id
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * arbitrary metadata associated with this collection
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 2 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * arbitrary metadata associated with this collection
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 2 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The metadata.
   */
  com.google.protobuf.Value getMetadata();
  /**
   * <pre>
   * arbitrary metadata associated with this collection
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 2 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.ValueOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * projects owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Project projects = 3 [json_name = "projects", (.common.v21.field_options) = { ... }</code>
   */
  java.util.List<stream.api.live.Project> 
      getProjectsList();
  /**
   * <pre>
   * projects owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Project projects = 3 [json_name = "projects", (.common.v21.field_options) = { ... }</code>
   */
  stream.api.live.Project getProjects(int index);
  /**
   * <pre>
   * projects owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Project projects = 3 [json_name = "projects", (.common.v21.field_options) = { ... }</code>
   */
  int getProjectsCount();
  /**
   * <pre>
   * projects owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Project projects = 3 [json_name = "projects", (.common.v21.field_options) = { ... }</code>
   */
  java.util.List<? extends stream.api.live.ProjectOrBuilder> 
      getProjectsOrBuilderList();
  /**
   * <pre>
   * projects owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Project projects = 3 [json_name = "projects", (.common.v21.field_options) = { ... }</code>
   */
  stream.api.live.ProjectOrBuilder getProjectsOrBuilder(
      int index);

  /**
   * <pre>
   * collection live sources owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Source sources = 4 [json_name = "sources", (.common.v21.field_options) = { ... }</code>
   */
  java.util.List<stream.api.live.Source> 
      getSourcesList();
  /**
   * <pre>
   * collection live sources owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Source sources = 4 [json_name = "sources", (.common.v21.field_options) = { ... }</code>
   */
  stream.api.live.Source getSources(int index);
  /**
   * <pre>
   * collection live sources owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Source sources = 4 [json_name = "sources", (.common.v21.field_options) = { ... }</code>
   */
  int getSourcesCount();
  /**
   * <pre>
   * collection live sources owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Source sources = 4 [json_name = "sources", (.common.v21.field_options) = { ... }</code>
   */
  java.util.List<? extends stream.api.live.SourceOrBuilder> 
      getSourcesOrBuilderList();
  /**
   * <pre>
   * collection live sources owned by this collection
   * </pre>
   *
   * <code>repeated .live.v21.Source sources = 4 [json_name = "sources", (.common.v21.field_options) = { ... }</code>
   */
  stream.api.live.SourceOrBuilder getSourcesOrBuilder(
      int index);
}
