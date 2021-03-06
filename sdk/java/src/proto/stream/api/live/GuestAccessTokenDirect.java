/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * create an immutable, single-use guest access token
 * </pre>
 *
 * Protobuf type {@code live.v21.GuestAccessTokenDirect}
 */
public final class GuestAccessTokenDirect extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.GuestAccessTokenDirect)
    GuestAccessTokenDirectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuestAccessTokenDirect.newBuilder() to construct.
  private GuestAccessTokenDirect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuestAccessTokenDirect() {
    displayName_ = "";
    serviceUserId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuestAccessTokenDirect();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GuestAccessTokenDirect(
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

            displayName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            serviceUserId_ = s;
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
    return stream.api.live.Api.internal_static_live_v21_GuestAccessTokenDirect_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_GuestAccessTokenDirect_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.GuestAccessTokenDirect.class, stream.api.live.GuestAccessTokenDirect.Builder.class);
  }

  private int bitField0_;
  public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object displayName_;
  /**
   * <pre>
   * display name of the guest (used to generate webrtc particpant name)
   * </pre>
   *
   * <code>string display_name = 1 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * display name of the guest (used to generate webrtc particpant name)
   * </pre>
   *
   * <code>string display_name = 1 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_USER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object serviceUserId_;
  /**
   * <pre>
   * service-specific user id (used for record auditing purposes)
   * </pre>
   *
   * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the serviceUserId field is set.
   */
  @java.lang.Override
  public boolean hasServiceUserId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * service-specific user id (used for record auditing purposes)
   * </pre>
   *
   * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The serviceUserId.
   */
  @java.lang.Override
  public java.lang.String getServiceUserId() {
    java.lang.Object ref = serviceUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceUserId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * service-specific user id (used for record auditing purposes)
   * </pre>
   *
   * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for serviceUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceUserIdBytes() {
    java.lang.Object ref = serviceUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceUserId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceUserId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceUserId_);
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
    if (!(obj instanceof stream.api.live.GuestAccessTokenDirect)) {
      return super.equals(obj);
    }
    stream.api.live.GuestAccessTokenDirect other = (stream.api.live.GuestAccessTokenDirect) obj;

    if (!getDisplayName()
        .equals(other.getDisplayName())) return false;
    if (hasServiceUserId() != other.hasServiceUserId()) return false;
    if (hasServiceUserId()) {
      if (!getServiceUserId()
          .equals(other.getServiceUserId())) return false;
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
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    if (hasServiceUserId()) {
      hash = (37 * hash) + SERVICE_USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getServiceUserId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.GuestAccessTokenDirect parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.GuestAccessTokenDirect parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.GuestAccessTokenDirect parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.GuestAccessTokenDirect parseFrom(
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
  public static Builder newBuilder(stream.api.live.GuestAccessTokenDirect prototype) {
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
   * create an immutable, single-use guest access token
   * </pre>
   *
   * Protobuf type {@code live.v21.GuestAccessTokenDirect}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.GuestAccessTokenDirect)
      stream.api.live.GuestAccessTokenDirectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_GuestAccessTokenDirect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_GuestAccessTokenDirect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.GuestAccessTokenDirect.class, stream.api.live.GuestAccessTokenDirect.Builder.class);
    }

    // Construct using stream.api.live.GuestAccessTokenDirect.newBuilder()
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
      displayName_ = "";

      serviceUserId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_GuestAccessTokenDirect_descriptor;
    }

    @java.lang.Override
    public stream.api.live.GuestAccessTokenDirect getDefaultInstanceForType() {
      return stream.api.live.GuestAccessTokenDirect.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.GuestAccessTokenDirect build() {
      stream.api.live.GuestAccessTokenDirect result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.GuestAccessTokenDirect buildPartial() {
      stream.api.live.GuestAccessTokenDirect result = new stream.api.live.GuestAccessTokenDirect(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.displayName_ = displayName_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.serviceUserId_ = serviceUserId_;
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
      if (other instanceof stream.api.live.GuestAccessTokenDirect) {
        return mergeFrom((stream.api.live.GuestAccessTokenDirect)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.GuestAccessTokenDirect other) {
      if (other == stream.api.live.GuestAccessTokenDirect.getDefaultInstance()) return this;
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (other.hasServiceUserId()) {
        bitField0_ |= 0x00000001;
        serviceUserId_ = other.serviceUserId_;
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
      stream.api.live.GuestAccessTokenDirect parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.GuestAccessTokenDirect) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * display name of the guest (used to generate webrtc particpant name)
     * </pre>
     *
     * <code>string display_name = 1 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * display name of the guest (used to generate webrtc particpant name)
     * </pre>
     *
     * <code>string display_name = 1 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * display name of the guest (used to generate webrtc particpant name)
     * </pre>
     *
     * <code>string display_name = 1 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * display name of the guest (used to generate webrtc particpant name)
     * </pre>
     *
     * <code>string display_name = 1 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * display name of the guest (used to generate webrtc particpant name)
     * </pre>
     *
     * <code>string display_name = 1 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceUserId_ = "";
    /**
     * <pre>
     * service-specific user id (used for record auditing purposes)
     * </pre>
     *
     * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the serviceUserId field is set.
     */
    public boolean hasServiceUserId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * service-specific user id (used for record auditing purposes)
     * </pre>
     *
     * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The serviceUserId.
     */
    public java.lang.String getServiceUserId() {
      java.lang.Object ref = serviceUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * service-specific user id (used for record auditing purposes)
     * </pre>
     *
     * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for serviceUserId.
     */
    public com.google.protobuf.ByteString
        getServiceUserIdBytes() {
      java.lang.Object ref = serviceUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * service-specific user id (used for record auditing purposes)
     * </pre>
     *
     * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The serviceUserId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      serviceUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * service-specific user id (used for record auditing purposes)
     * </pre>
     *
     * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceUserId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      serviceUserId_ = getDefaultInstance().getServiceUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * service-specific user id (used for record auditing purposes)
     * </pre>
     *
     * <code>optional string service_user_id = 2 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for serviceUserId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      serviceUserId_ = value;
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


    // @@protoc_insertion_point(builder_scope:live.v21.GuestAccessTokenDirect)
  }

  // @@protoc_insertion_point(class_scope:live.v21.GuestAccessTokenDirect)
  private static final stream.api.live.GuestAccessTokenDirect DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.GuestAccessTokenDirect();
  }

  public static stream.api.live.GuestAccessTokenDirect getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuestAccessTokenDirect>
      PARSER = new com.google.protobuf.AbstractParser<GuestAccessTokenDirect>() {
    @java.lang.Override
    public GuestAccessTokenDirect parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GuestAccessTokenDirect(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GuestAccessTokenDirect> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuestAccessTokenDirect> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.GuestAccessTokenDirect getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

