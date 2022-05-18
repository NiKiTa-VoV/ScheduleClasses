package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.Table;

import java.time.Instant;

@Entity
@Table(appliesTo = "Schedule")
public class Schedule {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private Instant date;
}
