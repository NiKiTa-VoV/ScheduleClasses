package ru.nikitavov.scheduleClasses.dateBase.message;

import ru.nikitavov.scheduleClasses.grpc.MessageCode;

public record Message(MessageCode code, String message, Object entity) {
    public Message(MessageCode code, String message, Object entity) {
        this.code = code;
        this.message = message == null ? "" : message;
        this.entity = entity;
    }

    public static MessageBuilder create() {
        return new MessageBuilder();
    }

    public MessageCode getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getEntity() {
        return entity;
    }

    public boolean hasEntity() {
        return entity != null;
    }
}
