package com.beyond.walkie_talkies.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class Communication {
    private final Scanner scanner;

    public Communication(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> getInputLines() {
        String input = "";
        List<String> inputs = new ArrayList<>();
        while(!input.equalsIgnoreCase("over")) {
            input = scanner.nextLine();
            inputs.add(input);
        }
        inputs.remove(input);
        return inputs;
    }
}
