package com.knu.buga1chuk.interfaces_practice.service.impl;

import com.knu.buga1chuk.interfaces_practice.model.Alien;
import com.knu.buga1chuk.interfaces_practice.service.AlienInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlienInfoServiceImpl implements AlienInfoService {
    private static final Logger LOG = LoggerFactory.getLogger(AlienInfoServiceImpl.class);

    private static AlienInfoServiceImpl instance;

    public AlienInfoServiceImpl() {
    }

    public static AlienInfoServiceImpl getInstance() {
        if (instance == null) {
            instance = new AlienInfoServiceImpl();
        }
        return instance;
    }

    @Override
    public void showInfo(Alien alien) {
        LOG.info("My name is: '{}'. I am from galaxy!", alien.getId());
    }

    @Override
    public void greetings() {
        LOG.info("Hello, i'm from galaxy!");
    }

    @Override
    public void sleep() {
        LOG.info("I'm alien and i'm not sleeping at all");
    }
}
