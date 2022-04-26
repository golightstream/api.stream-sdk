/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.CreateCollectionResponse}
 */
public final class CreateCollectionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.CreateCollectionResponse)
    CreateCollectionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCollectionResponse.newBuilder() to construct.
  private CreateCollectionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCollectionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCollectionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateCollectionResponse(
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
            stream.api.live.Collection.Builder subBuilder = null;
            if (collection_ != null) {
              subBuilder = collection_.toBuilder();
            }
            collection_ = input.readMessage(stream.api.live.Collection.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(collection_);
              collection_ = subBuilder.buildPartial();
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
    return stream.api.live.Api.internal_static_live_v21_CreateCollectionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_CreateCollectionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.CreateCollectionResponse.class, stream.api.live.CreateCollectionResponse.Builder.class);
  }

  public static final int COLLECTION_FIELD_NUMBER = 1;
  private stream.api.live.Collection collection_;
  /**
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   * @return Whether the collection field is set.
   */
  @java.lang.Override
  public boolean hasCollection() {
    return collection_ != null;
  }
  /**
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   * @return The collection.
   */
  @java.lang.Override
  public stream.api.live.Collection getCollection() {
    return collection_ == null ? stream.api.live.Collection.getDefaultInstance() : collection_;
  }
  /**
   * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
   */
  @java.lang.Override
  public stream.api.live.CollectionOrBuilder getCollectionOrBuilder() {
    return getCollection();
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
    if (collection_ != null) {
      output.writeMessage(1, getCollection());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (collection_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCollection());
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
    if (!(obj instanceof stream.api.live.CreateCollectionResponse)) {
      return super.equals(obj);
    }
    stream.api.live.CreateCollectionResponse other = (stream.api.live.CreateCollectionResponse) obj;

    if (hasCollection() != other.hasCollection()) return false;
    if (hasCollection()) {
      if (!getCollection()
          .equals(other.getCollection())) return false;
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
    if (hasCollection()) {
      hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
      hash = (53 * hash) + getCollection().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.CreateCollectionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateCollectionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CreateCollectionResponse parseFrom(
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
  public static Builder newBuilder(stream.api.live.CreateCollectionResponse prototype) {
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
   * Protobuf type {@code live.v21.CreateCollectionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.CreateCollectionResponse)
      stream.api.live.CreateCollectionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_CreateCollectionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_CreateCollectionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.CreateCollectionResponse.class, stream.api.live.CreateCollectionResponse.Builder.class);
    }

    // Construct using stream.api.live.CreateCollectionResponse.newBuilder()
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
      if (collectionBuilder_ == null) {
        collection_ = null;
      } else {
        collection_ = null;
        collectionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_CreateCollectionResponse_descriptor;
    }

    @java.lang.Override
    public stream.api.live.CreateCollectionResponse getDefaultInstanceForType() {
      return stream.api.live.CreateCollectionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.CreateCollectionResponse build() {
      stream.api.live.CreateCollectionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.CreateCollectionResponse buildPartial() {
      stream.api.live.CreateCollectionResponse result = new stream.api.live.CreateCollectionResponse(this);
      if (collectionBuilder_ == null) {
        result.collection_ = collection_;
      } else {
        result.collection_ = collectionBuilder_.build();
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
      if (other instanceof stream.api.live.CreateCollectionResponse) {
        return mergeFrom((stream.api.live.CreateCollectionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.CreateCollectionResponse other) {
      if (other == stream.api.live.CreateCollectionResponse.getDefaultInstance()) return this;
      if (other.hasCollection()) {
        mergeCollection(other.getCollection());
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
      stream.api.live.CreateCollectionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.CreateCollectionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private stream.api.live.Collection collection_;
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.Collection, stream.api.live.Collection.Builder, stream.api.live.CollectionOrBuilder> collectionBuilder_;
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     * @return Whether the collection field is set.
     */
    public boolean hasCollection() {
      return collectionBuilder_ != null || collection_ != null;
    }
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     * @return The collection.
     */
    public stream.api.live.Collection getCollection() {
      if (collectionBuilder_ == null) {
        return collection_ == null ? stream.api.live.Collection.getDefaultInstance() : collection_;
      } else {
        return collectionBuilder_.getMessage();
      }
    }
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     */
    public Builder setCollection(stream.api.live.Collection value) {
      if (collectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        collection_ = value;
        onChanged();
      } else {
        collectionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     */
    public Builder setCollection(
        stream.api.live.Collection.Builder builderForValue) {
      if (collectionBuilder_ == null) {
        collection_ = builderForValue.build();
        onChanged();
      } else {
        collectionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     */
    public Builder mergeCollection(stream.api.live.Collection value) {
      if (collectionBuilder_ == null) {
        if (collection_ != null) {
          collection_ =
            stream.api.live.Collection.newBuilder(collection_).mergeFrom(value).buildPartial();
        } else {
          collection_ = value;
        }
        onChanged();
      } else {
        collectionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     */
    public Builder clearCollection() {
      if (collectionBuilder_ == null) {
        collection_ = null;
        onChanged();
      } else {
        collection_ = null;
        collectionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     */
    public stream.api.live.Collection.Builder getCollectionBuilder() {
      
      onChanged();
      return getCollectionFieldBuilder().getBuilder();
    }
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     */
    public stream.api.live.CollectionOrBuilder getCollectionOrBuilder() {
      if (collectionBuilder_ != null) {
        return collectionBuilder_.getMessageOrBuilder();
      } else {
        return collection_ == null ?
            stream.api.live.Collection.getDefaultInstance() : collection_;
      }
    }
    /**
     * <code>.live.v21.Collection collection = 1 [json_name = "collection"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.Collection, stream.api.live.Collection.Builder, stream.api.live.CollectionOrBuilder> 
        getCollectionFieldBuilder() {
      if (collectionBuilder_ == null) {
        collectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.Collection, stream.api.live.Collection.Builder, stream.api.live.CollectionOrBuilder>(
                getCollection(),
                getParentForChildren(),
                isClean());
        collection_ = null;
      }
      return collectionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:live.v21.CreateCollectionResponse)
  }

  // @@protoc_insertion_point(class_scope:live.v21.CreateCollectionResponse)
  private static final stream.api.live.CreateCollectionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.CreateCollectionResponse();
  }

  public static stream.api.live.CreateCollectionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCollectionResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateCollectionResponse>() {
    @java.lang.Override
    public CreateCollectionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateCollectionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateCollectionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCollectionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.CreateCollectionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

