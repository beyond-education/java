package com.beyond.walkie_talkies.logic;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class Transmission {
    private final Random random;

    public Transmission(Random random) {
        this.random = random;
    }

    public List<String> getInputsWithoutLost(List<String> inputs) {
        return inputs.stream()
                .filter(input -> random.nextInt(100) > 20)
                .toList();
    }
}
