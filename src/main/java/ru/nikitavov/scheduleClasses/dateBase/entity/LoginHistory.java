package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;


import java.time.Instant;

@Entity
@Table
public class LoginHistory {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @ManyToOne
    private User user;

    @Column
    private Instant date;
}
