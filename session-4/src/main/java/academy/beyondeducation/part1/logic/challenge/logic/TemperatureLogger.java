package academy.beyondeducation.part1.logic.challenge.logic;

import java.util.List;

public class TemperatureLogger {
    private final TemperaturePrompter prompter;

    public TemperatureLogger(TemperaturePrompter prompter) {
        this.prompter = prompter;
    }

    public void log(List<Integer> temperatures) {
        int temperature = prompter.promptForTemperature();
        temperatures.add(temperature);
    }
}
