/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface S3StorageAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.S3StorageAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * cloud region
   * </pre>
   *
   * <code>string region = 1 [json_name = "region", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * cloud region
   * </pre>
   *
   * <code>string region = 1 [json_name = "region", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * cloud bucket
   * </pre>
   *
   * <code>string bucket = 2 [json_name = "bucket", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   * <pre>
   * cloud bucket
   * </pre>
   *
   * <code>string bucket = 2 [json_name = "bucket", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString
      getBucketBytes();

  /**
   * <pre>
   * cloud bucket prefix
   * </pre>
   *
   * <code>optional string prefix = 3 [json_name = "prefix", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the prefix field is set.
   */
  boolean hasPrefix();
  /**
   * <pre>
   * cloud bucket prefix
   * </pre>
   *
   * <code>optional string prefix = 3 [json_name = "prefix", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The prefix.
   */
  java.lang.String getPrefix();
  /**
   * <pre>
   * cloud bucket prefix
   * </pre>
   *
   * <code>optional string prefix = 3 [json_name = "prefix", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for prefix.
   */
  com.google.protobuf.ByteString
      getPrefixBytes();

  /**
   * <pre>
   * cloud access key
   * </pre>
   *
   * <code>string access_key = 4 [json_name = "accessKey", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The accessKey.
   */
  java.lang.String getAccessKey();
  /**
   * <pre>
   * cloud access key
   * </pre>
   *
   * <code>string access_key = 4 [json_name = "accessKey", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for accessKey.
   */
  com.google.protobuf.ByteString
      getAccessKeyBytes();

  /**
   * <pre>
   * cloud secret key
   * </pre>
   *
   * <code>string secret_key = 5 [json_name = "secretKey", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The secretKey.
   */
  java.lang.String getSecretKey();
  /**
   * <pre>
   * cloud secret key
   * </pre>
   *
   * <code>string secret_key = 5 [json_name = "secretKey", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for secretKey.
   */
  com.google.protobuf.ByteString
      getSecretKeyBytes();

  /**
   * <pre>
   * token based auth
   * </pre>
   *
   * <code>optional string token = 6 [json_name = "token"];</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <pre>
   * token based auth
   * </pre>
   *
   * <code>optional string token = 6 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * token based auth
   * </pre>
   *
   * <code>optional string token = 6 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   * token duration in ms
   * </pre>
   *
   * <code>optional int32 token_duration = 7 [json_name = "tokenDuration"];</code>
   * @return Whether the tokenDuration field is set.
   */
  boolean hasTokenDuration();
  /**
   * <pre>
   * token duration in ms
   * </pre>
   *
   * <code>optional int32 token_duration = 7 [json_name = "tokenDuration"];</code>
   * @return The tokenDuration.
   */
  int getTokenDuration();

  /**
   * <pre>
   * access control list
   * </pre>
   *
   * <code>optional .live.v21.S3ACL acl = 8 [json_name = "acl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the acl field is set.
   */
  boolean hasAcl();
  /**
   * <pre>
   * access control list
   * </pre>
   *
   * <code>optional .live.v21.S3ACL acl = 8 [json_name = "acl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for acl.
   */
  int getAclValue();
  /**
   * <pre>
   * access control list
   * </pre>
   *
   * <code>optional .live.v21.S3ACL acl = 8 [json_name = "acl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The acl.
   */
  stream.api.live.S3ACL getAcl();

  /**
   * <pre>
   * endpoint for non aws s3 destinations
   * </pre>
   *
   * <code>optional string endpoint = 9 [json_name = "endpoint", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   * <pre>
   * endpoint for non aws s3 destinations
   * </pre>
   *
   * <code>optional string endpoint = 9 [json_name = "endpoint", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   * <pre>
   * endpoint for non aws s3 destinations
   * </pre>
   *
   * <code>optional string endpoint = 9 [json_name = "endpoint", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString
      getEndpointBytes();

  /**
   * <pre>
   * the format of the files to be written
   * </pre>
   *
   * <code>.live.v21.ObjectStoragePackaging packaging = 10 [json_name = "packaging", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the packaging field is set.
   */
  boolean hasPackaging();
  /**
   * <pre>
   * the format of the files to be written
   * </pre>
   *
   * <code>.live.v21.ObjectStoragePackaging packaging = 10 [json_name = "packaging", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The packaging.
   */
  stream.api.live.ObjectStoragePackaging getPackaging();
  /**
   * <pre>
   * the format of the files to be written
   * </pre>
   *
   * <code>.live.v21.ObjectStoragePackaging packaging = 10 [json_name = "packaging", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  stream.api.live.ObjectStoragePackagingOrBuilder getPackagingOrBuilder();
}
