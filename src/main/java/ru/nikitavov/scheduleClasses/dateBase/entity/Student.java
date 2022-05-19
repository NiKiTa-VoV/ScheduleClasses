package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @ManyToOne
    private Group group;
}
