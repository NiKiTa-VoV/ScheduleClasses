// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: classRoom.proto

package ru.nikitavov.scheduleClasses.grpc;

/**
 * Protobuf type {@code classRoom.ReadAllClassRoomRequest}
 */
public  final class ReadAllClassRoomRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:classRoom.ReadAllClassRoomRequest)
    ReadAllClassRoomRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadAllClassRoomRequest.newBuilder() to construct.
  private ReadAllClassRoomRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadAllClassRoomRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadAllClassRoomRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
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
    return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadAllClassRoomRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadAllClassRoomRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest.class, ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest.Builder.class);
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
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest)) {
      return super.equals(obj);
    }
    ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest other = (ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest) obj;

    boolean result = true;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parseFrom(
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
  public static Builder newBuilder(ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest prototype) {
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
   * Protobuf type {@code classRoom.ReadAllClassRoomRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:classRoom.ReadAllClassRoomRequest)
      ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadAllClassRoomRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadAllClassRoomRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest.class, ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest.Builder.class);
    }

    // Construct using ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest.newBuilder()
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
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.internal_static_classRoom_ReadAllClassRoomRequest_descriptor;
    }

    public ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest getDefaultInstanceForType() {
      return ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest.getDefaultInstance();
    }

    public ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest build() {
      ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest buildPartial() {
      ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest result = new ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest(this);
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
      if (other instanceof ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest) {
        return mergeFrom((ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest other) {
      if (other == ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest.getDefaultInstance()) return this;
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
      ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:classRoom.ReadAllClassRoomRequest)
  }

  // @@protoc_insertion_point(class_scope:classRoom.ReadAllClassRoomRequest)
  private static final ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest();
  }

  public static ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadAllClassRoomRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReadAllClassRoomRequest>() {
    public ReadAllClassRoomRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadAllClassRoomRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadAllClassRoomRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadAllClassRoomRequest> getParserForType() {
    return PARSER;
  }

  public ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

