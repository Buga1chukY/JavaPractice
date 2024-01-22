package com.knu.buga1chuk.serialization.service;

import com.knu.buga1chuk.model.PersonList;

import java.io.File;

public interface PersonSerializationService {

    void writePersonList(File file, PersonList personList);

    PersonList getPersonListFromFile(File file);

    PersonList toPersonList(String input);

    String toString(PersonList personList);

}
