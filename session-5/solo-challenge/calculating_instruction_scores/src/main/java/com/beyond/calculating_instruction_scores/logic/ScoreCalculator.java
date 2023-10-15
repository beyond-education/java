package com.beyond.calculating_instruction_scores.logic;

import org.springframework.stereotype.Component;

@Component
public class ScoreCalculator {
    public int getWordScore(String word) {
        return word.chars().sum();
    }
}
