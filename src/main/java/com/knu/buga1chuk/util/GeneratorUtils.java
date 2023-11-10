package com.knu.buga1chuk.util;

import java.util.List;
import java.util.Random;

public final class GeneratorUtils {
    private GeneratorUtils() {
    }

    private static final Random RANDOM = new Random();

    public static int getRandomInt(int from, int to) {
        return RANDOM.nextInt(to) + from;
    }

    public static String getRandomElement(List<String> data) {
        int randomInt = RANDOM.nextInt(data.size());
        return data.get(randomInt);
    }

}
