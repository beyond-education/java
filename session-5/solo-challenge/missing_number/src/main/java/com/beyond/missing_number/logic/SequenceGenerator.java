package com.beyond.missing_number.logic;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class SequenceGenerator {
    public List<Integer> getSequence(int number) {
        return IntStream.rangeClosed(0,9)
                .filter(n->n != number)
                .boxed()
                .toList();
    }
}
