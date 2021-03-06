/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface AudioRenderingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.AudioRendering)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * audio channel layout
   * </pre>
   *
   * <code>optional .live.v21.AudioChannelLayout channel_layout = 1 [json_name = "channelLayout", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the channelLayout field is set.
   */
  boolean hasChannelLayout();
  /**
   * <pre>
   * audio channel layout
   * </pre>
   *
   * <code>optional .live.v21.AudioChannelLayout channel_layout = 1 [json_name = "channelLayout", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for channelLayout.
   */
  int getChannelLayoutValue();
  /**
   * <pre>
   * audio channel layout
   * </pre>
   *
   * <code>optional .live.v21.AudioChannelLayout channel_layout = 1 [json_name = "channelLayout", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The channelLayout.
   */
  stream.api.live.AudioChannelLayout getChannelLayout();
}
