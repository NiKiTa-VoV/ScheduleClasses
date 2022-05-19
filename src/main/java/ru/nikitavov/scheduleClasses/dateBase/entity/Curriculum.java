package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Curriculum {
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
}
