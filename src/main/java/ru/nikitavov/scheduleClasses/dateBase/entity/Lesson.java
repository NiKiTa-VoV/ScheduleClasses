package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;


@Entity
@Table
public class Lesson {

    @ManyToOne
    private ClassRoom classroom;
    @Column(name = "under_record")
    private boolean underRecord;

    @Id
    @GeneratedValue
    @Column
    private long id;

    @ManyToOne
    private Subject subject;

    @ManyToOne
    private Group group;

    @ManyToOne
    private Teacher teacher;

    @Column
    private int lessonNumber;
    @ManyToOne
    private Schedule schedule;

    public Lesson() {
    }

    public Lesson(Schedule schedule, int lessonNumber, Teacher teacher, Group group, Subject subject, ClassRoom classroom, boolean underRecord) {
        this.subject = subject;
        this.group = group;
        this.teacher = teacher;
        this.lessonNumber = lessonNumber;
        this.classroom = classroom;
        this.underRecord = underRecord;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "subject=" + subject +
                ", group=" + group +
                ", teacher=" + teacher +
                ", lessonNumber=" + lessonNumber +
                ", classroom=" + classroom +
                ", underRecord=" + underRecord +
                ", schedule=" + schedule +
                '}';
    }

    public long getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public ClassRoom getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassRoom classroom) {
        this.classroom = classroom;
    }

    public boolean isUnderRecord() {
        return underRecord;
    }

    public void setUnderRecord(boolean underRecord) {
        this.underRecord = underRecord;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
