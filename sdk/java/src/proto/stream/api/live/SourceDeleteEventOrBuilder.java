/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface SourceDeleteEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.SourceDeleteEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <code>string collection_id = 1 [json_name = "collectionId"];</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <code>string source_id = 2 [json_name = "sourceId"];</code>
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   * <code>string source_id = 2 [json_name = "sourceId"];</code>
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString
      getSourceIdBytes();
}