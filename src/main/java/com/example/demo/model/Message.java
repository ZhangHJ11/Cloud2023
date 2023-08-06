package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

public class Message {
    @Getter
    @Setter
    private String msg;

    public Message() {
        this.msg = "nju16 final homework";
    }
}
