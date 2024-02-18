package com.knu.buga1chuk.serialization.json;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.JsonPersonSerializationService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonJsonDemo {
    public static final JsonPersonSerializationService jsonPersonSerializationService = JsonPersonSerializationService.getInstance();
    public static final PersonService personService = PersonService.getInstance();

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_JSON_PATH);
        List<Person> persons = personService.getAllPersons(10);
        PersonList personList = new PersonList(persons);

        jsonPersonSerializationService.writePersonList(file, personList);
    }
}
