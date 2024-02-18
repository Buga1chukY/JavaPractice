package com.knu.buga1chuk.serialization.json;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.serialization.service.JsonPersonSerializationService;
import com.knu.buga1chuk.service.PersonService;
import com.knu.buga1chuk.util.Base64Utils;
import com.knu.buga1chuk.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

public class ReadPersonJsonDemo {

    private static final Logger LOG = LoggerFactory.getLogger(ReadPersonJsonDemo.class);
    public static final JsonPersonSerializationService jsonPersonSerializationService = JsonPersonSerializationService.getInstance();
    public static final PersonService personService = PersonService.getInstance();
    public static final FileUtils fileUtils = FileUtils.getInstance();
    public static final Base64Utils base64Utils = Base64Utils.getInstance();



    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_JSON_PATH);

        List<Person> persons = jsonPersonSerializationService.getPersonListFromFile(file).getPersons();
        List<Person> youngestPersons = personService.getYoungestPerson(persons);

        for (Person young : youngestPersons) {

            int age = young.getAge();
            String city = young.getCity();
            String name = young.getName();

            LOG.info("'{}' from '{}' is the youngest. (age '{}')", name, city, age);
        }

        byte[] fileBytes = fileUtils.readFileToByteArray(file);
        String base64 = base64Utils.toBase64String(fileBytes);
        LOG.info("Base64 code: '{}'", base64);

    }
}
