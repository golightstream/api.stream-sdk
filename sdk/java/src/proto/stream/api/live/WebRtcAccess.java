/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * webrtc access parameters
 * </pre>
 *
 * Protobuf type {@code live.v21.WebRtcAccess}
 */
public final class WebRtcAccess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.WebRtcAccess)
    WebRtcAccessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WebRtcAccess.newBuilder() to construct.
  private WebRtcAccess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WebRtcAccess() {
    accessToken_ = "";
    participantId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WebRtcAccess();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WebRtcAccess(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            accessToken_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            participantId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return stream.api.live.Api.internal_static_live_v21_WebRtcAccess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_WebRtcAccess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.WebRtcAccess.class, stream.api.live.WebRtcAccess.Builder.class);
  }

  private int bitField0_;
  public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object accessToken_;
  /**
   * <pre>
   * access token for webrtc room
   * </pre>
   *
   * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The accessToken.
   */
  @java.lang.Override
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * access token for webrtc room
   * </pre>
   *
   * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for accessToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTICIPANT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object participantId_;
  /**
   * <pre>
   * the id this user was assigned in the webrtc room
   * </pre>
   *
   * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the participantId field is set.
   */
  @java.lang.Override
  public boolean hasParticipantId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * the id this user was assigned in the webrtc room
   * </pre>
   *
   * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The participantId.
   */
  @java.lang.Override
  public java.lang.String getParticipantId() {
    java.lang.Object ref = participantId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      participantId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the id this user was assigned in the webrtc room
   * </pre>
   *
   * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for participantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParticipantIdBytes() {
    java.lang.Object ref = participantId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      participantId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accessToken_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, participantId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accessToken_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, participantId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof stream.api.live.WebRtcAccess)) {
      return super.equals(obj);
    }
    stream.api.live.WebRtcAccess other = (stream.api.live.WebRtcAccess) obj;

    if (!getAccessToken()
        .equals(other.getAccessToken())) return false;
    if (hasParticipantId() != other.hasParticipantId()) return false;
    if (hasParticipantId()) {
      if (!getParticipantId()
          .equals(other.getParticipantId())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    if (hasParticipantId()) {
      hash = (37 * hash) + PARTICIPANT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParticipantId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.WebRtcAccess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.WebRtcAccess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.WebRtcAccess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.WebRtcAccess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.WebRtcAccess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.WebRtcAccess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.WebRtcAccess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.WebRtcAccess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.WebRtcAccess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.WebRtcAccess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.WebRtcAccess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.WebRtcAccess parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(stream.api.live.WebRtcAccess prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * webrtc access parameters
   * </pre>
   *
   * Protobuf type {@code live.v21.WebRtcAccess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.WebRtcAccess)
      stream.api.live.WebRtcAccessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_WebRtcAccess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_WebRtcAccess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.WebRtcAccess.class, stream.api.live.WebRtcAccess.Builder.class);
    }

    // Construct using stream.api.live.WebRtcAccess.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      accessToken_ = "";

      participantId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_WebRtcAccess_descriptor;
    }

    @java.lang.Override
    public stream.api.live.WebRtcAccess getDefaultInstanceForType() {
      return stream.api.live.WebRtcAccess.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.WebRtcAccess build() {
      stream.api.live.WebRtcAccess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.WebRtcAccess buildPartial() {
      stream.api.live.WebRtcAccess result = new stream.api.live.WebRtcAccess(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.accessToken_ = accessToken_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.participantId_ = participantId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof stream.api.live.WebRtcAccess) {
        return mergeFrom((stream.api.live.WebRtcAccess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.WebRtcAccess other) {
      if (other == stream.api.live.WebRtcAccess.getDefaultInstance()) return this;
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        onChanged();
      }
      if (other.hasParticipantId()) {
        bitField0_ |= 0x00000001;
        participantId_ = other.participantId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      stream.api.live.WebRtcAccess parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.WebRtcAccess) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object accessToken_ = "";
    /**
     * <pre>
     * access token for webrtc room
     * </pre>
     *
     * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The accessToken.
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * access token for webrtc room
     * </pre>
     *
     * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for accessToken.
     */
    public com.google.protobuf.ByteString
        getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * access token for webrtc room
     * </pre>
     *
     * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accessToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * access token for webrtc room
     * </pre>
     *
     * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAccessToken() {
      
      accessToken_ = getDefaultInstance().getAccessToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * access token for webrtc room
     * </pre>
     *
     * <code>string access_token = 1 [json_name = "accessToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accessToken_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object participantId_ = "";
    /**
     * <pre>
     * the id this user was assigned in the webrtc room
     * </pre>
     *
     * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the participantId field is set.
     */
    public boolean hasParticipantId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * the id this user was assigned in the webrtc room
     * </pre>
     *
     * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The participantId.
     */
    public java.lang.String getParticipantId() {
      java.lang.Object ref = participantId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        participantId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the id this user was assigned in the webrtc room
     * </pre>
     *
     * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for participantId.
     */
    public com.google.protobuf.ByteString
        getParticipantIdBytes() {
      java.lang.Object ref = participantId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        participantId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the id this user was assigned in the webrtc room
     * </pre>
     *
     * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The participantId to set.
     * @return This builder for chaining.
     */
    public Builder setParticipantId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      participantId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id this user was assigned in the webrtc room
     * </pre>
     *
     * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParticipantId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      participantId_ = getDefaultInstance().getParticipantId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id this user was assigned in the webrtc room
     * </pre>
     *
     * <code>optional string participant_id = 3 [json_name = "participantId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for participantId to set.
     * @return This builder for chaining.
     */
    public Builder setParticipantIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      participantId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:live.v21.WebRtcAccess)
  }

  // @@protoc_insertion_point(class_scope:live.v21.WebRtcAccess)
  private static final stream.api.live.WebRtcAccess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.WebRtcAccess();
  }

  public static stream.api.live.WebRtcAccess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebRtcAccess>
      PARSER = new com.google.protobuf.AbstractParser<WebRtcAccess>() {
    @java.lang.Override
    public WebRtcAccess parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WebRtcAccess(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WebRtcAccess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebRtcAccess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.WebRtcAccess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

