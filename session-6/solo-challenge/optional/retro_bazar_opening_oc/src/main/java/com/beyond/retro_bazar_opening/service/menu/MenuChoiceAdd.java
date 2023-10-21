package com.beyond.retro_bazar_opening.service.menu;

import com.beyond.retro_bazar_opening.data.Item;
import com.beyond.retro_bazar_opening.service.BazaarService;
import com.beyond.retro_bazar_opening.service.UserInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuChoiceAdd implements MenuPoint{

    private final UserInput userInput;
    private final BazaarService bazaarService;

    public MenuChoiceAdd(UserInput userInput, BazaarService bazaarService) {
        this.userInput = userInput;
        this.bazaarService = bazaarService;
    }

    @Override
    public void executeMenuChoice() {
        String itemName = userInput.getUserInput("Please choose a name: ");
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

    @Override
    public String getMenuName() {
        return "Add Item";
    }

    private void setItemPriceManuallyAndSave(String itemName) {
        double price;
        String itemPrice = userInput.getUserInput("Please choose a price: ");
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
}
