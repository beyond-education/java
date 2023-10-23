package com.beyond.kindergarden_intro.controller;

import com.beyond.kindergarden_intro.data.Kid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/kids")
public class KidsController {
    List<Kid> kids = new ArrayList<>();

    @GetMapping
    public List<Kid> getKids() {
        return kids;
    }

    @PostMapping
    public String addKid(@RequestBody Kid kid) {
        kids.add(kid);
        return "Hi, I am "+ kid.name() +" and my favourite " +
                "color is "+kid.favoriteColor();
    }

}
