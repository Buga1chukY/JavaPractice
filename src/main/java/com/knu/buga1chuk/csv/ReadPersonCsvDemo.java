package com.knu.buga1chuk.csv;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.service.PersonCsvService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class ReadPersonCsvDemo {

    public static void main(String[] args) {

        File file = new File(FilePathConstants.PEOPLE_DATA_CSV_PATH);

        PersonCsvService personCsvService = new PersonCsvService();
        PersonService personService = new PersonService();

        List<Person> persons = personCsvService.getPersonsFromFile(file);
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
