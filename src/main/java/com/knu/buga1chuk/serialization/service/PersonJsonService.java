package com.knu.buga1chuk.serialization.service;

import com.google.gson.Gson;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;

import java.io.*;
import java.util.List;

public class PersonJsonService {

    public List<Person> getPersonsFromFile(File file) {
        StringBuilder result = new StringBuilder();
        Gson gson = new Gson();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }

        String allPersonsString = result.toString();
        PersonList persons = gson.fromJson(allPersonsString, PersonList.class);

        return persons.getPersons();
    }

    public void writePersons(File file, PersonList persons) {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter(file)) {

            String personsJson = gson.toJson(persons);
            writer.write(personsJson);

            String messageFormat = "Data is successfully saved to file '%s'";
            String result = String.format(messageFormat, file);
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("IO exception");
            e.printStackTrace();
        }

    }

    public String toJson(Person person) {
        Gson gson = new Gson();
        return gson.toJson(person);
    }

    public Person toPerson(String personJson) {

        Gson gson = new Gson();
        Person person = gson.fromJson(personJson, Person.class);

        int id = person.getId();
        String name = person.getName();
        int age = person.getAge();
        String city = person.getCity();

        return new Person(id, name, age, city);
    }
}
