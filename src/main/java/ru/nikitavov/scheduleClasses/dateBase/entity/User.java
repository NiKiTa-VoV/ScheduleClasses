package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Column
    private Instant registryDate;
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Authentication> authentications;

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

    protected User() {
    }

    public User(Role role, String name, String login, String mail, Instant registryDate) {
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

    public long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Instant getRegistryDate() {
        return registryDate;
    }

    public List<Authentication> getAuthentications() {
        return authentications;
    }
}
