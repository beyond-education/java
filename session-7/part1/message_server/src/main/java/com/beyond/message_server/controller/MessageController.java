package com.beyond.message_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @GetMapping("/one")
    public String getMessage() {
        return "Hello, how are you doing?";
    }

    @GetMapping("/many")
    public List<String> getMessages() {
        return List.of("Hello",
                "Hi",
                "Hoi",
                "Servus");
    }
}
