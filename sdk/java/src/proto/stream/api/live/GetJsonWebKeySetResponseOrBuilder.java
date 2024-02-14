/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface GetJsonWebKeySetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.GetJsonWebKeySetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * public keys used to sign access tokens
   * </pre>
   *
   * <code>repeated .live.v21.JsonWebKey keys = 1 [json_name = "keys"];</code>
   */
  java.util.List<stream.api.live.JsonWebKey> 
      getKeysList();
  /**
   * <pre>
   * public keys used to sign access tokens
   * </pre>
   *
   * <code>repeated .live.v21.JsonWebKey keys = 1 [json_name = "keys"];</code>
   */
  stream.api.live.JsonWebKey getKeys(int index);
  /**
   * <pre>
   * public keys used to sign access tokens
   * </pre>
   *
   * <code>repeated .live.v21.JsonWebKey keys = 1 [json_name = "keys"];</code>
   */
  int getKeysCount();
  /**
   * <pre>
   * public keys used to sign access tokens
   * </pre>
   *
   * <code>repeated .live.v21.JsonWebKey keys = 1 [json_name = "keys"];</code>
   */
  java.util.List<? extends stream.api.live.JsonWebKeyOrBuilder> 
      getKeysOrBuilderList();
  /**
   * <pre>
   * public keys used to sign access tokens
   * </pre>
   *
   * <code>repeated .live.v21.JsonWebKey keys = 1 [json_name = "keys"];</code>
   */
  stream.api.live.JsonWebKeyOrBuilder getKeysOrBuilder(
      int index);
}