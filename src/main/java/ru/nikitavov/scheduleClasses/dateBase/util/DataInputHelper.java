package ru.nikitavov.scheduleClasses.dateBase.util;

import com.google.common.base.CharMatcher;
import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.nikitavov.scheduleClasses.dateBase.entity.User;

import java.util.regex.Pattern;

public class DataInputHelper {

    private static final Pattern mailPattern = Pattern.compile(".+@.+\\..+");

    public static boolean checkValidLogin(String login) {
        login = login.trim();
        return !login.isEmpty() && !CharMatcher.whitespace().matchesAnyOf(login);
    }

    public static boolean checkDuplicateLogin(String login) {
        Session session = SessionHelper.openSession();
        Query<User> query = session.createQuery("select user from User as user where login = :login", User.class);
        query.setParameter("login", login);
        return query.list().size() != 0;
    }

    public static boolean checkValidPassword(String password) {
        password = password.trim();
        return !password.isEmpty() && !CharMatcher.whitespace().matchesAnyOf(password);
    }

    public static boolean checkValidMail(String mail) {
        return !mail.isEmpty() && mailPattern.matcher(mail).find();
    }

    public static boolean checkDuplicateMail(String mail) {
        Session session = SessionHelper.openSession();
        Query<User> query = session.createQuery("select user from User as user where mail = :mail", User.class);
        query.setParameter("mail", mail);
        return query.list().size() != 0;
    }

    public static boolean hasBeenChanged(String text) {
        return !text.equals("#NOEDIT");
    }

    public static boolean validId(long id) {
        return id > 0;
    }

    public static boolean negative(int number) {
        return number < 0;
    }

    public static boolean equalsField(long number1, long number2) {
        return number1 == number2;
    }

    public static boolean equalsField(String text1, String text2) {
        return text1 != null && text1.equals(text2);
    }
}
