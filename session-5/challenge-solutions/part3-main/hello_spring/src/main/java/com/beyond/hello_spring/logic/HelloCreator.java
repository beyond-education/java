package com.beyond.hello_spring.logic;

import org.springframework.stereotype.Component;

@Component
public class HelloCreator {
    private final String hello="Hello";

    public String getHello() {
        return hello;
    }
}
