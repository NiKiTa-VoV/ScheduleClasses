package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import ru.nikitavov.scheduleClasses.dateBase.entity.Subject;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.util.List;

import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.equalsField;
import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.hasBeenChanged;

public class SubjectHandler {
    public static Message create(String name) {
        if (name.isEmpty()) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("name").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        Subject subject = new Subject(name);
        session.persist(subject);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(subject).build();
    }

    public static Message read(long specializationId) {
        Subject subject = find(specializationId);
        if (subject == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(subject).build();
    }

    public static Message edit(long subjectId, String name) {
        Subject subject = find(subjectId);
        if (subject == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        if (hasBeenChanged(name)) {
            if (name.isEmpty()) {
                return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("name").build();
            }
            if (!equalsField(subject.getName(), name)) {
                Session session = SessionHelper.openSession();
                SessionHelper.startTransaction(session);
                subject.setName(name);
                session.merge(subject);
                SessionHelper.endTransaction(session);
                return Message.create().setCode(MessageCode.SUCCESS).setEntity(subject).build();
            }
        }
        return Message.create().setCode(MessageCode.PASS).setEntity(subject).build();
    }

    public static Message delete(long subjectId) {
        Subject subject = find(subjectId);
        if (subject == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.remove(subject);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(subject).build();
    }

    public static Subject find(long id) {
        return QueryHelper.find(Subject.class, id);
    }

    public static List<Subject> findAll() {
        return QueryHelper.findAll(Subject.class);
    }
}
