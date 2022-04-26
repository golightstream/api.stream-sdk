/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface GetDestinationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.GetDestinationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the requested destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   * the requested destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
   * @return The destination.
   */
  stream.api.live.Destination getDestination();
  /**
   * <pre>
   * the requested destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
   */
  stream.api.live.DestinationOrBuilder getDestinationOrBuilder();
}