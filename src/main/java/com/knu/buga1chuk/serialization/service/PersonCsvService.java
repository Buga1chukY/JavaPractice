package com.knu.buga1chuk.serialization.service;

import com.knu.buga1chuk.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class PersonCsvService {
    private static final Logger LOG = LoggerFactory.getLogger(PersonCsvService.class);

    public static String toCsvRow(Person person) {
        int id = person.getId();
        String name = person.getName();
        int age = person.getAge();
        String city = person.getCity();

        String messageFormat = "%d,%s,%d,%s";
        return String.format(messageFormat, id, name, age, city);
    }

    public void writePerson(File file, List<Person> persons) {

        try (FileWriter writer = new FileWriter(file)) {

            for (Person person : persons) {
                String resultPerson = PersonCsvService.toCsvRow(person);
                writer.write(resultPerson + '\n');
            }
            String messageFormat = "Data is successfully saved to file '%s'";
            String result = String.format(messageFormat, file);
            LOG.info(result);

        } catch (IOException e) {
            LOG.error("An IO exception occurred while writing data to file '{}'. Details: {}", file, e.getMessage());
            e.printStackTrace();
        }

    }

    public Person toPerson(String input) {

        String emptyString = "";
        if (emptyString.equals(input)) {
            throw new IllegalStateException("The string is empty");
        }

        String[] parts = input.split(",");

        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int age = Integer.parseInt(parts[2]);
        String city = parts[3];

        return new Person(id, name, age, city);
    }

    public List<Person> getPersonsFromFile(File file) {
        PersonCsvService personCsvService = new PersonCsvService();
        List<Person> persons = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {

                Person person = personCsvService.toPerson(string);
                persons.add(person);
            }
        } catch (FileNotFoundException e) {
            LOG.error("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            LOG.error("An IO exception occurred while writing data to file '{}'. Details: {}", file, e.getMessage());
            e.printStackTrace();
        }

        return persons;
    }
}
