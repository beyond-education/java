package com.beyond.calculating_instruction_scores.runner;

import com.beyond.calculating_instruction_scores.data.Instruction;
import com.beyond.calculating_instruction_scores.logic.TotalScoreCalculator;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScoreRunner implements ApplicationRunner {

    private final TotalScoreCalculator totalScoreCalculator;

    public ScoreRunner(TotalScoreCalculator totalScoreCalculator) {
        this.totalScoreCalculator = totalScoreCalculator;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Instruction> instructions = List.of(
                new Instruction("Attack", false),
                new Instruction("Dice", true),
                new Instruction("Poll", true),
                new Instruction("Push", false)
                );
        int totalScore = totalScoreCalculator.getTotalScore(instructions);
        System.out.println("totalScore = " + totalScore);
    }
}
