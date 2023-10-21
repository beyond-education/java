package com.beyond.retro_bazar_opening.service;

import com.beyond.retro_bazar_opening.service.menu.MenuPoint;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetroUiService {
    private final UserInput userInput;

    private final List<MenuPoint> menuPoints;

    public RetroUiService(UserInput userInput, List<MenuPoint> menuPoints) {
        this.userInput = userInput;
        this.menuPoints = menuPoints;
    }

    public void showMenu() {
        int chosenMenu = 0;
        while (chosenMenu != menuPoints.size() + 1) {
            printMenu();
            String input = userInput.getUserInput("Please choose from the menu: ");
            try {
                chosenMenu = Integer.parseInt(input);
                if(chosenMenu <= menuPoints.size() && chosenMenu > 0) {
                    menuPoints.get(chosenMenu-1).executeMenuChoice();
                } else if (chosenMenu != menuPoints.size()+1) {
                    System.out.println("Please choose only from 1-4");
                }
            } catch (Exception e) {
                System.out.println("Please choose only from 1-4");
            }
        }
    }

    private void printMenu() {
        for (int i = 0; i < menuPoints.size(); i++) {
            MenuPoint menuPoint = menuPoints.get(i);
            System.out.println((i+1) + ". " + menuPoint.getMenuName());
        }
        System.out.println((menuPoints.size()+1) + ". Exit");
    }
}
