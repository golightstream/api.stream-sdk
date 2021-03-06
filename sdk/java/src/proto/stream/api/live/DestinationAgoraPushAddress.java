/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * Agora push addressing
 * </pre>
 *
 * Protobuf type {@code live.v21.DestinationAgoraPushAddress}
 */
public final class DestinationAgoraPushAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.DestinationAgoraPushAddress)
    DestinationAgoraPushAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DestinationAgoraPushAddress.newBuilder() to construct.
  private DestinationAgoraPushAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DestinationAgoraPushAddress() {
    appId_ = "";
    channelId_ = "";
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DestinationAgoraPushAddress();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DestinationAgoraPushAddress(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            appId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            channelId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
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
    return stream.api.live.Api.internal_static_live_v21_DestinationAgoraPushAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_DestinationAgoraPushAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.DestinationAgoraPushAddress.class, stream.api.live.DestinationAgoraPushAddress.Builder.class);
  }

  public static final int APP_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object appId_;
  /**
   * <pre>
   * Agora app id
   * </pre>
   *
   * <code>string app_id = 1 [json_name = "appId", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The appId.
   */
  @java.lang.Override
  public java.lang.String getAppId() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Agora app id
   * </pre>
   *
   * <code>string app_id = 1 [json_name = "appId", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for appId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAppIdBytes() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object channelId_;
  /**
   * <pre>
   * Agora channel id
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The channelId.
   */
  @java.lang.Override
  public java.lang.String getChannelId() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channelId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Agora channel id
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for channelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelIdBytes() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object userId_;
  /**
   * <pre>
   * Agora user id
   * </pre>
   *
   * <code>string user_id = 3 [json_name = "userId", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Agora user id
   * </pre>
   *
   * <code>string user_id = 3 [json_name = "userId", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, channelId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(appId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, channelId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userId_);
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
    if (!(obj instanceof stream.api.live.DestinationAgoraPushAddress)) {
      return super.equals(obj);
    }
    stream.api.live.DestinationAgoraPushAddress other = (stream.api.live.DestinationAgoraPushAddress) obj;

    if (!getAppId()
        .equals(other.getAppId())) return false;
    if (!getChannelId()
        .equals(other.getChannelId())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
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
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAppId().hashCode();
    hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChannelId().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.DestinationAgoraPushAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.DestinationAgoraPushAddress parseFrom(
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
  public static Builder newBuilder(stream.api.live.DestinationAgoraPushAddress prototype) {
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
   * Agora push addressing
   * </pre>
   *
   * Protobuf type {@code live.v21.DestinationAgoraPushAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.DestinationAgoraPushAddress)
      stream.api.live.DestinationAgoraPushAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_DestinationAgoraPushAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_DestinationAgoraPushAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.DestinationAgoraPushAddress.class, stream.api.live.DestinationAgoraPushAddress.Builder.class);
    }

    // Construct using stream.api.live.DestinationAgoraPushAddress.newBuilder()
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
      appId_ = "";

      channelId_ = "";

      userId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_DestinationAgoraPushAddress_descriptor;
    }

    @java.lang.Override
    public stream.api.live.DestinationAgoraPushAddress getDefaultInstanceForType() {
      return stream.api.live.DestinationAgoraPushAddress.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.DestinationAgoraPushAddress build() {
      stream.api.live.DestinationAgoraPushAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.DestinationAgoraPushAddress buildPartial() {
      stream.api.live.DestinationAgoraPushAddress result = new stream.api.live.DestinationAgoraPushAddress(this);
      result.appId_ = appId_;
      result.channelId_ = channelId_;
      result.userId_ = userId_;
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
      if (other instanceof stream.api.live.DestinationAgoraPushAddress) {
        return mergeFrom((stream.api.live.DestinationAgoraPushAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.DestinationAgoraPushAddress other) {
      if (other == stream.api.live.DestinationAgoraPushAddress.getDefaultInstance()) return this;
      if (!other.getAppId().isEmpty()) {
        appId_ = other.appId_;
        onChanged();
      }
      if (!other.getChannelId().isEmpty()) {
        channelId_ = other.channelId_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
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
      stream.api.live.DestinationAgoraPushAddress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.DestinationAgoraPushAddress) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object appId_ = "";
    /**
     * <pre>
     * Agora app id
     * </pre>
     *
     * <code>string app_id = 1 [json_name = "appId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The appId.
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Agora app id
     * </pre>
     *
     * <code>string app_id = 1 [json_name = "appId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for appId.
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Agora app id
     * </pre>
     *
     * <code>string app_id = 1 [json_name = "appId", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agora app id
     * </pre>
     *
     * <code>string app_id = 1 [json_name = "appId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      
      appId_ = getDefaultInstance().getAppId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agora app id
     * </pre>
     *
     * <code>string app_id = 1 [json_name = "appId", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object channelId_ = "";
    /**
     * <pre>
     * Agora channel id
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The channelId.
     */
    public java.lang.String getChannelId() {
      java.lang.Object ref = channelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Agora channel id
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for channelId.
     */
    public com.google.protobuf.ByteString
        getChannelIdBytes() {
      java.lang.Object ref = channelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Agora channel id
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      channelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agora channel id
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelId() {
      
      channelId_ = getDefaultInstance().getChannelId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agora channel id
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      channelId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * Agora user id
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Agora user id
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Agora user id
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agora user id
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId", (.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agora user id
     * </pre>
     *
     * <code>string user_id = 3 [json_name = "userId", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
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


    // @@protoc_insertion_point(builder_scope:live.v21.DestinationAgoraPushAddress)
  }

  // @@protoc_insertion_point(class_scope:live.v21.DestinationAgoraPushAddress)
  private static final stream.api.live.DestinationAgoraPushAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.DestinationAgoraPushAddress();
  }

  public static stream.api.live.DestinationAgoraPushAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DestinationAgoraPushAddress>
      PARSER = new com.google.protobuf.AbstractParser<DestinationAgoraPushAddress>() {
    @java.lang.Override
    public DestinationAgoraPushAddress parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DestinationAgoraPushAddress(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DestinationAgoraPushAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DestinationAgoraPushAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.DestinationAgoraPushAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

