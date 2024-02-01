package com.knu.buga1chuk.serialization.service;

import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CsvPersonSerializationService implements PersonSerializationService {
    private static final Logger LOG = LoggerFactory.getLogger(CsvPersonSerializationService.class);

    @Override
    public void writePersonList(File file, PersonList personList) {

        try (FileWriter writer = new FileWriter(file)) {

            String persons = toString(personList);
            writer.write(persons);
            LOG.info("Data is successfully saved to file '{}'", file);

        } catch (IOException e) {
            LOG.error("An IO exception occurred while writing data to file '{}'. Details: {}", file, e.getMessage());
        }

    }

    @Override
    public PersonList getPersonListFromFile(File file) {
        PersonList personList = new PersonList(new ArrayList<>());

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            String string;

            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
                stringBuilder.append("\n");
            }

            personList = toPersonList(stringBuilder.toString());

        } catch (FileNotFoundException e) {
            LOG.error("File not found");
        } catch (IOException e) {
            LOG.error("An IO exception occurred while writing data to file '{}'. Details: {}", file, e.getMessage());
        }

        return personList;
    }

    @Override
    public PersonList toPersonList(String personsCsvRows) {
        List<Person> list = new ArrayList<>();

        if (personsCsvRows != null) {

            String[] rows = personsCsvRows.split("\n");

            if (!personsCsvRows.isEmpty()) {
                for (String personRow : rows) {

                    String[] parts = personRow.split(",");

                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String city = parts[3];

                    Person person = new Person(id, name, age, city);
                    list.add(person);

                }
            }
        }

        return new PersonList(list);
    }

    @Override
    public String toString(PersonList personList) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Person person : personList.getPersons()) {
            int id = person.getId();
            String name = person.getName();
            int age = person.getAge();
            String city = person.getCity();

            String onePerson = String.format(Person.PERSON_FORMAT, id, name, age, city);

            stringBuilder.append(onePerson);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

}
