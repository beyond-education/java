package com.beyond.awesomebirthdays.logic;

import org.springframework.stereotype.Component;

@Component
public class EvenBirthdayMessageGenerator {
    public String generateBirthdayMessage(int day) {
        return "Happy EVEN birthday! (" + day + ")";
    }
}
