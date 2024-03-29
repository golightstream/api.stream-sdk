/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * hls lifecycle management
 * </pre>
 *
 * Protobuf type {@code live.v21.HlsLifecycle}
 */
public final class HlsLifecycle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.HlsLifecycle)
    HlsLifecycleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HlsLifecycle.newBuilder() to construct.
  private HlsLifecycle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HlsLifecycle() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HlsLifecycle();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HlsLifecycle(
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
            stream.api.live.HlsLifecycleVod.Builder subBuilder = null;
            if (typeCase_ == 1) {
              subBuilder = ((stream.api.live.HlsLifecycleVod) type_).toBuilder();
            }
            type_ =
                input.readMessage(stream.api.live.HlsLifecycleVod.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((stream.api.live.HlsLifecycleVod) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 1;
            break;
          }
          case 18: {
            stream.api.live.HlsLifecycleLive.Builder subBuilder = null;
            if (typeCase_ == 2) {
              subBuilder = ((stream.api.live.HlsLifecycleLive) type_).toBuilder();
            }
            type_ =
                input.readMessage(stream.api.live.HlsLifecycleLive.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((stream.api.live.HlsLifecycleLive) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 2;
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
    return stream.api.live.Api.internal_static_live_v21_HlsLifecycle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_HlsLifecycle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.HlsLifecycle.class, stream.api.live.HlsLifecycle.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    VOD(1),
    LIVE(2),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return VOD;
        case 2: return LIVE;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int VOD_FIELD_NUMBER = 1;
  /**
   * <pre>
   * lifecycle of vod
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the vod field is set.
   */
  @java.lang.Override
  public boolean hasVod() {
    return typeCase_ == 1;
  }
  /**
   * <pre>
   * lifecycle of vod
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The vod.
   */
  @java.lang.Override
  public stream.api.live.HlsLifecycleVod getVod() {
    if (typeCase_ == 1) {
       return (stream.api.live.HlsLifecycleVod) type_;
    }
    return stream.api.live.HlsLifecycleVod.getDefaultInstance();
  }
  /**
   * <pre>
   * lifecycle of vod
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public stream.api.live.HlsLifecycleVodOrBuilder getVodOrBuilder() {
    if (typeCase_ == 1) {
       return (stream.api.live.HlsLifecycleVod) type_;
    }
    return stream.api.live.HlsLifecycleVod.getDefaultInstance();
  }

  public static final int LIVE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * lifecycle of live
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
   * @return Whether the live field is set.
   */
  @java.lang.Override
  public boolean hasLive() {
    return typeCase_ == 2;
  }
  /**
   * <pre>
   * lifecycle of live
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
   * @return The live.
   */
  @java.lang.Override
  public stream.api.live.HlsLifecycleLive getLive() {
    if (typeCase_ == 2) {
       return (stream.api.live.HlsLifecycleLive) type_;
    }
    return stream.api.live.HlsLifecycleLive.getDefaultInstance();
  }
  /**
   * <pre>
   * lifecycle of live
   * </pre>
   *
   * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
   */
  @java.lang.Override
  public stream.api.live.HlsLifecycleLiveOrBuilder getLiveOrBuilder() {
    if (typeCase_ == 2) {
       return (stream.api.live.HlsLifecycleLive) type_;
    }
    return stream.api.live.HlsLifecycleLive.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (stream.api.live.HlsLifecycleVod) type_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (stream.api.live.HlsLifecycleLive) type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (stream.api.live.HlsLifecycleVod) type_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (stream.api.live.HlsLifecycleLive) type_);
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
    if (!(obj instanceof stream.api.live.HlsLifecycle)) {
      return super.equals(obj);
    }
    stream.api.live.HlsLifecycle other = (stream.api.live.HlsLifecycle) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getVod()
            .equals(other.getVod())) return false;
        break;
      case 2:
        if (!getLive()
            .equals(other.getLive())) return false;
        break;
      case 0:
      default:
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + VOD_FIELD_NUMBER;
        hash = (53 * hash) + getVod().hashCode();
        break;
      case 2:
        hash = (37 * hash) + LIVE_FIELD_NUMBER;
        hash = (53 * hash) + getLive().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.HlsLifecycle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.HlsLifecycle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.HlsLifecycle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.HlsLifecycle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.HlsLifecycle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.HlsLifecycle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.HlsLifecycle parseFrom(
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
  public static Builder newBuilder(stream.api.live.HlsLifecycle prototype) {
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
   * hls lifecycle management
   * </pre>
   *
   * Protobuf type {@code live.v21.HlsLifecycle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.HlsLifecycle)
      stream.api.live.HlsLifecycleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_HlsLifecycle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_HlsLifecycle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.HlsLifecycle.class, stream.api.live.HlsLifecycle.Builder.class);
    }

    // Construct using stream.api.live.HlsLifecycle.newBuilder()
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
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_HlsLifecycle_descriptor;
    }

    @java.lang.Override
    public stream.api.live.HlsLifecycle getDefaultInstanceForType() {
      return stream.api.live.HlsLifecycle.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.HlsLifecycle build() {
      stream.api.live.HlsLifecycle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.HlsLifecycle buildPartial() {
      stream.api.live.HlsLifecycle result = new stream.api.live.HlsLifecycle(this);
      if (typeCase_ == 1) {
        if (vodBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = vodBuilder_.build();
        }
      }
      if (typeCase_ == 2) {
        if (liveBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = liveBuilder_.build();
        }
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof stream.api.live.HlsLifecycle) {
        return mergeFrom((stream.api.live.HlsLifecycle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.HlsLifecycle other) {
      if (other == stream.api.live.HlsLifecycle.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case VOD: {
          mergeVod(other.getVod());
          break;
        }
        case LIVE: {
          mergeLive(other.getLive());
          break;
        }
        case TYPE_NOT_SET: {
          break;
        }
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
      stream.api.live.HlsLifecycle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.HlsLifecycle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.HlsLifecycleVod, stream.api.live.HlsLifecycleVod.Builder, stream.api.live.HlsLifecycleVodOrBuilder> vodBuilder_;
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the vod field is set.
     */
    @java.lang.Override
    public boolean hasVod() {
      return typeCase_ == 1;
    }
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The vod.
     */
    @java.lang.Override
    public stream.api.live.HlsLifecycleVod getVod() {
      if (vodBuilder_ == null) {
        if (typeCase_ == 1) {
          return (stream.api.live.HlsLifecycleVod) type_;
        }
        return stream.api.live.HlsLifecycleVod.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return vodBuilder_.getMessage();
        }
        return stream.api.live.HlsLifecycleVod.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setVod(stream.api.live.HlsLifecycleVod value) {
      if (vodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        vodBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setVod(
        stream.api.live.HlsLifecycleVod.Builder builderForValue) {
      if (vodBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        vodBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeVod(stream.api.live.HlsLifecycleVod value) {
      if (vodBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != stream.api.live.HlsLifecycleVod.getDefaultInstance()) {
          type_ = stream.api.live.HlsLifecycleVod.newBuilder((stream.api.live.HlsLifecycleVod) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          vodBuilder_.mergeFrom(value);
        }
        vodBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearVod() {
      if (vodBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        vodBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public stream.api.live.HlsLifecycleVod.Builder getVodBuilder() {
      return getVodFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    @java.lang.Override
    public stream.api.live.HlsLifecycleVodOrBuilder getVodOrBuilder() {
      if ((typeCase_ == 1) && (vodBuilder_ != null)) {
        return vodBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (stream.api.live.HlsLifecycleVod) type_;
        }
        return stream.api.live.HlsLifecycleVod.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * lifecycle of vod
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleVod vod = 1 [json_name = "vod", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.HlsLifecycleVod, stream.api.live.HlsLifecycleVod.Builder, stream.api.live.HlsLifecycleVodOrBuilder> 
        getVodFieldBuilder() {
      if (vodBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = stream.api.live.HlsLifecycleVod.getDefaultInstance();
        }
        vodBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.HlsLifecycleVod, stream.api.live.HlsLifecycleVod.Builder, stream.api.live.HlsLifecycleVodOrBuilder>(
                (stream.api.live.HlsLifecycleVod) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();;
      return vodBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.HlsLifecycleLive, stream.api.live.HlsLifecycleLive.Builder, stream.api.live.HlsLifecycleLiveOrBuilder> liveBuilder_;
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     * @return Whether the live field is set.
     */
    @java.lang.Override
    public boolean hasLive() {
      return typeCase_ == 2;
    }
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     * @return The live.
     */
    @java.lang.Override
    public stream.api.live.HlsLifecycleLive getLive() {
      if (liveBuilder_ == null) {
        if (typeCase_ == 2) {
          return (stream.api.live.HlsLifecycleLive) type_;
        }
        return stream.api.live.HlsLifecycleLive.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return liveBuilder_.getMessage();
        }
        return stream.api.live.HlsLifecycleLive.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     */
    public Builder setLive(stream.api.live.HlsLifecycleLive value) {
      if (liveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        liveBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     */
    public Builder setLive(
        stream.api.live.HlsLifecycleLive.Builder builderForValue) {
      if (liveBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        liveBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     */
    public Builder mergeLive(stream.api.live.HlsLifecycleLive value) {
      if (liveBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != stream.api.live.HlsLifecycleLive.getDefaultInstance()) {
          type_ = stream.api.live.HlsLifecycleLive.newBuilder((stream.api.live.HlsLifecycleLive) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          liveBuilder_.mergeFrom(value);
        }
        liveBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     */
    public Builder clearLive() {
      if (liveBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        liveBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     */
    public stream.api.live.HlsLifecycleLive.Builder getLiveBuilder() {
      return getLiveFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     */
    @java.lang.Override
    public stream.api.live.HlsLifecycleLiveOrBuilder getLiveOrBuilder() {
      if ((typeCase_ == 2) && (liveBuilder_ != null)) {
        return liveBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (stream.api.live.HlsLifecycleLive) type_;
        }
        return stream.api.live.HlsLifecycleLive.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * lifecycle of live
     * </pre>
     *
     * <code>.live.v21.HlsLifecycleLive live = 2 [json_name = "live"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.HlsLifecycleLive, stream.api.live.HlsLifecycleLive.Builder, stream.api.live.HlsLifecycleLiveOrBuilder> 
        getLiveFieldBuilder() {
      if (liveBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = stream.api.live.HlsLifecycleLive.getDefaultInstance();
        }
        liveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.HlsLifecycleLive, stream.api.live.HlsLifecycleLive.Builder, stream.api.live.HlsLifecycleLiveOrBuilder>(
                (stream.api.live.HlsLifecycleLive) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();;
      return liveBuilder_;
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


    // @@protoc_insertion_point(builder_scope:live.v21.HlsLifecycle)
  }

  // @@protoc_insertion_point(class_scope:live.v21.HlsLifecycle)
  private static final stream.api.live.HlsLifecycle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.HlsLifecycle();
  }

  public static stream.api.live.HlsLifecycle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HlsLifecycle>
      PARSER = new com.google.protobuf.AbstractParser<HlsLifecycle>() {
    @java.lang.Override
    public HlsLifecycle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HlsLifecycle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HlsLifecycle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HlsLifecycle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.HlsLifecycle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

