package academy.beyondeducation;

import academy.beyondeducation.part1.logic.AuctionHouseService;
import academy.beyondeducation.part1.logic.exception.WrongChoiceException;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Go Beyond.");
        Scanner scanner = new Scanner(System.in);
        AuctionHouseService auctionHouseService =
                new AuctionHouseService(scanner);
//        int bid = auctionHouseService.getBidFromUser();
//        System.out.println("The user has made the bid " + bid);
        String userChoice = "";
        try {
            userChoice =
                    auctionHouseService.getUserChoice(List.of("Chair", "Vase", "Porcelain"));
        } catch (WrongChoiceException wce) {
            System.out.println("You chose " + wce.getItem() + " which is not in the list.");
        }
        System.out.println("userChoice = " + userChoice);


    }
}