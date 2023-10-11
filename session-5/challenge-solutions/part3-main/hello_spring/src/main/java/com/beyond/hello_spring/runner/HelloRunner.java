package com.beyond.hello_spring.runner;

import com.beyond.hello_spring.logic.HelloSpringCreator;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloRunner implements ApplicationRunner {

    private final HelloSpringCreator helloSpringCreator;

    public HelloRunner(HelloSpringCreator helloSpringCreator) {
        this.helloSpringCreator = helloSpringCreator;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(helloSpringCreator.getCompleteMessage());
    }
}
