/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface HlsLifecycleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.HlsLifecycle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * lifecycle of vod
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the vod field is set.
   */
  boolean hasVod();
  /**
   * <pre>
   * lifecycle of vod
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The vod.
   */
  stream.api.live.HlsLifecycleVod getVod();
  /**
   * <pre>
   * lifecycle of vod
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  stream.api.live.HlsLifecycleVodOrBuilder getVodOrBuilder();

  /**
   * <pre>
   * lifecycle of live
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
   * @return Whether the live field is set.
   */
  boolean hasLive();
  /**
   * <pre>
   * lifecycle of live
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
   * @return The live.
   */
  stream.api.live.HlsLifecycleLive getLive();
  /**
   * <pre>
   * lifecycle of live
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
   */
  stream.api.live.HlsLifecycleLiveOrBuilder getLiveOrBuilder();

  public stream.api.live.HlsLifecycle.TypeCase getTypeCase();
}
