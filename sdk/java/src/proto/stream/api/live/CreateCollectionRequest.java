/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.CreateCollectionRequest}
 */
public final class CreateCollectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.CreateCollectionRequest)
    CreateCollectionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCollectionRequest.newBuilder() to construct.
  private CreateCollectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCollectionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCollectionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateCollectionRequest(
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
            com.google.protobuf.Value.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = metadata_.toBuilder();
            }
            metadata_ = input.readMessage(com.google.protobuf.Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metadata_);
              metadata_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return stream.api.live.Api.internal_static_live_v21_CreateCollectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_CreateCollectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.CreateCollectionRequest.class, stream.api.live.CreateCollectionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int METADATA_FIELD_NUMBER = 1;
  private com.google.protobuf.Value metadata_;
  /**
   * <pre>
   * arbitrary metadata to associate with this collection
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * arbitrary metadata to associate with this collection
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.protobuf.Value getMetadata() {
    return metadata_ == null ? com.google.protobuf.Value.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * arbitrary metadata to associate with this collection
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.ValueOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.google.protobuf.Value.getDefaultInstance() : metadata_;
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
      output.writeMessage(1, getMetadata());
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
        .computeMessageSize(1, getMetadata());
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
    if (!(obj instanceof stream.api.live.CreateCollectionRequest)) {
      return super.equals(obj);
    }
    stream.api.live.CreateCollectionRequest other = (stream.api.live.CreateCollectionRequest) obj;

    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.CreateCollectionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateCollectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateCollectionRequest parseFrom(
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
  public static Builder newBuilder(stream.api.live.CreateCollectionRequest prototype) {
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
   * Protobuf type {@code live.v21.CreateCollectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.CreateCollectionRequest)
      stream.api.live.CreateCollectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_CreateCollectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_CreateCollectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.CreateCollectionRequest.class, stream.api.live.CreateCollectionRequest.Builder.class);
    }

    // Construct using stream.api.live.CreateCollectionRequest.newBuilder()
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
        getMetadataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_CreateCollectionRequest_descriptor;
    }

    @java.lang.Override
    public stream.api.live.CreateCollectionRequest getDefaultInstanceForType() {
      return stream.api.live.CreateCollectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.CreateCollectionRequest build() {
      stream.api.live.CreateCollectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.CreateCollectionRequest buildPartial() {
      stream.api.live.CreateCollectionRequest result = new stream.api.live.CreateCollectionRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
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
      if (other instanceof stream.api.live.CreateCollectionRequest) {
        return mergeFrom((stream.api.live.CreateCollectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.CreateCollectionRequest other) {
      if (other == stream.api.live.CreateCollectionRequest.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
      stream.api.live.CreateCollectionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.CreateCollectionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Value metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The metadata.
     */
    public com.google.protobuf.Value getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.google.protobuf.Value.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setMetadata(com.google.protobuf.Value value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setMetadata(
        com.google.protobuf.Value.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeMetadata(com.google.protobuf.Value value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            metadata_ != null &&
            metadata_ != com.google.protobuf.Value.getDefaultInstance()) {
          metadata_ =
            com.google.protobuf.Value.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.google.protobuf.Value.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.google.protobuf.ValueOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.google.protobuf.Value.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * arbitrary metadata to associate with this collection
     * </pre>
     *
     * <code>optional .google.protobuf.Value metadata = 1 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:live.v21.CreateCollectionRequest)
  }

  // @@protoc_insertion_point(class_scope:live.v21.CreateCollectionRequest)
  private static final stream.api.live.CreateCollectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.CreateCollectionRequest();
  }

  public static stream.api.live.CreateCollectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCollectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCollectionRequest>() {
    @java.lang.Override
    public CreateCollectionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateCollectionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateCollectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCollectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.CreateCollectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

