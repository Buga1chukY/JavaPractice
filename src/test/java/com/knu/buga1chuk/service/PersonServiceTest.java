package com.knu.buga1chuk.service;

import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.CsvPersonSerializationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PersonServiceTest {
    private final PersonService personService = new PersonService();
    private final CsvPersonSerializationService csvPersonSerializationService = new CsvPersonSerializationService();

    @Test
    void shouldGetYoungestPerson1() {
        List<Person> youngestPersons = new ArrayList<>();

        Person person1 = new Person(1, "Maga", 22, "Kyiv");
        Person person2 = new Person(2, "Sasha", 21, "Kyiv");
        Person person3 = new Person(3, "Tima", 20, "Kyiv");
        Person person4 = new Person(4, "Yarik", 19, "Kyiv");

        youngestPersons.add(person1);
        youngestPersons.add(person2);
        youngestPersons.add(person3);
        youngestPersons.add(person4);

        List<Person> actual = personService.getYoungestPerson(youngestPersons);
        List<Person> expected = new ArrayList<>();
        expected.add(person4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetYoungestPerson2() {
        List<Person> youngestPersons = new ArrayList<>();

        Person person1 = new Person(1, "Maga", 103, "Kyiv");
        Person person2 = new Person(2, "Sasha", 104, "Kyiv");
        Person person3 = new Person(3, "Tima", 105, "Kyiv");
        Person person4 = new Person(4, "Yarik", 106, "Kyiv");

        youngestPersons.add(person1);
        youngestPersons.add(person2);
        youngestPersons.add(person3);
        youngestPersons.add(person4);

        List<Person> actual = personService.getYoungestPerson(youngestPersons);
        List<Person> expected = new ArrayList<>();
        expected.add(person1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetYoungestPersonOnDuplicate() {
        List<Person> youngestPersons = new ArrayList<>();

        Person person1 = new Person(1, "Maga", 20, "Kyiv");
        Person person2 = new Person(2, "Sasha", 19, "Kyiv");
        Person person3 = new Person(3, "Tima", 20, "Kyiv");
        Person person4 = new Person(4, "Yarik", 19, "Kyiv");

        youngestPersons.add(person1);
        youngestPersons.add(person2);
        youngestPersons.add(person3);
        youngestPersons.add(person4);

        List<Person> actual = personService.getYoungestPerson(youngestPersons);

        Assertions.assertTrue(actual.contains(person4));
        Assertions.assertTrue(actual.contains(person2));
        Assertions.assertEquals(2, actual.size());
    }

    @Test
    void shouldGetYoungestPersonOnEmptyInput() {
        List<Person> youngestPersons = new ArrayList<>();

        List<Person> actual = personService.getYoungestPerson(youngestPersons);
        List<Person> expected = new ArrayList<>();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToCsvRow() {
        CsvPersonSerializationService csvPersonSerializationService = new CsvPersonSerializationService();

        List<Person> list = new ArrayList<>();
        Person person1 = new Person(1, "Maga", 20, "Kyiv");

        list.add(person1);

        PersonList personList = new PersonList(list);

        String expected = "1,Maga,20,Kyiv\n";
        String actual = csvPersonSerializationService.toString(personList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToCsvRowWithEmptyPerson() {
        CsvPersonSerializationService csvPersonSerializationService = new CsvPersonSerializationService();

        List<Person> list = new ArrayList<>();

        Person person1 = new Person(0, "", 0, "");
        list.add(person1);
        PersonList personList = new PersonList(list);


        String expected = "0,,0,\n";
        String actual = csvPersonSerializationService.toString(personList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToCsvRowWithFirstNameAndLastName() {
        CsvPersonSerializationService csvPersonSerializationService = new CsvPersonSerializationService();
        List<Person> list = new ArrayList<>();

        Person person1 = new Person(3, "Yaroslav Bugaichuk", 21, "Kyiv");
        list.add(person1);
        PersonList personList = new PersonList(list);

        String expected = "3,Yaroslav Bugaichuk,21,Kyiv\n";
        String actual = csvPersonSerializationService.toString(personList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPerson() {
        String person = "1,Maga,22,Kyiv";

        Person expected = new Person(1, "Maga", 22, "Kyiv");
        PersonList personList = csvPersonSerializationService.toPersonList(person);
        Person actual = personList.getPersons().get(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonEmptyString() {
        String person = "";

        PersonList personList = new PersonList(new ArrayList<>());
        String expected = personList.toString();
        PersonList actual = csvPersonSerializationService.toPersonList(person);

        Assertions.assertEquals(expected, actual.toString());
    }

}
