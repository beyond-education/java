package com.beyond.cars_handler.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarsController {
    @PostMapping
    public int printCar(@RequestBody String brand) {
        System.out.println("brand = " + brand);
        return brand.length();

    }
}
