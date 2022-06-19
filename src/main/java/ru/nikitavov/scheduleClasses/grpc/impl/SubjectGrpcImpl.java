package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.Subject;
import ru.nikitavov.scheduleClasses.dateBase.handler.SubjectHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;

public class SubjectGrpcImpl extends SubjectGrpc.SubjectImplBase {

    @Override
    public void create(CreateSubjectRequest request, StreamObserver<CreateSubjectResponse> responseObserver) {
        Message message = SubjectHandler.create(request.getName());
        CreateSubjectResponse.Builder builder = CreateSubjectResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof Subject subject) {
            builder.setId(subject.getId());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadSubjectRequest request, StreamObserver<ReadSubjectResponse> responseObserver) {
        Message message = SubjectHandler.read(request.getId());
        ReadSubjectResponse.Builder builder = ReadSubjectResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof Subject subject) {
            builder.setName(subject.getName());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(EditSubjectRequest request, StreamObserver<EditSubjectResponse> responseObserver) {
        Message message = SubjectHandler.edit(request.getId(), request.getName());
        EditSubjectResponse build = EditSubjectResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteSubjectRequest request, StreamObserver<DeleteSubjectResponse> responseObserver) {
        Message message = SubjectHandler.delete(request.getId());
        DeleteSubjectResponse build = DeleteSubjectResponse.newBuilder().setCode(message.getCode()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void readAll(ReadAllSubjectRequest request, StreamObserver<ReadAllSubjectResponse> responseObserver) {
        ReadAllSubjectResponse.Builder builder = ReadAllSubjectResponse.newBuilder();
        for (Subject subject : SubjectHandler.findAll()) {
            ReadSubjectResponse build = ReadSubjectResponse.newBuilder().setCode(MessageCode.SUCCESS).setId(subject.getId()).setName(subject.getName()).build();
            builder.addResponses(build);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
