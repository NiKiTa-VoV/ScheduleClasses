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
    comments = "Source: department.proto")
public final class DepartmentGrpc {

  private DepartmentGrpc() {}

  public static final String SERVICE_NAME = "department.Department";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse> getCreateMethod;
    if ((getCreateMethod = DepartmentGrpc.getCreateMethod) == null) {
      synchronized (DepartmentGrpc.class) {
        if ((getCreateMethod = DepartmentGrpc.getCreateMethod) == null) {
          DepartmentGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.Department", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse> getReadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse> getReadMethod;
    if ((getReadMethod = DepartmentGrpc.getReadMethod) == null) {
      synchronized (DepartmentGrpc.class) {
        if ((getReadMethod = DepartmentGrpc.getReadMethod) == null) {
          DepartmentGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.Department", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEditMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse> METHOD_EDIT = getEditMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse> getEditMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse> getEditMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse> getEditMethod;
    if ((getEditMethod = DepartmentGrpc.getEditMethod) == null) {
      synchronized (DepartmentGrpc.class) {
        if ((getEditMethod = DepartmentGrpc.getEditMethod) == null) {
          DepartmentGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.Department", "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentMethodDescriptorSupplier("Edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse> getDeleteMethod;
    if ((getDeleteMethod = DepartmentGrpc.getDeleteMethod) == null) {
      synchronized (DepartmentGrpc.class) {
        if ((getDeleteMethod = DepartmentGrpc.getDeleteMethod) == null) {
          DepartmentGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.Department", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse> METHOD_READ_ALL = getReadAllMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse> getReadAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse> getReadAllMethod;
    if ((getReadAllMethod = DepartmentGrpc.getReadAllMethod) == null) {
      synchronized (DepartmentGrpc.class) {
        if ((getReadAllMethod = DepartmentGrpc.getReadAllMethod) == null) {
          DepartmentGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "department.Department", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartmentStub newStub(io.grpc.Channel channel) {
    return new DepartmentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartmentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DepartmentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartmentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DepartmentFutureStub(channel);
  }

  /**
   */
  public static abstract class DepartmentImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMethod(), responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest,
                ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getEditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest,
                ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse>(
                  this, METHODID_EDIT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest,
                ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class DepartmentStub extends io.grpc.stub.AbstractStub<DepartmentStub> {
    private DepartmentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentStub(channel, callOptions);
    }

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DepartmentBlockingStub extends io.grpc.stub.AbstractStub<DepartmentBlockingStub> {
    private DepartmentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse create(ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse read(ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse edit(ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse delete(ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DepartmentFutureStub extends io.grpc.stub.AbstractStub<DepartmentFutureStub> {
    private DepartmentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse> create(
        ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse> read(
        ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse> edit(
        ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse> delete(
        ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse> readAll(
        ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest request) {
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
    private final DepartmentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DepartmentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((ru.nikitavov.scheduleClasses.grpc.CreateDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateDepartmentResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((ru.nikitavov.scheduleClasses.grpc.ReadDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDepartmentResponse>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((ru.nikitavov.scheduleClasses.grpc.EditDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditDepartmentResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteDepartmentResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllDepartmentResponse>) responseObserver);
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

  private static abstract class DepartmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartmentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.DepartmentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Department");
    }
  }

  private static final class DepartmentFileDescriptorSupplier
      extends DepartmentBaseDescriptorSupplier {
    DepartmentFileDescriptorSupplier() {}
  }

  private static final class DepartmentMethodDescriptorSupplier
      extends DepartmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DepartmentMethodDescriptorSupplier(String methodName) {
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
      synchronized (DepartmentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartmentFileDescriptorSupplier())
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
