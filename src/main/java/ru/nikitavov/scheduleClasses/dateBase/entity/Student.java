package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table
public class Student {
    @OneToOne
    @Id
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User id;
    @ManyToOne
    private Department group;

    public Student() {
    }

    public Student(User id, Department group) {
        this.id = id;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", group=" + group +
                '}';
    }

    public User getId() {
        return id;
    }

    public Department getGroup() {
        return group;
    }

    public void setGroup(Department group) {
        this.group = group;
    }
}
