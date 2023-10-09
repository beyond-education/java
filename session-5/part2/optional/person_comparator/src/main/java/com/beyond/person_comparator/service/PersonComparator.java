package com.beyond.person_comparator.service;

import com.beyond.person_comparator.data.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonComparator {
    public Person getOlderPerson(Person p1, Person p2) {
        return p1.birthdate().isBefore(p2.birthdate())? p1 : p2;
    }
}
