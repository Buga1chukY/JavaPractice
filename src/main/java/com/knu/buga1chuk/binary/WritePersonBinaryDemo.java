package com.knu.buga1chuk.binary;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.service.PersonBinaryService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonBinaryDemo {

    public static void main(String[] args) {
        PersonBinaryService personBinaryService = new PersonBinaryService();
        File file = new File(FilePathConstants.PEOPLE_DATA_BINARY_PATH);

        PersonService personService = new PersonService();
        List<Person> persons = personService.getAllPersons(5);

        personBinaryService.writePerson(file, persons);
    }
}
