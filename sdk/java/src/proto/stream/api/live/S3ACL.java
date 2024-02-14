/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf enum {@code live.v21.S3ACL}
 */
public enum S3ACL
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>S3ACL_UNSPECIFIED = 0;</code>
   */
  S3ACL_UNSPECIFIED(0),
  /**
   * <code>S3ACL_PRIVATE = 1;</code>
   */
  S3ACL_PRIVATE(1),
  /**
   * <code>S3ACL_PUBLIC_READ = 2;</code>
   */
  S3ACL_PUBLIC_READ(2),
  /**
   * <code>S3ACL_PUBLIC_READ_WRITE = 3;</code>
   */
  S3ACL_PUBLIC_READ_WRITE(3),
  /**
   * <code>S3ACL_AUTHENTICATED_READ = 4;</code>
   */
  S3ACL_AUTHENTICATED_READ(4),
  /**
   * <code>S3ACL_BUCKET_OWNER_READ = 5;</code>
   */
  S3ACL_BUCKET_OWNER_READ(5),
  /**
   * <code>S3ACL_BUCKET_OWNER_FULL_CONTROL = 6;</code>
   */
  S3ACL_BUCKET_OWNER_FULL_CONTROL(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>S3ACL_UNSPECIFIED = 0;</code>
   */
  public static final int S3ACL_UNSPECIFIED_VALUE = 0;
  /**
   * <code>S3ACL_PRIVATE = 1;</code>
   */
  public static final int S3ACL_PRIVATE_VALUE = 1;
  /**
   * <code>S3ACL_PUBLIC_READ = 2;</code>
   */
  public static final int S3ACL_PUBLIC_READ_VALUE = 2;
  /**
   * <code>S3ACL_PUBLIC_READ_WRITE = 3;</code>
   */
  public static final int S3ACL_PUBLIC_READ_WRITE_VALUE = 3;
  /**
   * <code>S3ACL_AUTHENTICATED_READ = 4;</code>
   */
  public static final int S3ACL_AUTHENTICATED_READ_VALUE = 4;
  /**
   * <code>S3ACL_BUCKET_OWNER_READ = 5;</code>
   */
  public static final int S3ACL_BUCKET_OWNER_READ_VALUE = 5;
  /**
   * <code>S3ACL_BUCKET_OWNER_FULL_CONTROL = 6;</code>
   */
  public static final int S3ACL_BUCKET_OWNER_FULL_CONTROL_VALUE = 6;


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
  public static S3ACL valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static S3ACL forNumber(int value) {
    switch (value) {
      case 0: return S3ACL_UNSPECIFIED;
      case 1: return S3ACL_PRIVATE;
      case 2: return S3ACL_PUBLIC_READ;
      case 3: return S3ACL_PUBLIC_READ_WRITE;
      case 4: return S3ACL_AUTHENTICATED_READ;
      case 5: return S3ACL_BUCKET_OWNER_READ;
      case 6: return S3ACL_BUCKET_OWNER_FULL_CONTROL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<S3ACL>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      S3ACL> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<S3ACL>() {
          public S3ACL findValueByNumber(int number) {
            return S3ACL.forNumber(number);
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
    return stream.api.live.Api.getDescriptor().getEnumTypes().get(9);
  }

  private static final S3ACL[] VALUES = values();

  public static S3ACL valueOf(
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

  private S3ACL(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:live.v21.S3ACL)
}
