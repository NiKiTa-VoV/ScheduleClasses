package ru.nikitavov.scheduleClasses.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: user.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "user.User";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateUserRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateUserResponse> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateUserRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateUserResponse> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateUserRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateUserResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateUserRequest, ru.nikitavov.scheduleClasses.grpc.CreateUserResponse> getCreateMethod;
    if ((getCreateMethod = UserGrpc.getCreateMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getCreateMethod = UserGrpc.getCreateMethod) == null) {
          UserGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.CreateUserRequest, ru.nikitavov.scheduleClasses.grpc.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.User", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadUserRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadUserResponse> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadUserRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadUserResponse> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadUserRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadUserResponse> getReadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadUserRequest, ru.nikitavov.scheduleClasses.grpc.ReadUserResponse> getReadMethod;
    if ((getReadMethod = UserGrpc.getReadMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getReadMethod = UserGrpc.getReadMethod) == null) {
          UserGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadUserRequest, ru.nikitavov.scheduleClasses.grpc.ReadUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.User", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEditMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditUserRequest,
      ru.nikitavov.scheduleClasses.grpc.EditUserResponse> METHOD_EDIT = getEditMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditUserRequest,
      ru.nikitavov.scheduleClasses.grpc.EditUserResponse> getEditMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditUserRequest,
      ru.nikitavov.scheduleClasses.grpc.EditUserResponse> getEditMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditUserRequest, ru.nikitavov.scheduleClasses.grpc.EditUserResponse> getEditMethod;
    if ((getEditMethod = UserGrpc.getEditMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getEditMethod = UserGrpc.getEditMethod) == null) {
          UserGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.EditUserRequest, ru.nikitavov.scheduleClasses.grpc.EditUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.User", "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("Edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest, ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse> getDeleteMethod;
    if ((getDeleteMethod = UserGrpc.getDeleteMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getDeleteMethod = UserGrpc.getDeleteMethod) == null) {
          UserGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest, ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.User", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAuthorizationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest,
      ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse> METHOD_AUTHORIZATION = getAuthorizationMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest,
      ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse> getAuthorizationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest,
      ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse> getAuthorizationMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest, ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse> getAuthorizationMethod;
    if ((getAuthorizationMethod = UserGrpc.getAuthorizationMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getAuthorizationMethod = UserGrpc.getAuthorizationMethod) == null) {
          UserGrpc.getAuthorizationMethod = getAuthorizationMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest, ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.User", "Authorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("Authorization"))
                  .build();
          }
        }
     }
     return getAuthorizationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMethod(), responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void authorization(ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthorizationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.CreateUserRequest,
                ru.nikitavov.scheduleClasses.grpc.CreateUserResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadUserRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadUserResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getEditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.EditUserRequest,
                ru.nikitavov.scheduleClasses.grpc.EditUserResponse>(
                  this, METHODID_EDIT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest,
                ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getAuthorizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest,
                ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse>(
                  this, METHODID_AUTHORIZATION)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authorization(ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.CreateUserResponse create(ru.nikitavov.scheduleClasses.grpc.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadUserResponse read(ru.nikitavov.scheduleClasses.grpc.ReadUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.EditUserResponse edit(ru.nikitavov.scheduleClasses.grpc.EditUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse delete(ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse authorization(ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthorizationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.CreateUserResponse> create(
        ru.nikitavov.scheduleClasses.grpc.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadUserResponse> read(
        ru.nikitavov.scheduleClasses.grpc.ReadUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.EditUserResponse> edit(
        ru.nikitavov.scheduleClasses.grpc.EditUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse> delete(
        ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse> authorization(
        ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthorizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_EDIT = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_AUTHORIZATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((ru.nikitavov.scheduleClasses.grpc.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateUserResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((ru.nikitavov.scheduleClasses.grpc.ReadUserRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadUserResponse>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((ru.nikitavov.scheduleClasses.grpc.EditUserRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditUserResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ru.nikitavov.scheduleClasses.grpc.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_AUTHORIZATION:
          serviceImpl.authorization((ru.nikitavov.scheduleClasses.grpc.AuthorizationUserRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.AuthorizationUserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getEditMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getAuthorizationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
