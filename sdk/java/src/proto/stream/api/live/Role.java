/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * defined roles
 * </pre>
 *
 * Protobuf enum {@code live.v21.Role}
 */
public enum Role
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ROLE_UNSPECIFIED = 0;</code>
   */
  ROLE_UNSPECIFIED(0),
  /**
   * <code>ROLE_HOST = 1;</code>
   */
  ROLE_HOST(1),
  /**
   * <code>ROLE_COHOST = 2;</code>
   */
  ROLE_COHOST(2),
  /**
   * <code>ROLE_CONTRIBUTOR = 3;</code>
   */
  ROLE_CONTRIBUTOR(3),
  /**
   * <code>ROLE_GUEST = 4;</code>
   */
  ROLE_GUEST(4),
  /**
   * <code>ROLE_VIEWER = 5;</code>
   */
  ROLE_VIEWER(5),
  /**
   * <code>ROLE_RENDERER = 6;</code>
   */
  ROLE_RENDERER(6),
  /**
   * <code>ROLE_PLATFORM = 7;</code>
   */
  ROLE_PLATFORM(7),
  /**
   * <code>ROLE_IMPERSONATE = 8;</code>
   */
  ROLE_IMPERSONATE(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ROLE_UNSPECIFIED = 0;</code>
   */
  public static final int ROLE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ROLE_HOST = 1;</code>
   */
  public static final int ROLE_HOST_VALUE = 1;
  /**
   * <code>ROLE_COHOST = 2;</code>
   */
  public static final int ROLE_COHOST_VALUE = 2;
  /**
   * <code>ROLE_CONTRIBUTOR = 3;</code>
   */
  public static final int ROLE_CONTRIBUTOR_VALUE = 3;
  /**
   * <code>ROLE_GUEST = 4;</code>
   */
  public static final int ROLE_GUEST_VALUE = 4;
  /**
   * <code>ROLE_VIEWER = 5;</code>
   */
  public static final int ROLE_VIEWER_VALUE = 5;
  /**
   * <code>ROLE_RENDERER = 6;</code>
   */
  public static final int ROLE_RENDERER_VALUE = 6;
  /**
   * <code>ROLE_PLATFORM = 7;</code>
   */
  public static final int ROLE_PLATFORM_VALUE = 7;
  /**
   * <code>ROLE_IMPERSONATE = 8;</code>
   */
  public static final int ROLE_IMPERSONATE_VALUE = 8;


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
  public static Role valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Role forNumber(int value) {
    switch (value) {
      case 0: return ROLE_UNSPECIFIED;
      case 1: return ROLE_HOST;
      case 2: return ROLE_COHOST;
      case 3: return ROLE_CONTRIBUTOR;
      case 4: return ROLE_GUEST;
      case 5: return ROLE_VIEWER;
      case 6: return ROLE_RENDERER;
      case 7: return ROLE_PLATFORM;
      case 8: return ROLE_IMPERSONATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Role>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Role> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Role>() {
          public Role findValueByNumber(int number) {
            return Role.forNumber(number);
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
    return stream.api.live.Api.getDescriptor().getEnumTypes().get(12);
  }

  private static final Role[] VALUES = values();

  public static Role valueOf(
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

  private Role(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:live.v21.Role)
}

