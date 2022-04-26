/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

/**
 * Protobuf type {@code apis.layout.v2.GetLayerRequest}
 */
public final class GetLayerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apis.layout.v2.GetLayerRequest)
    GetLayerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetLayerRequest.newBuilder() to construct.
  private GetLayerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetLayerRequest() {
    layoutId_ = "";
    layerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetLayerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetLayerRequest(
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

            layoutId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            layerId_ = s;
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
    return stream.api.layout.Api.internal_static_apis_layout_v2_GetLayerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.layout.Api.internal_static_apis_layout_v2_GetLayerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.layout.GetLayerRequest.class, stream.api.layout.GetLayerRequest.Builder.class);
  }

  public static final int LAYOUT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object layoutId_;
  /**
   * <pre>
   * the id of the Layout
   * </pre>
   *
   * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The layoutId.
   */
  @java.lang.Override
  public java.lang.String getLayoutId() {
    java.lang.Object ref = layoutId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      layoutId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the id of the Layout
   * </pre>
   *
   * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for layoutId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLayoutIdBytes() {
    java.lang.Object ref = layoutId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      layoutId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAYER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object layerId_;
  /**
   * <pre>
   * the id of the Layer
   * </pre>
   *
   * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The layerId.
   */
  @java.lang.Override
  public java.lang.String getLayerId() {
    java.lang.Object ref = layerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      layerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the id of the Layer
   * </pre>
   *
   * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for layerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLayerIdBytes() {
    java.lang.Object ref = layerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      layerId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(layoutId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, layoutId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(layerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, layerId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(layoutId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, layoutId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(layerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, layerId_);
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
    if (!(obj instanceof stream.api.layout.GetLayerRequest)) {
      return super.equals(obj);
    }
    stream.api.layout.GetLayerRequest other = (stream.api.layout.GetLayerRequest) obj;

    if (!getLayoutId()
        .equals(other.getLayoutId())) return false;
    if (!getLayerId()
        .equals(other.getLayerId())) return false;
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
    hash = (37 * hash) + LAYOUT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLayoutId().hashCode();
    hash = (37 * hash) + LAYER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLayerId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.layout.GetLayerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.layout.GetLayerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.layout.GetLayerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.layout.GetLayerRequest parseFrom(
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
  public static Builder newBuilder(stream.api.layout.GetLayerRequest prototype) {
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
   * Protobuf type {@code apis.layout.v2.GetLayerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apis.layout.v2.GetLayerRequest)
      stream.api.layout.GetLayerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_GetLayerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_GetLayerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.layout.GetLayerRequest.class, stream.api.layout.GetLayerRequest.Builder.class);
    }

    // Construct using stream.api.layout.GetLayerRequest.newBuilder()
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
      layoutId_ = "";

      layerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_GetLayerRequest_descriptor;
    }

    @java.lang.Override
    public stream.api.layout.GetLayerRequest getDefaultInstanceForType() {
      return stream.api.layout.GetLayerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.layout.GetLayerRequest build() {
      stream.api.layout.GetLayerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.layout.GetLayerRequest buildPartial() {
      stream.api.layout.GetLayerRequest result = new stream.api.layout.GetLayerRequest(this);
      result.layoutId_ = layoutId_;
      result.layerId_ = layerId_;
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
      if (other instanceof stream.api.layout.GetLayerRequest) {
        return mergeFrom((stream.api.layout.GetLayerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.layout.GetLayerRequest other) {
      if (other == stream.api.layout.GetLayerRequest.getDefaultInstance()) return this;
      if (!other.getLayoutId().isEmpty()) {
        layoutId_ = other.layoutId_;
        onChanged();
      }
      if (!other.getLayerId().isEmpty()) {
        layerId_ = other.layerId_;
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
      stream.api.layout.GetLayerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.layout.GetLayerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object layoutId_ = "";
    /**
     * <pre>
     * the id of the Layout
     * </pre>
     *
     * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The layoutId.
     */
    public java.lang.String getLayoutId() {
      java.lang.Object ref = layoutId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        layoutId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the id of the Layout
     * </pre>
     *
     * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for layoutId.
     */
    public com.google.protobuf.ByteString
        getLayoutIdBytes() {
      java.lang.Object ref = layoutId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        layoutId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the id of the Layout
     * </pre>
     *
     * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The layoutId to set.
     * @return This builder for chaining.
     */
    public Builder setLayoutId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      layoutId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the Layout
     * </pre>
     *
     * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLayoutId() {
      
      layoutId_ = getDefaultInstance().getLayoutId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the Layout
     * </pre>
     *
     * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for layoutId to set.
     * @return This builder for chaining.
     */
    public Builder setLayoutIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      layoutId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object layerId_ = "";
    /**
     * <pre>
     * the id of the Layer
     * </pre>
     *
     * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The layerId.
     */
    public java.lang.String getLayerId() {
      java.lang.Object ref = layerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        layerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the id of the Layer
     * </pre>
     *
     * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for layerId.
     */
    public com.google.protobuf.ByteString
        getLayerIdBytes() {
      java.lang.Object ref = layerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        layerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the id of the Layer
     * </pre>
     *
     * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The layerId to set.
     * @return This builder for chaining.
     */
    public Builder setLayerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      layerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the Layer
     * </pre>
     *
     * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLayerId() {
      
      layerId_ = getDefaultInstance().getLayerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the Layer
     * </pre>
     *
     * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for layerId to set.
     * @return This builder for chaining.
     */
    public Builder setLayerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      layerId_ = value;
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


    // @@protoc_insertion_point(builder_scope:apis.layout.v2.GetLayerRequest)
  }

  // @@protoc_insertion_point(class_scope:apis.layout.v2.GetLayerRequest)
  private static final stream.api.layout.GetLayerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.layout.GetLayerRequest();
  }

  public static stream.api.layout.GetLayerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLayerRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetLayerRequest>() {
    @java.lang.Override
    public GetLayerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetLayerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetLayerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLayerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.layout.GetLayerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

