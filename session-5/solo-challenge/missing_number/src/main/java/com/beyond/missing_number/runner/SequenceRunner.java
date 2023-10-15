package com.beyond.missing_number.runner;

import com.beyond.missing_number.logic.Sequencer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SequenceRunner implements ApplicationRunner {

    private final Sequencer sequencer;

    public SequenceRunner(Sequencer sequencer) {
        this.sequencer = sequencer;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String sequence = sequencer.getSequenceForNumber(6);
        System.out.println("sequence = " + sequence);
    }
}
