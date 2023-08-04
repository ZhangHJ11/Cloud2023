package com.example.demo.model;

public class Message {
    private long id;
    private String msg;

    public Message() {
    }

    public Message(long id) {
        this.id = id;
        this.msg = "This is user " + id;
    }
}
