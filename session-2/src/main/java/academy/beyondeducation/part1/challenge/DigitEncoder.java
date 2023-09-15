package academy.beyondeducation.part1.challenge;

public class DigitEncoder extends PasswordEncoder {
    @Override
    protected char applyEncoding(char character) {
        if (Character.isDigit(character)) {
            return '$';
        }
        return character;
    }
}
