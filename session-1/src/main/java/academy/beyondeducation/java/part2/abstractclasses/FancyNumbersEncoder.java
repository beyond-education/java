package academy.beyondeducation.java.part2.abstractclasses;

public class FancyNumbersEncoder extends PasswordEncoder {
    @Override
    protected char applyEncoding(char character) {
        if (Character.isDigit(character)) {
            return '$';
        }
        return character;
    }
}
