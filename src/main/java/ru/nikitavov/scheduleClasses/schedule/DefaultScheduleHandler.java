package ru.nikitavov.scheduleClasses.schedule;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import static java.util.Calendar.WEEK_OF_YEAR;

public class DefaultScheduleHandler {

    private static HashMap<Long, ArrayList<DefaultSchedule>> defaultSchedules = new HashMap<>();

    public static void init() {

        File scheduleDir = new File("schedule");
        if (!checkOrCreateDirectory(scheduleDir)) {
            return;
        }
        File fileDefaultSchedule = new File(scheduleDir, "default_schedule.json");
        if (!checkOrCreateFile(fileDefaultSchedule)) {
            return;
        }
        try (BufferedReader in = new BufferedReader(new FileReader(fileDefaultSchedule))) {
            Type listType = new TypeToken<HashMap<Long, ArrayList<DefaultSchedule>>>() {
            }.getType();
            defaultSchedules = new Gson().fromJson(in, listType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean checkOrCreateDirectory(File file) {
        if (!file.exists()) {
            return file.mkdir();
        }
        return true;
    }

    private static boolean checkOrCreateFile(File file) {
        if (!file.exists()) {
            try {
                return file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }


    public static ArrayList<AvailableLesson> getDefaultLessons(Calendar calendar, LocalDate localDate, long teacherId) {
        if (localDate == null) return null;
        System.out.println(calendar.get(WEEK_OF_YEAR));
        int week = calendar.get(WEEK_OF_YEAR) % 2;
        int weekDay = localDate.getDayOfWeek().getValue();

        ArrayList<DefaultSchedule> defaultSchedules = DefaultScheduleHandler.defaultSchedules.get(teacherId);

        if (defaultSchedules != null) {
            for (DefaultSchedule schedule : defaultSchedules) {
                if (schedule.getWeek() == week && schedule.getDayWeek() == weekDay)
                    return schedule.getLessons();
            }
        }
        return null;
    }
}
