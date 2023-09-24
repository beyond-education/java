package academy.beyondeducation.part2.examples;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsPrimitivesApplication {
    public static void main(String[] args) {
        List<String> names = List.of("Tina", "Ron", "Samantha", "Felix", "Thomas", "Laura");
        System.out.println(names);

        List<String> longerNames = names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());
        System.out.println(longerNames);

        List<String> namesStartingWithT = names.stream()
                .filter(name -> name.startsWith("T"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(namesStartingWithT);

        names.stream()
                .filter(name-> name.contains("a"))
                .forEach(name-> System.out.println(name));
    }
}
