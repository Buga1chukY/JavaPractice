package com.knu.buga1chuk.serialization.binary;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.BinaryPersonSerializationService;
import com.knu.buga1chuk.serialization.service.PersonSerializationService;
import com.knu.buga1chuk.service.PersonService;
import com.knu.buga1chuk.util.Base64Utils;
import com.knu.buga1chuk.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

public class ReadPersonBinaryDemo {
    private static final Logger LOG = LoggerFactory.getLogger(ReadPersonBinaryDemo.class);

    public static void main(String[] args) {
        PersonSerializationService personSerializationService = new BinaryPersonSerializationService();
        PersonService personService = new PersonService();
        File file = new File(FilePathConstants.PEOPLE_DATA_BINARY_PATH);

        List<Person> persons = personSerializationService.getPersonListFromFile(file).getPersons();
        List<Person> youngestPersons = personService.getYoungestPerson(persons);

        for (Person young : youngestPersons) {

            int age = young.getAge();
            String city = young.getCity();
            String name = young.getName();

            LOG.info("'{}' from '{}' is the youngest. (age '{}')", name, city, age);
        }

        byte[] fileBytes = FileUtils.readFileToByteArray(file);
        String base64 = Base64Utils.toBase64String(fileBytes);

        LOG.info("Base64 code: '{}'", base64);

        PersonList personList = new PersonList(persons);
        String personListToString = personSerializationService.toString(personList);
        LOG.info("Person List String: '{}'", personListToString);

        PersonList personListFromBase64 = personSerializationService.toPersonList(base64);
        LOG.info("Person list from base64 string: '{}'", personListFromBase64);

    }

}
