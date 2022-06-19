package ru.nikitavov.scheduleClasses.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

import static java.util.Calendar.*;

public class DateUtil {

    public static Calendar parseDateToCalendar(String date) {
        Calendar cal = getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            cal.setTime(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        return cal;
    }

    public static LocalDate calendarDateToLocalDate(Calendar calendar) {
        if (calendar == null) return null;
        return LocalDate.of(calendar.get(YEAR), calendar.get(MONTH) + 1, calendar.get(DAY_OF_MONTH));
    }
}
