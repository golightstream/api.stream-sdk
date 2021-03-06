/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * video encoding CBR rate control params
 * </pre>
 *
 * Protobuf type {@code live.v21.VideoCodecRateControl}
 */
public final class VideoCodecRateControl extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.VideoCodecRateControl)
    VideoCodecRateControlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoCodecRateControl.newBuilder() to construct.
  private VideoCodecRateControl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoCodecRateControl() {
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoCodecRateControl();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VideoCodecRateControl(
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
            int rawValue = input.readEnum();
            bitField0_ |= 0x00000001;
            mode_ = rawValue;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            targetBitrate_ = input.readUInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            maxKeyFrameInterval_ = input.readUInt32();
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
    return stream.api.live.Api.internal_static_live_v21_VideoCodecRateControl_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_VideoCodecRateControl_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.VideoCodecRateControl.class, stream.api.live.VideoCodecRateControl.Builder.class);
  }

  private int bitField0_;
  public static final int MODE_FIELD_NUMBER = 1;
  private int mode_;
  /**
   * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the mode field is set.
   */
  @java.lang.Override public boolean hasMode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override public int getModeValue() {
    return mode_;
  }
  /**
   * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The mode.
   */
  @java.lang.Override public stream.api.live.VideoCodecRateControlMode getMode() {
    @SuppressWarnings("deprecation")
    stream.api.live.VideoCodecRateControlMode result = stream.api.live.VideoCodecRateControlMode.valueOf(mode_);
    return result == null ? stream.api.live.VideoCodecRateControlMode.UNRECOGNIZED : result;
  }

  public static final int TARGET_BITRATE_FIELD_NUMBER = 2;
  private int targetBitrate_;
  /**
   * <pre>
   * video encoding target bitrate (bits/s)
   * </pre>
   *
   * <code>optional uint32 target_bitrate = 2 [json_name = "targetBitrate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the targetBitrate field is set.
   */
  @java.lang.Override
  public boolean hasTargetBitrate() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * video encoding target bitrate (bits/s)
   * </pre>
   *
   * <code>optional uint32 target_bitrate = 2 [json_name = "targetBitrate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The targetBitrate.
   */
  @java.lang.Override
  public int getTargetBitrate() {
    return targetBitrate_;
  }

  public static final int MAX_KEY_FRAME_INTERVAL_FIELD_NUMBER = 3;
  private int maxKeyFrameInterval_;
  /**
   * <pre>
   * maximum video encoding key frame interval (frames)
   * </pre>
   *
   * <code>optional uint32 max_key_frame_interval = 3 [json_name = "maxKeyFrameInterval", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the maxKeyFrameInterval field is set.
   */
  @java.lang.Override
  public boolean hasMaxKeyFrameInterval() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * maximum video encoding key frame interval (frames)
   * </pre>
   *
   * <code>optional uint32 max_key_frame_interval = 3 [json_name = "maxKeyFrameInterval", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The maxKeyFrameInterval.
   */
  @java.lang.Override
  public int getMaxKeyFrameInterval() {
    return maxKeyFrameInterval_;
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
      output.writeEnum(1, mode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, targetBitrate_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, maxKeyFrameInterval_);
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
        .computeEnumSize(1, mode_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, targetBitrate_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, maxKeyFrameInterval_);
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
    if (!(obj instanceof stream.api.live.VideoCodecRateControl)) {
      return super.equals(obj);
    }
    stream.api.live.VideoCodecRateControl other = (stream.api.live.VideoCodecRateControl) obj;

    if (hasMode() != other.hasMode()) return false;
    if (hasMode()) {
      if (mode_ != other.mode_) return false;
    }
    if (hasTargetBitrate() != other.hasTargetBitrate()) return false;
    if (hasTargetBitrate()) {
      if (getTargetBitrate()
          != other.getTargetBitrate()) return false;
    }
    if (hasMaxKeyFrameInterval() != other.hasMaxKeyFrameInterval()) return false;
    if (hasMaxKeyFrameInterval()) {
      if (getMaxKeyFrameInterval()
          != other.getMaxKeyFrameInterval()) return false;
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
    if (hasMode()) {
      hash = (37 * hash) + MODE_FIELD_NUMBER;
      hash = (53 * hash) + mode_;
    }
    if (hasTargetBitrate()) {
      hash = (37 * hash) + TARGET_BITRATE_FIELD_NUMBER;
      hash = (53 * hash) + getTargetBitrate();
    }
    if (hasMaxKeyFrameInterval()) {
      hash = (37 * hash) + MAX_KEY_FRAME_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getMaxKeyFrameInterval();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.VideoCodecRateControl parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.VideoCodecRateControl parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.VideoCodecRateControl parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.VideoCodecRateControl parseFrom(
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
  public static Builder newBuilder(stream.api.live.VideoCodecRateControl prototype) {
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
   * video encoding CBR rate control params
   * </pre>
   *
   * Protobuf type {@code live.v21.VideoCodecRateControl}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.VideoCodecRateControl)
      stream.api.live.VideoCodecRateControlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_VideoCodecRateControl_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_VideoCodecRateControl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.VideoCodecRateControl.class, stream.api.live.VideoCodecRateControl.Builder.class);
    }

    // Construct using stream.api.live.VideoCodecRateControl.newBuilder()
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
      mode_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      targetBitrate_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      maxKeyFrameInterval_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_VideoCodecRateControl_descriptor;
    }

    @java.lang.Override
    public stream.api.live.VideoCodecRateControl getDefaultInstanceForType() {
      return stream.api.live.VideoCodecRateControl.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.VideoCodecRateControl build() {
      stream.api.live.VideoCodecRateControl result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.VideoCodecRateControl buildPartial() {
      stream.api.live.VideoCodecRateControl result = new stream.api.live.VideoCodecRateControl(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mode_ = mode_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetBitrate_ = targetBitrate_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxKeyFrameInterval_ = maxKeyFrameInterval_;
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
      if (other instanceof stream.api.live.VideoCodecRateControl) {
        return mergeFrom((stream.api.live.VideoCodecRateControl)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.VideoCodecRateControl other) {
      if (other == stream.api.live.VideoCodecRateControl.getDefaultInstance()) return this;
      if (other.hasMode()) {
        setMode(other.getMode());
      }
      if (other.hasTargetBitrate()) {
        setTargetBitrate(other.getTargetBitrate());
      }
      if (other.hasMaxKeyFrameInterval()) {
        setMaxKeyFrameInterval(other.getMaxKeyFrameInterval());
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
      stream.api.live.VideoCodecRateControl parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.VideoCodecRateControl) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mode_ = 0;
    /**
     * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the mode field is set.
     */
    @java.lang.Override public boolean hasMode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override public int getModeValue() {
      return mode_;
    }
    /**
     * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      bitField0_ |= 0x00000001;
      mode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The mode.
     */
    @java.lang.Override
    public stream.api.live.VideoCodecRateControlMode getMode() {
      @SuppressWarnings("deprecation")
      stream.api.live.VideoCodecRateControlMode result = stream.api.live.VideoCodecRateControlMode.valueOf(mode_);
      return result == null ? stream.api.live.VideoCodecRateControlMode.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(stream.api.live.VideoCodecRateControlMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mode_ = 0;
      onChanged();
      return this;
    }

    private int targetBitrate_ ;
    /**
     * <pre>
     * video encoding target bitrate (bits/s)
     * </pre>
     *
     * <code>optional uint32 target_bitrate = 2 [json_name = "targetBitrate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the targetBitrate field is set.
     */
    @java.lang.Override
    public boolean hasTargetBitrate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * video encoding target bitrate (bits/s)
     * </pre>
     *
     * <code>optional uint32 target_bitrate = 2 [json_name = "targetBitrate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The targetBitrate.
     */
    @java.lang.Override
    public int getTargetBitrate() {
      return targetBitrate_;
    }
    /**
     * <pre>
     * video encoding target bitrate (bits/s)
     * </pre>
     *
     * <code>optional uint32 target_bitrate = 2 [json_name = "targetBitrate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The targetBitrate to set.
     * @return This builder for chaining.
     */
    public Builder setTargetBitrate(int value) {
      bitField0_ |= 0x00000002;
      targetBitrate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * video encoding target bitrate (bits/s)
     * </pre>
     *
     * <code>optional uint32 target_bitrate = 2 [json_name = "targetBitrate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetBitrate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      targetBitrate_ = 0;
      onChanged();
      return this;
    }

    private int maxKeyFrameInterval_ ;
    /**
     * <pre>
     * maximum video encoding key frame interval (frames)
     * </pre>
     *
     * <code>optional uint32 max_key_frame_interval = 3 [json_name = "maxKeyFrameInterval", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the maxKeyFrameInterval field is set.
     */
    @java.lang.Override
    public boolean hasMaxKeyFrameInterval() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * maximum video encoding key frame interval (frames)
     * </pre>
     *
     * <code>optional uint32 max_key_frame_interval = 3 [json_name = "maxKeyFrameInterval", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The maxKeyFrameInterval.
     */
    @java.lang.Override
    public int getMaxKeyFrameInterval() {
      return maxKeyFrameInterval_;
    }
    /**
     * <pre>
     * maximum video encoding key frame interval (frames)
     * </pre>
     *
     * <code>optional uint32 max_key_frame_interval = 3 [json_name = "maxKeyFrameInterval", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The maxKeyFrameInterval to set.
     * @return This builder for chaining.
     */
    public Builder setMaxKeyFrameInterval(int value) {
      bitField0_ |= 0x00000004;
      maxKeyFrameInterval_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * maximum video encoding key frame interval (frames)
     * </pre>
     *
     * <code>optional uint32 max_key_frame_interval = 3 [json_name = "maxKeyFrameInterval", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxKeyFrameInterval() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxKeyFrameInterval_ = 0;
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


    // @@protoc_insertion_point(builder_scope:live.v21.VideoCodecRateControl)
  }

  // @@protoc_insertion_point(class_scope:live.v21.VideoCodecRateControl)
  private static final stream.api.live.VideoCodecRateControl DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.VideoCodecRateControl();
  }

  public static stream.api.live.VideoCodecRateControl getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoCodecRateControl>
      PARSER = new com.google.protobuf.AbstractParser<VideoCodecRateControl>() {
    @java.lang.Override
    public VideoCodecRateControl parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VideoCodecRateControl(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoCodecRateControl> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoCodecRateControl> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.VideoCodecRateControl getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

