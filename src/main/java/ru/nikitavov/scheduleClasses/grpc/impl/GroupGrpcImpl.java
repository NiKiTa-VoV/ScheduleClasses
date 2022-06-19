package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.Group;
import ru.nikitavov.scheduleClasses.dateBase.handler.GroupHandler;
import ru.nikitavov.scheduleClasses.dateBase.handler.SpecializationHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;

public class GroupGrpcImpl extends GroupGrpc.GroupImplBase {
    @Override
    public void create(CreateGroupRequest request, StreamObserver<CreateGroupResponse> responseObserver) {
        Message message = GroupHandler.create(request.getSpecializationId(), request.getDepartmentId(), request.getNumberCourse(), request.getNumberGroup());
        CreateGroupResponse.Builder builder = CreateGroupResponse.newBuilder().setCode(message.getCode()).setField(message.getMessage());
        if (message.entity() instanceof Group group) {
            builder.setId(group.getId());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadGroupRequest request, StreamObserver<ReadGroupResponse> responseObserver) {
        Message message = SpecializationHandler.read(request.getId());
        ReadGroupResponse.Builder builder = ReadGroupResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof Group group) {
            builder.setId(group.getId());
            builder.setSpecializationId(group.getSpecialization().getId());
            builder.setDepartmentId(group.getDepartment().getId());
            builder.setNumberCourse(group.getNumber());
            builder.setNumberGroup(group.getCourse());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(EditGroupRequest request, StreamObserver<EditGroupResponse> responseObserver) {
        Message message = GroupHandler.edit(request.getId(), request.getSpecializationId(), request.getDepartmentId(), request.getNumberCourse(), request.getNumberGroup());
        EditGroupResponse build = EditGroupResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteGroupRequest request, StreamObserver<DeleteGroupResponse> responseObserver) {
        Message message = GroupHandler.delete(request.getId());
        DeleteGroupResponse build = DeleteGroupResponse.newBuilder().setCode(message.getCode()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void readAll(ReadAllGroupRequest request, StreamObserver<ReadAllGroupResponse> responseObserver) {
        ReadAllGroupResponse.Builder builder = ReadAllGroupResponse.newBuilder();
        for (Group group : GroupHandler.findAll()) {
            ReadGroupResponse build = ReadGroupResponse.newBuilder()
                    .setCode(MessageCode.SUCCESS)
                    .setId(group.getId())
                    .setSpecializationId(group.getSpecialization().getId())
                    .setDepartmentId(group.getDepartment().getId())
                    .setNumberGroup(group.getNumber())
                    .setNumberCourse(group.getCourse())
                    .build();
            builder.addResponses(build);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
