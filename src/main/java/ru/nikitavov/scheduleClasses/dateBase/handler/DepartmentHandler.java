package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import ru.nikitavov.scheduleClasses.dateBase.entity.Department;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.util.List;

import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.equalsField;
import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.hasBeenChanged;

public class DepartmentHandler {
    public static Message create(String name) {
        if (name.isEmpty()) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("name").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        Department Department = new Department(name);
        session.persist(Department);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(Department).build();
    }

    public static Message read(long departmentId) {
        Department department = find(departmentId);
        if (department == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(department).build();
    }

    public static Message edit(long departmentId, String name) {
        Department department = find(departmentId);
        if (department == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        if (hasBeenChanged(name)) {
            if (name.isEmpty()) {
                return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("name").build();
            }
            if (!equalsField(department.getName(), name)) {
                Session session = SessionHelper.openSession();
                SessionHelper.startTransaction(session);
                department.setName(name);
                session.merge(department);
                SessionHelper.endTransaction(session);
                return Message.create().setCode(MessageCode.SUCCESS).setEntity(department).build();
            }
        }
        return Message.create().setCode(MessageCode.PASS).setEntity(department).build();
    }

    public static Message delete(long departmentId) {
        Department department = find(departmentId);
        if (department == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.remove(department);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(department).build();
    }

    public static Department find(long id) {
        return QueryHelper.find(Department.class, id);
    }

    public static List<Department> findAll() {
        return QueryHelper.findAll(Department.class);
    }
}
