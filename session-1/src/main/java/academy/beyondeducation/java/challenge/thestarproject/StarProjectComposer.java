package academy.beyondeducation.java.challenge.thestarproject;

public class StarProjectComposer {
    public String compose(StarInput input, StarAlgorithm algorithm) {
        String transmission = input.title();
        transmission += ": ";
        transmission += algorithm.apply(input.message());
        return transmission;
    }
}
