package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;


@Entity
@Table
@IdClass(AuthenticationId.class)
public class Authentication {
    @ManyToOne
    @Id
    private User user;

    @Column
    @Id
    private AuthenticationType type;

    @Column
    private byte[] SecretAuthorization;

}
