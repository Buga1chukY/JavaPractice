package main.java.csv;

import main.java.serialization.Person;
import main.java.serialization.PersonService;

import java.util.List;

public class ReadPersonCsvDemo {
    private static final String PEOPLE_DATA = "people.csv";

    public static void main(String[] args) {

        PersonService personService = new PersonService();
        List<Person> persons = personService.getPersonsFromFile(PEOPLE_DATA);

        List<Person> youngestPersons = personService.getYoungestPerson(persons);

        for (Person young : youngestPersons) {

            String messageFormat = "'%s' from '%s' is the youngest. (age '%d')";

            int age = young.getAge();
            String city = young.getCity();
            String name = young.getName();

            String result = String.format(messageFormat, name, city, age);

            System.out.println(result);
        }

    }
}
