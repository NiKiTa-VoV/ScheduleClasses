package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;


@Entity
@Table
public class Lesson {
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

    @Column
    private String classroom;

    @Column
    private boolean workedOut;
}
