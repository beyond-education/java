package com.beyond.british_time_frames.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.print.DocFlavor;
import java.util.List;

@Configuration
public class GreetingConfiguration {
    @Bean
    List<String> greetings() {
        return List.of("Good Morning", "Good Afternoon", "Good Evening");
    }
}
