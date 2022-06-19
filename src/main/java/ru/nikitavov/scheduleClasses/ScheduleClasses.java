package ru.nikitavov.scheduleClasses;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.nikitavov.scheduleClasses.dateBase.entity.Role;
import ru.nikitavov.scheduleClasses.dateBase.entity.User;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;

import java.time.Instant;

public class ScheduleClasses {


    public static void main(String[] args) {
        try {
            var s = SessionHelper.openSession();
            s.beginTransaction();
            var role = new Role();
            s.persist(role);
            s.persist(new User(
                    role,
                    "name 123",
                    "login 333",
                    "mail@smit101",
                    Instant.now()));
            s.getTransaction().commit();

            System.err.println(s.byId(User.class).load(1));

            s.close();
        } catch (Exception e) {
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(SessionHelper.getRegistry());
        }
    }
}
