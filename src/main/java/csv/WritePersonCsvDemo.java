package main.java.csv;

import main.java.serialization.Person;
import main.java.serialization.PersonService;

import java.util.List;

public class WritePersonCsvDemo {

    private static final String PEOPLE_DATA = "people.csv";

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<Person> persons = personService.getAllPersons();
        personService.writePerson(PEOPLE_DATA, persons);
    }
}
