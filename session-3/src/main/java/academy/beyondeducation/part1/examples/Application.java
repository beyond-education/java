package academy.beyondeducation.part1.examples;

import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        int number = 7;
        NumberTransformator transformator = n -> n * 10;
        System.out.println("transformedNumber = " + transformator.transform(number));
    }
}
