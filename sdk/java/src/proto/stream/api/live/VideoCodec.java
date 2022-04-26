/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * video encoding codec
 * </pre>
 *
 * Protobuf enum {@code live.v21.VideoCodec}
 */
public enum VideoCodec
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VIDEO_CODEC_UNSPECIFIED = 0;</code>
   */
  VIDEO_CODEC_UNSPECIFIED(0),
  /**
   * <code>VIDEO_CODEC_H264 = 1;</code>
   */
  VIDEO_CODEC_H264(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VIDEO_CODEC_UNSPECIFIED = 0;</code>
   */
  public static final int VIDEO_CODEC_UNSPECIFIED_VALUE = 0;
  /**
   * <code>VIDEO_CODEC_H264 = 1;</code>
   */
  public static final int VIDEO_CODEC_H264_VALUE = 1;


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
  public static VideoCodec valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VideoCodec forNumber(int value) {
    switch (value) {
      case 0: return VIDEO_CODEC_UNSPECIFIED;
      case 1: return VIDEO_CODEC_H264;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VideoCodec>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VideoCodec> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VideoCodec>() {
          public VideoCodec findValueByNumber(int number) {
            return VideoCodec.forNumber(number);
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
    return stream.api.live.Api.getDescriptor().getEnumTypes().get(4);
  }

  private static final VideoCodec[] VALUES = values();

  public static VideoCodec valueOf(
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

  private VideoCodec(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:live.v21.VideoCodec)
}
