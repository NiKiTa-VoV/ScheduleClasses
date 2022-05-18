package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

import java.util.Date;

@Entity
@Table(appliesTo = "User")
public class User {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @ManyToOne
    @Column
    private Role role;

    @Column
    private String name;

    @Column
    private String login;

    @Column
    private String mail;

    @Column
    private Date registryDate;
}
