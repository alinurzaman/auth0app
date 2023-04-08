package com.auth0spring.auth0app.model;

public class Message {
    private final String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}