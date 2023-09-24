package academy.beyondeducation.part3.examples;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindFirstApplication {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 0, 2, 9, 3, 8, 4, 7, 6);
        System.out.println(numbers);
        Optional<Integer> smallest = numbers.stream()
                .skip(1)
                .sorted()
                .limit(5)
                .findFirst();
        if (smallest.isPresent()) {
            Integer biggestNumber = smallest.get();
            System.out.println("smallestNumber = " + biggestNumber);
        } else {
            System.out.println("There is no smallest number");
        }

        Optional<Integer> biggest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst();
        if (biggest.isPresent()) {
            System.out.println("The biggest number is: " + biggest.get());
        }
    }
}
