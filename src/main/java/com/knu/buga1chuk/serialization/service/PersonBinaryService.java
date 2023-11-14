package com.knu.buga1chuk.serialization.service;

import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;

import java.io.*;
import java.util.List;

public class PersonBinaryService {

    public void writePerson(File file, List<Person> persons) {
        PersonList personList = new PersonList(persons);

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personList);

        } catch (IOException e) {
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
            System.out.println("There is no such class");
            e.printStackTrace();
            throw new IllegalStateException(e);
        }

        return personList.getPersons();
    }

}
