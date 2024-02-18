package com.knu.buga1chuk.serialzation.service;

import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.CsvPersonSerializationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class CsvPersonSerializationServiceTest {
    public static final CsvPersonSerializationService csvPersonSerializationService = CsvPersonSerializationService.getInstance();

    @Test
    void shouldGetPersonListFromFile() {
        File file = new File("target/test-files/peopleTestWithOnePerson.csv");

        Person person = new Person(1, "Tima", 46, "Zhytomyr");
        List<Person> expected = new ArrayList<>();
        expected.add(person);

        PersonList personList = csvPersonSerializationService.getPersonListFromFile(file);
        List<Person> actual = personList.getPersons();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetPersonListFromEmptyFile() {
        File file = new File("target/test-files/peopleTestWithEmptyFile.csv");

        List<Person> expected = new ArrayList<>();

        PersonList personList = csvPersonSerializationService.getPersonListFromFile(file);
        List<Person> actual = personList.getPersons();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonListOnString() {
        String personString = "1,Maga,22,Kyiv";

        Person expected = new Person(1, "Maga", 22, "Kyiv");
        PersonList personList = csvPersonSerializationService.toPersonList(personString);

        Person actual = personList.getPersons().get(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonListOnEmptyString() {
        String personString = "";

        PersonList personList = csvPersonSerializationService.toPersonList(personString);

        List<Person> expected = new ArrayList<>();
        List<Person> actual = personList.getPersons();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonListWithNull() {
        List<Person> expected = new ArrayList<>();

        PersonList personList = csvPersonSerializationService.toPersonList(null);
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

        String expected = "1,Maga,22,Kyiv\n2,Yarik,22,Kyiv\n";
        String actual = csvPersonSerializationService.toString(personList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToStringWithEmptyPersonList() {
        PersonList personList = new PersonList(new ArrayList<>());

        String expected = "";
        String actual = csvPersonSerializationService.toString(personList);

        Assertions.assertEquals(expected, actual);
    }


}
