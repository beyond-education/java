package academy.beyondeducation.part1.challenge;

public class LetterAEncoder extends PasswordEncoder {
    @Override
    protected char applyEncoding(char character) {
        char letterA = 'a';
        if (letterA == character) {
            return '#';
        }
        return Character.toUpperCase(character);
    }
}
