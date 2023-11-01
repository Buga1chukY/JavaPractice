package com.knu.buga1chuk.service;

import com.knu.buga1chuk.serialization.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonCsvService {

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
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("IO exception");
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
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }

        return persons;
    }
}
