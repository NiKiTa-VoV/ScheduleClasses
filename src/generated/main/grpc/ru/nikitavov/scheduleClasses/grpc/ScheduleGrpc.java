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
    comments = "Source: schedule.proto")
public final class ScheduleGrpc {

  private ScheduleGrpc() {}

  public static final String SERVICE_NAME = "schedule.Schedule";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest, ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse> getCreateMethod;
    if ((getCreateMethod = ScheduleGrpc.getCreateMethod) == null) {
      synchronized (ScheduleGrpc.class) {
        if ((getCreateMethod = ScheduleGrpc.getCreateMethod) == null) {
          ScheduleGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest, ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "schedule.Schedule", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScheduleMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse> getReadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest, ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse> getReadMethod;
    if ((getReadMethod = ScheduleGrpc.getReadMethod) == null) {
      synchronized (ScheduleGrpc.class) {
        if ((getReadMethod = ScheduleGrpc.getReadMethod) == null) {
          ScheduleGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest, ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "schedule.Schedule", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScheduleMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEditMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse> METHOD_EDIT = getEditMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse> getEditMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse> getEditMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest, ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse> getEditMethod;
    if ((getEditMethod = ScheduleGrpc.getEditMethod) == null) {
      synchronized (ScheduleGrpc.class) {
        if ((getEditMethod = ScheduleGrpc.getEditMethod) == null) {
          ScheduleGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest, ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "schedule.Schedule", "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScheduleMethodDescriptorSupplier("Edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse> METHOD_DELETE = getDeleteMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest, ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse> getDeleteMethod;
    if ((getDeleteMethod = ScheduleGrpc.getDeleteMethod) == null) {
      synchronized (ScheduleGrpc.class) {
        if ((getDeleteMethod = ScheduleGrpc.getDeleteMethod) == null) {
          ScheduleGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest, ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "schedule.Schedule", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScheduleMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse> METHOD_READ_ALL = getReadAllMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse> getReadAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse> getReadAllMethod;
    if ((getReadAllMethod = ScheduleGrpc.getReadAllMethod) == null) {
      synchronized (ScheduleGrpc.class) {
        if ((getReadAllMethod = ScheduleGrpc.getReadAllMethod) == null) {
          ScheduleGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "schedule.Schedule", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScheduleMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadDefaultMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse> METHOD_READ_DEFAULT = getReadDefaultMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse> getReadDefaultMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse> getReadDefaultMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest, ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse> getReadDefaultMethod;
    if ((getReadDefaultMethod = ScheduleGrpc.getReadDefaultMethod) == null) {
      synchronized (ScheduleGrpc.class) {
        if ((getReadDefaultMethod = ScheduleGrpc.getReadDefaultMethod) == null) {
          ScheduleGrpc.getReadDefaultMethod = getReadDefaultMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest, ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "schedule.Schedule", "ReadDefault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScheduleMethodDescriptorSupplier("ReadDefault"))
                  .build();
          }
        }
     }
     return getReadDefaultMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadDefaultsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse> METHOD_READ_DEFAULTS = getReadDefaultsMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse> getReadDefaultsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse> getReadDefaultsMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest, ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse> getReadDefaultsMethod;
    if ((getReadDefaultsMethod = ScheduleGrpc.getReadDefaultsMethod) == null) {
      synchronized (ScheduleGrpc.class) {
        if ((getReadDefaultsMethod = ScheduleGrpc.getReadDefaultsMethod) == null) {
          ScheduleGrpc.getReadDefaultsMethod = getReadDefaultsMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest, ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "schedule.Schedule", "ReadDefaults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScheduleMethodDescriptorSupplier("ReadDefaults"))
                  .build();
          }
        }
     }
     return getReadDefaultsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScheduleStub newStub(io.grpc.Channel channel) {
    return new ScheduleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScheduleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ScheduleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScheduleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ScheduleFutureStub(channel);
  }

  /**
   */
  public static abstract class ScheduleImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMethod(), responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    /**
     */
    public void readDefault(ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadDefaultMethod(), responseObserver);
    }

    /**
     */
    public void readDefaults(ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadDefaultsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest,
                ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getEditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest,
                ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse>(
                  this, METHODID_EDIT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest,
                ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse>(
                  this, METHODID_READ_ALL)))
          .addMethod(
            getReadDefaultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse>(
                  this, METHODID_READ_DEFAULT)))
          .addMethod(
            getReadDefaultsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse>(
                  this, METHODID_READ_DEFAULTS)))
          .build();
    }
  }

  /**
   */
  public static final class ScheduleStub extends io.grpc.stub.AbstractStub<ScheduleStub> {
    private ScheduleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScheduleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScheduleStub(channel, callOptions);
    }

    /**
     */
    public void create(ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void edit(ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readDefault(ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadDefaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readDefaults(ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadDefaultsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScheduleBlockingStub extends io.grpc.stub.AbstractStub<ScheduleBlockingStub> {
    private ScheduleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScheduleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScheduleBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse create(ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse read(ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse edit(ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse delete(ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse readDefault(ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadDefaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse readDefaults(ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadDefaultsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScheduleFutureStub extends io.grpc.stub.AbstractStub<ScheduleFutureStub> {
    private ScheduleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScheduleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScheduleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScheduleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse> create(
        ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse> read(
        ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse> edit(
        ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse> delete(
        ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse> readAll(
        ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse> readDefault(
        ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadDefaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse> readDefaults(
        ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadDefaultsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_EDIT = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_READ_ALL = 4;
  private static final int METHODID_READ_DEFAULT = 5;
  private static final int METHODID_READ_DEFAULTS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScheduleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScheduleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((ru.nikitavov.scheduleClasses.grpc.CreateScheduleRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.CreateScheduleResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((ru.nikitavov.scheduleClasses.grpc.ReadScheduleRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((ru.nikitavov.scheduleClasses.grpc.EditScheduleRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.EditScheduleResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ru.nikitavov.scheduleClasses.grpc.DeleteScheduleRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.DeleteScheduleResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllScheduleResponse>) responseObserver);
          break;
        case METHODID_READ_DEFAULT:
          serviceImpl.readDefault((ru.nikitavov.scheduleClasses.grpc.ReadDefaultRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultResponse>) responseObserver);
          break;
        case METHODID_READ_DEFAULTS:
          serviceImpl.readDefaults((ru.nikitavov.scheduleClasses.grpc.ReadDefaultsRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultsResponse>) responseObserver);
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

  private static abstract class ScheduleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScheduleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.ScheduleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Schedule");
    }
  }

  private static final class ScheduleFileDescriptorSupplier
      extends ScheduleBaseDescriptorSupplier {
    ScheduleFileDescriptorSupplier() {}
  }

  private static final class ScheduleMethodDescriptorSupplier
      extends ScheduleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScheduleMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScheduleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScheduleFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getEditMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getReadAllMethod())
              .addMethod(getReadDefaultMethod())
              .addMethod(getReadDefaultsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
