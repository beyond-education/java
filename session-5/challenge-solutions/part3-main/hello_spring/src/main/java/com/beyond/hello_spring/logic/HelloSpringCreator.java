package com.beyond.hello_spring.logic;

import org.springframework.stereotype.Component;

@Component
public class HelloSpringCreator {
    private final HelloCreator helloCreator;
    private final SpringCreator springCreator;


    public HelloSpringCreator(HelloCreator helloCreator, SpringCreator springCreator) {
        this.helloCreator = helloCreator;
        this.springCreator = springCreator;
    }

    public String getCompleteMessage() {
        return helloCreator.getHello() + " " + springCreator.getSpring();
    }
}
