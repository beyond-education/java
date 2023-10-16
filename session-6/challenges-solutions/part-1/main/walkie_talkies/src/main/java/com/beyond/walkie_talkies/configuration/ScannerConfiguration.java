package com.beyond.walkie_talkies.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class ScannerConfiguration {
    @Bean
    public Scanner generateScanner() {
        return new Scanner(System.in);
    }
}
