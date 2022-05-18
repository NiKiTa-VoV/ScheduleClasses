package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

import java.time.Instant;

@Entity
@Table(appliesTo = "LoginHistory")
public class LoginHistory {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @ManyToOne
    @Column
    private User user;

    @Column
    private Instant date;
}
