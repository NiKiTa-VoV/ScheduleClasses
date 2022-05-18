package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "Student")
public class Student {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @ManyToOne
    @Column
    private Group group;
    }
