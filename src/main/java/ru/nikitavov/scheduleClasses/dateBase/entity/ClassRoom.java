package ru.nikitavov.scheduleClasses.dateBase.entity;

import jakarta.persistence.*;

@Entity
@Table
public class ClassRoom {
    @Id
    @GeneratedValue
    @Column
    private long id;
    @Column
    private String number;

    public ClassRoom() {
    }

    public ClassRoom(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
