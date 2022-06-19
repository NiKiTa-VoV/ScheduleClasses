package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.Department;
import ru.nikitavov.scheduleClasses.dateBase.handler.DepartmentHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;

public class DepartmentGrpcImpl extends DepartmentGrpc.DepartmentImplBase {
    @Override
    public void create(CreateDepartmentRequest request, StreamObserver<CreateDepartmentResponse> responseObserver) {
        Message message = DepartmentHandler.create(request.getName());
        CreateDepartmentResponse.Builder builder = CreateDepartmentResponse.newBuilder()
                .setCode(message.getCode());
        if (message.entity() instanceof Department department) {
            builder.setId(department.getId());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadDepartmentRequest request, StreamObserver<ReadDepartmentResponse> responseObserver) {
        Message message = DepartmentHandler.read(request.getId());
        ReadDepartmentResponse.Builder builder = ReadDepartmentResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof Department Department) {
            builder.setName(Department.getName());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(EditDepartmentRequest request, StreamObserver<EditDepartmentResponse> responseObserver) {
        Message message = DepartmentHandler.edit(request.getId(), request.getName());
        EditDepartmentResponse build = EditDepartmentResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteDepartmentRequest request, StreamObserver<DeleteDepartmentResponse> responseObserver) {
        Message message = DepartmentHandler.delete(request.getId());
        DeleteDepartmentResponse build = DeleteDepartmentResponse.newBuilder().setCode(message.getCode()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void readAll(ReadAllDepartmentRequest request, StreamObserver<ReadAllDepartmentResponse> responseObserver) {
        ReadAllDepartmentResponse.Builder builder = ReadAllDepartmentResponse.newBuilder();
        for (Department department : DepartmentHandler.findAll()) {
            ReadDepartmentResponse build = ReadDepartmentResponse.newBuilder().setCode(MessageCode.SUCCESS).setId(department.getId()).setName(department.getName()).build();
            builder.addResponses(build);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
