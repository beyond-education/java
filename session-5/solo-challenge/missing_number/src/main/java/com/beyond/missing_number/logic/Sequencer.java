package com.beyond.missing_number.logic;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Sequencer {
    private final SequenceGenerator sequenceGenerator;
    private final SequenceFormatter sequenceFormatter;

    public Sequencer(SequenceGenerator sequenceGenerator, SequenceFormatter sequenceFormatter) {
        this.sequenceGenerator = sequenceGenerator;
        this.sequenceFormatter = sequenceFormatter;
    }

    public String getSequenceForNumber(int number) {
        List<Integer> sequence = sequenceGenerator.getSequence(number);
        return sequenceFormatter.getFormatedSequence(sequence);
    }
}
