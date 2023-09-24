package academy.beyondeducation.part3.examples;

import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperatorsApplication {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 0, 2, 9, 3, 8, 4, 7, 6);
        System.out.println(numbers);
        List<Integer> sorted = numbers.stream()
                .skip(1)
                .sorted()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
