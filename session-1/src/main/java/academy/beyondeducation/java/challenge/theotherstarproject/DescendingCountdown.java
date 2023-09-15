package academy.beyondeducation.java.challenge.theotherstarproject;

public class DescendingCountdown extends CountdownAlgorithm {
    @Override
    protected int calculateLength(int number1, int number2) {
        return number1 - number2 + 1;
    }

    @Override
    protected int next(int number) {
        return number - 1;
    }
}
