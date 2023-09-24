package academy.beyondeducation.part3.examples;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AdvancedSortApplication {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("El", 171), new Person("Emad", 202),
                new Person("Samantha", 165), new Person("Lila", 174));
        List<Person> top2shortest = people.stream()
                .sorted(Comparator.comparingInt(person -> person.height()))
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("top2shortest = " + top2shortest);
        List<Person> top2tallest = people.stream()
                .sorted(Comparator.comparingInt(Person::height).reversed())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("top2tallest = " + top2tallest);
    }
}
