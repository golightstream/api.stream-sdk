/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface GetCollectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.GetCollectionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   * @return Whether the collection field is set.
   */
  boolean hasCollection();
  /**
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   * @return The collection.
   */
  stream.api.live.Collection getCollection();
  /**
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   */
  stream.api.live.CollectionOrBuilder getCollectionOrBuilder();
}
