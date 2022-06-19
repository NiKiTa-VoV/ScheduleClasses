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
    comments = "Source: teacher.proto")
public final class TeacherGrpc {

  private TeacherGrpc() {}

  public static final String SERVICE_NAME = "teacher.Teacher";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest, ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse> getCreateMethod;
    if ((getCreateMethod = TeacherGrpc.getCreateMethod) == null) {
      synchronized (TeacherGrpc.class) {
        if ((getCreateMethod = TeacherGrpc.getCreateMethod) == null) {
          TeacherGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest, ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "teacher.Teacher", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TeacherMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse> getReadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest, ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse> getReadMethod;
    if ((getReadMethod = TeacherGrpc.getReadMethod) == null) {
      synchronized (TeacherGrpc.class) {
        if ((getReadMethod = TeacherGrpc.getReadMethod) == null) {
          TeacherGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest, ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "teacher.Teacher", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TeacherMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest, ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse> getDeleteMethod;
    if ((getDeleteMethod = TeacherGrpc.getDeleteMethod) == null) {
      synchronized (TeacherGrpc.class) {
        if ((getDeleteMethod = TeacherGrpc.getDeleteMethod) == null) {
          TeacherGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest, ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "teacher.Teacher", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TeacherMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse> METHOD_READ_ALL = getReadAllMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse> getReadAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse> getReadAllMethod;
    if ((getReadAllMethod = TeacherGrpc.getReadAllMethod) == null) {
      synchronized (TeacherGrpc.class) {
        if ((getReadAllMethod = TeacherGrpc.getReadAllMethod) == null) {
          TeacherGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "teacher.Teacher", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TeacherMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeacherStub newStub(io.grpc.Channel channel) {
    return new TeacherStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeacherBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TeacherBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeacherFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TeacherFutureStub(channel);
  }

  /**
   */
  public static abstract class TeacherImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest,
                ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest,
                ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class TeacherStub extends io.grpc.stub.AbstractStub<TeacherStub> {
    private TeacherStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherStub(channel, callOptions);
    }

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeacherBlockingStub extends io.grpc.stub.AbstractStub<TeacherBlockingStub> {
    private TeacherBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse create(ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse read(ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse delete(ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeacherFutureStub extends io.grpc.stub.AbstractStub<TeacherFutureStub> {
    private TeacherFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse> create(
        ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse> read(
        ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse> delete(
        ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse> readAll(
        ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_READ_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeacherImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TeacherImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((ru.nikitavov.scheduleClasses.grpc.CreateTeacherRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateTeacherResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((ru.nikitavov.scheduleClasses.grpc.ReadTeacherRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadTeacherResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ru.nikitavov.scheduleClasses.grpc.DeleteTeacherRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteTeacherResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllTeacherResponse>) responseObserver);
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

  private static abstract class TeacherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TeacherBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.TeacherProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Teacher");
    }
  }

  private static final class TeacherFileDescriptorSupplier
      extends TeacherBaseDescriptorSupplier {
    TeacherFileDescriptorSupplier() {}
  }

  private static final class TeacherMethodDescriptorSupplier
      extends TeacherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TeacherMethodDescriptorSupplier(String methodName) {
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
      synchronized (TeacherGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeacherFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getReadAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
