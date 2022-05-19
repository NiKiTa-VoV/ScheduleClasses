package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "'User'")
public class User {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @ManyToOne
    private Role role;

    @Column
    private String name;

    @Column
    private String login;

    @Column
    private String mail;

    @Column
    private Date registryDate;

    protected User() {}

    public User(Role role, String name, String login, String mail, Date registryDate) {
        this.role = role;
        this.name = name;
        this.login = login;
        this.mail = mail;
        this.registryDate = registryDate;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", role=" + role +
            ", name='" + name + '\'' +
            ", login='" + login + '\'' +
            ", mail='" + mail + '\'' +
            ", registryDate=" + registryDate +
            '}';
    }
}
