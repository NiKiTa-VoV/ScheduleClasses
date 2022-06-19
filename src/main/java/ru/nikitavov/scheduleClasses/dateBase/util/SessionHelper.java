package ru.nikitavov.scheduleClasses.dateBase.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionHelper {

    private static final StandardServiceRegistry registry;
    private static final SessionFactory sessionFactory;

    static {
        registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    public static Session openSession() {
        return sessionFactory.openSession();
    }

    public static Transaction startTransaction(Session session) {
        return session.beginTransaction();
    }

    public static void endTransaction(Session session) {
        session.getTransaction().commit();
    }

    public static StandardServiceRegistry getRegistry() {
        return registry;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
