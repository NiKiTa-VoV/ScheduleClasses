package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Subject {

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
