package com.beyond.kindergarden_groups.controller;

import com.beyond.kindergarden_groups.data.Kid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/kids")
public class KidsController {
    private final List<Kid> kids = new ArrayList<>();

    @GetMapping
    public List<Kid> getKids() {
        return kids;
    }

    @PostMapping
    public String addKid(@RequestBody Kid kid) {
        kids.add(kid);
        return "Hi, I am " + kid.name() + " and my favourite colour is "+kid.favoriteColor();
    }

    @GetMapping("/blue")
    public List<Kid> getKidsBlue() {
        return kids.stream()
                .filter(kid -> kid.favoriteColor().equals("blue"))
                .toList();
    }

    @GetMapping("/red")
    public List<Kid> getKidsRed() {
        return kids.stream()
                .filter(kid -> kid.favoriteColor().equals("red"))
                .toList();
    }
}
