package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Subject {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;
}
