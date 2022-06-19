package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.User;
import ru.nikitavov.scheduleClasses.dateBase.handler.UserHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;
import ru.nikitavov.scheduleClasses.grpc.UserGrpc.UserImplBase;

public class UserGrpcImpl extends UserImplBase {
    @Override
    public void create(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
        Message message = UserHandler.create(request.getRoleId(), request.getName(), request.getPassword(), request.getLogin(), request.getMail());
        CreateUserResponse build = CreateUserResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadUserRequest request, StreamObserver<ReadUserResponse> responseObserver) {
        Message message = UserHandler.read(request.getUserId());
        ReadUserResponse.Builder builder = ReadUserResponse.newBuilder()
                .setCode(message.getCode());
        if (message.getEntity() instanceof User user) {
            builder.setUserId(user.getId())
                    .setRoleId(user.getRole().getId())
                    .setName(user.getName())
                    .setLogin(user.getLogin())
                    .setMail(user.getMail());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void edit(EditUserRequest request, StreamObserver<EditUserResponse> responseObserver) {
        Message message = UserHandler.edit(request.getUserId(), request.getRoleId(), request.getName(), request.getPassword(), request.getLogin(), request.getMail());
        EditUserResponse build = EditUserResponse.newBuilder()
                .setCode(message.getCode())
                .setField(message.getMessage())
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteUserRequest request, StreamObserver<DeleteUserResponse> responseObserver) {
        Message message = UserHandler.delete(request.getUserId());
        DeleteUserResponse build = DeleteUserResponse.newBuilder()
                .setCode(message.getCode()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void authorization(AuthorizationUserRequest request, StreamObserver<AuthorizationUserResponse> responseObserver) {
        Message authorization = UserHandler.authorization(request.getLogin(), request.getPassword());
        AuthorizationUserResponse.Builder builder = AuthorizationUserResponse.newBuilder().setCode(authorization.getCode()).setMessage(authorization.message());
        boolean b = authorization.getEntity() == Boolean.TRUE;
        builder.setIsLogin(b);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
