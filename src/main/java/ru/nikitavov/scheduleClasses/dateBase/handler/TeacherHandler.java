package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import ru.nikitavov.scheduleClasses.dateBase.entity.Teacher;
import ru.nikitavov.scheduleClasses.dateBase.entity.User;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.util.List;

public class TeacherHandler {

    public static Message create(long userId) {
        User user = UserHandler.find(userId);
        if (user == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("userId").build();
        }
        Teacher teacher = new Teacher(user);
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.persist(teacher);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(teacher).build();
    }

    public static Message read(long userId) {
        Teacher teacher = find(userId);
        if (teacher == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND)
                    .setMessage("userId")
                    .build();
        }
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(teacher).build();
    }

    public static Message delete(long userId) {
        Teacher teacher = find(userId);
        if (teacher == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("userId").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.remove(teacher);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(teacher).build();
    }

    public static Teacher find(long id) {
        return QueryHelper.find(Teacher.class, id);
    }

    public static List<Teacher> findAll() {
        return QueryHelper.findAll(Teacher.class);
    }

    public static String convertToAbbreviation(Teacher teacher) {
        String[] s = teacher.getId().getName().split(" ");
        if (s.length == 3) {
            return s[0] + "." + s[1].charAt(0) + "." + s[2].charAt(0);
        }
        return teacher.getId().getName();
    }
}
