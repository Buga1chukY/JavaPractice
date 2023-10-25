package com.knu.buga1chuk.others;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(5);
        int randomNumber2 = random.nextInt(5);

        System.out.println("First random number: " + randomNumber);
        System.out.println("Second random number: " + randomNumber2);

        int result = randomNumber + randomNumber2;
        System.out.println("Sum random number: " + result);
    }

}
