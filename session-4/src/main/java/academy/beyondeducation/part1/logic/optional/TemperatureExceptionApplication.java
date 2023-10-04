package academy.beyondeducation.part1.logic.optional;

import academy.beyondeducation.part1.logic.challenge.logic.TemperatureLogger;
import academy.beyondeducation.part1.logic.challenge.logic.TemperaturePrompter;
import academy.beyondeducation.part1.logic.optional.logic.SensefulTemperatureLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperatureExceptionApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperaturePrompter prompter = new TemperaturePrompter(scanner);
        TemperatureLogger logger = new TemperatureLogger(prompter);
        SensefulTemperatureLogger sensefulLogger = new SensefulTemperatureLogger(prompter, logger);
        List<Integer> temperatures = new ArrayList<>();
        System.out.println("temperatures = " + temperatures);
        sensefulLogger.log(temperatures);
        System.out.println("temperatures = " + temperatures);
    }
}
