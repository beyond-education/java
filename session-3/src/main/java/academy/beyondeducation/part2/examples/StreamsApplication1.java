package academy.beyondeducation.part2.examples;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication1 {
    public static void main(String[] args) {
        List<String> names = List.of("Martin", "Dietmar", "Lal", "Guillermo");
        // names.stream()
//        String[] array = new String[4];
//         Stream.of(array)
        System.out.println("names = " + names);
        List<String> shortNames = names.stream()
                .filter(name-> name.length() <=6)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("names = " + names);
        System.out.println("shortNames = " + shortNames);

    }
}
