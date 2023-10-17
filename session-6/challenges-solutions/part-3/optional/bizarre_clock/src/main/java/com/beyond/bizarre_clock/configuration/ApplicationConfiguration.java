package com.beyond.bizarre_clock.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class ScannerConfiguration {
    @Bean
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
