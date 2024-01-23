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
    private static final List<String> NAMES = getNames();
    private static final List<String> CITIES = getCities();

    public Person getRandomPerson() {

        currentPersonId++;
        String name = GeneratorUtils.getRandomElement(NAMES);
        int age = GeneratorUtils.getRandomInt(12, 50);
        String city = GeneratorUtils.getRandomElement(CITIES);

        return new Person(currentPersonId, name, age, city);
    }

    private static List<String> getNames() {
        List<String> names = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FilePathConstants.NAMES_DATASET_PATH))) {
            String name;
            while ((name = reader.readLine()) != null) {
                names.add(name);
            }
        } catch (FileNotFoundException e) {
            LOG.error("There is no such file");
        } catch (IOException e) {
            LOG.error("An error occurred while reading the file: {}", e.getMessage());
        }

        return names;
    }

    private static List<String> getCities() {
        List<String> cities = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FilePathConstants.CITIES_DATASET_PATH))) {
            String city;
            while ((city = reader.readLine()) != null) {
                cities.add(city);
            }
        } catch (FileNotFoundException e) {
            LOG.error("There is no such file");
        } catch (IOException e) {
            LOG.error("An error occurred while reading the cities file: {}", e.getMessage());
        }

        return cities;
    }

}
