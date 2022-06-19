package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Department {
    @OneToMany
    @JoinColumn(name = "department_id")
    private List<Group> groups;

    public Department() {
    }

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
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
