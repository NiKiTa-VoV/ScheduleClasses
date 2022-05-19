package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;


import java.time.Instant;

@Entity
@Table
public class Schedule {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private Instant date;
}
