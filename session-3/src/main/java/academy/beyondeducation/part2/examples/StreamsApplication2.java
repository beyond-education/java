package academy.beyondeducation.part2.examples;

import java.util.List;

public class StreamsApplication2 {
    public static void main(String[] args) {
        List<String> names = List.of("Martin", "Dietmar", "Lal", "Guillermo");
        names.stream()
                .filter(name-> name.length() <=6 && name.contains("i"))
                .map(name-> name.toUpperCase())
                .forEach(name -> System.out.println(name));
        // Start: collection.stream() / Streams.of() // Arrays.stream()
        // Intermediate operations: filter, map
        // Terminal operations: collect, forEach
    }
}
