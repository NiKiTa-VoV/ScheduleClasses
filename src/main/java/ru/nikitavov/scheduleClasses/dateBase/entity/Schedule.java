package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table
public class Schedule {
    @ManyToOne
    private Teacher teacher;
    @OneToMany
    @JoinColumn(name = "schedule_id")
    private List<Lesson> lessons;

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private Instant date;

    public Schedule() {
    }

    public Schedule(Instant date, Teacher teacher) {
        this.date = date;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }

    public long getId() {
        return id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
}
