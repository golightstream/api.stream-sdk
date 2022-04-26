/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.CollectionEvent}
 */
public final class CollectionEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.CollectionEvent)
    CollectionEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CollectionEvent.newBuilder() to construct.
  private CollectionEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CollectionEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CollectionEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CollectionEvent(
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
            stream.api.live.CollectionCreateEvent.Builder subBuilder = null;
            if (typeCase_ == 1) {
              subBuilder = ((stream.api.live.CollectionCreateEvent) type_).toBuilder();
            }
            type_ =
                input.readMessage(stream.api.live.CollectionCreateEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((stream.api.live.CollectionCreateEvent) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 1;
            break;
          }
          case 18: {
            stream.api.live.CollectionUpdateEvent.Builder subBuilder = null;
            if (typeCase_ == 2) {
              subBuilder = ((stream.api.live.CollectionUpdateEvent) type_).toBuilder();
            }
            type_ =
                input.readMessage(stream.api.live.CollectionUpdateEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((stream.api.live.CollectionUpdateEvent) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 2;
            break;
          }
          case 26: {
            stream.api.live.CollectionDeleteEvent.Builder subBuilder = null;
            if (typeCase_ == 3) {
              subBuilder = ((stream.api.live.CollectionDeleteEvent) type_).toBuilder();
            }
            type_ =
                input.readMessage(stream.api.live.CollectionDeleteEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((stream.api.live.CollectionDeleteEvent) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 3;
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
    return stream.api.live.Api.internal_static_live_v21_CollectionEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_CollectionEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.CollectionEvent.class, stream.api.live.CollectionEvent.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CREATE(1),
    UPDATE(2),
    DELETE(3),
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
        case 1: return CREATE;
        case 2: return UPDATE;
        case 3: return DELETE;
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

  public static final int CREATE_FIELD_NUMBER = 1;
  /**
   * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
   * @return Whether the create field is set.
   */
  @java.lang.Override
  public boolean hasCreate() {
    return typeCase_ == 1;
  }
  /**
   * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
   * @return The create.
   */
  @java.lang.Override
  public stream.api.live.CollectionCreateEvent getCreate() {
    if (typeCase_ == 1) {
       return (stream.api.live.CollectionCreateEvent) type_;
    }
    return stream.api.live.CollectionCreateEvent.getDefaultInstance();
  }
  /**
   * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
   */
  @java.lang.Override
  public stream.api.live.CollectionCreateEventOrBuilder getCreateOrBuilder() {
    if (typeCase_ == 1) {
       return (stream.api.live.CollectionCreateEvent) type_;
    }
    return stream.api.live.CollectionCreateEvent.getDefaultInstance();
  }

  public static final int UPDATE_FIELD_NUMBER = 2;
  /**
   * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
   * @return Whether the update field is set.
   */
  @java.lang.Override
  public boolean hasUpdate() {
    return typeCase_ == 2;
  }
  /**
   * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
   * @return The update.
   */
  @java.lang.Override
  public stream.api.live.CollectionUpdateEvent getUpdate() {
    if (typeCase_ == 2) {
       return (stream.api.live.CollectionUpdateEvent) type_;
    }
    return stream.api.live.CollectionUpdateEvent.getDefaultInstance();
  }
  /**
   * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
   */
  @java.lang.Override
  public stream.api.live.CollectionUpdateEventOrBuilder getUpdateOrBuilder() {
    if (typeCase_ == 2) {
       return (stream.api.live.CollectionUpdateEvent) type_;
    }
    return stream.api.live.CollectionUpdateEvent.getDefaultInstance();
  }

  public static final int DELETE_FIELD_NUMBER = 3;
  /**
   * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
   * @return Whether the delete field is set.
   */
  @java.lang.Override
  public boolean hasDelete() {
    return typeCase_ == 3;
  }
  /**
   * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
   * @return The delete.
   */
  @java.lang.Override
  public stream.api.live.CollectionDeleteEvent getDelete() {
    if (typeCase_ == 3) {
       return (stream.api.live.CollectionDeleteEvent) type_;
    }
    return stream.api.live.CollectionDeleteEvent.getDefaultInstance();
  }
  /**
   * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
   */
  @java.lang.Override
  public stream.api.live.CollectionDeleteEventOrBuilder getDeleteOrBuilder() {
    if (typeCase_ == 3) {
       return (stream.api.live.CollectionDeleteEvent) type_;
    }
    return stream.api.live.CollectionDeleteEvent.getDefaultInstance();
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
      output.writeMessage(1, (stream.api.live.CollectionCreateEvent) type_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (stream.api.live.CollectionUpdateEvent) type_);
    }
    if (typeCase_ == 3) {
      output.writeMessage(3, (stream.api.live.CollectionDeleteEvent) type_);
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
        .computeMessageSize(1, (stream.api.live.CollectionCreateEvent) type_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (stream.api.live.CollectionUpdateEvent) type_);
    }
    if (typeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (stream.api.live.CollectionDeleteEvent) type_);
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
    if (!(obj instanceof stream.api.live.CollectionEvent)) {
      return super.equals(obj);
    }
    stream.api.live.CollectionEvent other = (stream.api.live.CollectionEvent) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getCreate()
            .equals(other.getCreate())) return false;
        break;
      case 2:
        if (!getUpdate()
            .equals(other.getUpdate())) return false;
        break;
      case 3:
        if (!getDelete()
            .equals(other.getDelete())) return false;
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
        hash = (37 * hash) + CREATE_FIELD_NUMBER;
        hash = (53 * hash) + getCreate().hashCode();
        break;
      case 2:
        hash = (37 * hash) + UPDATE_FIELD_NUMBER;
        hash = (53 * hash) + getUpdate().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DELETE_FIELD_NUMBER;
        hash = (53 * hash) + getDelete().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.CollectionEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CollectionEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CollectionEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CollectionEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CollectionEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.CollectionEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.CollectionEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CollectionEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CollectionEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.CollectionEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.CollectionEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.CollectionEvent parseFrom(
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
  public static Builder newBuilder(stream.api.live.CollectionEvent prototype) {
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
   * Protobuf type {@code live.v21.CollectionEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.CollectionEvent)
      stream.api.live.CollectionEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_CollectionEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_CollectionEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.CollectionEvent.class, stream.api.live.CollectionEvent.Builder.class);
    }

    // Construct using stream.api.live.CollectionEvent.newBuilder()
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
      return stream.api.live.Api.internal_static_live_v21_CollectionEvent_descriptor;
    }

    @java.lang.Override
    public stream.api.live.CollectionEvent getDefaultInstanceForType() {
      return stream.api.live.CollectionEvent.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.CollectionEvent build() {
      stream.api.live.CollectionEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.CollectionEvent buildPartial() {
      stream.api.live.CollectionEvent result = new stream.api.live.CollectionEvent(this);
      if (typeCase_ == 1) {
        if (createBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = createBuilder_.build();
        }
      }
      if (typeCase_ == 2) {
        if (updateBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = updateBuilder_.build();
        }
      }
      if (typeCase_ == 3) {
        if (deleteBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = deleteBuilder_.build();
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
      if (other instanceof stream.api.live.CollectionEvent) {
        return mergeFrom((stream.api.live.CollectionEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.CollectionEvent other) {
      if (other == stream.api.live.CollectionEvent.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case CREATE: {
          mergeCreate(other.getCreate());
          break;
        }
        case UPDATE: {
          mergeUpdate(other.getUpdate());
          break;
        }
        case DELETE: {
          mergeDelete(other.getDelete());
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
      stream.api.live.CollectionEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.CollectionEvent) e.getUnfinishedMessage();
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
        stream.api.live.CollectionCreateEvent, stream.api.live.CollectionCreateEvent.Builder, stream.api.live.CollectionCreateEventOrBuilder> createBuilder_;
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     * @return Whether the create field is set.
     */
    @java.lang.Override
    public boolean hasCreate() {
      return typeCase_ == 1;
    }
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     * @return The create.
     */
    @java.lang.Override
    public stream.api.live.CollectionCreateEvent getCreate() {
      if (createBuilder_ == null) {
        if (typeCase_ == 1) {
          return (stream.api.live.CollectionCreateEvent) type_;
        }
        return stream.api.live.CollectionCreateEvent.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return createBuilder_.getMessage();
        }
        return stream.api.live.CollectionCreateEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     */
    public Builder setCreate(stream.api.live.CollectionCreateEvent value) {
      if (createBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        createBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     */
    public Builder setCreate(
        stream.api.live.CollectionCreateEvent.Builder builderForValue) {
      if (createBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        createBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     */
    public Builder mergeCreate(stream.api.live.CollectionCreateEvent value) {
      if (createBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != stream.api.live.CollectionCreateEvent.getDefaultInstance()) {
          type_ = stream.api.live.CollectionCreateEvent.newBuilder((stream.api.live.CollectionCreateEvent) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          createBuilder_.mergeFrom(value);
        }
        createBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     */
    public Builder clearCreate() {
      if (createBuilder_ == null) {
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
        createBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     */
    public stream.api.live.CollectionCreateEvent.Builder getCreateBuilder() {
      return getCreateFieldBuilder().getBuilder();
    }
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     */
    @java.lang.Override
    public stream.api.live.CollectionCreateEventOrBuilder getCreateOrBuilder() {
      if ((typeCase_ == 1) && (createBuilder_ != null)) {
        return createBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (stream.api.live.CollectionCreateEvent) type_;
        }
        return stream.api.live.CollectionCreateEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.live.v21.CollectionCreateEvent create = 1 [json_name = "create"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.CollectionCreateEvent, stream.api.live.CollectionCreateEvent.Builder, stream.api.live.CollectionCreateEventOrBuilder> 
        getCreateFieldBuilder() {
      if (createBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = stream.api.live.CollectionCreateEvent.getDefaultInstance();
        }
        createBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.CollectionCreateEvent, stream.api.live.CollectionCreateEvent.Builder, stream.api.live.CollectionCreateEventOrBuilder>(
                (stream.api.live.CollectionCreateEvent) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();;
      return createBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.CollectionUpdateEvent, stream.api.live.CollectionUpdateEvent.Builder, stream.api.live.CollectionUpdateEventOrBuilder> updateBuilder_;
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     * @return Whether the update field is set.
     */
    @java.lang.Override
    public boolean hasUpdate() {
      return typeCase_ == 2;
    }
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     * @return The update.
     */
    @java.lang.Override
    public stream.api.live.CollectionUpdateEvent getUpdate() {
      if (updateBuilder_ == null) {
        if (typeCase_ == 2) {
          return (stream.api.live.CollectionUpdateEvent) type_;
        }
        return stream.api.live.CollectionUpdateEvent.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return updateBuilder_.getMessage();
        }
        return stream.api.live.CollectionUpdateEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     */
    public Builder setUpdate(stream.api.live.CollectionUpdateEvent value) {
      if (updateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        updateBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     */
    public Builder setUpdate(
        stream.api.live.CollectionUpdateEvent.Builder builderForValue) {
      if (updateBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        updateBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     */
    public Builder mergeUpdate(stream.api.live.CollectionUpdateEvent value) {
      if (updateBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != stream.api.live.CollectionUpdateEvent.getDefaultInstance()) {
          type_ = stream.api.live.CollectionUpdateEvent.newBuilder((stream.api.live.CollectionUpdateEvent) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          updateBuilder_.mergeFrom(value);
        }
        updateBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     */
    public Builder clearUpdate() {
      if (updateBuilder_ == null) {
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
        updateBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     */
    public stream.api.live.CollectionUpdateEvent.Builder getUpdateBuilder() {
      return getUpdateFieldBuilder().getBuilder();
    }
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     */
    @java.lang.Override
    public stream.api.live.CollectionUpdateEventOrBuilder getUpdateOrBuilder() {
      if ((typeCase_ == 2) && (updateBuilder_ != null)) {
        return updateBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (stream.api.live.CollectionUpdateEvent) type_;
        }
        return stream.api.live.CollectionUpdateEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.live.v21.CollectionUpdateEvent update = 2 [json_name = "update"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.CollectionUpdateEvent, stream.api.live.CollectionUpdateEvent.Builder, stream.api.live.CollectionUpdateEventOrBuilder> 
        getUpdateFieldBuilder() {
      if (updateBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = stream.api.live.CollectionUpdateEvent.getDefaultInstance();
        }
        updateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.CollectionUpdateEvent, stream.api.live.CollectionUpdateEvent.Builder, stream.api.live.CollectionUpdateEventOrBuilder>(
                (stream.api.live.CollectionUpdateEvent) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();;
      return updateBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.CollectionDeleteEvent, stream.api.live.CollectionDeleteEvent.Builder, stream.api.live.CollectionDeleteEventOrBuilder> deleteBuilder_;
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     * @return Whether the delete field is set.
     */
    @java.lang.Override
    public boolean hasDelete() {
      return typeCase_ == 3;
    }
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     * @return The delete.
     */
    @java.lang.Override
    public stream.api.live.CollectionDeleteEvent getDelete() {
      if (deleteBuilder_ == null) {
        if (typeCase_ == 3) {
          return (stream.api.live.CollectionDeleteEvent) type_;
        }
        return stream.api.live.CollectionDeleteEvent.getDefaultInstance();
      } else {
        if (typeCase_ == 3) {
          return deleteBuilder_.getMessage();
        }
        return stream.api.live.CollectionDeleteEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     */
    public Builder setDelete(stream.api.live.CollectionDeleteEvent value) {
      if (deleteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        deleteBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     */
    public Builder setDelete(
        stream.api.live.CollectionDeleteEvent.Builder builderForValue) {
      if (deleteBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        deleteBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     */
    public Builder mergeDelete(stream.api.live.CollectionDeleteEvent value) {
      if (deleteBuilder_ == null) {
        if (typeCase_ == 3 &&
            type_ != stream.api.live.CollectionDeleteEvent.getDefaultInstance()) {
          type_ = stream.api.live.CollectionDeleteEvent.newBuilder((stream.api.live.CollectionDeleteEvent) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 3) {
          deleteBuilder_.mergeFrom(value);
        }
        deleteBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     */
    public Builder clearDelete() {
      if (deleteBuilder_ == null) {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
        }
        deleteBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     */
    public stream.api.live.CollectionDeleteEvent.Builder getDeleteBuilder() {
      return getDeleteFieldBuilder().getBuilder();
    }
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     */
    @java.lang.Override
    public stream.api.live.CollectionDeleteEventOrBuilder getDeleteOrBuilder() {
      if ((typeCase_ == 3) && (deleteBuilder_ != null)) {
        return deleteBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 3) {
          return (stream.api.live.CollectionDeleteEvent) type_;
        }
        return stream.api.live.CollectionDeleteEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.live.v21.CollectionDeleteEvent delete = 3 [json_name = "delete"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.CollectionDeleteEvent, stream.api.live.CollectionDeleteEvent.Builder, stream.api.live.CollectionDeleteEventOrBuilder> 
        getDeleteFieldBuilder() {
      if (deleteBuilder_ == null) {
        if (!(typeCase_ == 3)) {
          type_ = stream.api.live.CollectionDeleteEvent.getDefaultInstance();
        }
        deleteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.CollectionDeleteEvent, stream.api.live.CollectionDeleteEvent.Builder, stream.api.live.CollectionDeleteEventOrBuilder>(
                (stream.api.live.CollectionDeleteEvent) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 3;
      onChanged();;
      return deleteBuilder_;
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


    // @@protoc_insertion_point(builder_scope:live.v21.CollectionEvent)
  }

  // @@protoc_insertion_point(class_scope:live.v21.CollectionEvent)
  private static final stream.api.live.CollectionEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.CollectionEvent();
  }

  public static stream.api.live.CollectionEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CollectionEvent>
      PARSER = new com.google.protobuf.AbstractParser<CollectionEvent>() {
    @java.lang.Override
    public CollectionEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CollectionEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CollectionEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollectionEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.CollectionEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

