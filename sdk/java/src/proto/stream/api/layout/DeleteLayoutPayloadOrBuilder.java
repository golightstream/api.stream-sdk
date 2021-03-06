/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

public interface DeleteLayoutPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apis.layout.v2.DeleteLayoutPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Metadata associated with the deletion of the layout
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 100 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   * <pre>
   * Metadata associated with the deletion of the layout
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 100 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The requestMetadata.
   */
  com.google.protobuf.Value getRequestMetadata();
  /**
   * <pre>
   * Metadata associated with the deletion of the layout
   * </pre>
   *
   * <code>optional .google.protobuf.Value request_metadata = 100 [json_name = "requestMetadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.ValueOrBuilder getRequestMetadataOrBuilder();
}
