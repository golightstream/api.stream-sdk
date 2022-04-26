/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/event/v2/api.proto

package stream.api.event;

/**
 * <pre>
 * Targetting for an event
 * Event targetting allows you to listen or publish an event against a specific target. You can assume that:
 * When subscribing, you will receive events for the chosen scope and any higher scope that isn't targetted. This means
 * - An event published against a layoutId can be listened to by targetting the given layoutId, projectId or collectionId
 * - An event published against a collectionId can be subscribed by scoping to any given projectId or layoutId under the collection.
 * </pre>
 *
 * Protobuf type {@code apis.event.v2.EventTarget}
 */
public final class EventTarget extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apis.event.v2.EventTarget)
    EventTargetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventTarget.newBuilder() to construct.
  private EventTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventTarget() {
    collectionId_ = "";
    projectId_ = "";
    layoutId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventTarget();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventTarget(
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
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            layoutId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            projectId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            collectionId_ = s;
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
    return stream.api.event.Api.internal_static_apis_event_v2_EventTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.event.Api.internal_static_apis_event_v2_EventTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.event.EventTarget.class, stream.api.event.EventTarget.Builder.class);
  }

  private int bitField0_;
  public static final int COLLECTION_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object collectionId_;
  /**
   * <pre>
   * Subscribe to events in a given collection.
   * </pre>
   *
   * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the collectionId field is set.
   */
  @java.lang.Override
  public boolean hasCollectionId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Subscribe to events in a given collection.
   * </pre>
   *
   * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  @java.lang.Override
  public java.lang.String getCollectionId() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collectionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Subscribe to events in a given collection.
   * </pre>
   *
   * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollectionIdBytes() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * Subscribe to events in a given project.
   * </pre>
   *
   * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the projectId field is set.
   */
  @java.lang.Override
  public boolean hasProjectId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Subscribe to events in a given project.
   * </pre>
   *
   * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Subscribe to events in a given project.
   * </pre>
   *
   * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAYOUT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object layoutId_;
  /**
   * <pre>
   * Stream events to a specific layout.
   * Note: when specified, collection_id and project_id are implictly defined. If you choose
   * to define them, you they _must_ match the layout.
   * </pre>
   *
   * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the layoutId field is set.
   */
  @java.lang.Override
  public boolean hasLayoutId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Stream events to a specific layout.
   * Note: when specified, collection_id and project_id are implictly defined. If you choose
   * to define them, you they _must_ match the layout.
   * </pre>
   *
   * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
   * Stream events to a specific layout.
   * Note: when specified, collection_id and project_id are implictly defined. If you choose
   * to define them, you they _must_ match the layout.
   * </pre>
   *
   * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, layoutId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, projectId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, collectionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, layoutId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, projectId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, collectionId_);
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
    if (!(obj instanceof stream.api.event.EventTarget)) {
      return super.equals(obj);
    }
    stream.api.event.EventTarget other = (stream.api.event.EventTarget) obj;

    if (hasCollectionId() != other.hasCollectionId()) return false;
    if (hasCollectionId()) {
      if (!getCollectionId()
          .equals(other.getCollectionId())) return false;
    }
    if (hasProjectId() != other.hasProjectId()) return false;
    if (hasProjectId()) {
      if (!getProjectId()
          .equals(other.getProjectId())) return false;
    }
    if (hasLayoutId() != other.hasLayoutId()) return false;
    if (hasLayoutId()) {
      if (!getLayoutId()
          .equals(other.getLayoutId())) return false;
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
    if (hasCollectionId()) {
      hash = (37 * hash) + COLLECTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCollectionId().hashCode();
    }
    if (hasProjectId()) {
      hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProjectId().hashCode();
    }
    if (hasLayoutId()) {
      hash = (37 * hash) + LAYOUT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLayoutId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.event.EventTarget parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.event.EventTarget parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.event.EventTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.event.EventTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.event.EventTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.event.EventTarget parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.event.EventTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.event.EventTarget parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.event.EventTarget parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.event.EventTarget parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.event.EventTarget parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.event.EventTarget parseFrom(
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
  public static Builder newBuilder(stream.api.event.EventTarget prototype) {
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
   * Targetting for an event
   * Event targetting allows you to listen or publish an event against a specific target. You can assume that:
   * When subscribing, you will receive events for the chosen scope and any higher scope that isn't targetted. This means
   * - An event published against a layoutId can be listened to by targetting the given layoutId, projectId or collectionId
   * - An event published against a collectionId can be subscribed by scoping to any given projectId or layoutId under the collection.
   * </pre>
   *
   * Protobuf type {@code apis.event.v2.EventTarget}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apis.event.v2.EventTarget)
      stream.api.event.EventTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.event.Api.internal_static_apis_event_v2_EventTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.event.Api.internal_static_apis_event_v2_EventTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.event.EventTarget.class, stream.api.event.EventTarget.Builder.class);
    }

    // Construct using stream.api.event.EventTarget.newBuilder()
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
      collectionId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      projectId_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      layoutId_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.event.Api.internal_static_apis_event_v2_EventTarget_descriptor;
    }

    @java.lang.Override
    public stream.api.event.EventTarget getDefaultInstanceForType() {
      return stream.api.event.EventTarget.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.event.EventTarget build() {
      stream.api.event.EventTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.event.EventTarget buildPartial() {
      stream.api.event.EventTarget result = new stream.api.event.EventTarget(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.collectionId_ = collectionId_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.projectId_ = projectId_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.layoutId_ = layoutId_;
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
      if (other instanceof stream.api.event.EventTarget) {
        return mergeFrom((stream.api.event.EventTarget)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.event.EventTarget other) {
      if (other == stream.api.event.EventTarget.getDefaultInstance()) return this;
      if (other.hasCollectionId()) {
        bitField0_ |= 0x00000001;
        collectionId_ = other.collectionId_;
        onChanged();
      }
      if (other.hasProjectId()) {
        bitField0_ |= 0x00000002;
        projectId_ = other.projectId_;
        onChanged();
      }
      if (other.hasLayoutId()) {
        bitField0_ |= 0x00000004;
        layoutId_ = other.layoutId_;
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
      stream.api.event.EventTarget parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.event.EventTarget) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object collectionId_ = "";
    /**
     * <pre>
     * Subscribe to events in a given collection.
     * </pre>
     *
     * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the collectionId field is set.
     */
    public boolean hasCollectionId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Subscribe to events in a given collection.
     * </pre>
     *
     * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The collectionId.
     */
    public java.lang.String getCollectionId() {
      java.lang.Object ref = collectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Subscribe to events in a given collection.
     * </pre>
     *
     * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for collectionId.
     */
    public com.google.protobuf.ByteString
        getCollectionIdBytes() {
      java.lang.Object ref = collectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Subscribe to events in a given collection.
     * </pre>
     *
     * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      collectionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Subscribe to events in a given collection.
     * </pre>
     *
     * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCollectionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      collectionId_ = getDefaultInstance().getCollectionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Subscribe to events in a given collection.
     * </pre>
     *
     * <code>optional string collection_id = 5 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      collectionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * Subscribe to events in a given project.
     * </pre>
     *
     * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the projectId field is set.
     */
    public boolean hasProjectId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Subscribe to events in a given project.
     * </pre>
     *
     * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Subscribe to events in a given project.
     * </pre>
     *
     * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Subscribe to events in a given project.
     * </pre>
     *
     * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Subscribe to events in a given project.
     * </pre>
     *
     * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Subscribe to events in a given project.
     * </pre>
     *
     * <code>optional string project_id = 4 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object layoutId_ = "";
    /**
     * <pre>
     * Stream events to a specific layout.
     * Note: when specified, collection_id and project_id are implictly defined. If you choose
     * to define them, you they _must_ match the layout.
     * </pre>
     *
     * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the layoutId field is set.
     */
    public boolean hasLayoutId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Stream events to a specific layout.
     * Note: when specified, collection_id and project_id are implictly defined. If you choose
     * to define them, you they _must_ match the layout.
     * </pre>
     *
     * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
     * Stream events to a specific layout.
     * Note: when specified, collection_id and project_id are implictly defined. If you choose
     * to define them, you they _must_ match the layout.
     * </pre>
     *
     * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
     * Stream events to a specific layout.
     * Note: when specified, collection_id and project_id are implictly defined. If you choose
     * to define them, you they _must_ match the layout.
     * </pre>
     *
     * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The layoutId to set.
     * @return This builder for chaining.
     */
    public Builder setLayoutId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      layoutId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Stream events to a specific layout.
     * Note: when specified, collection_id and project_id are implictly defined. If you choose
     * to define them, you they _must_ match the layout.
     * </pre>
     *
     * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLayoutId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      layoutId_ = getDefaultInstance().getLayoutId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Stream events to a specific layout.
     * Note: when specified, collection_id and project_id are implictly defined. If you choose
     * to define them, you they _must_ match the layout.
     * </pre>
     *
     * <code>optional string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for layoutId to set.
     * @return This builder for chaining.
     */
    public Builder setLayoutIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      layoutId_ = value;
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


    // @@protoc_insertion_point(builder_scope:apis.event.v2.EventTarget)
  }

  // @@protoc_insertion_point(class_scope:apis.event.v2.EventTarget)
  private static final stream.api.event.EventTarget DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.event.EventTarget();
  }

  public static stream.api.event.EventTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventTarget>
      PARSER = new com.google.protobuf.AbstractParser<EventTarget>() {
    @java.lang.Override
    public EventTarget parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventTarget(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.event.EventTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

