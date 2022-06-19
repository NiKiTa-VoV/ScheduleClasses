// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: classRoom.proto

package ru.nikitavov.scheduleClasses.grpc;

/**
 * Protobuf type {@code classRoom.ReadClassRoomResponse}
 */
public  final class ReadClassRoomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:classRoom.ReadClassRoomResponse)
    ReadClassRoomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadClassRoomResponse.newBuilder() to construct.
  private ReadClassRoomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadClassRoomResponse() {
    code_ = 0;
    id_ = 0L;
    number_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadClassRoomResponse(
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
          case 16: {

            id_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            number_ = s;
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
    return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadClassRoomResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadClassRoomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse.class, ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse.Builder.class);
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

  public static final int ID_FIELD_NUMBER = 2;
  private long id_;
  /**
   * <code>int64 id = 2;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int NUMBER_FIELD_NUMBER = 3;
  private volatile java.lang.Object number_;
  /**
   * <code>string number = 3;</code>
   */
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <code>string number = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != 0L) {
      output.writeInt64(2, id_);
    }
    if (!getNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, number_);
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
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, id_);
    }
    if (!getNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, number_);
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
    if (!(obj instanceof ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse)) {
      return super.equals(obj);
    }
    ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse other = (ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse) obj;

    boolean result = true;
    result = result && code_ == other.code_;
    result = result && (getId()
        == other.getId());
    result = result && getNumber()
        .equals(other.getNumber());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parseFrom(
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
  public static Builder newBuilder(ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse prototype) {
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
   * Protobuf type {@code classRoom.ReadClassRoomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:classRoom.ReadClassRoomResponse)
      ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadClassRoomResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadClassRoomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse.class, ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse.Builder.class);
    }

    // Construct using ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse.newBuilder()
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

      id_ = 0L;

      number_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadClassRoomResponse_descriptor;
    }

    public ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse getDefaultInstanceForType() {
      return ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse.getDefaultInstance();
    }

    public ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse build() {
      ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse buildPartial() {
      ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse result = new ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse(this);
      result.code_ = code_;
      result.id_ = id_;
      result.number_ = number_;
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
      if (other instanceof ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse) {
        return mergeFrom((ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse other) {
      if (other == ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
        onChanged();
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
      ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse) e.getUnfinishedMessage();
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

    private long id_ ;
    /**
     * <code>int64 id = 2;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 2;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 2;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object number_ = "";
    /**
     * <code>string number = 3;</code>
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string number = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string number = 3;</code>
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string number = 3;</code>
     */
    public Builder clearNumber() {
      
      number_ = getDefaultInstance().getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string number = 3;</code>
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      number_ = value;
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


    // @@protoc_insertion_point(builder_scope:classRoom.ReadClassRoomResponse)
  }

  // @@protoc_insertion_point(class_scope:classRoom.ReadClassRoomResponse)
  private static final ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse();
  }

  public static ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadClassRoomResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReadClassRoomResponse>() {
    public ReadClassRoomResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadClassRoomResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadClassRoomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadClassRoomResponse> getParserForType() {
    return PARSER;
  }

  public ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

