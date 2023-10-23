package com.beyond.loud_spelling_machine.controller;

import com.beyond.loud_spelling_machine.service.WordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("words")
public class SpellingController {
    private final WordService wordService;

    public SpellingController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping
    public String getLoudSpelling(@RequestBody String text) {
        return wordService.transformWord(text);
    }
}
