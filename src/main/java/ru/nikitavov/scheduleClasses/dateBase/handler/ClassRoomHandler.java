package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import ru.nikitavov.scheduleClasses.dateBase.entity.ClassRoom;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.util.List;

import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.equalsField;
import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.hasBeenChanged;

public class ClassRoomHandler {
    public static Message create(String number) {
        if (number.isEmpty()) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("number").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        ClassRoom classRoom = new ClassRoom(number);
        session.persist(classRoom);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(classRoom).build();
    }

    public static Message read(long id) {
        ClassRoom classRoom = find(id);
        if (classRoom == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(classRoom).build();
    }

    public static Message edit(long id, String number) {
        ClassRoom classRoom = find(id);
        if (classRoom == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        if (hasBeenChanged(number)) {
            if (number.isEmpty()) {
                return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("number").build();
            }
            if (!equalsField(classRoom.getNumber(), number)) {
                Session session = SessionHelper.openSession();
                SessionHelper.startTransaction(session);
                classRoom.setNumber(number);
                session.merge(classRoom);
                SessionHelper.endTransaction(session);
                return Message.create().setCode(MessageCode.SUCCESS).setEntity(classRoom).build();
            }
        }
        return Message.create().setCode(MessageCode.PASS).setEntity(classRoom).build();
    }

    public static Message delete(long id) {
        ClassRoom classRoom = find(id);
        if (classRoom == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.remove(classRoom);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(classRoom).build();
    }

    public static ClassRoom find(long id) {
        return QueryHelper.find(ClassRoom.class, id);
    }

    public static List<ClassRoom> findAll() {
        return QueryHelper.findAll(ClassRoom.class);
    }
}
