package com.knu.buga1chuk.json;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.service.PersonJsonService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonJsonDemo {

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_JSON_PATH);
        PersonJsonService personJsonService = new PersonJsonService();
        PersonService personService = new PersonService();
        List<Person> persons = personService.getAllPersons(10);
        PersonList personList = new PersonList(persons);
        personJsonService.writePersons(file, personList);
    }
}
