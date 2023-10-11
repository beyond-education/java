package com.beyond.hello_spring.logic;

import org.springframework.stereotype.Component;

@Component
public class SpringCreator {
    private final String spring = "Spring";

    public String getSpring() {
        return spring;
    }
}
