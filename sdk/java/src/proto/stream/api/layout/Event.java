/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

/**
 * <pre>
 * Event structure for an event sent from the layout
 * api via the event api
 * </pre>
 *
 * Protobuf type {@code apis.layout.v2.Event}
 */
public final class Event extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apis.layout.v2.Event)
    EventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Event() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Event();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Event(
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
            stream.api.layout.LayoutEvent.Builder subBuilder = null;
            if (typeCase_ == 1) {
              subBuilder = ((stream.api.layout.LayoutEvent) type_).toBuilder();
            }
            type_ =
                input.readMessage(stream.api.layout.LayoutEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((stream.api.layout.LayoutEvent) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 1;
            break;
          }
          case 18: {
            stream.api.layout.LayerEvent.Builder subBuilder = null;
            if (typeCase_ == 2) {
              subBuilder = ((stream.api.layout.LayerEvent) type_).toBuilder();
            }
            type_ =
                input.readMessage(stream.api.layout.LayerEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((stream.api.layout.LayerEvent) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 2;
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
    return stream.api.layout.Api.internal_static_apis_layout_v2_Event_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.layout.Api.internal_static_apis_layout_v2_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.layout.Event.class, stream.api.layout.Event.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LAYOUT(1),
    LAYER(2),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return LAYOUT;
        case 2: return LAYER;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int LAYOUT_FIELD_NUMBER = 1;
  /**
   * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
   * @return Whether the layout field is set.
   */
  @java.lang.Override
  public boolean hasLayout() {
    return typeCase_ == 1;
  }
  /**
   * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
   * @return The layout.
   */
  @java.lang.Override
  public stream.api.layout.LayoutEvent getLayout() {
    if (typeCase_ == 1) {
       return (stream.api.layout.LayoutEvent) type_;
    }
    return stream.api.layout.LayoutEvent.getDefaultInstance();
  }
  /**
   * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
   */
  @java.lang.Override
  public stream.api.layout.LayoutEventOrBuilder getLayoutOrBuilder() {
    if (typeCase_ == 1) {
       return (stream.api.layout.LayoutEvent) type_;
    }
    return stream.api.layout.LayoutEvent.getDefaultInstance();
  }

  public static final int LAYER_FIELD_NUMBER = 2;
  /**
   * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
   * @return Whether the layer field is set.
   */
  @java.lang.Override
  public boolean hasLayer() {
    return typeCase_ == 2;
  }
  /**
   * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
   * @return The layer.
   */
  @java.lang.Override
  public stream.api.layout.LayerEvent getLayer() {
    if (typeCase_ == 2) {
       return (stream.api.layout.LayerEvent) type_;
    }
    return stream.api.layout.LayerEvent.getDefaultInstance();
  }
  /**
   * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
   */
  @java.lang.Override
  public stream.api.layout.LayerEventOrBuilder getLayerOrBuilder() {
    if (typeCase_ == 2) {
       return (stream.api.layout.LayerEvent) type_;
    }
    return stream.api.layout.LayerEvent.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (stream.api.layout.LayoutEvent) type_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (stream.api.layout.LayerEvent) type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (stream.api.layout.LayoutEvent) type_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (stream.api.layout.LayerEvent) type_);
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
    if (!(obj instanceof stream.api.layout.Event)) {
      return super.equals(obj);
    }
    stream.api.layout.Event other = (stream.api.layout.Event) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getLayout()
            .equals(other.getLayout())) return false;
        break;
      case 2:
        if (!getLayer()
            .equals(other.getLayer())) return false;
        break;
      case 0:
      default:
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + LAYOUT_FIELD_NUMBER;
        hash = (53 * hash) + getLayout().hashCode();
        break;
      case 2:
        hash = (37 * hash) + LAYER_FIELD_NUMBER;
        hash = (53 * hash) + getLayer().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.layout.Event parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.Event parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.Event parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.layout.Event parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.layout.Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.layout.Event parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.layout.Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.layout.Event parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.layout.Event parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.layout.Event parseFrom(
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
  public static Builder newBuilder(stream.api.layout.Event prototype) {
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
   * Event structure for an event sent from the layout
   * api via the event api
   * </pre>
   *
   * Protobuf type {@code apis.layout.v2.Event}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apis.layout.v2.Event)
      stream.api.layout.EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.layout.Event.class, stream.api.layout.Event.Builder.class);
    }

    // Construct using stream.api.layout.Event.newBuilder()
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
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.layout.Api.internal_static_apis_layout_v2_Event_descriptor;
    }

    @java.lang.Override
    public stream.api.layout.Event getDefaultInstanceForType() {
      return stream.api.layout.Event.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.layout.Event build() {
      stream.api.layout.Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.layout.Event buildPartial() {
      stream.api.layout.Event result = new stream.api.layout.Event(this);
      if (typeCase_ == 1) {
        if (layoutBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = layoutBuilder_.build();
        }
      }
      if (typeCase_ == 2) {
        if (layerBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = layerBuilder_.build();
        }
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof stream.api.layout.Event) {
        return mergeFrom((stream.api.layout.Event)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.layout.Event other) {
      if (other == stream.api.layout.Event.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case LAYOUT: {
          mergeLayout(other.getLayout());
          break;
        }
        case LAYER: {
          mergeLayer(other.getLayer());
          break;
        }
        case TYPE_NOT_SET: {
          break;
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
      stream.api.layout.Event parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.layout.Event) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.layout.LayoutEvent, stream.api.layout.LayoutEvent.Builder, stream.api.layout.LayoutEventOrBuilder> layoutBuilder_;
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     * @return Whether the layout field is set.
     */
    @java.lang.Override
    public boolean hasLayout() {
      return typeCase_ == 1;
    }
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     * @return The layout.
     */
    @java.lang.Override
    public stream.api.layout.LayoutEvent getLayout() {
      if (layoutBuilder_ == null) {
        if (typeCase_ == 1) {
          return (stream.api.layout.LayoutEvent) type_;
        }
        return stream.api.layout.LayoutEvent.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return layoutBuilder_.getMessage();
        }
        return stream.api.layout.LayoutEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     */
    public Builder setLayout(stream.api.layout.LayoutEvent value) {
      if (layoutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        layoutBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     */
    public Builder setLayout(
        stream.api.layout.LayoutEvent.Builder builderForValue) {
      if (layoutBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        layoutBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     */
    public Builder mergeLayout(stream.api.layout.LayoutEvent value) {
      if (layoutBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != stream.api.layout.LayoutEvent.getDefaultInstance()) {
          type_ = stream.api.layout.LayoutEvent.newBuilder((stream.api.layout.LayoutEvent) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          layoutBuilder_.mergeFrom(value);
        }
        layoutBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     */
    public Builder clearLayout() {
      if (layoutBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        layoutBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     */
    public stream.api.layout.LayoutEvent.Builder getLayoutBuilder() {
      return getLayoutFieldBuilder().getBuilder();
    }
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     */
    @java.lang.Override
    public stream.api.layout.LayoutEventOrBuilder getLayoutOrBuilder() {
      if ((typeCase_ == 1) && (layoutBuilder_ != null)) {
        return layoutBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (stream.api.layout.LayoutEvent) type_;
        }
        return stream.api.layout.LayoutEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.apis.layout.v2.LayoutEvent layout = 1 [json_name = "layout"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.layout.LayoutEvent, stream.api.layout.LayoutEvent.Builder, stream.api.layout.LayoutEventOrBuilder> 
        getLayoutFieldBuilder() {
      if (layoutBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = stream.api.layout.LayoutEvent.getDefaultInstance();
        }
        layoutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.layout.LayoutEvent, stream.api.layout.LayoutEvent.Builder, stream.api.layout.LayoutEventOrBuilder>(
                (stream.api.layout.LayoutEvent) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();;
      return layoutBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.layout.LayerEvent, stream.api.layout.LayerEvent.Builder, stream.api.layout.LayerEventOrBuilder> layerBuilder_;
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     * @return Whether the layer field is set.
     */
    @java.lang.Override
    public boolean hasLayer() {
      return typeCase_ == 2;
    }
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     * @return The layer.
     */
    @java.lang.Override
    public stream.api.layout.LayerEvent getLayer() {
      if (layerBuilder_ == null) {
        if (typeCase_ == 2) {
          return (stream.api.layout.LayerEvent) type_;
        }
        return stream.api.layout.LayerEvent.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return layerBuilder_.getMessage();
        }
        return stream.api.layout.LayerEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     */
    public Builder setLayer(stream.api.layout.LayerEvent value) {
      if (layerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        layerBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     */
    public Builder setLayer(
        stream.api.layout.LayerEvent.Builder builderForValue) {
      if (layerBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        layerBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     */
    public Builder mergeLayer(stream.api.layout.LayerEvent value) {
      if (layerBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != stream.api.layout.LayerEvent.getDefaultInstance()) {
          type_ = stream.api.layout.LayerEvent.newBuilder((stream.api.layout.LayerEvent) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          layerBuilder_.mergeFrom(value);
        }
        layerBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     */
    public Builder clearLayer() {
      if (layerBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        layerBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     */
    public stream.api.layout.LayerEvent.Builder getLayerBuilder() {
      return getLayerFieldBuilder().getBuilder();
    }
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     */
    @java.lang.Override
    public stream.api.layout.LayerEventOrBuilder getLayerOrBuilder() {
      if ((typeCase_ == 2) && (layerBuilder_ != null)) {
        return layerBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (stream.api.layout.LayerEvent) type_;
        }
        return stream.api.layout.LayerEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.apis.layout.v2.LayerEvent layer = 2 [json_name = "layer"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.layout.LayerEvent, stream.api.layout.LayerEvent.Builder, stream.api.layout.LayerEventOrBuilder> 
        getLayerFieldBuilder() {
      if (layerBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = stream.api.layout.LayerEvent.getDefaultInstance();
        }
        layerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.layout.LayerEvent, stream.api.layout.LayerEvent.Builder, stream.api.layout.LayerEventOrBuilder>(
                (stream.api.layout.LayerEvent) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();;
      return layerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apis.layout.v2.Event)
  }

  // @@protoc_insertion_point(class_scope:apis.layout.v2.Event)
  private static final stream.api.layout.Event DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.layout.Event();
  }

  public static stream.api.layout.Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event>
      PARSER = new com.google.protobuf.AbstractParser<Event>() {
    @java.lang.Override
    public Event parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Event(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.layout.Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
