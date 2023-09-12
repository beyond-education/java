package academy.beyondeducation.java.part2.interfaces.challenge;

public class BigSmallBigFancier implements Fancier {
    @Override
    public String fancy(String text) {
        String first = text.substring(0, 1);
        String last = text.substring(text.length() - 1, text.length());
        String middle = text.substring(1, text.length() - 1);
        first = first.toUpperCase();
        last = last.toUpperCase();
        middle = middle.toLowerCase();
        return first + middle + last;
    }
}
