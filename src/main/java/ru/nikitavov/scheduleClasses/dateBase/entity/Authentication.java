package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "Authorization")
public class Authentication {
    @ManyToOne
    @Id
    @Column
    private User user;

    @Id
    @Column
    private AuthenticationType type;

    @Column
    private byte[] SecretAuthorization;

}
