package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Message get() {
        // Here, you can implement logic to fetch user by ID from a database or other
        // sources.
        return new Message();
    }
}
