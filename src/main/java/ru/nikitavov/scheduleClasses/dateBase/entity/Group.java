package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "groups")
public class Group {
    @OneToMany
    @JoinColumn(name = "group_id")
    List<Student> students;
    @OneToMany
    @JoinColumn(name = "group_id")
    private List<Curriculum> curricula;

    @Id
    @GeneratedValue
    @Column
    private long id;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Specialization specialization;

    @Column
    private int course;

    @Column
    private int number;
    @OneToMany
    @JoinColumn(name = "group_id")
    private List<Lesson> lesson;

    public Group() {
    }

    public Group(Department department, Specialization specialization, int course, int number) {
        this.department = department;
        this.specialization = specialization;
        this.course = course;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", department=" + department +
                ", specialization=" + specialization +
                ", course=" + course +
                ", number=" + number +
                '}';
    }

    public long getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Curriculum> getCurricula() {
        return curricula;
    }

    public List<Lesson> getLesson() {
        return lesson;
    }
}
