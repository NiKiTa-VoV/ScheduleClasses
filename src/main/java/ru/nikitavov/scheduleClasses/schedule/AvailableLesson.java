package ru.nikitavov.scheduleClasses.schedule;

public class AvailableLesson {
    int number;
    long idGroup;
    long idSubject;
    long idRoom;

    public AvailableLesson(int number, long idGroup, long idSubject, long idRoom) {
        this.number = number;
        this.idGroup = idGroup;
        this.idSubject = idSubject;
        this.idRoom = idRoom;
    }

    public int getNumber() {
        return number;
    }

    public long getIdGroup() {
        return idGroup;
    }

    public long getIdSubject() {
        return idSubject;
    }

    public long getIdRoom() {
        return idRoom;
    }
}
