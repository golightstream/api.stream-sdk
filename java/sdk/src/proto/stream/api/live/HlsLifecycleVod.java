/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * vod hls lifecycle management
 * </pre>
 *
 * Protobuf type {@code live.v21.HlsLifecycleVod}
 */
public final class HlsLifecycleVod extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.HlsLifecycleVod)
    HlsLifecycleVodOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HlsLifecycleVod.newBuilder() to construct.
  private HlsLifecycleVod(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HlsLifecycleVod() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HlsLifecycleVod();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HlsLifecycleVod(
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
          case 8: {
            bitField0_ |= 0x00000001;
            maxDuration_ = input.readInt32();
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
    return stream.api.live.Api.internal_static_live_v21_HlsLifecycleVod_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_HlsLifecycleVod_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.HlsLifecycleVod.class, stream.api.live.HlsLifecycleVod.Builder.class);
  }

  private int bitField0_;
  public static final int MAX_DURATION_FIELD_NUMBER = 1;
  private int maxDuration_;
  /**
   * <pre>
   * max duration of the recording in ms (0 is indefinite)
   * </pre>
   *
   * <code>optional int32 max_duration = 1 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the maxDuration field is set.
   */
  @java.lang.Override
  public boolean hasMaxDuration() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * max duration of the recording in ms (0 is indefinite)
   * </pre>
   *
   * <code>optional int32 max_duration = 1 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, maxDuration_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, maxDuration_);
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
    if (!(obj instanceof stream.api.live.HlsLifecycleVod)) {
      return super.equals(obj);
    }
    stream.api.live.HlsLifecycleVod other = (stream.api.live.HlsLifecycleVod) obj;

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
    if (hasMaxDuration()) {
      hash = (37 * hash) + MAX_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getMaxDuration();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.HlsLifecycleVod parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycleVod parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.HlsLifecycleVod parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.HlsLifecycleVod parseFrom(
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
  public static Builder newBuilder(stream.api.live.HlsLifecycleVod prototype) {
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
   * vod hls lifecycle management
   * </pre>
   *
   * Protobuf type {@code live.v21.HlsLifecycleVod}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.HlsLifecycleVod)
      stream.api.live.HlsLifecycleVodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_HlsLifecycleVod_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_HlsLifecycleVod_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.HlsLifecycleVod.class, stream.api.live.HlsLifecycleVod.Builder.class);
    }

    // Construct using stream.api.live.HlsLifecycleVod.newBuilder()
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
      maxDuration_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_HlsLifecycleVod_descriptor;
    }

    @java.lang.Override
    public stream.api.live.HlsLifecycleVod getDefaultInstanceForType() {
      return stream.api.live.HlsLifecycleVod.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.HlsLifecycleVod build() {
      stream.api.live.HlsLifecycleVod result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.HlsLifecycleVod buildPartial() {
      stream.api.live.HlsLifecycleVod result = new stream.api.live.HlsLifecycleVod(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxDuration_ = maxDuration_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof stream.api.live.HlsLifecycleVod) {
        return mergeFrom((stream.api.live.HlsLifecycleVod)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.HlsLifecycleVod other) {
      if (other == stream.api.live.HlsLifecycleVod.getDefaultInstance()) return this;
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
      stream.api.live.HlsLifecycleVod parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.HlsLifecycleVod) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int maxDuration_ ;
    /**
     * <pre>
     * max duration of the recording in ms (0 is indefinite)
     * </pre>
     *
     * <code>optional int32 max_duration = 1 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the maxDuration field is set.
     */
    @java.lang.Override
    public boolean hasMaxDuration() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * max duration of the recording in ms (0 is indefinite)
     * </pre>
     *
     * <code>optional int32 max_duration = 1 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The maxDuration.
     */
    @java.lang.Override
    public int getMaxDuration() {
      return maxDuration_;
    }
    /**
     * <pre>
     * max duration of the recording in ms (0 is indefinite)
     * </pre>
     *
     * <code>optional int32 max_duration = 1 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The maxDuration to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDuration(int value) {
      bitField0_ |= 0x00000001;
      maxDuration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * max duration of the recording in ms (0 is indefinite)
     * </pre>
     *
     * <code>optional int32 max_duration = 1 [json_name = "maxDuration", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:live.v21.HlsLifecycleVod)
  }

  // @@protoc_insertion_point(class_scope:live.v21.HlsLifecycleVod)
  private static final stream.api.live.HlsLifecycleVod DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.HlsLifecycleVod();
  }

  public static stream.api.live.HlsLifecycleVod getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HlsLifecycleVod>
      PARSER = new com.google.protobuf.AbstractParser<HlsLifecycleVod>() {
    @java.lang.Override
    public HlsLifecycleVod parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HlsLifecycleVod(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HlsLifecycleVod> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HlsLifecycleVod> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.HlsLifecycleVod getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
