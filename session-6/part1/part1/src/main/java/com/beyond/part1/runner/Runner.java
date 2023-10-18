package com.beyond.part1.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class Runner implements ApplicationRunner {
    private final Scanner scanner;

    public Runner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String myInput = scanner.nextLine();
        System.out.println("myInput = " + myInput);
    }
}
