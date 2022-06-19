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
    comments = "Source: lesson.proto")
public final class LessonGrpc {

  private LessonGrpc() {}

  public static final String SERVICE_NAME = "lesson.Lesson";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse> getReadMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest, ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse> getReadMethod;
    if ((getReadMethod = LessonGrpc.getReadMethod) == null) {
      synchronized (LessonGrpc.class) {
        if ((getReadMethod = LessonGrpc.getReadMethod) == null) {
          LessonGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest, ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lesson.Lesson", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LessonMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadAllMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse> METHOD_READ_ALL = getReadAllMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse> getReadAllMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse> getReadAllMethod;
    if ((getReadAllMethod = LessonGrpc.getReadAllMethod) == null) {
      synchronized (LessonGrpc.class) {
        if ((getReadAllMethod = LessonGrpc.getReadAllMethod) == null) {
          LessonGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest, ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lesson.Lesson", "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LessonMethodDescriptorSupplier("ReadAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadAvailableLessonsTeacherMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse> METHOD_READ_AVAILABLE_LESSONS_TEACHER = getReadAvailableLessonsTeacherMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse> getReadAvailableLessonsTeacherMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse> getReadAvailableLessonsTeacherMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest, ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse> getReadAvailableLessonsTeacherMethod;
    if ((getReadAvailableLessonsTeacherMethod = LessonGrpc.getReadAvailableLessonsTeacherMethod) == null) {
      synchronized (LessonGrpc.class) {
        if ((getReadAvailableLessonsTeacherMethod = LessonGrpc.getReadAvailableLessonsTeacherMethod) == null) {
          LessonGrpc.getReadAvailableLessonsTeacherMethod = getReadAvailableLessonsTeacherMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest, ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lesson.Lesson", "ReadAvailableLessonsTeacher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LessonMethodDescriptorSupplier("ReadAvailableLessonsTeacher"))
                  .build();
          }
        }
     }
     return getReadAvailableLessonsTeacherMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadDefaultLessonsTeacherMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse> METHOD_READ_DEFAULT_LESSONS_TEACHER = getReadDefaultLessonsTeacherMethod();

  private static volatile io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse> getReadDefaultLessonsTeacherMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest,
      ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse> getReadDefaultLessonsTeacherMethod() {
    io.grpc.MethodDescriptor<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest, ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse> getReadDefaultLessonsTeacherMethod;
    if ((getReadDefaultLessonsTeacherMethod = LessonGrpc.getReadDefaultLessonsTeacherMethod) == null) {
      synchronized (LessonGrpc.class) {
        if ((getReadDefaultLessonsTeacherMethod = LessonGrpc.getReadDefaultLessonsTeacherMethod) == null) {
          LessonGrpc.getReadDefaultLessonsTeacherMethod = getReadDefaultLessonsTeacherMethod = 
              io.grpc.MethodDescriptor.<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest, ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lesson.Lesson", "ReadDefaultLessonsTeacher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LessonMethodDescriptorSupplier("ReadDefaultLessonsTeacher"))
                  .build();
          }
        }
     }
     return getReadDefaultLessonsTeacherMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LessonStub newStub(io.grpc.Channel channel) {
    return new LessonStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LessonBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LessonBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LessonFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LessonFutureStub(channel);
  }

  /**
   */
  public static abstract class LessonImplBase implements io.grpc.BindableService {

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    /**
     */
    public void readAvailableLessonsTeacher(ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAvailableLessonsTeacherMethod(), responseObserver);
    }

    /**
     */
    public void readDefaultLessonsTeacher(ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadDefaultLessonsTeacherMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse>(
                  this, METHODID_READ_ALL)))
          .addMethod(
            getReadAvailableLessonsTeacherMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse>(
                  this, METHODID_READ_AVAILABLE_LESSONS_TEACHER)))
          .addMethod(
            getReadDefaultLessonsTeacherMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest,
                ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse>(
                  this, METHODID_READ_DEFAULT_LESSONS_TEACHER)))
          .build();
    }
  }

  /**
   */
  public static final class LessonStub extends io.grpc.stub.AbstractStub<LessonStub> {
    private LessonStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LessonStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LessonStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LessonStub(channel, callOptions);
    }

    /**
     */
    public void read(ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAvailableLessonsTeacher(ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAvailableLessonsTeacherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readDefaultLessonsTeacher(ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest request,
        io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadDefaultLessonsTeacherMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LessonBlockingStub extends io.grpc.stub.AbstractStub<LessonBlockingStub> {
    private LessonBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LessonBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LessonBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LessonBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse read(ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse readAll(ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse readAvailableLessonsTeacher(ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAvailableLessonsTeacherMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse readDefaultLessonsTeacher(ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadDefaultLessonsTeacherMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LessonFutureStub extends io.grpc.stub.AbstractStub<LessonFutureStub> {
    private LessonFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LessonFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LessonFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LessonFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse> read(
        ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse> readAll(
        ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse> readAvailableLessonsTeacher(
        ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAvailableLessonsTeacherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse> readDefaultLessonsTeacher(
        ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadDefaultLessonsTeacherMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_READ_ALL = 1;
  private static final int METHODID_READ_AVAILABLE_LESSONS_TEACHER = 2;
  private static final int METHODID_READ_DEFAULT_LESSONS_TEACHER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LessonImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LessonImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((ru.nikitavov.scheduleClasses.grpc.ReadLessonRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadLessonResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAllLessonsResponse>) responseObserver);
          break;
        case METHODID_READ_AVAILABLE_LESSONS_TEACHER:
          serviceImpl.readAvailableLessonsTeacher((ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonsResponse>) responseObserver);
          break;
        case METHODID_READ_DEFAULT_LESSONS_TEACHER:
          serviceImpl.readDefaultLessonsTeacher((ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherRequest) request,
              (io.grpc.stub.StreamObserver<ru.nikitavov.scheduleClasses.grpc.ReadDefaultLessonsTeacherResponse>) responseObserver);
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

  private static abstract class LessonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LessonBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.LessonProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lesson");
    }
  }

  private static final class LessonFileDescriptorSupplier
      extends LessonBaseDescriptorSupplier {
    LessonFileDescriptorSupplier() {}
  }

  private static final class LessonMethodDescriptorSupplier
      extends LessonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LessonMethodDescriptorSupplier(String methodName) {
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
      synchronized (LessonGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LessonFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .addMethod(getReadAllMethod())
              .addMethod(getReadAvailableLessonsTeacherMethod())
              .addMethod(getReadDefaultLessonsTeacherMethod())
              .build();
        }
      }
    }
    return result;
  }
}
