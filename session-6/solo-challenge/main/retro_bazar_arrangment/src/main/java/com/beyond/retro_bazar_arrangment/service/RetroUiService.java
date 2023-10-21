package com.beyond.retro_bazar_arrangment.service;

import com.beyond.retro_bazar_arrangment.data.Item;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class RetroUiService {
    private final Scanner scanner;
    private final BazaarService bazaarService;

    public RetroUiService(Scanner scanner, BazaarService bazaarService) {
        this.scanner = scanner;
        this.bazaarService = bazaarService;
    }

    public void showMenu() {
        String input = "";
        while(!input.equals("3")) {
            printMenu();
            input = getUserInput("Please choose from the menu: ");
            if(input.equals("1")) {
                printItems();
            } else if (input.equals("2")) {
                addItem();
            } else if (!input.equals("3")) {
                System.out.println("Please choose only from 1-3");
            }

        }
    }

    private void addItem() {
        String itemName = getUserInput("Please choose a name: ");
        String itemPrice = getUserInput("Please choose a price: ");
        try {
            double price = Double.parseDouble(itemPrice);
            bazaarService.saveItem(itemName, price);
        } catch (Exception e) {
            System.out.println(itemPrice + " was not a number.");
        }
    }

    private void printItems() {
        System.out.println("----------------------");
        bazaarService.getItems().forEach(item-> System.out.println(item));
        System.out.println("----------------------");
    }

    private String getUserInput(String instruction) {
        System.out.print(instruction);
        return scanner.nextLine();
    }

    private void printMenu() {
        System.out.println("1. Display Items");
        System.out.println("2. Add Item");
        System.out.println("3. exit");
    }
}
