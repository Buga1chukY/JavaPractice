package com.knu.buga1chuk.json;

import com.knu.buga1chuk.serialization.Person;
import com.knu.buga1chuk.service.PersonJsonService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class ReadPersonJsonDemo {
    private static final String PEOPLE_DATA_FILE_PATH = "target/people.json";

    public static void main(String[] args) {
        File file = new File(PEOPLE_DATA_FILE_PATH);

        PersonService personService = new PersonService();
        PersonJsonService personJsonService = new PersonJsonService();

        List<Person> persons = personJsonService.getPersonsFromFile(file);
        List<Person> youngestPersons = personService.getYoungestPerson(persons);

        for (Person young : youngestPersons) {
            String messageFormat = "'%s' from '%s' is the youngest. (age '%d')";

            int age = young.getAge();
            String city = young.getCity();
            String name = young.getName();

            String youngestPersonMessage = String.format(messageFormat, name, city, age);
            System.out.println(youngestPersonMessage);
        }
    }
}
