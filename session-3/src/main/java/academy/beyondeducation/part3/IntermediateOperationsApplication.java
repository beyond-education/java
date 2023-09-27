package academy.beyondeducation.part3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntermediateOperationsApplication {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 6, 1, 4, 3, 7, 8, 9, 0);
        // display the biggest 3 numbers, after skipping the first 2
        List<Integer> smallest3 = numbers.stream()
                .skip(2)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("smallest3 = " + smallest3);
        // display the smallest number, after skipping the first 3
        Optional<Integer> optionalSmallestNumber = numbers.stream()
                .skip(3)
                .sorted()
                .findFirst();
        if(optionalSmallestNumber.isEmpty()){
            System.out.println("There were no numbers!");
        } else {
            Integer smallest = optionalSmallestNumber.get();
            System.out.println("smallest = " + smallest);
        }
    }
}
