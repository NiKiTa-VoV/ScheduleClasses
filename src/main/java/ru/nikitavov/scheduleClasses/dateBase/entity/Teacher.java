package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    @OneToMany
    private List<Curriculum> curricula;

    @Column
    @OneToMany
    private List<Lesson> lesson;
}
