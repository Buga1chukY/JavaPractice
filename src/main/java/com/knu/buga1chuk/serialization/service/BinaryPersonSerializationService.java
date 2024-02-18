package com.knu.buga1chuk.serialization.service;

import com.knu.buga1chuk.model.PersonList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;

public class BinaryPersonSerializationService implements PersonSerializationService {
    private static final Logger LOG = LoggerFactory.getLogger(BinaryPersonSerializationService.class);
    private static BinaryPersonSerializationService instance;

    private BinaryPersonSerializationService() {
    }

    public static BinaryPersonSerializationService getInstance() {
        if (instance == null) {
            instance = new BinaryPersonSerializationService();
        }
        return instance;
    }

    @Override
    public void writePersonList(File file, PersonList personList) {

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personList);
        } catch (IOException e) {
            LOG.error("An IO exception occurred while writing data to file '{}'. Details: {}", file, e.getMessage());
        }
    }

    @Override
    public PersonList getPersonListFromFile(File file) {
        PersonList personList = new PersonList(new ArrayList<>());

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            personList = (PersonList) ois.readObject();
        } catch (EOFException e) {
            LOG.error("The file is empty: {}", e.getMessage());
        } catch (IOException e) {
            LOG.error("An error occurred during deserialization: {}", e.getMessage());
        } catch (ClassNotFoundException e) {
            LOG.error("There is no such class. {}", e.getMessage());
        }

        return personList;
    }

    @Override
    public PersonList toPersonList(String base64) {
        PersonList personList = new PersonList(new ArrayList<>());

        if (base64 != null && !base64.isEmpty()) {
            byte[] decode = Base64.getDecoder().decode(base64);

            try (ByteArrayInputStream bis = new ByteArrayInputStream(decode);
                 ObjectInputStream ois = new ObjectInputStream(bis)) {

                personList = (PersonList) ois.readObject();

            } catch (IOException | ClassNotFoundException e) {
                LOG.error("During the base64 converting the error was raised: ", e);
            }
        }

        return personList;
    }

    @Override
    public String toString(PersonList personList) {
        return personList.toString();
    }

}
