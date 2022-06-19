package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

@Entity
@Table(indexes = {@Index(columnList = "subject_id, group_id, teacher_id_id")})
public class Curriculum {
    public Curriculum() {
    }

    public Curriculum(Subject subject, Group group, Teacher teacher, int numberStudyHours) {
        this.subject = subject;
        this.group = group;
        this.teacher = teacher;
        this.numberStudyHours = numberStudyHours;
    }

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
    private int numberStudyHours;

    @Override
    public String toString() {
        return "Curriculum{" + "id=" + id + ", subject=" + subject + ", group=" + group + ", teacher=" + teacher + ", numberStudyHours=" + numberStudyHours + '}';
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

    public int getNumberStudyHours() {
        return numberStudyHours;
    }

    public void setNumberStudyHours(int numberStudyHours) {
        this.numberStudyHours = numberStudyHours;
    }
}
