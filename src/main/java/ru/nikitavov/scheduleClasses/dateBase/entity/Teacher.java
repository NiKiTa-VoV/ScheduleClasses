package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Table
public class Teacher {
    @OneToOne
    @Id
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User id;
    @OneToMany
    @JoinColumn(name = "teacher_id_id")
    private List<Curriculum> curricula;
    @OneToMany
    @JoinColumn(name = "teacher_id_id")
    private List<Lesson> lesson;

    public Teacher() {
    }

    public Teacher(User id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                '}';
    }

    public User getId() {
        return id;
    }

    public List<Curriculum> getCurricula() {
        return curricula;
    }

    public List<Lesson> getLesson() {
        return lesson;
    }
}
