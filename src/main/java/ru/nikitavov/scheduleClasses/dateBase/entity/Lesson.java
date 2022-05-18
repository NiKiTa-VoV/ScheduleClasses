package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "Lesson")
public class Lesson {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    @ManyToOne
    private Subject subject;

    @Column
    @ManyToOne
    private Group group;

    @Column
    @ManyToOne
    private Teacher teacher;

    @Column
    private int lessonNumber;

    @Column
    private String classroom;

    @Column
    private boolean workedOut;
}
