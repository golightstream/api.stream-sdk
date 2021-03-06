/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.GetProjectResponse}
 */
public final class GetProjectResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.GetProjectResponse)
    GetProjectResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetProjectResponse.newBuilder() to construct.
  private GetProjectResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetProjectResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetProjectResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetProjectResponse(
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
            stream.api.live.Project.Builder subBuilder = null;
            if (project_ != null) {
              subBuilder = project_.toBuilder();
            }
            project_ = input.readMessage(stream.api.live.Project.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(project_);
              project_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            stream.api.live.ProjectBroadcastStatus.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(stream.api.live.ProjectBroadcastStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
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
    return stream.api.live.Api.internal_static_live_v21_GetProjectResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_GetProjectResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.GetProjectResponse.class, stream.api.live.GetProjectResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_FIELD_NUMBER = 1;
  private stream.api.live.Project project_;
  /**
   * <pre>
   * the request project
   * </pre>
   *
   * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  @java.lang.Override
  public boolean hasProject() {
    return project_ != null;
  }
  /**
   * <pre>
   * the request project
   * </pre>
   *
   * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
   * @return The project.
   */
  @java.lang.Override
  public stream.api.live.Project getProject() {
    return project_ == null ? stream.api.live.Project.getDefaultInstance() : project_;
  }
  /**
   * <pre>
   * the request project
   * </pre>
   *
   * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
   */
  @java.lang.Override
  public stream.api.live.ProjectOrBuilder getProjectOrBuilder() {
    return getProject();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private stream.api.live.ProjectBroadcastStatus status_;
  /**
   * <pre>
   * the status of the project broadcast (if requested)
   * </pre>
   *
   * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * the status of the project broadcast (if requested)
   * </pre>
   *
   * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override
  public stream.api.live.ProjectBroadcastStatus getStatus() {
    return status_ == null ? stream.api.live.ProjectBroadcastStatus.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * the status of the project broadcast (if requested)
   * </pre>
   *
   * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
   */
  @java.lang.Override
  public stream.api.live.ProjectBroadcastStatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? stream.api.live.ProjectBroadcastStatus.getDefaultInstance() : status_;
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
    if (project_ != null) {
      output.writeMessage(1, getProject());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (project_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProject());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
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
    if (!(obj instanceof stream.api.live.GetProjectResponse)) {
      return super.equals(obj);
    }
    stream.api.live.GetProjectResponse other = (stream.api.live.GetProjectResponse) obj;

    if (hasProject() != other.hasProject()) return false;
    if (hasProject()) {
      if (!getProject()
          .equals(other.getProject())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    if (hasProject()) {
      hash = (37 * hash) + PROJECT_FIELD_NUMBER;
      hash = (53 * hash) + getProject().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.GetProjectResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetProjectResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetProjectResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetProjectResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetProjectResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetProjectResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetProjectResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.GetProjectResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.GetProjectResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.GetProjectResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.GetProjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.GetProjectResponse parseFrom(
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
  public static Builder newBuilder(stream.api.live.GetProjectResponse prototype) {
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
   * Protobuf type {@code live.v21.GetProjectResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.GetProjectResponse)
      stream.api.live.GetProjectResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_GetProjectResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_GetProjectResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.GetProjectResponse.class, stream.api.live.GetProjectResponse.Builder.class);
    }

    // Construct using stream.api.live.GetProjectResponse.newBuilder()
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
        getStatusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (projectBuilder_ == null) {
        project_ = null;
      } else {
        project_ = null;
        projectBuilder_ = null;
      }
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        statusBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_GetProjectResponse_descriptor;
    }

    @java.lang.Override
    public stream.api.live.GetProjectResponse getDefaultInstanceForType() {
      return stream.api.live.GetProjectResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.GetProjectResponse build() {
      stream.api.live.GetProjectResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.GetProjectResponse buildPartial() {
      stream.api.live.GetProjectResponse result = new stream.api.live.GetProjectResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (projectBuilder_ == null) {
        result.project_ = project_;
      } else {
        result.project_ = projectBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
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
      if (other instanceof stream.api.live.GetProjectResponse) {
        return mergeFrom((stream.api.live.GetProjectResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.GetProjectResponse other) {
      if (other == stream.api.live.GetProjectResponse.getDefaultInstance()) return this;
      if (other.hasProject()) {
        mergeProject(other.getProject());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      stream.api.live.GetProjectResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.GetProjectResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private stream.api.live.Project project_;
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.Project, stream.api.live.Project.Builder, stream.api.live.ProjectOrBuilder> projectBuilder_;
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     * @return Whether the project field is set.
     */
    public boolean hasProject() {
      return projectBuilder_ != null || project_ != null;
    }
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     * @return The project.
     */
    public stream.api.live.Project getProject() {
      if (projectBuilder_ == null) {
        return project_ == null ? stream.api.live.Project.getDefaultInstance() : project_;
      } else {
        return projectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public Builder setProject(stream.api.live.Project value) {
      if (projectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        project_ = value;
        onChanged();
      } else {
        projectBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public Builder setProject(
        stream.api.live.Project.Builder builderForValue) {
      if (projectBuilder_ == null) {
        project_ = builderForValue.build();
        onChanged();
      } else {
        projectBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public Builder mergeProject(stream.api.live.Project value) {
      if (projectBuilder_ == null) {
        if (project_ != null) {
          project_ =
            stream.api.live.Project.newBuilder(project_).mergeFrom(value).buildPartial();
        } else {
          project_ = value;
        }
        onChanged();
      } else {
        projectBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public Builder clearProject() {
      if (projectBuilder_ == null) {
        project_ = null;
        onChanged();
      } else {
        project_ = null;
        projectBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public stream.api.live.Project.Builder getProjectBuilder() {
      
      onChanged();
      return getProjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public stream.api.live.ProjectOrBuilder getProjectOrBuilder() {
      if (projectBuilder_ != null) {
        return projectBuilder_.getMessageOrBuilder();
      } else {
        return project_ == null ?
            stream.api.live.Project.getDefaultInstance() : project_;
      }
    }
    /**
     * <pre>
     * the request project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.Project, stream.api.live.Project.Builder, stream.api.live.ProjectOrBuilder> 
        getProjectFieldBuilder() {
      if (projectBuilder_ == null) {
        projectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.Project, stream.api.live.Project.Builder, stream.api.live.ProjectOrBuilder>(
                getProject(),
                getParentForChildren(),
                isClean());
        project_ = null;
      }
      return projectBuilder_;
    }

    private stream.api.live.ProjectBroadcastStatus status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.ProjectBroadcastStatus, stream.api.live.ProjectBroadcastStatus.Builder, stream.api.live.ProjectBroadcastStatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     * @return The status.
     */
    public stream.api.live.ProjectBroadcastStatus getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? stream.api.live.ProjectBroadcastStatus.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     */
    public Builder setStatus(stream.api.live.ProjectBroadcastStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     */
    public Builder setStatus(
        stream.api.live.ProjectBroadcastStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     */
    public Builder mergeStatus(stream.api.live.ProjectBroadcastStatus value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            status_ != null &&
            status_ != stream.api.live.ProjectBroadcastStatus.getDefaultInstance()) {
          status_ =
            stream.api.live.ProjectBroadcastStatus.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        statusBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     */
    public stream.api.live.ProjectBroadcastStatus.Builder getStatusBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     */
    public stream.api.live.ProjectBroadcastStatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            stream.api.live.ProjectBroadcastStatus.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * the status of the project broadcast (if requested)
     * </pre>
     *
     * <code>optional .live.v21.ProjectBroadcastStatus status = 2 [json_name = "status"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.ProjectBroadcastStatus, stream.api.live.ProjectBroadcastStatus.Builder, stream.api.live.ProjectBroadcastStatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.ProjectBroadcastStatus, stream.api.live.ProjectBroadcastStatus.Builder, stream.api.live.ProjectBroadcastStatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:live.v21.GetProjectResponse)
  }

  // @@protoc_insertion_point(class_scope:live.v21.GetProjectResponse)
  private static final stream.api.live.GetProjectResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.GetProjectResponse();
  }

  public static stream.api.live.GetProjectResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetProjectResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetProjectResponse>() {
    @java.lang.Override
    public GetProjectResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetProjectResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetProjectResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetProjectResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.GetProjectResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

