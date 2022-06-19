package ru.nikitavov.scheduleClasses.grpc.handler;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.nikitavov.scheduleClasses.dateBase.entity.Teacher;
import ru.nikitavov.scheduleClasses.dateBase.handler.TeacherHandler;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.TeacherInfo;

import java.util.ArrayList;
import java.util.List;

public class ReportHandler {
    public static ArrayList<TeacherInfo> teacherWorkload() {
        ArrayList<TeacherInfo> teacherInfos = new ArrayList<>();
        for (Teacher teacher : TeacherHandler.findAll()) {
            TeacherInfo.Builder builder = TeacherInfo.newBuilder();
            builder.setNameAbbreviation(TeacherHandler.convertToAbbreviation(teacher));
            Session session = SessionHelper.openSession();
            Query<Long> query = session.createQuery("select sum(c.numberStudyHours) from Curriculum c where c.teacher.id.id = " + teacher.getId().getId(), Long.class);
            List<Long> list = query.list();
            Long value = list.get(0);
            builder.setNumberHours(value == null ? 0 : value.intValue());
            teacherInfos.add(builder.build());
        }
        return teacherInfos;
    }
}
