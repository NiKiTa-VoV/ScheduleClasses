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
    comments = "Source: classRoom.proto")
public final class ClassRoomGrpc {

  private ClassRoomGrpc() {}

  public static final String SERVICE_NAME = "classRoom.ClassRoom";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse> getCreateMethod;
    if ((getCreateMethod = ClassRoomGrpc.getCreateMethod) == null) {
      synchronized (ClassRoomGrpc.class) {
        if ((getCreateMethod = ClassRoomGrpc.getCreateMethod) == null) {
          ClassRoomGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "classRoom.ClassRoom", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassRoomMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse> getReadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse> getReadMethod;
    if ((getReadMethod = ClassRoomGrpc.getReadMethod) == null) {
      synchronized (ClassRoomGrpc.class) {
        if ((getReadMethod = ClassRoomGrpc.getReadMethod) == null) {
          ClassRoomGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "classRoom.ClassRoom", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassRoomMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEditMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse> METHOD_EDIT = getEditMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse> getEditMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse> getEditMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse> getEditMethod;
    if ((getEditMethod = ClassRoomGrpc.getEditMethod) == null) {
      synchronized (ClassRoomGrpc.class) {
        if ((getEditMethod = ClassRoomGrpc.getEditMethod) == null) {
          ClassRoomGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "classRoom.ClassRoom", "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassRoomMethodDescriptorSupplier("Edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse> getDeleteMethod;
    if ((getDeleteMethod = ClassRoomGrpc.getDeleteMethod) == null) {
      synchronized (ClassRoomGrpc.class) {
        if ((getDeleteMethod = ClassRoomGrpc.getDeleteMethod) == null) {
          ClassRoomGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "classRoom.ClassRoom", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassRoomMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse> METHOD_READ_ALL = getReadAllMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse> getReadAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse> getReadAllMethod;
    if ((getReadAllMethod = ClassRoomGrpc.getReadAllMethod) == null) {
      synchronized (ClassRoomGrpc.class) {
        if ((getReadAllMethod = ClassRoomGrpc.getReadAllMethod) == null) {
          ClassRoomGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "classRoom.ClassRoom", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClassRoomMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClassRoomStub newStub(io.grpc.Channel channel) {
    return new ClassRoomStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClassRoomBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClassRoomBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClassRoomFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClassRoomFutureStub(channel);
  }

  /**
   */
  public static abstract class ClassRoomImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMethod(), responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest,
                ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getEditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest,
                ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse>(
                  this, METHODID_EDIT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest,
                ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ClassRoomStub extends io.grpc.stub.AbstractStub<ClassRoomStub> {
    private ClassRoomStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassRoomStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassRoomStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassRoomStub(channel, callOptions);
    }

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClassRoomBlockingStub extends io.grpc.stub.AbstractStub<ClassRoomBlockingStub> {
    private ClassRoomBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassRoomBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassRoomBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassRoomBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse create(ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse read(ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse edit(ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse delete(ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClassRoomFutureStub extends io.grpc.stub.AbstractStub<ClassRoomFutureStub> {
    private ClassRoomFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClassRoomFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassRoomFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClassRoomFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse> create(
        ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse> read(
        ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse> edit(
        ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse> delete(
        ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse> readAll(
        ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_EDIT = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_READ_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClassRoomImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClassRoomImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((ru.nikitavov.scheduleClasses.grpc.CreateClassRoomRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateClassRoomResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((ru.nikitavov.scheduleClasses.grpc.ReadClassRoomRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadClassRoomResponse>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((ru.nikitavov.scheduleClasses.grpc.EditClassRoomRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditClassRoomResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteClassRoomResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllClassRoomResponse>) responseObserver);
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

  private static abstract class ClassRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClassRoomBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.ClassRoomProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClassRoom");
    }
  }

  private static final class ClassRoomFileDescriptorSupplier
      extends ClassRoomBaseDescriptorSupplier {
    ClassRoomFileDescriptorSupplier() {}
  }

  private static final class ClassRoomMethodDescriptorSupplier
      extends ClassRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClassRoomMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClassRoomGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClassRoomFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getEditMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getReadAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
