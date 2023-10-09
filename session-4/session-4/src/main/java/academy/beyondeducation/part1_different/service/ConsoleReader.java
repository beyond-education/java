package academy.beyondeducation.part1_different.service;

import academy.beyondeducation.part1_different.constants.MathConstants;
import academy.beyondeducation.part1_different.exception.NotIdealNumberException;

import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getUserInput() {
        System.out.print("Please type in a number: ");
        String userInput;
        int parsedUserInput;
        while(true) {
            try {
                userInput = scanner.nextLine();
                parsedUserInput = Integer.parseInt(userInput);
                if(parsedUserInput < MathConstants.MIN_NUMBER){
                    throw new NotIdealNumberException("The given number is not ideal for calculations");
                }
                return parsedUserInput;
            } catch (NumberFormatException nfe) {
                System.out.println("Please type in only numbers. " + nfe.getMessage());
            } catch (NotIdealNumberException e) {
                System.out.println("Please use only numbers above 0");
            }
        }

    }
}
