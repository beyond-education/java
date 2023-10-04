package academy.beyondeducation.part1.logic.challenge.logic;

import java.util.Scanner;

public class TemperaturePrompter {
    private final Scanner scanner;

    public TemperaturePrompter(Scanner scanner) {
        this.scanner = scanner;
    }

    public int promptForTemperature() {
        while (true) {
            System.out.print("Current temperature: ");
            String input = scanner.nextLine();
            try {
                int temperature = Integer.parseInt(input);
                return temperature;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Temperature provided is not a number.");
            }
        }
    }

}
