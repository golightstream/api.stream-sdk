/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.GetSourcesResponse}
 */
public final class GetSourcesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.GetSourcesResponse)
    GetSourcesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSourcesResponse.newBuilder() to construct.
  private GetSourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSourcesResponse() {
    sources_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSourcesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSourcesResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              sources_ = new java.util.ArrayList<stream.api.live.Source>();
              mutable_bitField0_ |= 0x00000001;
            }
            sources_.add(
                input.readMessage(stream.api.live.Source.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        sources_ = java.util.Collections.unmodifiableList(sources_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return stream.api.live.Api.internal_static_live_v21_GetSourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_GetSourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.GetSourcesResponse.class, stream.api.live.GetSourcesResponse.Builder.class);
  }

  public static final int SOURCES_FIELD_NUMBER = 1;
  private java.util.List<stream.api.live.Source> sources_;
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  @java.lang.Override
  public java.util.List<stream.api.live.Source> getSourcesList() {
    return sources_;
  }
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends stream.api.live.SourceOrBuilder> 
      getSourcesOrBuilderList() {
    return sources_;
  }
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  @java.lang.Override
  public int getSourcesCount() {
    return sources_.size();
  }
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  @java.lang.Override
  public stream.api.live.Source getSources(int index) {
    return sources_.get(index);
  }
  /**
   * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
   */
  @java.lang.Override
  public stream.api.live.SourceOrBuilder getSourcesOrBuilder(
      int index) {
    return sources_.get(index);
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
    for (int i = 0; i < sources_.size(); i++) {
      output.writeMessage(1, sources_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sources_.get(i));
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
    if (!(obj instanceof stream.api.live.GetSourcesResponse)) {
      return super.equals(obj);
    }
    stream.api.live.GetSourcesResponse other = (stream.api.live.GetSourcesResponse) obj;

    if (!getSourcesList()
        .equals(other.getSourcesList())) return false;
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
    if (getSourcesCount() > 0) {
      hash = (37 * hash) + SOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getSourcesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.GetSourcesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.GetSourcesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.GetSourcesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.GetSourcesResponse parseFrom(
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
  public static Builder newBuilder(stream.api.live.GetSourcesResponse prototype) {
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
   * Protobuf type {@code live.v21.GetSourcesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.GetSourcesResponse)
      stream.api.live.GetSourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_GetSourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_GetSourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.GetSourcesResponse.class, stream.api.live.GetSourcesResponse.Builder.class);
    }

    // Construct using stream.api.live.GetSourcesResponse.newBuilder()
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
        getSourcesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sourcesBuilder_ == null) {
        sources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sourcesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_GetSourcesResponse_descriptor;
    }

    @java.lang.Override
    public stream.api.live.GetSourcesResponse getDefaultInstanceForType() {
      return stream.api.live.GetSourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.GetSourcesResponse build() {
      stream.api.live.GetSourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.GetSourcesResponse buildPartial() {
      stream.api.live.GetSourcesResponse result = new stream.api.live.GetSourcesResponse(this);
      int from_bitField0_ = bitField0_;
      if (sourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sources_ = java.util.Collections.unmodifiableList(sources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sources_ = sources_;
      } else {
        result.sources_ = sourcesBuilder_.build();
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
      if (other instanceof stream.api.live.GetSourcesResponse) {
        return mergeFrom((stream.api.live.GetSourcesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.GetSourcesResponse other) {
      if (other == stream.api.live.GetSourcesResponse.getDefaultInstance()) return this;
      if (sourcesBuilder_ == null) {
        if (!other.sources_.isEmpty()) {
          if (sources_.isEmpty()) {
            sources_ = other.sources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSourcesIsMutable();
            sources_.addAll(other.sources_);
          }
          onChanged();
        }
      } else {
        if (!other.sources_.isEmpty()) {
          if (sourcesBuilder_.isEmpty()) {
            sourcesBuilder_.dispose();
            sourcesBuilder_ = null;
            sources_ = other.sources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sourcesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSourcesFieldBuilder() : null;
          } else {
            sourcesBuilder_.addAllMessages(other.sources_);
          }
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
      stream.api.live.GetSourcesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.GetSourcesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<stream.api.live.Source> sources_ =
      java.util.Collections.emptyList();
    private void ensureSourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sources_ = new java.util.ArrayList<stream.api.live.Source>(sources_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        stream.api.live.Source, stream.api.live.Source.Builder, stream.api.live.SourceOrBuilder> sourcesBuilder_;

    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public java.util.List<stream.api.live.Source> getSourcesList() {
      if (sourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sources_);
      } else {
        return sourcesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public int getSourcesCount() {
      if (sourcesBuilder_ == null) {
        return sources_.size();
      } else {
        return sourcesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public stream.api.live.Source getSources(int index) {
      if (sourcesBuilder_ == null) {
        return sources_.get(index);
      } else {
        return sourcesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder setSources(
        int index, stream.api.live.Source value) {
      if (sourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourcesIsMutable();
        sources_.set(index, value);
        onChanged();
      } else {
        sourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder setSources(
        int index, stream.api.live.Source.Builder builderForValue) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        sources_.set(index, builderForValue.build());
        onChanged();
      } else {
        sourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder addSources(stream.api.live.Source value) {
      if (sourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourcesIsMutable();
        sources_.add(value);
        onChanged();
      } else {
        sourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder addSources(
        int index, stream.api.live.Source value) {
      if (sourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourcesIsMutable();
        sources_.add(index, value);
        onChanged();
      } else {
        sourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder addSources(
        stream.api.live.Source.Builder builderForValue) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        sources_.add(builderForValue.build());
        onChanged();
      } else {
        sourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder addSources(
        int index, stream.api.live.Source.Builder builderForValue) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        sources_.add(index, builderForValue.build());
        onChanged();
      } else {
        sourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder addAllSources(
        java.lang.Iterable<? extends stream.api.live.Source> values) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sources_);
        onChanged();
      } else {
        sourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder clearSources() {
      if (sourcesBuilder_ == null) {
        sources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sourcesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public Builder removeSources(int index) {
      if (sourcesBuilder_ == null) {
        ensureSourcesIsMutable();
        sources_.remove(index);
        onChanged();
      } else {
        sourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public stream.api.live.Source.Builder getSourcesBuilder(
        int index) {
      return getSourcesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public stream.api.live.SourceOrBuilder getSourcesOrBuilder(
        int index) {
      if (sourcesBuilder_ == null) {
        return sources_.get(index);  } else {
        return sourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public java.util.List<? extends stream.api.live.SourceOrBuilder> 
         getSourcesOrBuilderList() {
      if (sourcesBuilder_ != null) {
        return sourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sources_);
      }
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public stream.api.live.Source.Builder addSourcesBuilder() {
      return getSourcesFieldBuilder().addBuilder(
          stream.api.live.Source.getDefaultInstance());
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public stream.api.live.Source.Builder addSourcesBuilder(
        int index) {
      return getSourcesFieldBuilder().addBuilder(
          index, stream.api.live.Source.getDefaultInstance());
    }
    /**
     * <code>repeated .live.v21.Source sources = 1 [json_name = "sources"];</code>
     */
    public java.util.List<stream.api.live.Source.Builder> 
         getSourcesBuilderList() {
      return getSourcesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        stream.api.live.Source, stream.api.live.Source.Builder, stream.api.live.SourceOrBuilder> 
        getSourcesFieldBuilder() {
      if (sourcesBuilder_ == null) {
        sourcesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            stream.api.live.Source, stream.api.live.Source.Builder, stream.api.live.SourceOrBuilder>(
                sources_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sources_ = null;
      }
      return sourcesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:live.v21.GetSourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:live.v21.GetSourcesResponse)
  private static final stream.api.live.GetSourcesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.GetSourcesResponse();
  }

  public static stream.api.live.GetSourcesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSourcesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSourcesResponse>() {
    @java.lang.Override
    public GetSourcesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSourcesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.GetSourcesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
