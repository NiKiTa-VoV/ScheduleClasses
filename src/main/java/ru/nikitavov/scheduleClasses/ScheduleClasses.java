package ru.nikitavov.scheduleClasses;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.nikitavov.scheduleClasses.dateBase.entity.Role;
import ru.nikitavov.scheduleClasses.dateBase.entity.User;

import java.time.Instant;
import java.util.Date;

public class ScheduleClasses {
    public static void main(String[] args) {
        final var registry = new StandardServiceRegistryBuilder()
            .configure() // configures settings from hibernate.cfg.xml
            .build();
        try {
            try (final var sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory()) {
                var s = sessionFactory.openSession();
                s.beginTransaction();
                var role = new Role();
                s.persist(role);
                s.persist(new User(
                    role,
                    "name 123",
                    "login 333",
                    "mail@smit101",
                    Date.from(Instant.ofEpochMilli(99412341))
                ));
                s.getTransaction().commit();

                System.err.println(s.byId(User.class).load(1));

                s.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }
}
