/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * region which is hosting broadcast
 * </pre>
 *
 * Protobuf enum {@code live.v21.Region}
 */
public enum Region
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REGION_UNSPECIFIED = 0;</code>
   */
  REGION_UNSPECIFIED(0),
  /**
   * <pre>
   * US East
   * </pre>
   *
   * <code>REGION_US_EAST_1 = 1;</code>
   */
  REGION_US_EAST_1(1),
  /**
   * <code>REGION_US_EAST_2 = 2;</code>
   */
  REGION_US_EAST_2(2),
  /**
   * <pre>
   * US West
   * </pre>
   *
   * <code>REGION_US_WEST_1 = 3;</code>
   */
  REGION_US_WEST_1(3),
  /**
   * <code>REGION_US_WEST_2 = 4;</code>
   */
  REGION_US_WEST_2(4),
  /**
   * <pre>
   * US Central
   * </pre>
   *
   * <code>REGION_US_CENTRAL_1 = 5;</code>
   */
  REGION_US_CENTRAL_1(5),
  /**
   * <pre>
   * Asia Pacific Southeast
   * </pre>
   *
   * <code>REGION_AP_SOUTHEAST_1 = 10;</code>
   */
  REGION_AP_SOUTHEAST_1(10),
  /**
   * <pre>
   * Canada East
   * </pre>
   *
   * <code>REGION_CA_EAST_1 = 20;</code>
   */
  REGION_CA_EAST_1(20),
  /**
   * <pre>
   * Europe Central
   * </pre>
   *
   * <code>REGION_EU_CENTRAL_1 = 30;</code>
   */
  REGION_EU_CENTRAL_1(30),
  /**
   * <pre>
   * Europe West
   * </pre>
   *
   * <code>REGION_EU_WEST_1 = 31;</code>
   */
  REGION_EU_WEST_1(31),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REGION_UNSPECIFIED = 0;</code>
   */
  public static final int REGION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * US East
   * </pre>
   *
   * <code>REGION_US_EAST_1 = 1;</code>
   */
  public static final int REGION_US_EAST_1_VALUE = 1;
  /**
   * <code>REGION_US_EAST_2 = 2;</code>
   */
  public static final int REGION_US_EAST_2_VALUE = 2;
  /**
   * <pre>
   * US West
   * </pre>
   *
   * <code>REGION_US_WEST_1 = 3;</code>
   */
  public static final int REGION_US_WEST_1_VALUE = 3;
  /**
   * <code>REGION_US_WEST_2 = 4;</code>
   */
  public static final int REGION_US_WEST_2_VALUE = 4;
  /**
   * <pre>
   * US Central
   * </pre>
   *
   * <code>REGION_US_CENTRAL_1 = 5;</code>
   */
  public static final int REGION_US_CENTRAL_1_VALUE = 5;
  /**
   * <pre>
   * Asia Pacific Southeast
   * </pre>
   *
   * <code>REGION_AP_SOUTHEAST_1 = 10;</code>
   */
  public static final int REGION_AP_SOUTHEAST_1_VALUE = 10;
  /**
   * <pre>
   * Canada East
   * </pre>
   *
   * <code>REGION_CA_EAST_1 = 20;</code>
   */
  public static final int REGION_CA_EAST_1_VALUE = 20;
  /**
   * <pre>
   * Europe Central
   * </pre>
   *
   * <code>REGION_EU_CENTRAL_1 = 30;</code>
   */
  public static final int REGION_EU_CENTRAL_1_VALUE = 30;
  /**
   * <pre>
   * Europe West
   * </pre>
   *
   * <code>REGION_EU_WEST_1 = 31;</code>
   */
  public static final int REGION_EU_WEST_1_VALUE = 31;


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
  public static Region valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Region forNumber(int value) {
    switch (value) {
      case 0: return REGION_UNSPECIFIED;
      case 1: return REGION_US_EAST_1;
      case 2: return REGION_US_EAST_2;
      case 3: return REGION_US_WEST_1;
      case 4: return REGION_US_WEST_2;
      case 5: return REGION_US_CENTRAL_1;
      case 10: return REGION_AP_SOUTHEAST_1;
      case 20: return REGION_CA_EAST_1;
      case 30: return REGION_EU_CENTRAL_1;
      case 31: return REGION_EU_WEST_1;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Region>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Region> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Region>() {
          public Region findValueByNumber(int number) {
            return Region.forNumber(number);
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
    return stream.api.live.Api.getDescriptor().getEnumTypes().get(10);
  }

  private static final Region[] VALUES = values();

  public static Region valueOf(
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

  private Region(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:live.v21.Region)
}
