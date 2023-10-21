package com.beyond.retro_bazar_opening.service.menu;

import com.beyond.retro_bazar_opening.data.Item;
import com.beyond.retro_bazar_opening.service.BazaarService;
import com.beyond.retro_bazar_opening.service.UserInput;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class MenuChoiceSell implements MenuPoint{
    private final UserInput userInput;
    private final BazaarService bazaarService;

    public MenuChoiceSell(UserInput userInput, BazaarService bazaarService) {
        this.userInput = userInput;
        this.bazaarService = bazaarService;
    }

    @Override
    public void executeMenuChoice() {
        String itemName = userInput.getUserInput("Please write the item you want to sell: ");
        try {
            sellItem(itemName);
        } catch (NoSuchElementException nsee) {
            System.out.println("Could not find item " + itemName);
        }
    }

    @Override
    public String getMenuName() {
        return "Sell item";
    }

    private Item sellItem(String itemName) throws NoSuchElementException{
        Item item = bazaarService.removeItem(itemName);
        System.out.println("Sold item " + itemName);
        return item;
    }
}
