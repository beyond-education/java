package academy.beyondeducation.java.challenge.thestarproject;

public class OneStarAlgorithm implements StarAlgorithm {
    @Override
    public String apply(String message) {
        String[] letters = message.split("");
        return String.join("*", letters);
    }
}
