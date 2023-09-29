package academy.beyondeducation.part1_optional.service;

import academy.beyondeducation.part1_optional.exception.ItemDoesNotExist;

import java.util.List;
import java.util.Scanner;

public class AuctionHouseService {
    private final Scanner scanner;

    public AuctionHouseService(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getItemToBidOn(List<String> items) {
        while(true) {
            try{
                String item = getItem(items);
                return item;
            } catch (ItemDoesNotExist ine) {
                System.out.println("Item " + ine.getChosenItem() + " does not exist. Please choose one of the following items: " + items);
            }
        }
    }

    private String getItem(List<String> items) throws ItemDoesNotExist {
        String item = scanner.nextLine();
        if (!items.contains(item)) {
            throw new ItemDoesNotExist(item);
        }
        return item;
    }
}
