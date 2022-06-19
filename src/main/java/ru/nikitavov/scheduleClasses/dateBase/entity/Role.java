package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Role {
    @OneToMany
    @JoinColumn(name = "role_id")
    private List<User> users;

    public Role() {
    }

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String name;

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
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

    public List<User> getUsers() {
        return users;
    }
}
