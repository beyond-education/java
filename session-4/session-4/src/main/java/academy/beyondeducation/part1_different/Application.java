package academy.beyondeducation.part1_different;

import academy.beyondeducation.part1_different.service.ConsoleReader;
import academy.beyondeducation.part1_different.service.MathService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleReader consoleReader = new ConsoleReader(scanner);
        MathService mathService = new MathService();
        System.out.println("mathService.getFaculty(consoleReader.getUserInput()) = "
                + mathService.getFaculty(consoleReader.getUserInput()));
    }
}
