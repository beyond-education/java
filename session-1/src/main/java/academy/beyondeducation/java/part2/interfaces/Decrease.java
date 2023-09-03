package academy.beyondeducation.java.part2.interfaces;

public class Decrease implements Operation{
    @Override
    public double perform(double original, double amount) {
        return original - amount;
    }
}
