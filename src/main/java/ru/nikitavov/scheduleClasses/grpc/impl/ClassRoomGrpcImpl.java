package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.ClassRoom;
import ru.nikitavov.scheduleClasses.dateBase.handler.ClassRoomHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;

public class ClassRoomGrpcImpl extends ClassRoomGrpc.ClassRoomImplBase {
    @Override
    public void create(CreateClassRoomRequest request, StreamObserver<CreateClassRoomResponse> responseObserver) {
        Message message = ClassRoomHandler.create(request.getNumber());
        CreateClassRoomResponse.Builder builder = CreateClassRoomResponse.newBuilder()
                .setCode(message.getCode());
        if (message.entity() instanceof ClassRoom classRoom) {
            builder.setId(classRoom.getId());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadClassRoomRequest request, StreamObserver<ReadClassRoomResponse> responseObserver) {
        Message message = ClassRoomHandler.read(request.getId());
        ReadClassRoomResponse.Builder builder = ReadClassRoomResponse.newBuilder().setCode(message.getCode());
        if (message.getEntity() instanceof ClassRoom classRoom) {
            builder.setNumber(classRoom.getNumber());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(EditClassRoomRequest request, StreamObserver<EditClassRoomResponse> responseObserver) {
        Message message = ClassRoomHandler.edit(request.getId(), request.getNumber());
        EditClassRoomResponse build = EditClassRoomResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteClassRoomRequest request, StreamObserver<DeleteClassRoomResponse> responseObserver) {
        Message message = ClassRoomHandler.delete(request.getId());
        DeleteClassRoomResponse build = DeleteClassRoomResponse.newBuilder().setCode(message.getCode()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void readAll(ReadAllClassRoomRequest request, StreamObserver<ReadAllClassRoomResponse> responseObserver) {
        ReadAllClassRoomResponse.Builder builder = ReadAllClassRoomResponse.newBuilder();
        for (ClassRoom classRoom : ClassRoomHandler.findAll()) {
            ReadClassRoomResponse build = ReadClassRoomResponse.newBuilder().setCode(MessageCode.SUCCESS).setId(classRoom.getId()).setNumber(classRoom.getNumber()).build();
            builder.addResponses(build);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
