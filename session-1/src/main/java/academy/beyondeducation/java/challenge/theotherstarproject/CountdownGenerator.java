package academy.beyondeducation.java.challenge.theotherstarproject;

public class CountdownGenerator {
    public String generate(Numbers numbers, CountdownAlgorithm algorithm) {
        String countdown = "";
        int[] sequence = algorithm.generate(numbers.number1(), numbers.number2());
        for (int number : sequence) {
            String digit = String.valueOf(number);
            countdown += digit + ", ";
        }
        return countdown + "go!";
    }
}
