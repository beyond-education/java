package academy.beyondeducation.part1.optional;

import academy.beyondeducation.part1.challenge.PasswordEncoder;

public class VowelEncoder extends PasswordEncoder {
    private final String vowels = "aeiouAEIOU";

    @Override
    protected char applyEncoding(char character) {
        String string = Character.toString(character);
        if (vowels.contains(string)) {
            return '@';
        }
        return character;
    }
}
