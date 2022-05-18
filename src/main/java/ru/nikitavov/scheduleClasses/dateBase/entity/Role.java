package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

import java.util.List;

@Entity
@Table(appliesTo = "Role")
public class Role {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @OneToMany
    @Column
    private List<User> users;
}
