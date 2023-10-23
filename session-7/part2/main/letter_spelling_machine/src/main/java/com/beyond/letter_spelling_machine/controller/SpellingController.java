package com.beyond.letter_spelling_machine.controller;

import com.beyond.letter_spelling_machine.service.TextService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/letters")
public class SpellingController {
    private final TextService textService;

    public SpellingController(TextService textService) {
        this.textService = textService;
    }

    @PostMapping
    public String spellText(@RequestBody String text){
        textService.spellText(text);
        return text;
    }
}
