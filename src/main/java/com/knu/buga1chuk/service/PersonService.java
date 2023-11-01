package com.knu.buga1chuk.service;

import com.knu.buga1chuk.serialization.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<>();

        Person person1 = new Person(1, "Maga", 22, "Kyiv");
        Person person2 = new Person(2, "Sasha", 21, "Kyiv");
        Person person3 = new Person(3, "Tima", 20, "Kyiv");
        Person person4 = new Person(4, "Yarik", 19, "Kyiv");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        return persons;
    }

    public List<Person> getYoungestPerson(List<Person> persons) {
        List<Person> youngestPersons = new ArrayList<>();

        if (persons.isEmpty()) {
            return youngestPersons;
        }

        int currentPersonAge;
        int previousPersonAge = persons.get(0).getAge();

        for (Person person : persons) {
            currentPersonAge = person.getAge();
            if (currentPersonAge < previousPersonAge) {
                previousPersonAge = currentPersonAge;

                youngestPersons.clear();
                youngestPersons.add(person);
            } else if (currentPersonAge == previousPersonAge) {
                youngestPersons.add(person);
            }
        }

        return youngestPersons;
    }

}
