package ru.nikitavov.scheduleClasses.grpc.impl;

import io.grpc.stub.StreamObserver;
import ru.nikitavov.scheduleClasses.dateBase.entity.Schedule;
import ru.nikitavov.scheduleClasses.dateBase.entity.Teacher;
import ru.nikitavov.scheduleClasses.dateBase.handler.ScheduleHandler;
import ru.nikitavov.scheduleClasses.dateBase.handler.TeacherHandler;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.grpc.*;
import ru.nikitavov.scheduleClasses.schedule.AvailableLesson;
import ru.nikitavov.scheduleClasses.schedule.DefaultScheduleHandler;
import ru.nikitavov.scheduleClasses.util.DateUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class ScheduleGrpcHandler extends ScheduleGrpc.ScheduleImplBase {
    @Override
    public void create(CreateScheduleRequest request, StreamObserver<CreateScheduleResponse> responseObserver) {
        Message message = ScheduleHandler.create(request.getTeacherId(), request.getDate(), request.getLessonsList());
        CreateScheduleResponse.Builder builder = CreateScheduleResponse.newBuilder().setCode(message.getCode()).setField(message.getMessage());
        if (message.getEntity() instanceof Schedule schedule) {
            builder.setId(schedule.getId());
        }

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadScheduleRequest request, StreamObserver<ReadScheduleResponse> responseObserver) {
        super.read(request, responseObserver);
    }

    @Override
    public void edit(EditScheduleRequest request, StreamObserver<EditScheduleResponse> responseObserver) {
        super.edit(request, responseObserver);
    }

    @Override
    public void delete(DeleteScheduleRequest request, StreamObserver<DeleteScheduleResponse> responseObserver) {
        super.delete(request, responseObserver);
    }

    @Override
    public void readAll(ReadAllScheduleRequest request, StreamObserver<ReadAllScheduleResponse> responseObserver) {
        super.readAll(request, responseObserver);
    }

    @Override
    public void readDefault(ReadDefaultRequest request, StreamObserver<ReadDefaultResponse> responseObserver) {
        super.readDefault(request, responseObserver);
    }

    @Override
    public void readDefaults(ReadDefaultsRequest request, StreamObserver<ReadDefaultsResponse> responseObserver) {
        Calendar calendar = DateUtil.parseDateToCalendar(request.getDate());
        LocalDate localDate = DateUtil.calendarDateToLocalDate(calendar);
        ReadDefaultsResponse.Builder builder = ReadDefaultsResponse.newBuilder();
        for (Teacher teacher : TeacherHandler.findAll()) {
            ReadDefaultResponse.Builder builderDefault = ReadDefaultResponse.newBuilder();
            builderDefault.setCode(MessageCode.PASS);
            builderDefault.setTeacherId(teacher.getId().getId());
            ReadDefaultLessonsTeacherResponse.Builder builderLessons = ReadDefaultLessonsTeacherResponse.newBuilder();
            builderLessons.setTeacherId(teacher.getId().getId());
            ArrayList<AvailableLesson> defaultLessons = DefaultScheduleHandler.getDefaultLessons(calendar, localDate, teacher.getId().getId());
            if (defaultLessons != null) {
                for (AvailableLesson defaultLesson : defaultLessons) {
                    builderLessons.addResponses(
                            ReadAvailableLessonResponse
                                    .newBuilder()
                                    .setTeacherId(teacher.getId().getId())
                                    .setSubjectId(defaultLesson.getIdSubject())
                                    .setGroupId(defaultLesson.getIdGroup())
                                    .setRoomId(defaultLesson.getIdRoom())
                                    .setLessonNumber(defaultLesson.getNumber()).build()
                    );
                }
            }
            builderDefault.setLessons(builderLessons.build());
            builder.addSchedules(builderDefault.build());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
