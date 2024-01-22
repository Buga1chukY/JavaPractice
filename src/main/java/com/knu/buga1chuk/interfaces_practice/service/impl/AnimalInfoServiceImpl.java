package com.knu.buga1chuk.interfaces_practice.service.impl;

import com.knu.buga1chuk.interfaces_practice.model.Animal;
import com.knu.buga1chuk.interfaces_practice.service.AnimalInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalInfoServiceImpl implements AnimalInfoService {
    private static final Logger LOG = LoggerFactory.getLogger(AnimalInfoServiceImpl.class);

    @Override
    public void greetings() {
        LOG.info("Wouw");
    }

    @Override
    public void sleep() {
        LOG.info("I am animal and i am sleeping");
    }

    @Override
    public void showInfo(Animal animal) {
        LOG.info("Id is: '{}'", animal.getId());
    }
}
