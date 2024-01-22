package com.knu.buga1chuk.serialization.json;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.serialization.service.JsonPersonSerializationService;
import com.knu.buga1chuk.serialization.service.PersonSerializationService;
import com.knu.buga1chuk.service.PersonService;
import com.knu.buga1chuk.util.Base64Utils;
import com.knu.buga1chuk.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

public class ReadPersonJsonDemo {

    private static final Logger LOG = LoggerFactory.getLogger(ReadPersonJsonDemo.class);

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_JSON_PATH);

        PersonService personService = new PersonService();
        PersonSerializationService personSerializationService = new JsonPersonSerializationService();

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

    }
}
