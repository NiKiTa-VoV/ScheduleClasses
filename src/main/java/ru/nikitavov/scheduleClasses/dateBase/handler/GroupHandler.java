package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import ru.nikitavov.scheduleClasses.dateBase.entity.Department;
import ru.nikitavov.scheduleClasses.dateBase.entity.Group;
import ru.nikitavov.scheduleClasses.dateBase.entity.Specialization;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.util.List;

import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.*;

public class GroupHandler {
    public static Message create(long specializationId, long departmentId, int numberCourse, int numberGroup) {
        Specialization specialization = SpecializationHandler.find(specializationId);
        if (specialization == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("specializationId").build();
        }
        Department department = DepartmentHandler.find(departmentId);
        if (department == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("departmentId").build();
        }
        if (negative(numberCourse)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("numberCourse").build();
        }
        if (negative(numberGroup)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("numberGroup").build();
        }
        Session session = SessionHelper.openSession();
        Group group = new Group(department, specialization, numberCourse, numberGroup);
        SessionHelper.startTransaction(session);
        session.persist(group);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(group).build();
    }


    public static Message read(long id) {
        Group group = find(id);
        if (group == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(group).build();
    }

    public static Message edit(long id, long specializationId, long departmentId, int numberCourse, int numberGroup) {
        Group group = find(id);
        if (group == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        Specialization specialization;
        if (validId(specializationId)) {
            specialization = SpecializationHandler.find(specializationId);
            if (specialization == null) {
                return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("specializationId").build();
            }
        } else return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("specializationId").build();
        Department department;
        if (validId(departmentId)) {
            department = DepartmentHandler.find(departmentId);
            if (department == null) {
                return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("departmentId").build();
            }
        } else return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("departmentId").build();
        if (negative(numberCourse)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("numberCourse").build();
        }
        if (negative(numberGroup)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("numberGroup").build();
        }
        boolean flag = false;
        if (!equalsField(group.getSpecialization().getId(), specializationId)) {
            group.setSpecialization(specialization);
            flag = true;
        }
        if (!equalsField(group.getDepartment().getId(), departmentId)) {
            group.setDepartment(department);
            flag = true;
        }
        if (!equalsField(group.getCourse(), numberCourse)) {
            group.setCourse(numberCourse);
            flag = true;
        }
        if (!equalsField(group.getNumber(), numberGroup)) {
            group.setNumber(numberGroup);
            flag = true;
        }
        if (flag) {
            Session session = SessionHelper.openSession();
            SessionHelper.startTransaction(session);
            session.merge(group);
            SessionHelper.endTransaction(session);
            return Message.create().setCode(MessageCode.SUCCESS).setEntity(group).build();
        }
        return Message.create().setCode(MessageCode.PASS).setEntity(group).build();
    }

    public static Message delete(long id) {
        Group group = find(id);
        if (group == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.remove(group);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(group).build();
    }

    public static Group find(long id) {
        return QueryHelper.find(Group.class, id);
    }

    public static List<Group> findAll() {
        return QueryHelper.findAll(Group.class);
    }
}
