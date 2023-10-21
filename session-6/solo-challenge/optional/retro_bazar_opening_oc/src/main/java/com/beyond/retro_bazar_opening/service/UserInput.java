package com.beyond.retro_bazar_opening.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserInput {
    private final Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getUserInput(String instruction) {
        System.out.print(instruction);
        return scanner.nextLine();
    }
}
