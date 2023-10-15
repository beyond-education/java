package com.beyond.missing_number.logic;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SequenceFormatter {
    public String getFormatedSequence(List<Integer> sequence) {
        return sequence.stream()
                .map(number->Integer.toString(number))
                .collect(Collectors.joining(",", "[", "]"));
    }
}
