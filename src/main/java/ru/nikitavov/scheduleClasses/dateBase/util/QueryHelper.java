package ru.nikitavov.scheduleClasses.dateBase.util;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class QueryHelper {

    @SuppressWarnings("all")
    public static <T> T find(Class<T> clazz, Object id) {
        Session session = SessionHelper.openSession();
        T entity = session.get(clazz, id);
        session.close();
        return entity;
    }

    public static <T> List<T> findAll(Class<T> clazz) {
        Session session = SessionHelper.openSession();
        var split = clazz.getName().split("\\.");

        Query<T> query = session.createQuery("select entity from " + split[split.length - 1] + " entity", clazz);
        var list = query.list();
        session.close();
        return list;
    }

    public static String textParam(String text) {
        return "\"" + text + "\"";
    }
}
