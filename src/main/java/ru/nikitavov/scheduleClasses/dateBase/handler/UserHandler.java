package ru.nikitavov.scheduleClasses.dateBase.handler;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.nikitavov.scheduleClasses.dateBase.entity.*;
import ru.nikitavov.scheduleClasses.dateBase.message.Message;
import ru.nikitavov.scheduleClasses.dateBase.util.QueryHelper;
import ru.nikitavov.scheduleClasses.dateBase.util.SessionHelper;
import ru.nikitavov.scheduleClasses.grpc.MessageCode;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import static ru.nikitavov.scheduleClasses.dateBase.util.DataInputHelper.*;

public class UserHandler {

    public static Message create(long roleId, String name, String password, String login, String mail) {
        Role role = RoleHandler.find(roleId);
        if (role == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("roleId").build();
        }
        if (!checkValidLogin(login)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("login").build();
        }
        if (checkDuplicateLogin(login)) {
            return Message.create().setCode(MessageCode.DUPLICATE).setMessage("login").build();
        }
        if (!checkValidPassword(password)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("password").build();
        }
        if (!checkValidMail(mail)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("mail").build();
        }
        if (checkDuplicateMail(mail)) {
            return Message.create().setCode(MessageCode.DUPLICATE).setMessage("mail").build();
        }
        Session session = SessionHelper.openSession();
        User user = new User(session.get(Role.class, roleId), name, login, mail, Instant.now());
        Authentication authentication = new Authentication(user, AuthenticationType.PASSWORD, password.getBytes(StandardCharsets.UTF_8));
        SessionHelper.startTransaction(session);
        session.persist(user);
        session.persist(authentication);
        SessionHelper.endTransaction(session);
        session.close();
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(user).build();
    }

    public static Message read(long userId) {
        User user = find(userId);
        if (user == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("userId").build();
        }
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(user).build();
    }

    public static Message edit(long userId, long roleId, String name, String password, String login, String mail) {
        User user = find(userId);
        if (user == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("userId").build();
        }
        Role role = RoleHandler.find(roleId);
        if (role == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("roleId").build();
        }
        if (!checkValidLogin(login)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("login").build();
        }
        if (!equalsField(user.getLogin(), login) && checkDuplicateLogin(login)) {
            return Message.create().setCode(MessageCode.DUPLICATE).setMessage("login").build();
        }
        if (!validId(roleId) && !checkValidPassword(password)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("password").build();
        }
        if (!checkValidMail(mail)) {
            return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("mail").build();
        }
        if (!equalsField(user.getMail(), mail) && checkDuplicateMail(mail)) {
            return Message.create().setCode(MessageCode.DUPLICATE).setMessage("mail").build();
        }
        boolean flag = false;
        if (!equalsField(user.getRole().getId(), roleId)) {
            user.setRole(role);
            flag = true;
        }
        if (!equalsField(user.getName(), name)) {
            user.setName(name);
            flag = true;
        }
        if (!equalsField(user.getLogin(), login)) {
            user.setLogin(login);
            flag = true;
        }
        if (!equalsField(user.getMail(), mail)) {
            user.setMail(mail);
            flag = true;
        }
        Session session = SessionHelper.openSession();
        Authentication authentication = null;
        boolean flag1 = false;
        if (!password.isEmpty()) {
            authentication = session.get(Authentication.class, new AuthenticationId(user, AuthenticationType.PASSWORD));
            if (authentication != null) {
                flag1 = true;
            }
        }
        if (flag || flag1) {
            SessionHelper.startTransaction(session);
            if (flag) {
                session.merge(user);
            }
            if (flag1) {
                authentication.setSecretAuthorization(password.getBytes(StandardCharsets.UTF_8));
            }
            SessionHelper.endTransaction(session);
        }
        session.close();
        if (flag || flag1) {
            return Message.create().setCode(MessageCode.SUCCESS).setEntity(user).build();
        }
        return Message.create().setCode(MessageCode.PASS).setEntity(user).build();
    }

    public static Message delete(long userId) {
        User user = find(userId);
        if (user == null) {
            return Message.create().setCode(MessageCode.NOT_FOUND).setMessage("userId").build();
        }
        Session session = SessionHelper.openSession();
        SessionHelper.startTransaction(session);
        session.remove(user);
        SessionHelper.endTransaction(session);
        return Message.create().setCode(MessageCode.SUCCESS).setEntity(user).build();
    }

    public static User find(long id) {
        return QueryHelper.find(User.class, id);
    }

    public static List<User> findAll() {
        return QueryHelper.findAll(User.class);
    }

    public static Message authorization(String login, String password) {
        Session session = SessionHelper.openSession();
        Query<User> query = session.createQuery("select u from User u where u.mail = " + QueryHelper.textParam(login), User.class);
        for (User user : query.stream().toList()) {
            for (Authentication authentication : user.getAuthentications()) {
                if (authentication.getType().equals(AuthenticationType.PASSWORD)) {
                    if (Arrays.equals(authentication.getSecretAuthorization(), password.getBytes(StandardCharsets.UTF_8))) {
                        SessionHelper.startTransaction(session);
                        session.persist(new LoginHistory(user));
                        SessionHelper.endTransaction(session);
                        return Message.create().setCode(MessageCode.SUCCESS).setMessage("Успешная авторизация").setEntity(Boolean.TRUE).build();
                    } else {
                        return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("Пароль не совпадает").setEntity(Boolean.FALSE).build();
                    }
                }
            }
        }
        return Message.create().setCode(MessageCode.INVALID_DATA).setMessage("Логин не найден").setEntity(Boolean.FALSE).build();
    }
}
