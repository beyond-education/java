package com.beyond.part1.configuration;

import com.beyond.part1.service.RandomOptionSelector;
import com.beyond.part1.service.TotallyRandomOptionSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Random;

@Configuration
public class BeanConfiguration {
    @Bean
    Random random() {
        return new Random();
    }

    @Bean
    RandomOptionSelector pizzaSelector(Random random) {
        List<String> pizzas = List.of("margarita", "provinziale", "spinach", "salami", "hawaii");
        return new RandomOptionSelector(random, pizzas);
    }

    @Bean
    RandomOptionSelector icecreamSelector(Random random) {
        List<String> icecreams = List.of("chocolate", "coffee", "vanilla", "mango");
        return new RandomOptionSelector(random, icecreams);
    }

    @Bean
    TotallyRandomOptionSelector totallyRandomOptionSelector(RandomOptionSelector pizzaSelector,
                                                            RandomOptionSelector icecreamSelector){
        return new TotallyRandomOptionSelector(pizzaSelector, icecreamSelector);
    }
}
