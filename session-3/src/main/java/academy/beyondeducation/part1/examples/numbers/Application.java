package academy.beyondeducation.part1.examples.numbers;

public class Application {
    public static void main(String[] args) {
        NumberTransformer numberTransformer = number -> number + 10;
        int result = numberTransformer.transform(7);
        System.out.println("result = " + result);
    }
}
