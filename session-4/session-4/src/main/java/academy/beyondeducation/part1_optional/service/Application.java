package academy.beyondeducation.part1_optional.service;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuctionHouseService auctionHouseService = new AuctionHouseService(scanner);
        List<String> items = List.of("Chair", "Vase", "Porzellan", "Figure");
        System.out.println("Pleases make a bit on one of following items: " + items);
        String item = auctionHouseService.getItemToBidOn(items);
        System.out.println("There was a bid on item " + item);
    }
}
