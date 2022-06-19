package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.Teacher;
import ru.nikitavov.scheduleClasses.dateBase.handler.TeacherHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;

public class TeacherGrpcImpl extends TeacherGrpc.TeacherImplBase {

    @Override
    public void create(CreateTeacherRequest request, StreamObserver<CreateTeacherResponse> responseObserver) {
        Message message = TeacherHandler.create(request.getUserId());
        CreateTeacherResponse build = CreateTeacherResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadTeacherRequest request, StreamObserver<ReadTeacherResponse> responseObserver) {
        Message message = TeacherHandler.read(request.getUserId());
        ReadTeacherResponse.Builder builder = ReadTeacherResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof Teacher teacher)
            builder.setName(teacher.getId().getName())
                    .setUserId(teacher.getId().getId());
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteTeacherRequest request, StreamObserver<DeleteTeacherResponse> responseObserver) {
        Message message = TeacherHandler.delete(request.getUserId());
        DeleteTeacherResponse build = DeleteTeacherResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void readAll(ReadAllTeacherRequest request, StreamObserver<ReadAllTeacherResponse> responseObserver) {
        ReadAllTeacherResponse.Builder builder = ReadAllTeacherResponse.newBuilder();
        for (Teacher teacher : TeacherHandler.findAll()) {
            ReadTeacherResponse build = ReadTeacherResponse.newBuilder().setCode(MessageCode.SUCCESS).setUserId(teacher.getId().getId()).setName(teacher.getId().getName()).build();
            builder.addResponses(build);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
