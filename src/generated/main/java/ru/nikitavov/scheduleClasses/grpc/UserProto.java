// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package ru.nikitavov.scheduleClasses.grpc;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_CreateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_CreateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_CreateUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_CreateUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ReadUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ReadUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_ReadUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_ReadUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_EditUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_EditUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_EditUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_EditUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_DeleteUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_DeleteUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_DeleteUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_DeleteUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_AuthorizationUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_AuthorizationUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_AuthorizationUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_AuthorizationUserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\004user\032\021messageCode.proto\"`\n" +
      "\021CreateUserRequest\022\016\n\006roleId\030\001 \001(\003\022\014\n\004na" +
      "me\030\002 \001(\t\022\r\n\005login\030\003 \001(\t\022\020\n\010password\030\004 \001(" +
      "\t\022\014\n\004mail\030\005 \001(\t\"?\n\022CreateUserResponse\022\032\n" +
      "\004code\030\001 \001(\0162\014.MessageCode\022\r\n\005field\030\002 \001(\t" +
      "\"!\n\017ReadUserRequest\022\016\n\006userId\030\001 \001(\003\"y\n\020R" +
      "eadUserResponse\022\032\n\004code\030\001 \001(\0162\014.MessageC" +
      "ode\022\016\n\006userId\030\002 \001(\003\022\016\n\006roleId\030\003 \001(\003\022\014\n\004n" +
      "ame\030\004 \001(\t\022\r\n\005login\030\005 \001(\t\022\014\n\004mail\030\006 \001(\t\"n" +
      "\n\017EditUserRequest\022\016\n\006userId\030\001 \001(\003\022\016\n\006rol" +
      "eId\030\002 \001(\003\022\014\n\004name\030\003 \001(\t\022\r\n\005login\030\004 \001(\t\022\020" +
      "\n\010password\030\005 \001(\t\022\014\n\004mail\030\006 \001(\t\"=\n\020EditUs" +
      "erResponse\022\032\n\004code\030\001 \001(\0162\014.MessageCode\022\r" +
      "\n\005field\030\002 \001(\t\"#\n\021DeleteUserRequest\022\016\n\006us" +
      "erId\030\001 \001(\003\"0\n\022DeleteUserResponse\022\032\n\004code" +
      "\030\001 \001(\0162\014.MessageCode\";\n\030AuthorizationUse" +
      "rRequest\022\r\n\005login\030\001 \001(\t\022\020\n\010password\030\002 \001(" +
      "\t\"Y\n\031AuthorizationUserResponse\022\032\n\004code\030\001" +
      " \001(\0162\014.MessageCode\022\017\n\007message\030\002 \001(\t\022\017\n\007i" +
      "sLogin\030\003 \001(\0102\312\002\n\004User\022=\n\006Create\022\027.user.C" +
      "reateUserRequest\032\030.user.CreateUserRespon" +
      "se\"\000\0227\n\004Read\022\025.user.ReadUserRequest\032\026.us" +
      "er.ReadUserResponse\"\000\0227\n\004Edit\022\025.user.Edi" +
      "tUserRequest\032\026.user.EditUserResponse\"\000\022=" +
      "\n\006Delete\022\027.user.DeleteUserRequest\032\030.user" +
      ".DeleteUserResponse\"\000\022R\n\rAuthorization\022\036" +
      ".user.AuthorizationUserRequest\032\037.user.Au" +
      "thorizationUserResponse\"\000B0\n!ru.nikitavo" +
      "v.scheduleClasses.grpcB\tUserProtoP\001b\006pro" +
      "to3"
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
    internal_static_user_CreateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_CreateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_CreateUserRequest_descriptor,
        new java.lang.String[] { "RoleId", "Name", "Login", "Password", "Mail", });
    internal_static_user_CreateUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_CreateUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_CreateUserResponse_descriptor,
        new java.lang.String[] { "Code", "Field", });
    internal_static_user_ReadUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_user_ReadUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ReadUserRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_user_ReadUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_user_ReadUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_ReadUserResponse_descriptor,
        new java.lang.String[] { "Code", "UserId", "RoleId", "Name", "Login", "Mail", });
    internal_static_user_EditUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_user_EditUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_EditUserRequest_descriptor,
        new java.lang.String[] { "UserId", "RoleId", "Name", "Login", "Password", "Mail", });
    internal_static_user_EditUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_user_EditUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_EditUserResponse_descriptor,
        new java.lang.String[] { "Code", "Field", });
    internal_static_user_DeleteUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_user_DeleteUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_DeleteUserRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_user_DeleteUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_user_DeleteUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_DeleteUserResponse_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_user_AuthorizationUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_user_AuthorizationUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_AuthorizationUserRequest_descriptor,
        new java.lang.String[] { "Login", "Password", });
    internal_static_user_AuthorizationUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_user_AuthorizationUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_AuthorizationUserResponse_descriptor,
        new java.lang.String[] { "Code", "Message", "IsLogin", });
    ru.nikitavov.scheduleClasses.grpc.MessageCodeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
