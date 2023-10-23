package com.beyond.loud_spelling_machine.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class WordService {
    public String transformWord(String text) {
        return Arrays.stream(text.split("")).collect(Collectors.joining("-"));
    }
}
