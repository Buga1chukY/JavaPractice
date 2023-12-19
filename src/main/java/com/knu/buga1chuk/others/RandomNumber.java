package com.knu.buga1chuk.others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class RandomNumber {
    private static final Logger LOG = LoggerFactory.getLogger(RandomNumber.class);


    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(5);
        int randomNumber2 = random.nextInt(5);

        LOG.info("First random number: {}", randomNumber);
        LOG.info("Second random number: {}", randomNumber);

        int result = randomNumber + randomNumber2;
        LOG.info("Sum random number: {}", result);
    }

}
