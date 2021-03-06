/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/event/v2/api.proto

package stream.api.event;

public interface EventsStreamErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apis.event.v2.EventsStreamError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The GRPC error code for the event.
   * </pre>
   *
   * <code>int32 code = 1 [json_name = "code", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The code.
   */
  int getCode();

  /**
   * <pre>
   * A mesasage indicating what the error is.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * A mesasage indicating what the error is.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
