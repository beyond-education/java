package com.beyond.retro_bazar_arrangment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class ScannerConfiguration {
    @Bean
    Scanner scanner() {
        return new Scanner(System.in);
    }
}
