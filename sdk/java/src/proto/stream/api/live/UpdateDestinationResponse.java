/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.UpdateDestinationResponse}
 */
public final class UpdateDestinationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.UpdateDestinationResponse)
    UpdateDestinationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDestinationResponse.newBuilder() to construct.
  private UpdateDestinationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDestinationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDestinationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateDestinationResponse(
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
            stream.api.live.Destination.Builder subBuilder = null;
            if (destination_ != null) {
              subBuilder = destination_.toBuilder();
            }
            destination_ = input.readMessage(stream.api.live.Destination.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(destination_);
              destination_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            broadcastUpdated_ = input.readBool();
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
    return stream.api.live.Api.internal_static_live_v21_UpdateDestinationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_UpdateDestinationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.UpdateDestinationResponse.class, stream.api.live.UpdateDestinationResponse.Builder.class);
  }

  public static final int DESTINATION_FIELD_NUMBER = 1;
  private stream.api.live.Destination destination_;
  /**
   * <pre>
   * updated destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
   * @return Whether the destination field is set.
   */
  @java.lang.Override
  public boolean hasDestination() {
    return destination_ != null;
  }
  /**
   * <pre>
   * updated destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
   * @return The destination.
   */
  @java.lang.Override
  public stream.api.live.Destination getDestination() {
    return destination_ == null ? stream.api.live.Destination.getDefaultInstance() : destination_;
  }
  /**
   * <pre>
   * updated destination
   * </pre>
   *
   * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
   */
  @java.lang.Override
  public stream.api.live.DestinationOrBuilder getDestinationOrBuilder() {
    return getDestination();
  }

  public static final int BROADCAST_UPDATED_FIELD_NUMBER = 2;
  private boolean broadcastUpdated_;
  /**
   * <pre>
   * indicates whether the broadcast was updated as a function of this request
   * </pre>
   *
   * <code>bool broadcast_updated = 2 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The broadcastUpdated.
   */
  @java.lang.Override
  public boolean getBroadcastUpdated() {
    return broadcastUpdated_;
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
    if (destination_ != null) {
      output.writeMessage(1, getDestination());
    }
    if (broadcastUpdated_ != false) {
      output.writeBool(2, broadcastUpdated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (destination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDestination());
    }
    if (broadcastUpdated_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, broadcastUpdated_);
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
    if (!(obj instanceof stream.api.live.UpdateDestinationResponse)) {
      return super.equals(obj);
    }
    stream.api.live.UpdateDestinationResponse other = (stream.api.live.UpdateDestinationResponse) obj;

    if (hasDestination() != other.hasDestination()) return false;
    if (hasDestination()) {
      if (!getDestination()
          .equals(other.getDestination())) return false;
    }
    if (getBroadcastUpdated()
        != other.getBroadcastUpdated()) return false;
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
    if (hasDestination()) {
      hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getDestination().hashCode();
    }
    hash = (37 * hash) + BROADCAST_UPDATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBroadcastUpdated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.UpdateDestinationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.UpdateDestinationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.UpdateDestinationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.UpdateDestinationResponse parseFrom(
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
  public static Builder newBuilder(stream.api.live.UpdateDestinationResponse prototype) {
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
   * Protobuf type {@code live.v21.UpdateDestinationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.UpdateDestinationResponse)
      stream.api.live.UpdateDestinationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_UpdateDestinationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_UpdateDestinationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.UpdateDestinationResponse.class, stream.api.live.UpdateDestinationResponse.Builder.class);
    }

    // Construct using stream.api.live.UpdateDestinationResponse.newBuilder()
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
      if (destinationBuilder_ == null) {
        destination_ = null;
      } else {
        destination_ = null;
        destinationBuilder_ = null;
      }
      broadcastUpdated_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_UpdateDestinationResponse_descriptor;
    }

    @java.lang.Override
    public stream.api.live.UpdateDestinationResponse getDefaultInstanceForType() {
      return stream.api.live.UpdateDestinationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.UpdateDestinationResponse build() {
      stream.api.live.UpdateDestinationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.UpdateDestinationResponse buildPartial() {
      stream.api.live.UpdateDestinationResponse result = new stream.api.live.UpdateDestinationResponse(this);
      if (destinationBuilder_ == null) {
        result.destination_ = destination_;
      } else {
        result.destination_ = destinationBuilder_.build();
      }
      result.broadcastUpdated_ = broadcastUpdated_;
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
      if (other instanceof stream.api.live.UpdateDestinationResponse) {
        return mergeFrom((stream.api.live.UpdateDestinationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.UpdateDestinationResponse other) {
      if (other == stream.api.live.UpdateDestinationResponse.getDefaultInstance()) return this;
      if (other.hasDestination()) {
        mergeDestination(other.getDestination());
      }
      if (other.getBroadcastUpdated() != false) {
        setBroadcastUpdated(other.getBroadcastUpdated());
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
      stream.api.live.UpdateDestinationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.UpdateDestinationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private stream.api.live.Destination destination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.Destination, stream.api.live.Destination.Builder, stream.api.live.DestinationOrBuilder> destinationBuilder_;
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     * @return Whether the destination field is set.
     */
    public boolean hasDestination() {
      return destinationBuilder_ != null || destination_ != null;
    }
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     * @return The destination.
     */
    public stream.api.live.Destination getDestination() {
      if (destinationBuilder_ == null) {
        return destination_ == null ? stream.api.live.Destination.getDefaultInstance() : destination_;
      } else {
        return destinationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     */
    public Builder setDestination(stream.api.live.Destination value) {
      if (destinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        destination_ = value;
        onChanged();
      } else {
        destinationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     */
    public Builder setDestination(
        stream.api.live.Destination.Builder builderForValue) {
      if (destinationBuilder_ == null) {
        destination_ = builderForValue.build();
        onChanged();
      } else {
        destinationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     */
    public Builder mergeDestination(stream.api.live.Destination value) {
      if (destinationBuilder_ == null) {
        if (destination_ != null) {
          destination_ =
            stream.api.live.Destination.newBuilder(destination_).mergeFrom(value).buildPartial();
        } else {
          destination_ = value;
        }
        onChanged();
      } else {
        destinationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     */
    public Builder clearDestination() {
      if (destinationBuilder_ == null) {
        destination_ = null;
        onChanged();
      } else {
        destination_ = null;
        destinationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     */
    public stream.api.live.Destination.Builder getDestinationBuilder() {
      
      onChanged();
      return getDestinationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     */
    public stream.api.live.DestinationOrBuilder getDestinationOrBuilder() {
      if (destinationBuilder_ != null) {
        return destinationBuilder_.getMessageOrBuilder();
      } else {
        return destination_ == null ?
            stream.api.live.Destination.getDefaultInstance() : destination_;
      }
    }
    /**
     * <pre>
     * updated destination
     * </pre>
     *
     * <code>.live.v21.Destination destination = 1 [json_name = "destination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.Destination, stream.api.live.Destination.Builder, stream.api.live.DestinationOrBuilder> 
        getDestinationFieldBuilder() {
      if (destinationBuilder_ == null) {
        destinationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.Destination, stream.api.live.Destination.Builder, stream.api.live.DestinationOrBuilder>(
                getDestination(),
                getParentForChildren(),
                isClean());
        destination_ = null;
      }
      return destinationBuilder_;
    }

    private boolean broadcastUpdated_ ;
    /**
     * <pre>
     * indicates whether the broadcast was updated as a function of this request
     * </pre>
     *
     * <code>bool broadcast_updated = 2 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The broadcastUpdated.
     */
    @java.lang.Override
    public boolean getBroadcastUpdated() {
      return broadcastUpdated_;
    }
    /**
     * <pre>
     * indicates whether the broadcast was updated as a function of this request
     * </pre>
     *
     * <code>bool broadcast_updated = 2 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The broadcastUpdated to set.
     * @return This builder for chaining.
     */
    public Builder setBroadcastUpdated(boolean value) {
      
      broadcastUpdated_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indicates whether the broadcast was updated as a function of this request
     * </pre>
     *
     * <code>bool broadcast_updated = 2 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearBroadcastUpdated() {
      
      broadcastUpdated_ = false;
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


    // @@protoc_insertion_point(builder_scope:live.v21.UpdateDestinationResponse)
  }

  // @@protoc_insertion_point(class_scope:live.v21.UpdateDestinationResponse)
  private static final stream.api.live.UpdateDestinationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.UpdateDestinationResponse();
  }

  public static stream.api.live.UpdateDestinationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDestinationResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDestinationResponse>() {
    @java.lang.Override
    public UpdateDestinationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateDestinationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateDestinationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDestinationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.UpdateDestinationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

