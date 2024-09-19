/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * broadcast phase of project
 * </pre>
 *
 * Protobuf enum {@code live.v21.ProjectBroadcastPhase}
 */
public enum ProjectBroadcastPhase
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PROJECT_BROADCAST_PHASE_UNSPECIFIED = 0;</code>
   */
  PROJECT_BROADCAST_PHASE_UNSPECIFIED(0),
  /**
   * <code>PROJECT_BROADCAST_PHASE_NOT_RUNNING = 1;</code>
   */
  PROJECT_BROADCAST_PHASE_NOT_RUNNING(1),
  /**
   * <pre>
   * broadcast is waiting to be scheduled
   * </pre>
   *
   * <code>PROJECT_BROADCAST_PHASE_WAITING = 2;</code>
   */
  PROJECT_BROADCAST_PHASE_WAITING(2),
  /**
   * <code>PROJECT_BROADCAST_PHASE_STARTING = 3;</code>
   */
  PROJECT_BROADCAST_PHASE_STARTING(3),
  /**
   * <code>PROJECT_BROADCAST_PHASE_RUNNING = 4;</code>
   */
  PROJECT_BROADCAST_PHASE_RUNNING(4),
  /**
   * <code>PROJECT_BROADCAST_PHASE_STOPPING = 5;</code>
   */
  PROJECT_BROADCAST_PHASE_STOPPING(5),
  /**
   * <code>PROJECT_BROADCAST_PHASE_STOPPED = 6;</code>
   */
  PROJECT_BROADCAST_PHASE_STOPPED(6),
  /**
   * <code>PROJECT_BROADCAST_PHASE_ARCHIVED = 7;</code>
   */
  PROJECT_BROADCAST_PHASE_ARCHIVED(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PROJECT_BROADCAST_PHASE_UNSPECIFIED = 0;</code>
   */
  public static final int PROJECT_BROADCAST_PHASE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>PROJECT_BROADCAST_PHASE_NOT_RUNNING = 1;</code>
   */
  public static final int PROJECT_BROADCAST_PHASE_NOT_RUNNING_VALUE = 1;
  /**
   * <pre>
   * broadcast is waiting to be scheduled
   * </pre>
   *
   * <code>PROJECT_BROADCAST_PHASE_WAITING = 2;</code>
   */
  public static final int PROJECT_BROADCAST_PHASE_WAITING_VALUE = 2;
  /**
   * <code>PROJECT_BROADCAST_PHASE_STARTING = 3;</code>
   */
  public static final int PROJECT_BROADCAST_PHASE_STARTING_VALUE = 3;
  /**
   * <code>PROJECT_BROADCAST_PHASE_RUNNING = 4;</code>
   */
  public static final int PROJECT_BROADCAST_PHASE_RUNNING_VALUE = 4;
  /**
   * <code>PROJECT_BROADCAST_PHASE_STOPPING = 5;</code>
   */
  public static final int PROJECT_BROADCAST_PHASE_STOPPING_VALUE = 5;
  /**
   * <code>PROJECT_BROADCAST_PHASE_STOPPED = 6;</code>
   */
  public static final int PROJECT_BROADCAST_PHASE_STOPPED_VALUE = 6;
  /**
   * <code>PROJECT_BROADCAST_PHASE_ARCHIVED = 7;</code>
   */
  public static final int PROJECT_BROADCAST_PHASE_ARCHIVED_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ProjectBroadcastPhase valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProjectBroadcastPhase forNumber(int value) {
    switch (value) {
      case 0: return PROJECT_BROADCAST_PHASE_UNSPECIFIED;
      case 1: return PROJECT_BROADCAST_PHASE_NOT_RUNNING;
      case 2: return PROJECT_BROADCAST_PHASE_WAITING;
      case 3: return PROJECT_BROADCAST_PHASE_STARTING;
      case 4: return PROJECT_BROADCAST_PHASE_RUNNING;
      case 5: return PROJECT_BROADCAST_PHASE_STOPPING;
      case 6: return PROJECT_BROADCAST_PHASE_STOPPED;
      case 7: return PROJECT_BROADCAST_PHASE_ARCHIVED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProjectBroadcastPhase>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProjectBroadcastPhase> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProjectBroadcastPhase>() {
          public ProjectBroadcastPhase findValueByNumber(int number) {
            return ProjectBroadcastPhase.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return stream.api.live.Api.getDescriptor().getEnumTypes().get(8);
  }

  private static final ProjectBroadcastPhase[] VALUES = values();

  public static ProjectBroadcastPhase valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ProjectBroadcastPhase(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:live.v21.ProjectBroadcastPhase)
}
