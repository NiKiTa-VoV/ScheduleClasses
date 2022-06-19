package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Arrays;


@Entity
@Table
@IdClass(AuthenticationId.class)
public class Authentication {
    @ManyToOne
    @Id
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    public Authentication() {
    }

    public Authentication(User user, AuthenticationType type, byte[] secretAuthorization) {
        this.user = user;
        this.type = type;
        SecretAuthorization = secretAuthorization;
    }

    @Column
    @Id
    private AuthenticationType type;

    @Column
    private byte[] SecretAuthorization;

    @Override
    public String toString() {
        return "Authentication{" +
                "user=" + user +
                ", type=" + type +
                ", SecretAuthorization=" + Arrays.toString(SecretAuthorization) +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationType getType() {
        return type;
    }

    public void setType(AuthenticationType type) {
        this.type = type;
    }

    public byte[] getSecretAuthorization() {
        return SecretAuthorization;
    }

    public void setSecretAuthorization(byte[] secretAuthorization) {
        SecretAuthorization = secretAuthorization;
    }
}
