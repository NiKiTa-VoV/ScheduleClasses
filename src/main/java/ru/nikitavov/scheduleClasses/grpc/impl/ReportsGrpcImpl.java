package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.grpc.ReportGrpc;
import ru.nikitavov.scheduleClasses.grpc.TeacherInfo;
import ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadRequest;
import ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse;
import ru.nikitavov.scheduleClasses.grpc.handler.ReportHandler;

import java.util.ArrayList;

public class ReportsGrpcImpl extends ReportGrpc.ReportImplBase {
    @Override
    public void teacherWorkload(TeacherWorkloadRequest request, StreamObserver<TeacherWorkloadResponse> responseObserver) {
        ArrayList<TeacherInfo> teacherInfos = ReportHandler.teacherWorkload();
        TeacherWorkloadResponse.Builder builder = TeacherWorkloadResponse.newBuilder();
        builder.addAllTeachers(teacherInfos);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
