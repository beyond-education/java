package com.beyond.awesomebirthdays.logic;

import org.springframework.stereotype.Component;

@Component
public class OddBirthdayMessageGenerator {
    public String generateBirthdayMessage(int day) {
        return "Happy ODD birthday! (" + day + ")";
    }
}
