package academy.beyondeducation.java.challenge.theotherstarproject;

public class AscendingCountdown extends CountdownAlgorithm {

    @Override
    protected int calculateLength(int number1, int number2) {
        return number2 - number1 + 1;
    }

    @Override
    protected int next(int number) {
        return number + 1;
    }
}
