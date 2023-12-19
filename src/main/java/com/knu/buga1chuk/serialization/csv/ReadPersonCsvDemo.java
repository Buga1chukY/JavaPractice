package com.knu.buga1chuk.serialization.csv;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.serialization.service.PersonCsvService;
import com.knu.buga1chuk.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

public class ReadPersonCsvDemo {
    private static final Logger LOG = LoggerFactory.getLogger(ReadPersonCsvDemo.class);

    public static void main(String[] args) {

        File file = new File(FilePathConstants.PEOPLE_DATA_CSV_PATH);

        PersonCsvService personCsvService = new PersonCsvService();
        PersonService personService = new PersonService();

        List<Person> persons = personCsvService.getPersonsFromFile(file);
        List<Person> youngestPersons = personService.getYoungestPerson(persons);

        for (Person young : youngestPersons) {

            int age = young.getAge();
            String city = young.getCity();
            String name = young.getName();

            LOG.info("'{}' from '{}' is the youngest. (age '{}')", name, city, age);
        }

    }
}
