package com.knu.buga1chuk.csv;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.service.PersonCsvService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonCsvDemo {

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_CSV_PATH);
        PersonService personService = new PersonService();
        PersonCsvService personCsvService = new PersonCsvService();
        List<Person> persons = personService.getAllPersons(10);
        personCsvService.writePerson(file, persons);
    }
}
