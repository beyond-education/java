package academy.beyondeducation.java.part2.abstractclasses;

public class VowelNumbersEncoder extends PasswordEncoder {
    @Override
    protected char applyEncoding(char character) {
        char letterA = 'a';
        if (letterA == character) {
            return '#';
        }
        return Character.toUpperCase(character);
    }
}
