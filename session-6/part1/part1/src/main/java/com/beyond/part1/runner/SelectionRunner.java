package com.beyond.part1.runner;

import com.beyond.part1.service.RandomOptionSelector;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SelectionRunner implements ApplicationRunner {
    private final RandomOptionSelector pizzaSelector;
    private final RandomOptionSelector icecreamSelector;

    public SelectionRunner(RandomOptionSelector pizzaSelector, RandomOptionSelector icecreamSelector) {
        this.pizzaSelector = pizzaSelector;
        this.icecreamSelector = icecreamSelector;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String pizza = pizzaSelector.selectOneAtRandom();
        System.out.println("pizza = " + pizza);
        String icecream = icecreamSelector.selectOneAtRandom();
        System.out.println("icecream = " + icecream);
    }
}
