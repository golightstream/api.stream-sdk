/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

/**
 * Protobuf type {@code apis.layout.v2.ListLayoutsResponse}
 */
public final class ListLayoutsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apis.layout.v2.ListLayoutsResponse)
    ListLayoutsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListLayoutsResponse.newBuilder() to construct.
  private ListLayoutsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLayoutsResponse() {
    layouts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListLayoutsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListLayoutsResponse(
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
              layouts_ = new java.util.ArrayList<stream.api.layout.Layout>();
              mutable_bitField0_ |= 0x00000001;
            }
            layouts_.add(
                input.readMessage(stream.api.layout.Layout.parser(), extensionRegistry));
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
        layouts_ = java.util.Collections.unmodifiableList(layouts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return stream.api.layout.Api.internal_static_apis_layout_v2_ListLayoutsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.layout.Api.internal_static_apis_layout_v2_ListLayoutsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.layout.ListLayoutsResponse.class, stream.api.layout.ListLayoutsResponse.Builder.class);
  }

  public static final int LAYOUTS_FIELD_NUMBER = 1;
  private java.util.List<stream.api.layout.Layout> layouts_;
  /**
   * <pre>
   * All layouts returned.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
   */
  @java.lang.Override
  public java.util.List<stream.api.layout.Layout> getLayoutsList() {
    return layouts_;
  }
  /**
   * <pre>
   * All layouts returned.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends stream.api.layout.LayoutOrBuilder> 
      getLayoutsOrBuilderList() {
    return layouts_;
  }
  /**
   * <pre>
   * All layouts returned.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
   */
  @java.lang.Override
  public int getLayoutsCount() {
    return layouts_.size();
  }
  /**
   * <pre>
   * All layouts returned.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
   */
  @java.lang.Override
  public stream.api.layout.Layout getLayouts(int index) {
    return layouts_.get(index);
  }
  /**
   * <pre>
   * All layouts returned.
   * </pre>
   *
   * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
   */
  @java.lang.Override
  public stream.api.layout.LayoutOrBuilder getLayoutsOrBuilder(
      int index) {
    return layouts_.get(index);
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
    for (int i = 0; i < layouts_.size(); i++) {
      output.writeMessage(1, layouts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < layouts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, layouts_.get(i));
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
    if (!(obj instanceof stream.api.layout.ListLayoutsResponse)) {
      return super.equals(obj);
    }
    stream.api.layout.ListLayoutsResponse other = (stream.api.layout.ListLayoutsResponse) obj;

    if (!getLayoutsList()
        .equals(other.getLayoutsList())) return false;
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
    if (getLayoutsCount() > 0) {
      hash = (37 * hash) + LAYOUTS_FIELD_NUMBER;
      hash = (53 * hash) + getLayoutsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.layout.ListLayoutsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.layout.ListLayoutsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.layout.ListLayoutsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.layout.ListLayoutsResponse parseFrom(
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
  public static Builder newBuilder(stream.api.layout.ListLayoutsResponse prototype) {
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
   * Protobuf type {@code apis.layout.v2.ListLayoutsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apis.layout.v2.ListLayoutsResponse)
      stream.api.layout.ListLayoutsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_ListLayoutsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_ListLayoutsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.layout.ListLayoutsResponse.class, stream.api.layout.ListLayoutsResponse.Builder.class);
    }

    // Construct using stream.api.layout.ListLayoutsResponse.newBuilder()
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
        getLayoutsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (layoutsBuilder_ == null) {
        layouts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        layoutsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_ListLayoutsResponse_descriptor;
    }

    @java.lang.Override
    public stream.api.layout.ListLayoutsResponse getDefaultInstanceForType() {
      return stream.api.layout.ListLayoutsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.layout.ListLayoutsResponse build() {
      stream.api.layout.ListLayoutsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.layout.ListLayoutsResponse buildPartial() {
      stream.api.layout.ListLayoutsResponse result = new stream.api.layout.ListLayoutsResponse(this);
      int from_bitField0_ = bitField0_;
      if (layoutsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          layouts_ = java.util.Collections.unmodifiableList(layouts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.layouts_ = layouts_;
      } else {
        result.layouts_ = layoutsBuilder_.build();
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
      if (other instanceof stream.api.layout.ListLayoutsResponse) {
        return mergeFrom((stream.api.layout.ListLayoutsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.layout.ListLayoutsResponse other) {
      if (other == stream.api.layout.ListLayoutsResponse.getDefaultInstance()) return this;
      if (layoutsBuilder_ == null) {
        if (!other.layouts_.isEmpty()) {
          if (layouts_.isEmpty()) {
            layouts_ = other.layouts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLayoutsIsMutable();
            layouts_.addAll(other.layouts_);
          }
          onChanged();
        }
      } else {
        if (!other.layouts_.isEmpty()) {
          if (layoutsBuilder_.isEmpty()) {
            layoutsBuilder_.dispose();
            layoutsBuilder_ = null;
            layouts_ = other.layouts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            layoutsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLayoutsFieldBuilder() : null;
          } else {
            layoutsBuilder_.addAllMessages(other.layouts_);
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
      stream.api.layout.ListLayoutsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.layout.ListLayoutsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<stream.api.layout.Layout> layouts_ =
      java.util.Collections.emptyList();
    private void ensureLayoutsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        layouts_ = new java.util.ArrayList<stream.api.layout.Layout>(layouts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        stream.api.layout.Layout, stream.api.layout.Layout.Builder, stream.api.layout.LayoutOrBuilder> layoutsBuilder_;

    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public java.util.List<stream.api.layout.Layout> getLayoutsList() {
      if (layoutsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(layouts_);
      } else {
        return layoutsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public int getLayoutsCount() {
      if (layoutsBuilder_ == null) {
        return layouts_.size();
      } else {
        return layoutsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public stream.api.layout.Layout getLayouts(int index) {
      if (layoutsBuilder_ == null) {
        return layouts_.get(index);
      } else {
        return layoutsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder setLayouts(
        int index, stream.api.layout.Layout value) {
      if (layoutsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLayoutsIsMutable();
        layouts_.set(index, value);
        onChanged();
      } else {
        layoutsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder setLayouts(
        int index, stream.api.layout.Layout.Builder builderForValue) {
      if (layoutsBuilder_ == null) {
        ensureLayoutsIsMutable();
        layouts_.set(index, builderForValue.build());
        onChanged();
      } else {
        layoutsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder addLayouts(stream.api.layout.Layout value) {
      if (layoutsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLayoutsIsMutable();
        layouts_.add(value);
        onChanged();
      } else {
        layoutsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder addLayouts(
        int index, stream.api.layout.Layout value) {
      if (layoutsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLayoutsIsMutable();
        layouts_.add(index, value);
        onChanged();
      } else {
        layoutsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder addLayouts(
        stream.api.layout.Layout.Builder builderForValue) {
      if (layoutsBuilder_ == null) {
        ensureLayoutsIsMutable();
        layouts_.add(builderForValue.build());
        onChanged();
      } else {
        layoutsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder addLayouts(
        int index, stream.api.layout.Layout.Builder builderForValue) {
      if (layoutsBuilder_ == null) {
        ensureLayoutsIsMutable();
        layouts_.add(index, builderForValue.build());
        onChanged();
      } else {
        layoutsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder addAllLayouts(
        java.lang.Iterable<? extends stream.api.layout.Layout> values) {
      if (layoutsBuilder_ == null) {
        ensureLayoutsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, layouts_);
        onChanged();
      } else {
        layoutsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder clearLayouts() {
      if (layoutsBuilder_ == null) {
        layouts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        layoutsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public Builder removeLayouts(int index) {
      if (layoutsBuilder_ == null) {
        ensureLayoutsIsMutable();
        layouts_.remove(index);
        onChanged();
      } else {
        layoutsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public stream.api.layout.Layout.Builder getLayoutsBuilder(
        int index) {
      return getLayoutsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public stream.api.layout.LayoutOrBuilder getLayoutsOrBuilder(
        int index) {
      if (layoutsBuilder_ == null) {
        return layouts_.get(index);  } else {
        return layoutsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public java.util.List<? extends stream.api.layout.LayoutOrBuilder> 
         getLayoutsOrBuilderList() {
      if (layoutsBuilder_ != null) {
        return layoutsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(layouts_);
      }
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public stream.api.layout.Layout.Builder addLayoutsBuilder() {
      return getLayoutsFieldBuilder().addBuilder(
          stream.api.layout.Layout.getDefaultInstance());
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public stream.api.layout.Layout.Builder addLayoutsBuilder(
        int index) {
      return getLayoutsFieldBuilder().addBuilder(
          index, stream.api.layout.Layout.getDefaultInstance());
    }
    /**
     * <pre>
     * All layouts returned.
     * </pre>
     *
     * <code>repeated .apis.layout.v2.Layout layouts = 1 [json_name = "layouts"];</code>
     */
    public java.util.List<stream.api.layout.Layout.Builder> 
         getLayoutsBuilderList() {
      return getLayoutsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        stream.api.layout.Layout, stream.api.layout.Layout.Builder, stream.api.layout.LayoutOrBuilder> 
        getLayoutsFieldBuilder() {
      if (layoutsBuilder_ == null) {
        layoutsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            stream.api.layout.Layout, stream.api.layout.Layout.Builder, stream.api.layout.LayoutOrBuilder>(
                layouts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        layouts_ = null;
      }
      return layoutsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apis.layout.v2.ListLayoutsResponse)
  }

  // @@protoc_insertion_point(class_scope:apis.layout.v2.ListLayoutsResponse)
  private static final stream.api.layout.ListLayoutsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.layout.ListLayoutsResponse();
  }

  public static stream.api.layout.ListLayoutsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLayoutsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLayoutsResponse>() {
    @java.lang.Override
    public ListLayoutsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListLayoutsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListLayoutsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLayoutsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.layout.ListLayoutsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

