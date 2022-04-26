/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

public interface LayerEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apis.layout.v2.LayerEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * New layer added
   * </pre>
   *
   * <code>.apis.layout.v2.Layer create = 1 [json_name = "create"];</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * New layer added
   * </pre>
   *
   * <code>.apis.layout.v2.Layer create = 1 [json_name = "create"];</code>
   * @return The create.
   */
  stream.api.layout.Layer getCreate();
  /**
   * <pre>
   * New layer added
   * </pre>
   *
   * <code>.apis.layout.v2.Layer create = 1 [json_name = "create"];</code>
   */
  stream.api.layout.LayerOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Existing layer updated
   * </pre>
   *
   * <code>.apis.layout.v2.Layer update = 2 [json_name = "update"];</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Existing layer updated
   * </pre>
   *
   * <code>.apis.layout.v2.Layer update = 2 [json_name = "update"];</code>
   * @return The update.
   */
  stream.api.layout.Layer getUpdate();
  /**
   * <pre>
   * Existing layer updated
   * </pre>
   *
   * <code>.apis.layout.v2.Layer update = 2 [json_name = "update"];</code>
   */
  stream.api.layout.LayerOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Existing layer destroyed
   * </pre>
   *
   * <code>.apis.layout.v2.DeleteLayerResponse delete = 3 [json_name = "delete"];</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <pre>
   * Existing layer destroyed
   * </pre>
   *
   * <code>.apis.layout.v2.DeleteLayerResponse delete = 3 [json_name = "delete"];</code>
   * @return The delete.
   */
  stream.api.layout.DeleteLayerResponse getDelete();
  /**
   * <pre>
   * Existing layer destroyed
   * </pre>
   *
   * <code>.apis.layout.v2.DeleteLayerResponse delete = 3 [json_name = "delete"];</code>
   */
  stream.api.layout.DeleteLayerResponseOrBuilder getDeleteOrBuilder();

  /**
   * <pre>
   * Batch events
   * </pre>
   *
   * <code>.apis.layout.v2.BatchLayerResponse batch = 4 [json_name = "batch"];</code>
   * @return Whether the batch field is set.
   */
  boolean hasBatch();
  /**
   * <pre>
   * Batch events
   * </pre>
   *
   * <code>.apis.layout.v2.BatchLayerResponse batch = 4 [json_name = "batch"];</code>
   * @return The batch.
   */
  stream.api.layout.BatchLayerResponse getBatch();
  /**
   * <pre>
   * Batch events
   * </pre>
   *
   * <code>.apis.layout.v2.BatchLayerResponse batch = 4 [json_name = "batch"];</code>
   */
  stream.api.layout.BatchLayerResponseOrBuilder getBatchOrBuilder();

  public stream.api.layout.LayerEvent.TypeCase getTypeCase();
}
