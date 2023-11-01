package com.knu.buga1chuk.service;

import com.knu.buga1chuk.serialization.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonJsonServiceTest {

    @Test
    void toPersonTest() {
        PersonJsonService personJsonService = new PersonJsonService();
        String personString = "{\"id\":1,\"name\":\"Maga\",\"age\":22,\"city\":\"Kyiv\"}";

        Person expected = new Person(1, "Maga", 22, "Kyiv");
        Person actual = personJsonService.toPerson(personString);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void toJsonTest() {
        PersonJsonService personJsonService = new PersonJsonService();
        Person person = new Person(1, "Maga", 22, "Kyiv");

        String expected = "{\"id\":1,\"name\":\"Maga\",\"age\":22,\"city\":\"Kyiv\"}";
        String actual = personJsonService.toJson(person);

        Assertions.assertEquals(expected, actual);
    }
}
