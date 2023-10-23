package com.beyond.letter_spelling_machine.service;

import org.springframework.stereotype.Service;

@Service
public class TextService {
    public void spellText(String text) {
        for (String s : text.split("")) {
            System.out.println(s);
        }
    }
}
