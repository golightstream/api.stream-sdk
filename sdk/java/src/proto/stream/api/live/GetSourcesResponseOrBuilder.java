/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface GetSourcesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.GetSourcesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  java.util.List<stream.api.live.Source> 
      getSourcesList();
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  stream.api.live.Source getSources(int index);
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  int getSourcesCount();
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  java.util.List<? extends stream.api.live.SourceOrBuilder> 
      getSourcesOrBuilderList();
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  stream.api.live.SourceOrBuilder getSourcesOrBuilder(
      int index);
}
