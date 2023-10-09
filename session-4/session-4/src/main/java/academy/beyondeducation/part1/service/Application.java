package academy.beyondeducation.part1.service;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuctionHouseService auctionHouseService = new AuctionHouseService(scanner);
        System.out.print("Please input your bid: ");
        System.out.println("User has made following bid: " + auctionHouseService.getInputBid());
    }
}
