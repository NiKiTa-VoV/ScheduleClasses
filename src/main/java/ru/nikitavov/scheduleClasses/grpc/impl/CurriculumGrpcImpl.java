package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.Curriculum;
import ru.nikitavov.scheduleClasses.dateBase.handler.CurriculumHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;

public class CurriculumGrpcImpl extends CurriculumGrpc.CurriculumImplBase {

    @Override
    public void create(CreateCurriculumRequest request, StreamObserver<CreateCurriculumResponse> responseObserver) {
        Message message = CurriculumHandler.create(request.getTeacherId(), request.getGroupId(), request.getSubjectId(), request.getNumberStudyHours());
        CreateCurriculumResponse.Builder builder = CreateCurriculumResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage());
        if (message.entity() instanceof Curriculum curriculum) {
            builder.setId(curriculum.getId());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadCurriculumRequest request, StreamObserver<ReadCurriculumResponse> responseObserver) {
        Message message = CurriculumHandler.read(request.getId());
        ReadCurriculumResponse.Builder builder = ReadCurriculumResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof Curriculum curriculum) {
            builder.setId(curriculum.getId());
            builder.setTeacherId(curriculum.getTeacher().getId().getId());
            builder.setGroupId(curriculum.getGroup().getId());
            builder.setSubjectId(curriculum.getSubject().getId());
            builder.setNumberStudyHours(curriculum.getNumberStudyHours());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(EditCurriculumRequest request, StreamObserver<EditCurriculumResponse> responseObserver) {
        Message message = CurriculumHandler.edit(request.getId(), request.getTeacherId(), request.getGroupId(), request.getSubjectId(), request.getNumberStudyHours());
        EditCurriculumResponse build = EditCurriculumResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteCurriculumRequest request, StreamObserver<DeleteCurriculumResponse> responseObserver) {
        Message message = CurriculumHandler.delete(request.getId());
        DeleteCurriculumResponse build = DeleteCurriculumResponse.newBuilder().setCode(message.getCode()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void readAll(ReadAllCurriculumRequest request, StreamObserver<ReadAllCurriculumResponse> responseObserver) {
        ReadAllCurriculumResponse.Builder builder = ReadAllCurriculumResponse.newBuilder();
        for (Curriculum curriculum : CurriculumHandler.findAll()) {
            ReadCurriculumResponse build = ReadCurriculumResponse.newBuilder()
                    .setCode(MessageCode.SUCCESS)
                    .setId(curriculum.getId())
                    .setTeacherId(curriculum.getTeacher().getId().getId())
                    .setGroupId(curriculum.getGroup().getId())
                    .setSubjectId(curriculum.getSubject().getId())
                    .setNumberStudyHours(curriculum.getNumberStudyHours())
                    .build();
            builder.addResponses(build);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
