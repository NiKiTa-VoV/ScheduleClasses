package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table
public class Role {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String name;

    @OneToMany
    private List<User> users;
}
