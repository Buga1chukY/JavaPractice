package com.knu.buga1chuk.serialization.binary;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.serialization.service.PersonBinaryService;
import com.knu.buga1chuk.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

public class ReadPersonBinaryDemo {
    private static final Logger LOG = LoggerFactory.getLogger(ReadPersonBinaryDemo.class);

    public static void main(String[] args) {
        PersonBinaryService personBinaryService = new PersonBinaryService();
        PersonService personService = new PersonService();
        File file = new File(FilePathConstants.PEOPLE_DATA_BINARY_PATH);

        List<Person> persons = personBinaryService.getPersonFromFile(file);
        List<Person> youngestPersons = personService.getYoungestPerson(persons);

        for (Person young : youngestPersons) {

            int age = young.getAge();
            String city = young.getCity();
            String name = young.getName();

            LOG.info("'{}' from '{}' is the youngest. (age '{}')", name, city, age);
        }


    }
}
