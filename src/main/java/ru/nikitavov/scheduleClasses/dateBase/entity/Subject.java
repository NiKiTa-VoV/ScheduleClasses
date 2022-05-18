package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "Subject")
public class Subject {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;
}
