// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: classRoom.proto

package ru.nikitavov.scheduleClasses.grpc;

public final class ClassRoomProto {
  private ClassRoomProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_CreateClassRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_CreateClassRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_CreateClassRoomResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_CreateClassRoomResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_ReadClassRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_ReadClassRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_ReadClassRoomResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_ReadClassRoomResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_EditClassRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_EditClassRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_EditClassRoomResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_EditClassRoomResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_DeleteClassRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_DeleteClassRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_DeleteClassRoomResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_DeleteClassRoomResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_ReadAllClassRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_ReadAllClassRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classRoom_ReadAllClassRoomResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classRoom_ReadAllClassRoomResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017classRoom.proto\022\tclassRoom\032\021messageCod" +
      "e.proto\"(\n\026CreateClassRoomRequest\022\016\n\006num" +
      "ber\030\001 \001(\t\"A\n\027CreateClassRoomResponse\022\032\n\004" +
      "code\030\001 \001(\0162\014.MessageCode\022\n\n\002id\030\002 \001(\003\"\"\n\024" +
      "ReadClassRoomRequest\022\n\n\002id\030\001 \001(\003\"O\n\025Read" +
      "ClassRoomResponse\022\032\n\004code\030\001 \001(\0162\014.Messag" +
      "eCode\022\n\n\002id\030\002 \001(\003\022\016\n\006number\030\003 \001(\t\"2\n\024Edi" +
      "tClassRoomRequest\022\n\n\002id\030\001 \001(\003\022\016\n\006number\030" +
      "\002 \001(\t\"B\n\025EditClassRoomResponse\022\032\n\004code\030\001" +
      " \001(\0162\014.MessageCode\022\r\n\005field\030\002 \001(\t\"$\n\026Del" +
      "eteClassRoomRequest\022\n\n\002id\030\001 \001(\003\"5\n\027Delet" +
      "eClassRoomResponse\022\032\n\004code\030\001 \001(\0162\014.Messa" +
      "geCode\"\031\n\027ReadAllClassRoomRequest\"O\n\030Rea" +
      "dAllClassRoomResponse\0223\n\tresponses\030\001 \003(\013" +
      "2 .classRoom.ReadClassRoomResponse2\241\003\n\tC" +
      "lassRoom\022Q\n\006Create\022!.classRoom.CreateCla" +
      "ssRoomRequest\032\".classRoom.CreateClassRoo" +
      "mResponse\"\000\022K\n\004Read\022\037.classRoom.ReadClas" +
      "sRoomRequest\032 .classRoom.ReadClassRoomRe" +
      "sponse\"\000\022K\n\004Edit\022\037.classRoom.EditClassRo" +
      "omRequest\032 .classRoom.EditClassRoomRespo" +
      "nse\"\000\022Q\n\006Delete\022!.classRoom.DeleteClassR" +
      "oomRequest\032\".classRoom.DeleteClassRoomRe" +
      "sponse\"\000\022T\n\007ReadAll\022\".classRoom.ReadAllC" +
      "lassRoomRequest\032#.classRoom.ReadAllClass" +
      "RoomResponse\"\000B5\n!ru.nikitavov.scheduleC" +
      "lasses.grpcB\016ClassRoomProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ru.nikitavov.scheduleClasses.grpc.MessageCodeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_classRoom_CreateClassRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_classRoom_CreateClassRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_CreateClassRoomRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_classRoom_CreateClassRoomResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_classRoom_CreateClassRoomResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_CreateClassRoomResponse_descriptor,
        new java.lang.String[] { "Code", "Id", });
    internal_static_classRoom_ReadClassRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_classRoom_ReadClassRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_ReadClassRoomRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_classRoom_ReadClassRoomResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_classRoom_ReadClassRoomResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_ReadClassRoomResponse_descriptor,
        new java.lang.String[] { "Code", "Id", "Number", });
    internal_static_classRoom_EditClassRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_classRoom_EditClassRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_EditClassRoomRequest_descriptor,
        new java.lang.String[] { "Id", "Number", });
    internal_static_classRoom_EditClassRoomResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_classRoom_EditClassRoomResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_EditClassRoomResponse_descriptor,
        new java.lang.String[] { "Code", "Field", });
    internal_static_classRoom_DeleteClassRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_classRoom_DeleteClassRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_DeleteClassRoomRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_classRoom_DeleteClassRoomResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_classRoom_DeleteClassRoomResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_DeleteClassRoomResponse_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_classRoom_ReadAllClassRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_classRoom_ReadAllClassRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_ReadAllClassRoomRequest_descriptor,
        new java.lang.String[] { });
    internal_static_classRoom_ReadAllClassRoomResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_classRoom_ReadAllClassRoomResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classRoom_ReadAllClassRoomResponse_descriptor,
        new java.lang.String[] { "Responses", });
    ru.nikitavov.scheduleClasses.grpc.MessageCodeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
