/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface UpdateCollectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.UpdateCollectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the updated collection
   * </pre>
   *
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   * @return Whether the collection field is set.
   */
  boolean hasCollection();
  /**
   * <pre>
   * the updated collection
   * </pre>
   *
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   * @return The collection.
   */
  stream.api.live.Collection getCollection();
  /**
   * <pre>
   * the updated collection
   * </pre>
   *
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   */
  stream.api.live.CollectionOrBuilder getCollectionOrBuilder();
}
