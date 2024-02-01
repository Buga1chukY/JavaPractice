package com.knu.buga1chuk.service;

import com.knu.buga1chuk.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public List<Person> getAllPersons(int numberOfPersons) {

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < numberOfPersons; i++) {
            Person person = PersonGenerator.getRandomPerson();

            persons.add(person);
        }

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
