package academy.beyondeducation.java.part2.abstractclasses;

public abstract class PasswordEncoder {
    public String encode(String password){
        String encodedPassword = "";
        char[] characters = password.toCharArray();
        for (char character : characters        ) {
            char encodedCharacter = applyEncoding(character);
            encodedPassword += encodedCharacter;
        }
        return encodedPassword;
    }

    protected abstract char applyEncoding(char character);
}
