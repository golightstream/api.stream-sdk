/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface HlsLifecycleVodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.HlsLifecycleVod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * max duration of the recording in ms (0 is indefinite)
   * </pre>
   *
   * <code>optional int32 max_duration = 1 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the maxDuration field is set.
   */
  boolean hasMaxDuration();
  /**
   * <pre>
   * max duration of the recording in ms (0 is indefinite)
   * </pre>
   *
   * <code>optional int32 max_duration = 1 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The maxDuration.
   */
  int getMaxDuration();
}
