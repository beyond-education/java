package com.beyond.retro_bazar_opening.service;

import com.beyond.retro_bazar_opening.data.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        while(!input.equals("4")) {
            printMenu();
            input = getUserInput("Please choose from the menu: ");
            if(input.equals("1")) {
                printItems();
            } else if (input.equals("2")) {
                addItem();
            } else if (input.equals("3")) {
                String itemName = scanner.nextLine();
                try {
                    System.out.print("Please write the item you want to sell: ");
                    sellItem(itemName);
                } catch (NoSuchElementException nsee) {
                    System.out.println("Could not find item " + itemName);
                }
            } else if (!input.equals("4")) {
                System.out.println("Please choose only from 1-4");
            }

        }
    }

    private Item sellItem(String itemName) {
        Item item = bazaarService.removeItem(itemName);
        System.out.println("Sold item " + itemName);
        return item;
    }

    private void addItem() {
        String itemName = getUserInput("Please choose a name: ");
        double price;
        List<Item> compareItem = getItemWithSameName(itemName);
        if(compareItem.size() > 0) {
            price = compareItem.get(0).price();
            bazaarService.saveItem(itemName, price);
        }
        else {
            setItemPriceManuallyAndSave(itemName);
        }
    }

    private void setItemPriceManuallyAndSave(String itemName) {
        double price;
        String itemPrice = getUserInput("Please choose a price: ");
        try {
            price = Double.parseDouble(itemPrice);
            bazaarService.saveItem(itemName, price);
        } catch (Exception e) {
            System.out.println(itemPrice + " was not a number.");
        }
    }

    private List<Item> getItemWithSameName(String itemName) {
        return bazaarService.getItems().stream()
                .filter(item -> item.name().equals(itemName))
                .toList();
    }

    private void printItems() {
        System.out.println("----------------------");
        bazaarService.getItems()
                .stream().collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .entrySet().stream()
                .map(entry ->
                        entry.getValue() == 1 ?
                                entry.getKey().toString()
                                : getCollectedOutputString(entry))
                .forEach(itemString-> System.out.println(itemString));
        System.out.println("----------------------");
    }

    private String getCollectedOutputString(Map.Entry<Item, Long> entry) {
        return entry.getKey().toString() + ", x" + entry.getValue();
    }

    private String getUserInput(String instruction) {
        System.out.print(instruction);
        return scanner.nextLine();
    }

    private void printMenu() {
        System.out.println("1. Display Items");
        System.out.println("2. Add Item");
        System.out.println("3. Sell Item");
        System.out.println("4. exit");
    }
}
