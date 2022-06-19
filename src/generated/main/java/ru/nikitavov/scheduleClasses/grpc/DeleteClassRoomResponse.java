// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: classRoom.proto

package ru.nikitavov.scheduleClasses.grpc;

/**
 * Protobuf type {@code classRoom.DeleteClassRoomResponse}
 */
public  final class DeleteClassRoomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:classRoom.DeleteClassRoomResponse)
    DeleteClassRoomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteClassRoomResponse.newBuilder() to construct.
  private DeleteClassRoomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteClassRoomResponse() {
    code_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteClassRoomResponse(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            code_ = rawValue;
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
    return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_DeleteClassRoomResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_DeleteClassRoomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse.class, ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>.MessageCode code = 1;</code>
   */
  public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.MessageCode code = 1;</code>
   */
  public ru.nikitavov.scheduleClasses.grpc.MessageCode getCode() {
    ru.nikitavov.scheduleClasses.grpc.MessageCode result = ru.nikitavov.scheduleClasses.grpc.MessageCode.valueOf(code_);
    return result == null ? ru.nikitavov.scheduleClasses.grpc.MessageCode.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (code_ != ru.nikitavov.scheduleClasses.grpc.MessageCode.EMPTY.getNumber()) {
      output.writeEnum(1, code_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != ru.nikitavov.scheduleClasses.grpc.MessageCode.EMPTY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
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
    if (!(obj instanceof ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse)) {
      return super.equals(obj);
    }
    ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse other = (ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse) obj;

    boolean result = true;
    result = result && code_ == other.code_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code classRoom.DeleteClassRoomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:classRoom.DeleteClassRoomResponse)
      ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_DeleteClassRoomResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_DeleteClassRoomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse.class, ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse.Builder.class);
    }

    // Construct using ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      code_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_DeleteClassRoomResponse_descriptor;
    }

    public ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse getDefaultInstanceForType() {
      return ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse.getDefaultInstance();
    }

    public ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse build() {
      ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse buildPartial() {
      ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse result = new ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse(this);
      result.code_ = code_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse) {
        return mergeFrom((ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse other) {
      if (other == ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ = 0;
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public ru.nikitavov.scheduleClasses.grpc.MessageCode getCode() {
      ru.nikitavov.scheduleClasses.grpc.MessageCode result = ru.nikitavov.scheduleClasses.grpc.MessageCode.valueOf(code_);
      return result == null ? ru.nikitavov.scheduleClasses.grpc.MessageCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public Builder setCode(ru.nikitavov.scheduleClasses.grpc.MessageCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:classRoom.DeleteClassRoomResponse)
  }

  // @@protoc_insertion_point(class_scope:classRoom.DeleteClassRoomResponse)
  private static final ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse();
  }

  public static ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteClassRoomResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteClassRoomResponse>() {
    public DeleteClassRoomResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteClassRoomResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteClassRoomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteClassRoomResponse> getParserForType() {
    return PARSER;
  }

  public ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
