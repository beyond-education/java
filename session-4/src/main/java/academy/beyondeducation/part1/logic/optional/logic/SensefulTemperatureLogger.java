package academy.beyondeducation.part1.logic.optional.logic;

import academy.beyondeducation.part1.logic.challenge.logic.TemperatureLogger;
import academy.beyondeducation.part1.logic.challenge.logic.TemperaturePrompter;

import java.util.List;

public class SensefulTemperatureLogger {
    private final TemperaturePrompter prompter;
    private final TemperatureLogger logger;

    public SensefulTemperatureLogger(TemperaturePrompter prompter, TemperatureLogger logger) {
        this.prompter = prompter;
        this.logger = logger;
    }

    public void log(List<Integer> temperatures) {
        while (true) {
            int temperature = prompter.promptForTemperature();
            try {
                if (temperature < -60 || temperature > 38) {
                    throw new SenselessTemperatureException();
                }
                temperatures.add(temperature);
                return;
            } catch (SenselessTemperatureException senselessTemperatureException) {
                System.out.println("Temperature out of bounds: " + temperature);
            }
        }
    }
}
