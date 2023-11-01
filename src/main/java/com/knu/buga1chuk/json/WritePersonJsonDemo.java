package com.knu.buga1chuk.json;

import com.knu.buga1chuk.serialization.Person;
import com.knu.buga1chuk.serialization.PersonList;
import com.knu.buga1chuk.service.PersonJsonService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonJsonDemo {

    private static final String PEOPLE_DATA_FILE_PATH = "target/people.json";

    public static void main(String[] args) {
        File file = new File(PEOPLE_DATA_FILE_PATH);
        PersonJsonService personJsonService = new PersonJsonService();
        PersonService personService = new PersonService();
        List<Person> persons = personService.getAllPersons();
        PersonList personList = new PersonList(persons);
        personJsonService.writePersons(file, personList);
    }
}
