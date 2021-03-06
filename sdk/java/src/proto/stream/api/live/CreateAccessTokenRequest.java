/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.CreateAccessTokenRequest}
 */
public final class CreateAccessTokenRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.CreateAccessTokenRequest)
    CreateAccessTokenRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAccessTokenRequest.newBuilder() to construct.
  private CreateAccessTokenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAccessTokenRequest() {
    serviceUserId_ = "";
    displayName_ = "";
    role_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAccessTokenRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAccessTokenRequest(
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

            serviceUserId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            bitField0_ |= 0x00000002;
            role_ = rawValue;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            maxDuration_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            displayName_ = s;
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
    return stream.api.live.Api.internal_static_live_v21_CreateAccessTokenRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_CreateAccessTokenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.CreateAccessTokenRequest.class, stream.api.live.CreateAccessTokenRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceUserId_;
  /**
   * <pre>
   * service-specific user id
   * ### Usage
   * * this should be an opaque GUID with no spaces
   * </pre>
   *
   * <code>string service_user_id = 1 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
   * service-specific user id
   * ### Usage
   * * this should be an opaque GUID with no spaces
   * </pre>
   *
   * <code>string service_user_id = 1 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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

  public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object displayName_;
  /**
   * <code>optional string display_name = 4 [json_name = "displayName"];</code>
   * @return Whether the displayName field is set.
   */
  @java.lang.Override
  public boolean hasDisplayName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string display_name = 4 [json_name = "displayName"];</code>
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
   * <code>optional string display_name = 4 [json_name = "displayName"];</code>
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

  public static final int ROLE_FIELD_NUMBER = 2;
  private int role_;
  /**
   * <pre>
   * the requested role
   * </pre>
   *
   * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the role field is set.
   */
  @java.lang.Override public boolean hasRole() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * the requested role
   * </pre>
   *
   * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for role.
   */
  @java.lang.Override public int getRoleValue() {
    return role_;
  }
  /**
   * <pre>
   * the requested role
   * </pre>
   *
   * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The role.
   */
  @java.lang.Override public stream.api.live.Role getRole() {
    @SuppressWarnings("deprecation")
    stream.api.live.Role result = stream.api.live.Role.valueOf(role_);
    return result == null ? stream.api.live.Role.UNRECOGNIZED : result;
  }

  public static final int MAX_DURATION_FIELD_NUMBER = 3;
  private int maxDuration_;
  /**
   * <pre>
   * requested duration of token before it expires (ms)
   * </pre>
   *
   * <code>optional uint32 max_duration = 3 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the maxDuration field is set.
   */
  @java.lang.Override
  public boolean hasMaxDuration() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * requested duration of token before it expires (ms)
   * </pre>
   *
   * <code>optional uint32 max_duration = 3 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The maxDuration.
   */
  @java.lang.Override
  public int getMaxDuration() {
    return maxDuration_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceUserId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceUserId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, role_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, maxDuration_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, displayName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceUserId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceUserId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, role_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, maxDuration_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, displayName_);
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
    if (!(obj instanceof stream.api.live.CreateAccessTokenRequest)) {
      return super.equals(obj);
    }
    stream.api.live.CreateAccessTokenRequest other = (stream.api.live.CreateAccessTokenRequest) obj;

    if (!getServiceUserId()
        .equals(other.getServiceUserId())) return false;
    if (hasDisplayName() != other.hasDisplayName()) return false;
    if (hasDisplayName()) {
      if (!getDisplayName()
          .equals(other.getDisplayName())) return false;
    }
    if (hasRole() != other.hasRole()) return false;
    if (hasRole()) {
      if (role_ != other.role_) return false;
    }
    if (hasMaxDuration() != other.hasMaxDuration()) return false;
    if (hasMaxDuration()) {
      if (getMaxDuration()
          != other.getMaxDuration()) return false;
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
    hash = (37 * hash) + SERVICE_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceUserId().hashCode();
    if (hasDisplayName()) {
      hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayName().hashCode();
    }
    if (hasRole()) {
      hash = (37 * hash) + ROLE_FIELD_NUMBER;
      hash = (53 * hash) + role_;
    }
    if (hasMaxDuration()) {
      hash = (37 * hash) + MAX_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getMaxDuration();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.CreateAccessTokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CreateAccessTokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateAccessTokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateAccessTokenRequest parseFrom(
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
  public static Builder newBuilder(stream.api.live.CreateAccessTokenRequest prototype) {
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
   * Protobuf type {@code live.v21.CreateAccessTokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.CreateAccessTokenRequest)
      stream.api.live.CreateAccessTokenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_CreateAccessTokenRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_CreateAccessTokenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.CreateAccessTokenRequest.class, stream.api.live.CreateAccessTokenRequest.Builder.class);
    }

    // Construct using stream.api.live.CreateAccessTokenRequest.newBuilder()
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
      serviceUserId_ = "";

      displayName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      role_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      maxDuration_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_CreateAccessTokenRequest_descriptor;
    }

    @java.lang.Override
    public stream.api.live.CreateAccessTokenRequest getDefaultInstanceForType() {
      return stream.api.live.CreateAccessTokenRequest.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.CreateAccessTokenRequest build() {
      stream.api.live.CreateAccessTokenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.CreateAccessTokenRequest buildPartial() {
      stream.api.live.CreateAccessTokenRequest result = new stream.api.live.CreateAccessTokenRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.serviceUserId_ = serviceUserId_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.displayName_ = displayName_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.role_ = role_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxDuration_ = maxDuration_;
        to_bitField0_ |= 0x00000004;
      }
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
      if (other instanceof stream.api.live.CreateAccessTokenRequest) {
        return mergeFrom((stream.api.live.CreateAccessTokenRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.CreateAccessTokenRequest other) {
      if (other == stream.api.live.CreateAccessTokenRequest.getDefaultInstance()) return this;
      if (!other.getServiceUserId().isEmpty()) {
        serviceUserId_ = other.serviceUserId_;
        onChanged();
      }
      if (other.hasDisplayName()) {
        bitField0_ |= 0x00000001;
        displayName_ = other.displayName_;
        onChanged();
      }
      if (other.hasRole()) {
        setRole(other.getRole());
      }
      if (other.hasMaxDuration()) {
        setMaxDuration(other.getMaxDuration());
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
      stream.api.live.CreateAccessTokenRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.CreateAccessTokenRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object serviceUserId_ = "";
    /**
     * <pre>
     * service-specific user id
     * ### Usage
     * * this should be an opaque GUID with no spaces
     * </pre>
     *
     * <code>string service_user_id = 1 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
     * service-specific user id
     * ### Usage
     * * this should be an opaque GUID with no spaces
     * </pre>
     *
     * <code>string service_user_id = 1 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
     * service-specific user id
     * ### Usage
     * * this should be an opaque GUID with no spaces
     * </pre>
     *
     * <code>string service_user_id = 1 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The serviceUserId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * service-specific user id
     * ### Usage
     * * this should be an opaque GUID with no spaces
     * </pre>
     *
     * <code>string service_user_id = 1 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceUserId() {
      
      serviceUserId_ = getDefaultInstance().getServiceUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * service-specific user id
     * ### Usage
     * * this should be an opaque GUID with no spaces
     * </pre>
     *
     * <code>string service_user_id = 1 [json_name = "serviceUserId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for serviceUserId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceUserId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <code>optional string display_name = 4 [json_name = "displayName"];</code>
     * @return Whether the displayName field is set.
     */
    public boolean hasDisplayName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string display_name = 4 [json_name = "displayName"];</code>
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
     * <code>optional string display_name = 4 [json_name = "displayName"];</code>
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
     * <code>optional string display_name = 4 [json_name = "displayName"];</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string display_name = 4 [json_name = "displayName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string display_name = 4 [json_name = "displayName"];</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      displayName_ = value;
      onChanged();
      return this;
    }

    private int role_ = 0;
    /**
     * <pre>
     * the requested role
     * </pre>
     *
     * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the role field is set.
     */
    @java.lang.Override public boolean hasRole() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * the requested role
     * </pre>
     *
     * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The enum numeric value on the wire for role.
     */
    @java.lang.Override public int getRoleValue() {
      return role_;
    }
    /**
     * <pre>
     * the requested role
     * </pre>
     *
     * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {
      bitField0_ |= 0x00000002;
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the requested role
     * </pre>
     *
     * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The role.
     */
    @java.lang.Override
    public stream.api.live.Role getRole() {
      @SuppressWarnings("deprecation")
      stream.api.live.Role result = stream.api.live.Role.valueOf(role_);
      return result == null ? stream.api.live.Role.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the requested role
     * </pre>
     *
     * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(stream.api.live.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the requested role
     * </pre>
     *
     * <code>optional .live.v21.Role role = 2 [json_name = "role", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      bitField0_ = (bitField0_ & ~0x00000002);
      role_ = 0;
      onChanged();
      return this;
    }

    private int maxDuration_ ;
    /**
     * <pre>
     * requested duration of token before it expires (ms)
     * </pre>
     *
     * <code>optional uint32 max_duration = 3 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the maxDuration field is set.
     */
    @java.lang.Override
    public boolean hasMaxDuration() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * requested duration of token before it expires (ms)
     * </pre>
     *
     * <code>optional uint32 max_duration = 3 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The maxDuration.
     */
    @java.lang.Override
    public int getMaxDuration() {
      return maxDuration_;
    }
    /**
     * <pre>
     * requested duration of token before it expires (ms)
     * </pre>
     *
     * <code>optional uint32 max_duration = 3 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The maxDuration to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDuration(int value) {
      bitField0_ |= 0x00000004;
      maxDuration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * requested duration of token before it expires (ms)
     * </pre>
     *
     * <code>optional uint32 max_duration = 3 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxDuration() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxDuration_ = 0;
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


    // @@protoc_insertion_point(builder_scope:live.v21.CreateAccessTokenRequest)
  }

  // @@protoc_insertion_point(class_scope:live.v21.CreateAccessTokenRequest)
  private static final stream.api.live.CreateAccessTokenRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.CreateAccessTokenRequest();
  }

  public static stream.api.live.CreateAccessTokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAccessTokenRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAccessTokenRequest>() {
    @java.lang.Override
    public CreateAccessTokenRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateAccessTokenRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAccessTokenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAccessTokenRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.CreateAccessTokenRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

