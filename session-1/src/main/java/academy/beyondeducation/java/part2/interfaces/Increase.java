package academy.beyondeducation.java.part2.interfaces;

public class Increase implements Operation{
    @Override
    public double perform(double original, double amount) {
        return original + amount;
    }
}
