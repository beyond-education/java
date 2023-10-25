package com.beyond.developers.controller;

import com.beyond.developers.data.Developer;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("developers")
public class DeveloperController {
    private final Set<Developer> developers = new HashSet<>();

    @GetMapping
    Set<Developer> getAll(){
        return developers;
    }

    @PostMapping
    Developer postOne(@RequestBody Developer developer){
        developers.add(developer);
        return developer;
    }
}
