package academy.beyondeducation.part1.logic;

import academy.beyondeducation.part1.logic.exception.WrongChoiceException;

import java.util.List;
import java.util.Scanner;

public class AuctionHouseService {
    private final Scanner scanner;

    public AuctionHouseService(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getBidFromUser() {
        System.out.print("Please make your bid: ");
        int bid = -1;
        while(true) {
            String input = scanner.nextLine();
            try {
                bid = Integer.parseInt(input);
                return bid;
            } catch (Exception e) {
                System.out.println("Please only type in numbers. " + e.getMessage());
            }
        }
    }

    public String getUserChoice(List<String> items) throws WrongChoiceException {
        String input = scanner.nextLine();
        if(!items.contains(input)) {
            throw new WrongChoiceException("The item " + input + " does not exist.", input);
        }
        return input;
    }
}
