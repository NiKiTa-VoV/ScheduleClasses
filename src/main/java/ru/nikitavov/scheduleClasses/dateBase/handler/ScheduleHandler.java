package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.nikitavov.scheduleClasses.dateBase.entity.*;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.CreateLessonRequest;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ScheduleHandler {

    public static Message create(long teacherId, String dateText, List<CreateLessonRequest> lessonsList) {
        Teacher teacher = TeacherHandler.find(teacherId);
        if (teacher == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("teacherId").build();
        }
        Instant date;
        try {
            long time = Long.parseLong(dateText);
            date = Instant.ofEpochMilli(time);
        } catch (Exception e) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("date").build();
        }

        Schedule schedule;

        try (Session session = SessionHelper.openSession()) {
            Query<Schedule> query = session.createQuery("select s from Schedule s where s.date = " + QueryHelper.textParam(date.toString()) + " and s.teacher.id.id = " + teacher.getId().getId(), Schedule.class);
            List<Schedule> list = query.list();

            if (list.size() != 0) {
                return Message.create().setCode(MessageCode.PASS).setEntity(list.get(0)).build();
            }

            SessionHelper.startTransaction(session);

            schedule = new Schedule(date, teacher);

            ArrayList<Lesson> lessons = new ArrayList<>();

            for (CreateLessonRequest lessonRequest : lessonsList) {
                if (lessonRequest.getEmpty()) continue;
                Group group = GroupHandler.find(lessonRequest.getGroupId());
                if (group == null) {
                    return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("lesson: " + lessonRequest.getLessonNumber() + " groupId").build();
                }
                Subject subject = SubjectHandler.find(lessonRequest.getSubjectId());
                if (subject == null) {
                    return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("lesson: " + lessonRequest.getLessonNumber() + " SubjectId").build();
                }
                ClassRoom classRoom = ClassRoomHandler.find(lessonRequest.getRoomId());
                if (classRoom == null) {
                    return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("lesson: " + lessonRequest.getLessonNumber() + " RoomId").build();
                }
                Lesson lesson = new Lesson(schedule, lessonRequest.getLessonNumber(), teacher, group, subject, classRoom, lessonRequest.getUnderRecord());
                lessons.add(lesson);
            }

            session.persist(schedule);

            for (Lesson lesson : lessons) {
                session.persist(lesson);
            }
            SessionHelper.endTransaction(session);
        }

        return Message.create().setCode(MessageCode.SUCCESS).setEntity(schedule).build();
    }

    public static Schedule find(long id) {
        return QueryHelper.find(Schedule.class, id);
    }

    public static List<Schedule> findAll() {
        return QueryHelper.findAll(Schedule.class);
    }
}
