package ru.nikitavov.scheduleClasses;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ru.nikitavov.scheduleClasses.dateBase.entity.User;
import ru.nikitavov.scheduleClasses.util.HibernateUtil;

public class ScheduleClasses {
    public static void main(String[] args) {
        var s = HibernateUtil.getSessionFactory().openSession();
        s.persist(new User());
    }
}
