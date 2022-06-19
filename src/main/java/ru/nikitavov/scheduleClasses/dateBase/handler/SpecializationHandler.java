package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import ru.nikitavov.scheduleClasses.dateBase.entity.Specialization;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.util.List;

import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.equalsField;
import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.hasBeenChanged;

public class SpecializationHandler {
    public static Message create(String name) {
        if (name.isEmpty()) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("name").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        Specialization specialization = new Specialization(name);
        session.persist(specialization);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(specialization).build();
    }

    public static Message read(long specializationId) {
        Specialization specialization = find(specializationId);
        if (specialization == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(specialization).build();
    }

    public static Message edit(long specializationId, String name) {
        Specialization specialization = find(specializationId);
        if (specialization == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        if (hasBeenChanged(name)) {
            if (name.isEmpty()) {
                return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("name").build();
            }
            if (!equalsField(specialization.getName(), name)) {
                Session session = SessionHelper.openSession();
                SessionHelper.startTransaction(session);
                specialization.setName(name);
                session.merge(specialization);
                SessionHelper.endTransaction(session);
                return Message.create().setCode(MessageCode.SUCCESS).setEntity(specialization).build();
            }
        }
        return Message.create().setCode(MessageCode.PASS).setEntity(specialization).build();
    }

    public static Message delete(long specializationId) {
        Specialization specialization = find(specializationId);
        if (specialization == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.remove(specialization);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(specialization).build();
    }

    public static Specialization find(long id) {
        return QueryHelper.find(Specialization.class, id);
    }

    public static List<Specialization> findAll() {
        return QueryHelper.findAll(Specialization.class);
    }
}
