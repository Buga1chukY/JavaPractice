package com.knu.buga1chuk.oop_practice.animal_practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog {
    private static final Logger LOG = LoggerFactory.getLogger(Dog.class);

    private final String name;

    public Dog(String birthName) {
        name = birthName;
    }

    public void sound() {
        LOG.info("gow");
    }

    public void dogName() {
        LOG.info(name);
    }

}
