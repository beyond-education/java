package com.beyond.calculating_instruction_scores.logic;

import org.springframework.stereotype.Component;

@Component
public class ScoreDoubleUpperCaseCalculator {
    public int getWordScore(String word) {
        return word.toUpperCase().chars()
                .map(c->c*2)
                .sum();
    }
}
