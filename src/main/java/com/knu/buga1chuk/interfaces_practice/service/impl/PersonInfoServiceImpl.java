package com.knu.buga1chuk.interfaces_practice.service.impl;

import com.knu.buga1chuk.interfaces_practice.model.Person;
import com.knu.buga1chuk.interfaces_practice.service.PersonInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonInfoServiceImpl implements PersonInfoService {
    private static final Logger LOG = LoggerFactory.getLogger(PersonInfoServiceImpl.class);

    private static PersonInfoServiceImpl instance;

    public PersonInfoServiceImpl() {
    }

    public static PersonInfoServiceImpl getInstance() {
        if (instance == null) {
            instance = new PersonInfoServiceImpl();
        }
        return instance;
    }

    @Override
    public void greetings() {
        LOG.info("Hello!");
    }

    @Override
    public void sleep() {
        LOG.info("I am person and i am sleeping");
    }

    @Override
    public void showInfo(Person person) {
        LOG.info("My name is: '{}'", person.getName());
    }
}
