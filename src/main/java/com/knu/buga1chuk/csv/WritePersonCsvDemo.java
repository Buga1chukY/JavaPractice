package com.knu.buga1chuk.csv;

import com.knu.buga1chuk.serialization.Person;
import com.knu.buga1chuk.service.PersonCsvService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonCsvDemo {

    private static final String PEOPLE_DATA_FILE_PATH = "target/people.csv";

    public static void main(String[] args) {
        File file = new File(PEOPLE_DATA_FILE_PATH);
        PersonService personService = new PersonService();
        PersonCsvService personCsvService = new PersonCsvService();
        List<Person> persons = personService.getAllPersons();
        personCsvService.writePerson(file, persons);
    }
}
