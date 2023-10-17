package com.beyond.bizarre_clock.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;
import java.util.Set;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    Set<Integer> bizarreHours() {
        return Set.of(0, 11, 22);
    }
}
