package com.beyond.part1.service;

import java.util.List;
import java.util.Random;

public class RandomOptionSelector {
    private final Random random;
    private final List<String> options;

    public RandomOptionSelector(Random random, List<String> options) {
        this.random = random;
        this.options = options;
    }

    public String selectOneAtRandom() {
        int size = options.size();
        int randomIndex = random.nextInt(size);
        return options.get(randomIndex);
    }
}
