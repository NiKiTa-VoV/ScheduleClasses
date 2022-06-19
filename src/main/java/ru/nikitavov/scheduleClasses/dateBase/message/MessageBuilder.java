package ru.nikitavov.scheduleClasses.dateBase.message;

import ru.nikitavov.scheduleClasses.grpc.MessageCode;

public class MessageBuilder {
    private MessageCode code;
    private String message;
    private Object entity;

    public MessageBuilder setCode(MessageCode code) {
        this.code = code;
        return this;
    }

    public MessageBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public MessageBuilder setEntity(Object entity) {
        this.entity = entity;
        return this;
    }

    public Message build() {
        return new Message(code, message, entity);
    }
}