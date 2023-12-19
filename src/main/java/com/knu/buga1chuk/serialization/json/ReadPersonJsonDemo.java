package com.knu.buga1chuk.serialization.json;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.serialization.service.PersonJsonService;
import com.knu.buga1chuk.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

public class ReadPersonJsonDemo {

    private static final Logger LOG = LoggerFactory.getLogger(ReadPersonJsonDemo.class);

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_JSON_PATH);

        PersonService personService = new PersonService();
        PersonJsonService personJsonService = new PersonJsonService();

        List<Person> persons = personJsonService.getPersonsFromFile(file);
        List<Person> youngestPersons = personService.getYoungestPerson(persons);

        for (Person young : youngestPersons) {

            int age = young.getAge();
            String city = young.getCity();
            String name = young.getName();

            LOG.info("'{}' from '{}' is the youngest. (age '{}')", name, city, age);
        }
    }
}
