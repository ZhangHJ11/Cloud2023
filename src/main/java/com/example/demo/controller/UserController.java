package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public Message getUserById(@PathVariable long id) {
        // Here, you can implement logic to fetch user by ID from a database or other
        // sources.
        return new Message(id);
    }

}
