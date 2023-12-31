package academy.beyondeducation.part3.optional.data;

public record Coin(CointType cointType, int value) {
    @Override
    public String toString() {
        return "Coin{" +
                "cointType=" + cointType +
                ", value=" + value +
                '}';
    }
}
