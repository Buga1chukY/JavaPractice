package com.knu.buga1chuk.serialization.service;

import com.google.gson.Gson;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonPersonSerializationService implements PersonSerializationService {
    private static final Logger LOG = LoggerFactory.getLogger(JsonPersonSerializationService.class);

    @Override
    public void writePersonList(File file, PersonList personList) {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter(file)) {

            String personsJson = gson.toJson(personList);
            writer.write(personsJson);

            String messageFormat = "Data is successfully saved to file '%s'";
            String result = String.format(messageFormat, file);
            LOG.info(result);

        } catch (IOException e) {
            LOG.error("An IO exception occurred while writing data to file '{}'. Details: {}", file, e.getMessage());
        }

    }

    @Override
    public PersonList getPersonListFromFile(File file) {
        PersonList personList = new PersonList(new ArrayList<>());

        StringBuilder result = new StringBuilder();
        Gson gson = new Gson();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
            }

        } catch (FileNotFoundException e) {
            LOG.error("File not found");
        } catch (IOException e) {
            LOG.error("An IO exception occurred while writing data to file '{}'. Details: {}", file, e.getMessage());
        }

        String allPersonsString = result.toString();

        if (!allPersonsString.isEmpty()) {
            personList = gson.fromJson(allPersonsString, PersonList.class);
        }

        return personList;
    }

    @Override
    public PersonList toPersonList(String personListJson) {
        List<Person> personList = new ArrayList<>();
        Gson gson = new Gson();

        if (personListJson != null && !personListJson.isEmpty()) {
            Person person = gson.fromJson(personListJson, Person.class);
            personList.add(person);
        }
        return new PersonList(personList);
    }

    @Override
    public String toString(PersonList personList) {
        Gson gson = new Gson();
        return gson.toJson(personList);
    }

}
