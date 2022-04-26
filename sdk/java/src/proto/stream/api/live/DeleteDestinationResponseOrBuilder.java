/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface DeleteDestinationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.DeleteDestinationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * indicates whether the broadcast was updated as a function of this request
   * </pre>
   *
   * <code>bool broadcast_updated = 1 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The broadcastUpdated.
   */
  boolean getBroadcastUpdated();
}
