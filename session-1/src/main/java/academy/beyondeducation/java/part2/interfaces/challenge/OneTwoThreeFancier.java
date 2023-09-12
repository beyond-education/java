package academy.beyondeducation.java.part2.interfaces.challenge;

public class OneTwoThreeFancier implements Fancier {
    @Override
    public String fancy(String text) {
        String upperCase = text.toUpperCase();
        return "123" + upperCase + "321";
    }
}
