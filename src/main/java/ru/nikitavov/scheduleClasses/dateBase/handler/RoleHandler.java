package ru.nikitavov.scheduleClasses.dateBase.handler;

import ru.nikitavov.scheduleClasses.dateBase.entity.Role;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;

import java.util.List;

public class RoleHandler {

    public static Role find(long id) {
        return QueryHelper.find(Role.class, id);
    }

    public static List<Role> findAll() {
        return QueryHelper.findAll(Role.class);
    }
}
