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
    comments = "Source: report.proto")
public final class ReportGrpc {

  private ReportGrpc() {}

  public static final String SERVICE_NAME = "report.Report";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTeacherWorkloadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest,
      ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse> METHOD_TEACHER_WORKLOAD = getTeacherWorkloadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest,
      ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse> getTeacherWorkloadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest,
      ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse> getTeacherWorkloadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest, ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse> getTeacherWorkloadMethod;
    if ((getTeacherWorkloadMethod = ReportGrpc.getTeacherWorkloadMethod) == null) {
      synchronized (ReportGrpc.class) {
        if ((getTeacherWorkloadMethod = ReportGrpc.getTeacherWorkloadMethod) == null) {
          ReportGrpc.getTeacherWorkloadMethod = getTeacherWorkloadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest, ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "report.Report", "TeacherWorkload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReportMethodDescriptorSupplier("TeacherWorkload"))
                  .build();
          }
        }
     }
     return getTeacherWorkloadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReportStub newStub(io.grpc.Channel channel) {
    return new ReportStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReportBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReportFutureStub(channel);
  }

  /**
   */
  public static abstract class ReportImplBase implements io.grpc.BindableService {

    /**
     */
    public void teacherWorkload(ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTeacherWorkloadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTeacherWorkloadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest,
                ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse>(
                  this, METHODID_TEACHER_WORKLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class ReportStub extends io.grpc.stub.AbstractStub<ReportStub> {
    private ReportStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportStub(channel, callOptions);
    }

    /**
     */
    public void teacherWorkload(ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTeacherWorkloadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReportBlockingStub extends io.grpc.stub.AbstractStub<ReportBlockingStub> {
    private ReportBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse teacherWorkload(ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest request) {
      return blockingUnaryCall(
          getChannel(), getTeacherWorkloadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReportFutureStub extends io.grpc.stub.AbstractStub<ReportFutureStub> {
    private ReportFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReportFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReportFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReportFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse> teacherWorkload(
        ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTeacherWorkloadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEACHER_WORKLOAD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReportImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReportImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEACHER_WORKLOAD:
          serviceImpl.teacherWorkload((ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse>) responseObserver);
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

  private static abstract class ReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.ReportProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Report");
    }
  }

  private static final class ReportFileDescriptorSupplier
      extends ReportBaseDescriptorSupplier {
    ReportFileDescriptorSupplier() {}
  }

  private static final class ReportMethodDescriptorSupplier
      extends ReportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReportMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReportFileDescriptorSupplier())
              .addMethod(getTeacherWorkloadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
