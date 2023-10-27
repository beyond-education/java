package com.beyond.trick_or_treat.controller;

import com.beyond.trick_or_treat.data.Sweet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("sweets")
@CrossOrigin
public class SweetsController {
    private final List<Sweet> sweets = new ArrayList<>();

    @PostMapping
    String add(@RequestBody String name) {
        String randomID = UUID.randomUUID().toString();
        Sweet sweet = new Sweet(randomID, name);
        sweets.add(sweet);
        return "Thank you!";
    }

    @GetMapping
    List<Sweet> getAll() {
        return sweets;
    }

}
