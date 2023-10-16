package com.beyond.walkie_talkies.runner;

import com.beyond.walkie_talkies.logic.Communication;
import com.beyond.walkie_talkies.logic.Transmission;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WalkieTalkieRunner implements ApplicationRunner {

    private final Communication communication;
    private final Transmission transmission;

    public WalkieTalkieRunner(Communication communication, Transmission transmission) {
        this.communication = communication;
        this.transmission = transmission;
    }

    @Override
    public void run(ApplicationArguments args) {
        List<String> inputs = communication.getInputLines();
        System.out.println("inputs = " + inputs);
        List<String> inputsWithoutLost = transmission.getInputsWithoutLost(inputs);
        System.out.println("inputsWithoutLost = " + inputsWithoutLost);
    }
}
