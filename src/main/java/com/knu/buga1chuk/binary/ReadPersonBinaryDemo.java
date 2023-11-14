package com.knu.buga1chuk.binary;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.service.PersonBinaryService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class ReadPersonBinaryDemo {

    public static void main(String[] args) {
        PersonBinaryService personBinaryService = new PersonBinaryService();
        PersonService personService = new PersonService();
        File file = new File(FilePathConstants.PEOPLE_DATA_BINARY_PATH);

        List<Person> persons = personBinaryService.getPersonFromFile(file);
        List<Person> youngestPersons = personService.getYoungestPerson(persons);

        for (Person young : youngestPersons) {

            String messageFormat = "'%s' from '%s' is the youngest. (age '%d')";

            int age = young.getAge();
            String city = young.getCity();
            String name = young.getName();

            String result = String.format(messageFormat, name, city, age);

            System.out.println(result);
        }


    }
}
