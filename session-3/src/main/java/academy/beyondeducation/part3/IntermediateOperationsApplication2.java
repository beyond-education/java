package academy.beyondeducation.part3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class IntermediateOperationsApplication2 {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Martin", 186), new Person("Dietmar", 172),
                new Person("Lal", 180), new Person("El", 171));
        System.out.println("people = " + people);
        Optional<Person> shortestPerson = people.stream()
                .sorted(Comparator.comparingInt(person -> person.height()))
                .findFirst();
        if (shortestPerson.isPresent()) {
            System.out.println("The shortest person is: " + shortestPerson.get());
        }
        Optional<Person> tallestPerson = people.stream()
                .sorted(Comparator.comparingInt(Person::height).reversed())
                .findFirst();
        if (tallestPerson.isPresent()) {
            System.out.println("The tallest person is: " + tallestPerson.get());
        }
    }
}
