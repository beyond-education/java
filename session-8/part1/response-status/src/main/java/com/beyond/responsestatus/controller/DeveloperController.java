package com.beyond.responsestatus.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("developers")
public class DeveloperController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    String create(@RequestBody String name) {
        return name;
    }
}
