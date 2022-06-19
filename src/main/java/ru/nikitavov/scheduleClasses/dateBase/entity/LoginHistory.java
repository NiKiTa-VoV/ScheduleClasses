package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table
public class LoginHistory {
    public LoginHistory() {
    }

    public LoginHistory(User user) {
        this.user = user;
        date = Instant.now();
    }

    @Id
    @GeneratedValue
    @Column
    private long id;

    @ManyToOne
    private User user;

    @Column
    private Instant date;

    @Override
    public String toString() {
        return "LoginHistory{" +
                "id=" + id +
                ", user=" + user +
                ", date=" + date +
                '}';
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Instant getDate() {
        return date;
    }
}
