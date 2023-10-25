package com.beyond.british_time_frames.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/one")
    public String getGreeting() {
        return "How do you do?";
    }

    @GetMapping("/many")
    public List<String> getGreetings() {
        return List.of("Good morning", "Good afternoon", "Good evening", "Good night");
    }
}
