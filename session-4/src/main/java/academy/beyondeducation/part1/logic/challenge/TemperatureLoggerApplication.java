package academy.beyondeducation.part1.logic.challenge;

import academy.beyondeducation.part1.logic.challenge.logic.TemperatureLogger;
import academy.beyondeducation.part1.logic.challenge.logic.TemperaturePrompter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperatureLoggerApplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperaturePrompter temperaturePrompter = new TemperaturePrompter(scanner);
        TemperatureLogger temperatureLogger = new TemperatureLogger(temperaturePrompter);
        List<Integer> temperatures = new ArrayList<>();
        System.out.println("temperatures before log = " + temperatures);
        temperatureLogger.log(temperatures);
        System.out.println("temperatures after log = " + temperatures);
    }
}
