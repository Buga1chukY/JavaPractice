package com.knu.buga1chuk.serialization.csv;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.CsvPersonSerializationService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonCsvDemo {
    public static final CsvPersonSerializationService csvPersonSerializationService = CsvPersonSerializationService.getInstance();
    public static final PersonService personService = PersonService.getInstance();

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_CSV_PATH);
        List<Person> persons = personService.getAllPersons(10);
        PersonList personList = new PersonList(persons);
        csvPersonSerializationService.writePersonList(file, personList);
    }
}
