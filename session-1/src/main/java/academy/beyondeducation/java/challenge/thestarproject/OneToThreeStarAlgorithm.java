package academy.beyondeducation.java.challenge.thestarproject;

public class OneToThreeStarAlgorithm implements StarAlgorithm {
    @Override
    public String apply(String message) {
        String transmission = "";
        int times = 1;
        String[] letters = message.split("");
        for (String letter : letters) {
            String stars = "*".repeat(times);
            transmission += letter + stars;
            times = (times % 3) + 1;
        }
        return transmission.substring(0, transmission.length() - times + 1);
    }
}
