package academy.beyondeducation.part1.service;

import java.util.Scanner;

public class AuctionHouseService {
    private final Scanner scanner;

    public AuctionHouseService(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getInputBid(){
        int bidAmount = -1;
        while (true) {
            String userInput = scanner.nextLine();
            try {
                bidAmount = Integer.parseInt(userInput);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Please input only numbers. " + nfe.getMessage());
            }
        }

        return bidAmount;
    }
}
