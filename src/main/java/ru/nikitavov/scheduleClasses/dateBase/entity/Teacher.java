package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

import java.util.List;

@Entity
@Table(appliesTo = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    @OneToMany
    private List<Curriculum> curricula;

    @Column
    @OneToMany
    private List<Lesson> lesson;
}
