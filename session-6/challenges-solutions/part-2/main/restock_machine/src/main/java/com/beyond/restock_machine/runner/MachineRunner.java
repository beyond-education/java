package com.beyond.restock_machine.runner;

import com.beyond.restock_machine.repository.MachineStorage;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Component
public class MachineRunner implements ApplicationRunner {
    private final Scanner scanner;
    private final MachineStorage machineStorage;

    public MachineRunner(Scanner scanner, MachineStorage machineStorage) {
        this.scanner = scanner;
        this.machineStorage = machineStorage;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Provide snacks to stock:");
        String snacksLine = scanner.nextLine();
        List<String> snacks = Arrays.stream(snacksLine.split(",")).toList();
        snacks.forEach(snack -> machineStorage.getSnacks().add(snack));
        System.out.println("snacks = " + machineStorage.getSnacks());
    }
}
