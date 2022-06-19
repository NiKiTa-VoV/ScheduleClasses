package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Specialization {
    @OneToMany
    @JoinColumn(name = "specialization_id")
    List<Group> groups;

    public Specialization() {
    }

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String name;

    public Specialization(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
