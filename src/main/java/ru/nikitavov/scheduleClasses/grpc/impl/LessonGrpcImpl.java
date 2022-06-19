package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.Curriculum;
import ru.nikitavov.scheduleClasses.dateBase.handler.LessonHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;

import java.util.List;

public class LessonGrpcImpl extends LessonGrpc.LessonImplBase {

    @Override
    public void read(ReadLessonRequest request, StreamObserver<ReadLessonResponse> responseObserver) {
        super.read(request, responseObserver);
    }

    @Override
    public void readAll(ReadAllLessonsRequest request, StreamObserver<ReadAllLessonsResponse> responseObserver) {
        super.readAll(request, responseObserver);
    }

    @Override
    public void readAvailableLessonsTeacher(ReadAvailableLessonsRequest request, StreamObserver<ReadAvailableLessonsResponse> responseObserver) {
        Message message = LessonHandler.collectingAvailableLessons(request.getTeacherId());
        ReadAvailableLessonsResponse.Builder builder = ReadAvailableLessonsResponse.newBuilder().setTeacherId(request.getTeacherId()).setCode(message.getCode());
        if (message.getEntity() instanceof List) {
            List<Curriculum> list = (List<Curriculum>) message.getEntity();
            for (Curriculum curriculum : list) {
                ReadAvailableLessonResponse.Builder builderLesson = ReadAvailableLessonResponse.newBuilder();
                builderLesson
                        .setGroupId(curriculum.getGroup().getId())
                        .setSubjectId(curriculum.getSubject().getId())
                        .setTeacherId(curriculum.getTeacher().getId().getId());
                builder.addResponses(builderLesson.build());
            }
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void readDefaultLessonsTeacher(ReadDefaultLessonsTeacherRequest request, StreamObserver<ReadDefaultLessonsTeacherResponse> responseObserver) {
        super.readDefaultLessonsTeacher(request, responseObserver);
    }
}
