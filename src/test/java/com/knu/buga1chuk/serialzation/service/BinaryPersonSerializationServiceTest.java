package com.knu.buga1chuk.serialzation.service;

import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.BinaryPersonSerializationService;
import com.knu.buga1chuk.util.Base64Utils;
import com.knu.buga1chuk.util.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class BinaryPersonSerializationServiceTest {
    private final BinaryPersonSerializationService binaryPersonSerializationService = new BinaryPersonSerializationService();

    @Test
    void shouldGetPersonListFromFile() {
        File file = new File("target/test-files/peopleTestWithOnePerson.bin");

        Person person = new Person(1, "Ostap", 57, "Vinnitsa");
        List<Person> expected = new ArrayList<>();
        expected.add(person);

        PersonList personList = binaryPersonSerializationService.getPersonListFromFile(file);
        List<Person> actual = personList.getPersons();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetPersonListFromEmptyFile() {
        File file = new File("target/test-files/peopleTestWithEmptyFile.bin");

        List<Person> expected = new ArrayList<>();

        PersonList personList = binaryPersonSerializationService.getPersonListFromFile(file);
        List<Person> actual = personList.getPersons();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonListOnBase64() {
        File file = new File("target/test-files/writeOnePersonToFileTest.bin");

        byte[] fileBytes = FileUtils.readFileToByteArray(file);
        String base64 = Base64Utils.toBase64String(fileBytes);

        Person expected = new Person(1, "Ostap", 17, "Uzhgorod");
        PersonList personList = binaryPersonSerializationService.toPersonList(base64);

        Person actual = personList.getPersons().get(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonListOnEmptyString() {
        File file = new File("target/test-files/peopleTestWithEmptyFile.bin");

        byte[] fileBytes = FileUtils.readFileToByteArray(file);
        String base64 = Base64Utils.toBase64String(fileBytes);

        PersonList personList = binaryPersonSerializationService.toPersonList(base64);

        List<Person> expected = new ArrayList<>();
        List<Person> actual = personList.getPersons();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonListWithNull() {
        List<Person> expected = new ArrayList<>();

        PersonList personList = binaryPersonSerializationService.toPersonList(null);
        List<Person> actual = personList.getPersons();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToStringOnPersonList() {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person(1, "Maga", 22, "Kyiv");
        Person person2 = new Person(2, "Yarik", 22, "Kyiv");

        list.add(person1);
        list.add(person2);

        PersonList personList = new PersonList(list);

        String expected = "PersonList{persons=[Person{id=1, name='Maga', age=22, city='Kyiv'}, Person{id=2, name='Yarik', age=22, city='Kyiv'}]}";
        String actual = binaryPersonSerializationService.toString(personList);

        Assertions.assertEquals(expected, actual);
    }

}
