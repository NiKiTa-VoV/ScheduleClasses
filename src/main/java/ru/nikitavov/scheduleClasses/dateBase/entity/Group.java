package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Table;

import java.util.List;

@Entity
@Table(appliesTo = "Group")
public class Group {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @ManyToOne
    @Column
    private Department department;

    @ManyToOne
    @Column
    private Specialization specialization;

    @Column
    private int course;

    @Column
    private int number;

    @OneToMany
    @Column
    List<Student> students;

    @Column
    @OneToMany
    private List<Curriculum> curricula;

    @Column
    @OneToMany
    private List<Lesson> lesson;
}
