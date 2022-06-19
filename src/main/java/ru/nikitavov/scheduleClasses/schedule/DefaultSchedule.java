package ru.nikitavov.scheduleClasses.schedule;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class DefaultSchedule {

    private long teacherId;
    private int week;
    private int dayWeek;
    private ArrayList<AvailableLesson> lessons;

    public DefaultSchedule(int teacherId, int week, int dayWeek, AvailableLesson... lessons) {
        this.teacherId = teacherId;
        this.week = week;
        this.dayWeek = dayWeek;
        this.lessons = Lists.newArrayList(lessons);
    }

    public void addLesson(AvailableLesson lesson) {
        if (lessons == null) {
            lessons = new ArrayList<>();
        }
        lessons.add(lesson);
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(int dayWeek) {
        this.dayWeek = dayWeek;
    }

    public ArrayList<AvailableLesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<AvailableLesson> lessons) {
        this.lessons = lessons;
    }
}
