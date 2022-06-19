package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.Specialization;
import ru.nikitavov.scheduleClasses.dateBase.handler.SpecializationHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;

public class SpecializationGrpcImpl extends SpecializationGrpc.SpecializationImplBase {
    @Override
    public void create(CreateSpecializationRequest request, StreamObserver<CreateSpecializationResponse> responseObserver) {
        Message message = SpecializationHandler.create(request.getName());
        CreateSpecializationResponse.Builder builder = CreateSpecializationResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof Specialization specialization) {
            builder.setId(specialization.getId());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadSpecializationRequest request, StreamObserver<ReadSpecializationResponse> responseObserver) {
        Message message = SpecializationHandler.read(request.getId());
        ReadSpecializationResponse.Builder builder = ReadSpecializationResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof Specialization specialization) {
            builder.setName(specialization.getName());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(EditSpecializationRequest request, StreamObserver<EditSpecializationResponse> responseObserver) {
        Message message = SpecializationHandler.edit(request.getId(), request.getName());
        EditSpecializationResponse build = EditSpecializationResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteSpecializationRequest request, StreamObserver<DeleteSpecializationResponse> responseObserver) {
        Message message = SpecializationHandler.delete(request.getId());
        DeleteSpecializationResponse build = DeleteSpecializationResponse.newBuilder().setCode(message.getCode()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void readAll(ReadAllSpecializationRequest request, StreamObserver<ReadAllSpecializationResponse> responseObserver) {
        ReadAllSpecializationResponse.Builder builder = ReadAllSpecializationResponse.newBuilder();
        for (Specialization specialization : SpecializationHandler.findAll()) {
            ReadSpecializationResponse build = ReadSpecializationResponse.newBuilder().setCode(MessageCode.SUCCESS).setId(specialization.getId()).setName(specialization.getName()).build();
            builder.addResponses(build);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
