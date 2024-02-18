package com.knu.buga1chuk.serialzation.service;

import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.CsvPersonSerializationService;
import com.knu.buga1chuk.serialization.service.JsonPersonSerializationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class JsonPersonSerializationServiceTest {
    public static final JsonPersonSerializationService jsonPersonSerializationService = JsonPersonSerializationService.getInstance();

    @Test
    void shouldToPersonListFromString() {
        String personString = "{\"id\":1,\"name\":\"Maga\",\"age\":22,\"city\":\"Kyiv\"}";

        Person expected = new Person(1, "Maga", 22, "Kyiv");
        PersonList personList = jsonPersonSerializationService.toPersonList(personString);

        Person actual = personList.getPersons().get(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToJsonFromPersonList() {
        List<Person> list = new ArrayList<>();
        Person person = new Person(1, "Maga", 22, "Kyiv");
        list.add(person);

        PersonList personList = new PersonList(list);


        String expected = "{\"persons\":[{\"id\":1,\"name\":\"Maga\",\"age\":22,\"city\":\"Kyiv\"}]}";
        String actual = jsonPersonSerializationService.toString(personList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonListWithNull() {
        List<Person> expected = new ArrayList<>();

        PersonList personList = jsonPersonSerializationService.toPersonList(null);
        List<Person> actual = personList.getPersons();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldToPersonListWithEmptyString() {
        List<Person> expected = new ArrayList<>();

        String string = "";
        PersonList personList = jsonPersonSerializationService.toPersonList(string);
        List<Person> actual = personList.getPersons();

        Assertions.assertEquals(expected, actual);
    }
}
