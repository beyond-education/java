package academy.beyondeducation.part1_optional.exception;

public class ItemDoesNotExist extends Exception {
    private final String chosenItem;

    public ItemDoesNotExist(String chosenItem) {
        this.chosenItem = chosenItem;
    }

    public String getChosenItem() {
        return chosenItem;
    }
}
