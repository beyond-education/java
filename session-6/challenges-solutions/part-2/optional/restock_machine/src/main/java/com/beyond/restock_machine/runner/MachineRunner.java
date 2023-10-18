package com.beyond.restock_machine.runner;

import com.beyond.restock_machine.logic.VendorMachineService;
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
    private final VendorMachineService vendorMachineService;

    public MachineRunner(Scanner scanner, VendorMachineService vendorMachineService) {
        this.scanner = scanner;
        this.vendorMachineService = vendorMachineService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Provide snacks to stock:");
        String snacksLine = scanner.nextLine();
        List<String> snacks = Arrays.stream(snacksLine.split(",")).toList();
        snacks.forEach(snack -> vendorMachineService.add(snack));
        System.out.println("snacks = " + vendorMachineService.getAllSnacks());
        while (!vendorMachineService.getAllSnacks().isEmpty()) {
            System.out.print("Please input a snack code: ");
            String snackCode = scanner.nextLine();
            try {
                int numericCode = Integer.parseInt(snackCode);
                String snack = vendorMachineService.getSnack(numericCode);
                System.out.println("Snack " + snack + " was delivered. Enjoy your snack.");
                System.out.println("Available snacks: " + vendorMachineService.getAllSnacks());
            } catch (NumberFormatException nfe) {
                System.out.println("Please only input numbers!");
            } catch (IndexOutOfBoundsException ioob) {
                int lastIndex = vendorMachineService.getAllSnacks().size() - 1;
                System.out.println("Please choose only valid snack codes " +
                        "(from 0 to " + lastIndex + ")");
            } catch (Exception e) {
                System.out.println("An error occurred, please try it again.");
            }
        }

    }
}
