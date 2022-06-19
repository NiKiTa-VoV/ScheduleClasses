package ru.nikitavov.scheduleClasses.dateBase.handler;

import ru.nikitavov.scheduleClasses.dateBase.entity.Curriculum;
import ru.nikitavov.scheduleClasses.dateBase.entity.Lesson;
import ru.nikitavov.scheduleClasses.dateBase.entity.Teacher;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.util.List;

public class LessonHandler {

    public static Message collectingAvailableLessons(long teacherId) {
        Teacher teacher = TeacherHandler.find(teacherId);
        if (teacher == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("teacherId").build();
        }
        List<Curriculum> availableCurriculum = CurriculumHandler.findByTeacher(teacher);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(availableCurriculum).build();
    }

    public static Lesson find(long id) {
        return QueryHelper.find(Lesson.class, id);
    }

    public static List<Lesson> findAll() {
        return QueryHelper.findAll(Lesson.class);
    }
}
