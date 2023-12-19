package com.knu.buga1chuk.serialization.service;

import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;

public class PersonBinaryService {
    private static final Logger LOG = LoggerFactory.getLogger(PersonBinaryService.class);

    public void writePerson(File file, List<Person> persons) {
        PersonList personList = new PersonList(persons);

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personList);

        } catch (IOException e) {
            LOG.error("An IO exception occurred while writing data to file '{}'. Details: {}", file, e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Person> getPersonFromFile(File file) {
        PersonList personList;

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            personList = (PersonList) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        } catch (ClassNotFoundException e) {
            LOG.error("There is no such class. {}", e.getMessage());
            e.printStackTrace();
            throw new IllegalStateException(e);
        }

        return personList.getPersons();
    }

}
