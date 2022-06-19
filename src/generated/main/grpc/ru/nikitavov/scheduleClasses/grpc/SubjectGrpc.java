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
    comments = "Source: subject.proto")
public final class SubjectGrpc {

  private SubjectGrpc() {}

  public static final String SERVICE_NAME = "subject.Subject";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest, ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse> getCreateMethod;
    if ((getCreateMethod = SubjectGrpc.getCreateMethod) == null) {
      synchronized (SubjectGrpc.class) {
        if ((getCreateMethod = SubjectGrpc.getCreateMethod) == null) {
          SubjectGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest, ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "subject.Subject", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubjectMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse> getReadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest, ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse> getReadMethod;
    if ((getReadMethod = SubjectGrpc.getReadMethod) == null) {
      synchronized (SubjectGrpc.class) {
        if ((getReadMethod = SubjectGrpc.getReadMethod) == null) {
          SubjectGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest, ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "subject.Subject", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubjectMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEditMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse> METHOD_EDIT = getEditMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse> getEditMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse> getEditMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest, ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse> getEditMethod;
    if ((getEditMethod = SubjectGrpc.getEditMethod) == null) {
      synchronized (SubjectGrpc.class) {
        if ((getEditMethod = SubjectGrpc.getEditMethod) == null) {
          SubjectGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest, ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "subject.Subject", "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubjectMethodDescriptorSupplier("Edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest, ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse> getDeleteMethod;
    if ((getDeleteMethod = SubjectGrpc.getDeleteMethod) == null) {
      synchronized (SubjectGrpc.class) {
        if ((getDeleteMethod = SubjectGrpc.getDeleteMethod) == null) {
          SubjectGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest, ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "subject.Subject", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubjectMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse> METHOD_READ_ALL = getReadAllMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse> getReadAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse> getReadAllMethod;
    if ((getReadAllMethod = SubjectGrpc.getReadAllMethod) == null) {
      synchronized (SubjectGrpc.class) {
        if ((getReadAllMethod = SubjectGrpc.getReadAllMethod) == null) {
          SubjectGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "subject.Subject", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubjectMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubjectStub newStub(io.grpc.Channel channel) {
    return new SubjectStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubjectBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubjectBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubjectFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubjectFutureStub(channel);
  }

  /**
   */
  public static abstract class SubjectImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMethod(), responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest,
                ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getEditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest,
                ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse>(
                  this, METHODID_EDIT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest,
                ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class SubjectStub extends io.grpc.stub.AbstractStub<SubjectStub> {
    private SubjectStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubjectStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubjectStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubjectStub(channel, callOptions);
    }

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SubjectBlockingStub extends io.grpc.stub.AbstractStub<SubjectBlockingStub> {
    private SubjectBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubjectBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubjectBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubjectBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse create(ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse read(ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse edit(ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse delete(ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SubjectFutureStub extends io.grpc.stub.AbstractStub<SubjectFutureStub> {
    private SubjectFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubjectFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubjectFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubjectFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse> create(
        ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse> read(
        ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse> edit(
        ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse> delete(
        ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse> readAll(
        ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest request) {
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
    private final SubjectImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubjectImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((ru.nikitavov.scheduleClasses.grpc.CreateSubjectRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateSubjectResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((ru.nikitavov.scheduleClasses.grpc.ReadSubjectRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadSubjectResponse>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((ru.nikitavov.scheduleClasses.grpc.EditSubjectRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditSubjectResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ru.nikitavov.scheduleClasses.grpc.DeleteSubjectRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteSubjectResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllSubjectResponse>) responseObserver);
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

  private static abstract class SubjectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubjectBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.SubjectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Subject");
    }
  }

  private static final class SubjectFileDescriptorSupplier
      extends SubjectBaseDescriptorSupplier {
    SubjectFileDescriptorSupplier() {}
  }

  private static final class SubjectMethodDescriptorSupplier
      extends SubjectBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubjectMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubjectGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubjectFileDescriptorSupplier())
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
