package test.java.serialzation;

import main.java.serialization.Person;
import main.java.serialization.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class PersonServiceTest {
    private final PersonService personService = new PersonService();

    @Test
    public void shouldGetYoungestPerson1() {
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
    public void shouldGetYoungestPerson2() {
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
    public void shouldGetYoungestPersonOnDuplicate() {
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
    public void shouldGetYoungestPersonOnEmptyInput() {
        List<Person> youngestPersons = new ArrayList<>();

        List<Person> actual = personService.getYoungestPerson(youngestPersons);
        List<Person> expected = new ArrayList<>();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToCsvRow() {
        Person person1 = new Person(1, "Maga", 20, "Kyiv");

        String expected = "1,Maga,20,Kyiv";
        String actual = PersonService.toCsvRow(person1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToCsvRowWithEmptyPerson() {
        Person person1 = new Person(0, "", 0, "");

        String expected = "0,,0,";
        String actual = PersonService.toCsvRow(person1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToCsvRowWithFirstNameAndLastName() {
        Person person1 = new Person(3, "Yaroslav Bugaichuk", 21, "Kyiv");

        String expected = "3,Yaroslav Bugaichuk,21,Kyiv";
        String actual = PersonService.toCsvRow(person1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToPerson() {
        String person = "1,Maga,22,Kyiv";

        Person expected = new Person(1, "Maga", 22, "Kyiv");
        Person actual = personService.toPerson(person);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToPersonEmptyString() {
        String person = "";

        String expected = "The string is empty";
        String actual = "";

        try {
            personService.toPerson(person);
        } catch (IllegalStateException e) {
            actual = e.getMessage();
        }
        Assertions.assertEquals(expected, actual);
    }

}
