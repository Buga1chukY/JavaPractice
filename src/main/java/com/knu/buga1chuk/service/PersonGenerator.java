package com.knu.buga1chuk.service;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.util.GeneratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonGenerator {

    private static final Logger LOG = LoggerFactory.getLogger(PersonGenerator.class);

    private static int currentPersonId = 0;
    private static final List<String> NAMES = getNames(FilePathConstants.NAMES_DATASET_PATH);
    private static final List<String> CITIES = getCities(FilePathConstants.CITIES_DATASET_PATH);

    public Person getRandomPerson() {

        currentPersonId++;
        String name = GeneratorUtils.getRandomElement(NAMES);
        int age = GeneratorUtils.getRandomInt(12, 50);
        String city = GeneratorUtils.getRandomElement(CITIES);

        return new Person(currentPersonId, name, age, city);
    }

    private static List<String> getNames(String filePath) {
        List<String> names = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String name;
            while ((name = reader.readLine()) != null) {
                names.add(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LOG.error("There is no such file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;
    }

    private static List<String> getCities(String filePath) {
        List<String> cities = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String city;
            while ((city = reader.readLine()) != null) {
                cities.add(city);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LOG.error("There is no such file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cities;
    }

}
