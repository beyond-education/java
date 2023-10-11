package com.beyond.awesomebirthdays.logic;

import org.springframework.stereotype.Component;

@Component
public class BirthdayMessageGenerator {
    private final OddBirthdayMessageGenerator oddBirthdayMessageGenerator;
    private final EvenBirthdayMessageGenerator evenBirthdayMessageGenerator;

    public BirthdayMessageGenerator(OddBirthdayMessageGenerator oddBirthdayMessageGenerator, EvenBirthdayMessageGenerator evenBirthdayMessageGenerator) {
        this.oddBirthdayMessageGenerator = oddBirthdayMessageGenerator;
        this.evenBirthdayMessageGenerator = evenBirthdayMessageGenerator;
    }

    public String generateBirthdayMessage(int day){
        if(day % 2 == 0){
            return evenBirthdayMessageGenerator.generateBirthdayMessage(day);
        } else {
            return oddBirthdayMessageGenerator.generateBirthdayMessage(day);
        }
    }
}
