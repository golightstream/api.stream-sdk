/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * composition video parameters
 * </pre>
 *
 * Protobuf type {@code live.v21.VideoRendering}
 */
public final class VideoRendering extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.VideoRendering)
    VideoRenderingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoRendering.newBuilder() to construct.
  private VideoRendering(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoRendering() {
    colorSpace_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoRendering();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VideoRendering(
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
            height_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            width_ = input.readUInt32();
            break;
          }
          case 29: {
            bitField0_ |= 0x00000004;
            framerate_ = input.readFloat();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();
            bitField0_ |= 0x00000008;
            colorSpace_ = rawValue;
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
    return stream.api.live.Api.internal_static_live_v21_VideoRendering_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_VideoRendering_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.VideoRendering.class, stream.api.live.VideoRendering.Builder.class);
  }

  private int bitField0_;
  public static final int HEIGHT_FIELD_NUMBER = 1;
  private int height_;
  /**
   * <pre>
   * canvas height (pixels)
   * </pre>
   *
   * <code>optional uint32 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the height field is set.
   */
  @java.lang.Override
  public boolean hasHeight() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * canvas height (pixels)
   * </pre>
   *
   * <code>optional uint32 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }

  public static final int WIDTH_FIELD_NUMBER = 2;
  private int width_;
  /**
   * <pre>
   * canvas width (pixels)
   * </pre>
   *
   * <code>optional uint32 width = 2 [json_name = "width", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the width field is set.
   */
  @java.lang.Override
  public boolean hasWidth() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * canvas width (pixels)
   * </pre>
   *
   * <code>optional uint32 width = 2 [json_name = "width", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }

  public static final int FRAMERATE_FIELD_NUMBER = 3;
  private float framerate_;
  /**
   * <pre>
   * canvas frame rate (frames/s)
   * </pre>
   *
   * <code>optional float framerate = 3 [json_name = "framerate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the framerate field is set.
   */
  @java.lang.Override
  public boolean hasFramerate() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * canvas frame rate (frames/s)
   * </pre>
   *
   * <code>optional float framerate = 3 [json_name = "framerate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The framerate.
   */
  @java.lang.Override
  public float getFramerate() {
    return framerate_;
  }

  public static final int COLOR_SPACE_FIELD_NUMBER = 4;
  private int colorSpace_;
  /**
   * <pre>
   * rendering color space
   * </pre>
   *
   * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the colorSpace field is set.
   */
  @java.lang.Override public boolean hasColorSpace() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * rendering color space
   * </pre>
   *
   * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for colorSpace.
   */
  @java.lang.Override public int getColorSpaceValue() {
    return colorSpace_;
  }
  /**
   * <pre>
   * rendering color space
   * </pre>
   *
   * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The colorSpace.
   */
  @java.lang.Override public stream.api.live.VideoColorSpace getColorSpace() {
    @SuppressWarnings("deprecation")
    stream.api.live.VideoColorSpace result = stream.api.live.VideoColorSpace.valueOf(colorSpace_);
    return result == null ? stream.api.live.VideoColorSpace.UNRECOGNIZED : result;
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
      output.writeUInt32(1, height_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, width_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeFloat(3, framerate_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeEnum(4, colorSpace_);
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
        .computeUInt32Size(1, height_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, width_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, framerate_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, colorSpace_);
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
    if (!(obj instanceof stream.api.live.VideoRendering)) {
      return super.equals(obj);
    }
    stream.api.live.VideoRendering other = (stream.api.live.VideoRendering) obj;

    if (hasHeight() != other.hasHeight()) return false;
    if (hasHeight()) {
      if (getHeight()
          != other.getHeight()) return false;
    }
    if (hasWidth() != other.hasWidth()) return false;
    if (hasWidth()) {
      if (getWidth()
          != other.getWidth()) return false;
    }
    if (hasFramerate() != other.hasFramerate()) return false;
    if (hasFramerate()) {
      if (java.lang.Float.floatToIntBits(getFramerate())
          != java.lang.Float.floatToIntBits(
              other.getFramerate())) return false;
    }
    if (hasColorSpace() != other.hasColorSpace()) return false;
    if (hasColorSpace()) {
      if (colorSpace_ != other.colorSpace_) return false;
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
    if (hasHeight()) {
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getHeight();
    }
    if (hasWidth()) {
      hash = (37 * hash) + WIDTH_FIELD_NUMBER;
      hash = (53 * hash) + getWidth();
    }
    if (hasFramerate()) {
      hash = (37 * hash) + FRAMERATE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFramerate());
    }
    if (hasColorSpace()) {
      hash = (37 * hash) + COLOR_SPACE_FIELD_NUMBER;
      hash = (53 * hash) + colorSpace_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.VideoRendering parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.VideoRendering parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.VideoRendering parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.VideoRendering parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.VideoRendering parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.VideoRendering parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.VideoRendering parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.VideoRendering parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.VideoRendering parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.VideoRendering parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.VideoRendering parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.VideoRendering parseFrom(
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
  public static Builder newBuilder(stream.api.live.VideoRendering prototype) {
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
   * composition video parameters
   * </pre>
   *
   * Protobuf type {@code live.v21.VideoRendering}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.VideoRendering)
      stream.api.live.VideoRenderingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_VideoRendering_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_VideoRendering_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.VideoRendering.class, stream.api.live.VideoRendering.Builder.class);
    }

    // Construct using stream.api.live.VideoRendering.newBuilder()
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
      height_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      width_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      framerate_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000004);
      colorSpace_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_VideoRendering_descriptor;
    }

    @java.lang.Override
    public stream.api.live.VideoRendering getDefaultInstanceForType() {
      return stream.api.live.VideoRendering.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.VideoRendering build() {
      stream.api.live.VideoRendering result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.VideoRendering buildPartial() {
      stream.api.live.VideoRendering result = new stream.api.live.VideoRendering(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = height_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.width_ = width_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.framerate_ = framerate_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        to_bitField0_ |= 0x00000008;
      }
      result.colorSpace_ = colorSpace_;
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
      if (other instanceof stream.api.live.VideoRendering) {
        return mergeFrom((stream.api.live.VideoRendering)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.VideoRendering other) {
      if (other == stream.api.live.VideoRendering.getDefaultInstance()) return this;
      if (other.hasHeight()) {
        setHeight(other.getHeight());
      }
      if (other.hasWidth()) {
        setWidth(other.getWidth());
      }
      if (other.hasFramerate()) {
        setFramerate(other.getFramerate());
      }
      if (other.hasColorSpace()) {
        setColorSpace(other.getColorSpace());
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
      stream.api.live.VideoRendering parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.VideoRendering) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int height_ ;
    /**
     * <pre>
     * canvas height (pixels)
     * </pre>
     *
     * <code>optional uint32 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the height field is set.
     */
    @java.lang.Override
    public boolean hasHeight() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * canvas height (pixels)
     * </pre>
     *
     * <code>optional uint32 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     * canvas height (pixels)
     * </pre>
     *
     * <code>optional uint32 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      bitField0_ |= 0x00000001;
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * canvas height (pixels)
     * </pre>
     *
     * <code>optional uint32 height = 1 [json_name = "height", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = 0;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <pre>
     * canvas width (pixels)
     * </pre>
     *
     * <code>optional uint32 width = 2 [json_name = "width", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the width field is set.
     */
    @java.lang.Override
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * canvas width (pixels)
     * </pre>
     *
     * <code>optional uint32 width = 2 [json_name = "width", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }
    /**
     * <pre>
     * canvas width (pixels)
     * </pre>
     *
     * <code>optional uint32 width = 2 [json_name = "width", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      bitField0_ |= 0x00000002;
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * canvas width (pixels)
     * </pre>
     *
     * <code>optional uint32 width = 2 [json_name = "width", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000002);
      width_ = 0;
      onChanged();
      return this;
    }

    private float framerate_ ;
    /**
     * <pre>
     * canvas frame rate (frames/s)
     * </pre>
     *
     * <code>optional float framerate = 3 [json_name = "framerate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the framerate field is set.
     */
    @java.lang.Override
    public boolean hasFramerate() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * canvas frame rate (frames/s)
     * </pre>
     *
     * <code>optional float framerate = 3 [json_name = "framerate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The framerate.
     */
    @java.lang.Override
    public float getFramerate() {
      return framerate_;
    }
    /**
     * <pre>
     * canvas frame rate (frames/s)
     * </pre>
     *
     * <code>optional float framerate = 3 [json_name = "framerate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The framerate to set.
     * @return This builder for chaining.
     */
    public Builder setFramerate(float value) {
      bitField0_ |= 0x00000004;
      framerate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * canvas frame rate (frames/s)
     * </pre>
     *
     * <code>optional float framerate = 3 [json_name = "framerate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearFramerate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      framerate_ = 0F;
      onChanged();
      return this;
    }

    private int colorSpace_ = 0;
    /**
     * <pre>
     * rendering color space
     * </pre>
     *
     * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the colorSpace field is set.
     */
    @java.lang.Override public boolean hasColorSpace() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * rendering color space
     * </pre>
     *
     * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The enum numeric value on the wire for colorSpace.
     */
    @java.lang.Override public int getColorSpaceValue() {
      return colorSpace_;
    }
    /**
     * <pre>
     * rendering color space
     * </pre>
     *
     * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The enum numeric value on the wire for colorSpace to set.
     * @return This builder for chaining.
     */
    public Builder setColorSpaceValue(int value) {
      bitField0_ |= 0x00000008;
      colorSpace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * rendering color space
     * </pre>
     *
     * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The colorSpace.
     */
    @java.lang.Override
    public stream.api.live.VideoColorSpace getColorSpace() {
      @SuppressWarnings("deprecation")
      stream.api.live.VideoColorSpace result = stream.api.live.VideoColorSpace.valueOf(colorSpace_);
      return result == null ? stream.api.live.VideoColorSpace.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * rendering color space
     * </pre>
     *
     * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The colorSpace to set.
     * @return This builder for chaining.
     */
    public Builder setColorSpace(stream.api.live.VideoColorSpace value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      colorSpace_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * rendering color space
     * </pre>
     *
     * <code>optional .live.v21.VideoColorSpace color_space = 4 [json_name = "colorSpace", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearColorSpace() {
      bitField0_ = (bitField0_ & ~0x00000008);
      colorSpace_ = 0;
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


    // @@protoc_insertion_point(builder_scope:live.v21.VideoRendering)
  }

  // @@protoc_insertion_point(class_scope:live.v21.VideoRendering)
  private static final stream.api.live.VideoRendering DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.VideoRendering();
  }

  public static stream.api.live.VideoRendering getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoRendering>
      PARSER = new com.google.protobuf.AbstractParser<VideoRendering>() {
    @java.lang.Override
    public VideoRendering parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VideoRendering(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoRendering> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoRendering> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.VideoRendering getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

