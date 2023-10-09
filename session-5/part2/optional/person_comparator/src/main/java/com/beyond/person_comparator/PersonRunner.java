package com.beyond.person_comparator;

import com.beyond.person_comparator.data.Person;
import com.beyond.person_comparator.service.PersonComparator;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PersonRunner implements ApplicationRunner {

    private final PersonComparator personComparator;

    public PersonRunner(PersonComparator personComparator) {
        this.personComparator = personComparator;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person p1 = new Person(LocalDate.of(1990, 1, 1), "p1");
        Person p2 = new Person(LocalDate.of(1991, 1, 1), "p2");
        System.out.println("personComparator = " + personComparator.getOlderPerson(p1, p2).name());
    }
}
