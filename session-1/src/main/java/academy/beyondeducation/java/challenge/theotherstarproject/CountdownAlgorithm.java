package academy.beyondeducation.java.challenge.theotherstarproject;

public abstract class CountdownAlgorithm {
    public int[] generate(int number1, int number2) {
        int length = calculateLength(number1, number2);
        int[] sequence = new int[length];
        int number = number1;
        for (int index = 0; index < length; index++) {
            sequence[index] = number;
            number = next(number);
        }
        return sequence;
    }

    protected abstract int calculateLength(int number1, int number2);

    protected abstract int next(int number);
}
