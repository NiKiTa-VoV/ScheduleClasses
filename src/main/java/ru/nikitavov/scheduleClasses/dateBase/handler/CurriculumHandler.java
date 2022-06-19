package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.nikitavov.scheduleClasses.dateBase.entity.Curriculum;
import ru.nikitavov.scheduleClasses.dateBase.entity.Group;
import ru.nikitavov.scheduleClasses.dateBase.entity.Subject;
import ru.nikitavov.scheduleClasses.dateBase.entity.Teacher;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.util.List;

import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.*;

public class CurriculumHandler {
    public static Message create(long teacherId, long groupId, long subjectId, int numberStudyHours) {
        Subject subject = SubjectHandler.find(subjectId);
        if (subject == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("subjectId").build();
        }
        Group group = GroupHandler.find(groupId);
        if (group == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("groupId").build();
        }
        Teacher teacher = TeacherHandler.find(teacherId);
        if (teacher == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("teacherId").build();
        }
        if (negative(numberStudyHours)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("numberStudyHours").build();
        }
        try (Session session = SessionHelper.openSession()) {
            SessionHelper.startTransaction(session);
            List<Curriculum> list = session.createQuery("from Curriculum c where c.group = " + groupId + " and c.subject = " + subjectId, Curriculum.class).list();
            if (list.size() > 0) {
                for (Curriculum curriculum : list) {
                    if (curriculum.getTeacher().getId().getId() == teacherId) {
                        return Message.create().setCode(MessageCode.DUPLICATE).build();
                    }
                }
            }
            SessionHelper.endTransaction(session);
            Curriculum curriculum = new Curriculum(subject, group, teacher, numberStudyHours);
            SessionHelper.startTransaction(session);
            session.persist(curriculum);
            SessionHelper.endTransaction(session);
            return Message.create().setCode(MessageCode.SUCCESS).setEntity(curriculum).build();
        } catch (Exception e) {
            return Message.create().setCode(MessageCode.DUPLICATE).build();
        }
    }

    public static Message read(long id) {
        Curriculum curriculum = find(id);
        if (curriculum == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(curriculum).build();
    }

    public static Message edit(long id, long teacherId, long groupId, long subjectId, int numberStudyHours) {
        Curriculum curriculum = find(id);
        if (curriculum == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        Teacher teacher;
        if (validId(teacherId)) {
            teacher = TeacherHandler.find(teacherId);
            if (teacher == null) {
                return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("teacherId").build();
            }
        } else return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("teacherId").build();
        Group group;
        if (validId(groupId)) {
            group = GroupHandler.find(groupId);
            if (group == null) {
                return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("groupId").build();
            }
        } else return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("groupId").build();

        Subject subject;
        if (validId(subjectId)) {
            subject = SubjectHandler.find(subjectId);
            if (subject == null) {
                return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("subjectId").build();
            }
        } else return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("subjectId").build();
        if (negative(numberStudyHours)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("numberStudyHours").build();
        }
        boolean flag = false;
        if (!equalsField(curriculum.getTeacher().getId().getId(), teacherId)) {
            curriculum.setTeacher(teacher);
            flag = true;
        }
        if (!equalsField(curriculum.getGroup().getId(), groupId)) {
            curriculum.setGroup(group);
            flag = true;
        }
        if (!equalsField(curriculum.getSubject().getId(), subjectId)) {
            curriculum.setSubject(subject);
            flag = true;
        }
        if (!equalsField(curriculum.getNumberStudyHours(), numberStudyHours)) {
            curriculum.setNumberStudyHours(numberStudyHours);
            flag = true;
        }
        if (flag) {
            try (Session session = SessionHelper.openSession()) {
                SessionHelper.startTransaction(session);
                session.persist(curriculum);
                SessionHelper.endTransaction(session);
            } catch (Exception e) {
                return Message.create().setCode(MessageCode.DUPLICATE).build();
            }
            return Message.create().setCode(MessageCode.SUCCESS).setEntity(curriculum).build();
        }
        return Message.create().setCode(MessageCode.PASS).setEntity(curriculum).build();
    }

    public static Message delete(long id) {
        Curriculum curriculum = find(id);
        if (curriculum == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("id").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.remove(curriculum);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(curriculum).build();
    }

    public static Curriculum find(long id) {
        return QueryHelper.find(Curriculum.class, id);
    }

    public static List<Curriculum> findAll() {
        return QueryHelper.findAll(Curriculum.class);
    }

    public static List<Curriculum> findByTeacher(Teacher teacher) {
        Session session = SessionHelper.openSession();
        Query<Curriculum> query = session.createQuery("select entity from  Curriculum entity where entity.teacher.id.id = " + teacher.getId().getId(), Curriculum.class);
        var list = query.list();
        session.close();
        return list;
    }
}
