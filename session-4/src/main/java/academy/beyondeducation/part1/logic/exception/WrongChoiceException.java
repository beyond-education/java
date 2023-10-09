package academy.beyondeducation.part1.logic.exception;

public class WrongChoiceException extends Exception {
    final String item;
    public WrongChoiceException(String s, String item) {
        super(s);
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
