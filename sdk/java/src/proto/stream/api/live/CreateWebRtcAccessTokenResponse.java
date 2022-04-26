/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.CreateWebRtcAccessTokenResponse}
 */
public final class CreateWebRtcAccessTokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.CreateWebRtcAccessTokenResponse)
    CreateWebRtcAccessTokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateWebRtcAccessTokenResponse.newBuilder() to construct.
  private CreateWebRtcAccessTokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateWebRtcAccessTokenResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateWebRtcAccessTokenResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateWebRtcAccessTokenResponse(
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
          case 18: {
            stream.api.live.WebRtcAccess.Builder subBuilder = null;
            if (webrtcAccess_ != null) {
              subBuilder = webrtcAccess_.toBuilder();
            }
            webrtcAccess_ = input.readMessage(stream.api.live.WebRtcAccess.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(webrtcAccess_);
              webrtcAccess_ = subBuilder.buildPartial();
            }

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
    return stream.api.live.Api.internal_static_live_v21_CreateWebRtcAccessTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_CreateWebRtcAccessTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.CreateWebRtcAccessTokenResponse.class, stream.api.live.CreateWebRtcAccessTokenResponse.Builder.class);
  }

  public static final int WEBRTC_ACCESS_FIELD_NUMBER = 2;
  private stream.api.live.WebRtcAccess webrtcAccess_;
  /**
   * <pre>
   * the webrtc token parameters
   * </pre>
   *
   * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
   * @return Whether the webrtcAccess field is set.
   */
  @java.lang.Override
  public boolean hasWebrtcAccess() {
    return webrtcAccess_ != null;
  }
  /**
   * <pre>
   * the webrtc token parameters
   * </pre>
   *
   * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
   * @return The webrtcAccess.
   */
  @java.lang.Override
  public stream.api.live.WebRtcAccess getWebrtcAccess() {
    return webrtcAccess_ == null ? stream.api.live.WebRtcAccess.getDefaultInstance() : webrtcAccess_;
  }
  /**
   * <pre>
   * the webrtc token parameters
   * </pre>
   *
   * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
   */
  @java.lang.Override
  public stream.api.live.WebRtcAccessOrBuilder getWebrtcAccessOrBuilder() {
    return getWebrtcAccess();
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
    if (webrtcAccess_ != null) {
      output.writeMessage(2, getWebrtcAccess());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (webrtcAccess_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWebrtcAccess());
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
    if (!(obj instanceof stream.api.live.CreateWebRtcAccessTokenResponse)) {
      return super.equals(obj);
    }
    stream.api.live.CreateWebRtcAccessTokenResponse other = (stream.api.live.CreateWebRtcAccessTokenResponse) obj;

    if (hasWebrtcAccess() != other.hasWebrtcAccess()) return false;
    if (hasWebrtcAccess()) {
      if (!getWebrtcAccess()
          .equals(other.getWebrtcAccess())) return false;
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
    if (hasWebrtcAccess()) {
      hash = (37 * hash) + WEBRTC_ACCESS_FIELD_NUMBER;
      hash = (53 * hash) + getWebrtcAccess().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateWebRtcAccessTokenResponse parseFrom(
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
  public static Builder newBuilder(stream.api.live.CreateWebRtcAccessTokenResponse prototype) {
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
   * Protobuf type {@code live.v21.CreateWebRtcAccessTokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.CreateWebRtcAccessTokenResponse)
      stream.api.live.CreateWebRtcAccessTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_CreateWebRtcAccessTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_CreateWebRtcAccessTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.CreateWebRtcAccessTokenResponse.class, stream.api.live.CreateWebRtcAccessTokenResponse.Builder.class);
    }

    // Construct using stream.api.live.CreateWebRtcAccessTokenResponse.newBuilder()
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
      if (webrtcAccessBuilder_ == null) {
        webrtcAccess_ = null;
      } else {
        webrtcAccess_ = null;
        webrtcAccessBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_CreateWebRtcAccessTokenResponse_descriptor;
    }

    @java.lang.Override
    public stream.api.live.CreateWebRtcAccessTokenResponse getDefaultInstanceForType() {
      return stream.api.live.CreateWebRtcAccessTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.CreateWebRtcAccessTokenResponse build() {
      stream.api.live.CreateWebRtcAccessTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.CreateWebRtcAccessTokenResponse buildPartial() {
      stream.api.live.CreateWebRtcAccessTokenResponse result = new stream.api.live.CreateWebRtcAccessTokenResponse(this);
      if (webrtcAccessBuilder_ == null) {
        result.webrtcAccess_ = webrtcAccess_;
      } else {
        result.webrtcAccess_ = webrtcAccessBuilder_.build();
      }
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
      if (other instanceof stream.api.live.CreateWebRtcAccessTokenResponse) {
        return mergeFrom((stream.api.live.CreateWebRtcAccessTokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.CreateWebRtcAccessTokenResponse other) {
      if (other == stream.api.live.CreateWebRtcAccessTokenResponse.getDefaultInstance()) return this;
      if (other.hasWebrtcAccess()) {
        mergeWebrtcAccess(other.getWebrtcAccess());
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
      stream.api.live.CreateWebRtcAccessTokenResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.CreateWebRtcAccessTokenResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private stream.api.live.WebRtcAccess webrtcAccess_;
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.WebRtcAccess, stream.api.live.WebRtcAccess.Builder, stream.api.live.WebRtcAccessOrBuilder> webrtcAccessBuilder_;
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     * @return Whether the webrtcAccess field is set.
     */
    public boolean hasWebrtcAccess() {
      return webrtcAccessBuilder_ != null || webrtcAccess_ != null;
    }
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     * @return The webrtcAccess.
     */
    public stream.api.live.WebRtcAccess getWebrtcAccess() {
      if (webrtcAccessBuilder_ == null) {
        return webrtcAccess_ == null ? stream.api.live.WebRtcAccess.getDefaultInstance() : webrtcAccess_;
      } else {
        return webrtcAccessBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     */
    public Builder setWebrtcAccess(stream.api.live.WebRtcAccess value) {
      if (webrtcAccessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        webrtcAccess_ = value;
        onChanged();
      } else {
        webrtcAccessBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     */
    public Builder setWebrtcAccess(
        stream.api.live.WebRtcAccess.Builder builderForValue) {
      if (webrtcAccessBuilder_ == null) {
        webrtcAccess_ = builderForValue.build();
        onChanged();
      } else {
        webrtcAccessBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     */
    public Builder mergeWebrtcAccess(stream.api.live.WebRtcAccess value) {
      if (webrtcAccessBuilder_ == null) {
        if (webrtcAccess_ != null) {
          webrtcAccess_ =
            stream.api.live.WebRtcAccess.newBuilder(webrtcAccess_).mergeFrom(value).buildPartial();
        } else {
          webrtcAccess_ = value;
        }
        onChanged();
      } else {
        webrtcAccessBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     */
    public Builder clearWebrtcAccess() {
      if (webrtcAccessBuilder_ == null) {
        webrtcAccess_ = null;
        onChanged();
      } else {
        webrtcAccess_ = null;
        webrtcAccessBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     */
    public stream.api.live.WebRtcAccess.Builder getWebrtcAccessBuilder() {
      
      onChanged();
      return getWebrtcAccessFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     */
    public stream.api.live.WebRtcAccessOrBuilder getWebrtcAccessOrBuilder() {
      if (webrtcAccessBuilder_ != null) {
        return webrtcAccessBuilder_.getMessageOrBuilder();
      } else {
        return webrtcAccess_ == null ?
            stream.api.live.WebRtcAccess.getDefaultInstance() : webrtcAccess_;
      }
    }
    /**
     * <pre>
     * the webrtc token parameters
     * </pre>
     *
     * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.WebRtcAccess, stream.api.live.WebRtcAccess.Builder, stream.api.live.WebRtcAccessOrBuilder> 
        getWebrtcAccessFieldBuilder() {
      if (webrtcAccessBuilder_ == null) {
        webrtcAccessBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.WebRtcAccess, stream.api.live.WebRtcAccess.Builder, stream.api.live.WebRtcAccessOrBuilder>(
                getWebrtcAccess(),
                getParentForChildren(),
                isClean());
        webrtcAccess_ = null;
      }
      return webrtcAccessBuilder_;
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


    // @@protoc_insertion_point(builder_scope:live.v21.CreateWebRtcAccessTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:live.v21.CreateWebRtcAccessTokenResponse)
  private static final stream.api.live.CreateWebRtcAccessTokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.CreateWebRtcAccessTokenResponse();
  }

  public static stream.api.live.CreateWebRtcAccessTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWebRtcAccessTokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateWebRtcAccessTokenResponse>() {
    @java.lang.Override
    public CreateWebRtcAccessTokenResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateWebRtcAccessTokenResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateWebRtcAccessTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWebRtcAccessTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.CreateWebRtcAccessTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

