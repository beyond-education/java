package com.beyond.show_and_tell.controller;

import com.beyond.show_and_tell.exception.SweetNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.beyond.show_and_tell.data.Sweet;

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

    @GetMapping("{id}")
    Sweet get(@PathVariable String id) {
        Optional<Sweet> sweet = sweets.stream()
                .filter(sweet1 -> sweet1.id().equals(id))
                .findFirst();
        if (sweet.isEmpty()) {
            throw new SweetNotFoundException();
        }
        return sweet.get();
    }

    @DeleteMapping("{id}")
    boolean delete(@PathVariable String id) {
        boolean isDeleted = sweets.removeIf(sweet -> sweet.id().equals(id));
        if(!isDeleted) {
            throw new SweetNotFoundException();
        }
        return true;
    }



}