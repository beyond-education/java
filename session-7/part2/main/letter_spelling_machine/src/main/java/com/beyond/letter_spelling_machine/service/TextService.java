package com.beyond.letter_spelling_machine.service;

import org.springframework.stereotype.Service;

@Service
public class TextService {
    public void spellText(String text) {
        String[] letters = text.split("");
        for (String letter : letters) {
            System.out.println(letter);
        }
    }
}
