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
    comments = "Source: specialization.proto")
public final class SpecializationGrpc {

  private SpecializationGrpc() {}

  public static final String SERVICE_NAME = "specialization.Specialization";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse> getCreateMethod;
    if ((getCreateMethod = SpecializationGrpc.getCreateMethod) == null) {
      synchronized (SpecializationGrpc.class) {
        if ((getCreateMethod = SpecializationGrpc.getCreateMethod) == null) {
          SpecializationGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "specialization.Specialization", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpecializationMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse> getReadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse> getReadMethod;
    if ((getReadMethod = SpecializationGrpc.getReadMethod) == null) {
      synchronized (SpecializationGrpc.class) {
        if ((getReadMethod = SpecializationGrpc.getReadMethod) == null) {
          SpecializationGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "specialization.Specialization", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpecializationMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEditMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse> METHOD_EDIT = getEditMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse> getEditMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse> getEditMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse> getEditMethod;
    if ((getEditMethod = SpecializationGrpc.getEditMethod) == null) {
      synchronized (SpecializationGrpc.class) {
        if ((getEditMethod = SpecializationGrpc.getEditMethod) == null) {
          SpecializationGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "specialization.Specialization", "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpecializationMethodDescriptorSupplier("Edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse> getDeleteMethod;
    if ((getDeleteMethod = SpecializationGrpc.getDeleteMethod) == null) {
      synchronized (SpecializationGrpc.class) {
        if ((getDeleteMethod = SpecializationGrpc.getDeleteMethod) == null) {
          SpecializationGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "specialization.Specialization", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpecializationMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse> METHOD_READ_ALL = getReadAllMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse> getReadAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse> getReadAllMethod;
    if ((getReadAllMethod = SpecializationGrpc.getReadAllMethod) == null) {
      synchronized (SpecializationGrpc.class) {
        if ((getReadAllMethod = SpecializationGrpc.getReadAllMethod) == null) {
          SpecializationGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "specialization.Specialization", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpecializationMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpecializationStub newStub(io.grpc.Channel channel) {
    return new SpecializationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpecializationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpecializationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpecializationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpecializationFutureStub(channel);
  }

  /**
   */
  public static abstract class SpecializationImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMethod(), responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest,
                ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getEditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest,
                ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse>(
                  this, METHODID_EDIT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest,
                ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class SpecializationStub extends io.grpc.stub.AbstractStub<SpecializationStub> {
    private SpecializationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpecializationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpecializationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpecializationStub(channel, callOptions);
    }

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpecializationBlockingStub extends io.grpc.stub.AbstractStub<SpecializationBlockingStub> {
    private SpecializationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpecializationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpecializationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpecializationBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse create(ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse read(ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse edit(ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest request) {
      return blockingUnaryCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse delete(ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpecializationFutureStub extends io.grpc.stub.AbstractStub<SpecializationFutureStub> {
    private SpecializationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpecializationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpecializationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpecializationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse> create(
        ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse> read(
        ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse> edit(
        ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse> delete(
        ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse> readAll(
        ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest request) {
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
    private final SpecializationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpecializationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((ru.nikitavov.scheduleClasses.grpc.CreateSpecializationRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateSpecializationResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((ru.nikitavov.scheduleClasses.grpc.ReadSpecializationRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadSpecializationResponse>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((ru.nikitavov.scheduleClasses.grpc.EditSpecializationRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditSpecializationResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteSpecializationResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllSpecializationResponse>) responseObserver);
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

  private static abstract class SpecializationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpecializationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.SpecializationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Specialization");
    }
  }

  private static final class SpecializationFileDescriptorSupplier
      extends SpecializationBaseDescriptorSupplier {
    SpecializationFileDescriptorSupplier() {}
  }

  private static final class SpecializationMethodDescriptorSupplier
      extends SpecializationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpecializationMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpecializationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpecializationFileDescriptorSupplier())
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
