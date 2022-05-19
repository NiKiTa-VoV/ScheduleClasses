package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "'Group'")
public class Group {
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
    List<Student> students;

    @OneToMany
    private List<Curriculum> curricula;

    @OneToMany
    private List<Lesson> lesson;
}
