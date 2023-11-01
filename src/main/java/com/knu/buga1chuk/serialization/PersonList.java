package com.knu.buga1chuk.serialization;

import java.io.Serializable;
import java.util.List;

public class PersonList implements Serializable {
    private final List<Person> persons;

    public PersonList(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "persons=" + persons +
                '}';
    }
}
