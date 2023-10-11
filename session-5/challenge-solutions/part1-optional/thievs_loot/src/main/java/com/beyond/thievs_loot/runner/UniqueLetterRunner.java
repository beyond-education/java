package com.beyond.thievs_loot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UniqueLetterRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String name = "Alexander";
        String uniqueCharacters = name.toLowerCase().chars()
                .distinct()
                .sorted()
                .mapToObj(Character::toString)
                .collect(Collectors.joining(",","[","]"));
        System.out.println("uniqueCharacters = " + uniqueCharacters);
    }
}
