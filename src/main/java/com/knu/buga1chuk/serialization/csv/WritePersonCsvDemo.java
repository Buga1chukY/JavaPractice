package com.knu.buga1chuk.serialization.csv;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.PersonSerializationService;
import com.knu.buga1chuk.serialization.service.CsvPersonSerializationService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonCsvDemo {

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_CSV_PATH);
        PersonService personService = new PersonService();
        PersonSerializationService personSerializationService = new CsvPersonSerializationService();
        List<Person> persons = personService.getAllPersons(10);
        PersonList personList = new PersonList(persons);
        personSerializationService.writePersonList(file, personList);
    }
}
