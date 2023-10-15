package com.beyond.calculating_instruction_scores.logic;

import com.beyond.calculating_instruction_scores.data.Instruction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TotalScoreCalculator {

    private final ScoreCalculator scoreCalculator;
    private final ScoreDoubleUpperCaseCalculator scoreDoubleUpperCaseCalculator;

    public TotalScoreCalculator(ScoreCalculator scoreCalculator,
                                ScoreDoubleUpperCaseCalculator scoreDoubleUpperCaseCalculator) {
        this.scoreCalculator = scoreCalculator;
        this.scoreDoubleUpperCaseCalculator = scoreDoubleUpperCaseCalculator;
    }

    public int getTotalScore(List<Instruction> instructions) {
        return instructions.stream()
                .mapToInt(instr->instr.isSpecial()?
                        scoreDoubleUpperCaseCalculator.getWordScore(instr.word()) :
                        scoreCalculator.getWordScore(instr.word()))
                .sum();

    }
}
