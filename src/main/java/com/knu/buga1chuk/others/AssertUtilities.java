package com.knu.buga1chuk.others;

import java.util.Arrays;

public class AssertUtilities {

    public static void assertEquals(int[] actualArray, int[] expectedArray) {
        if (!Arrays.equals(actualArray, expectedArray)) {
            String actualArrayToString = Arrays.toString(actualArray);
            String expectedArrayToString = Arrays.toString(expectedArray);

            String messageFormat = "\n\nActual does not equal to expected:\nActual = %s\nExpected = %s\n";
            String message = String.format(messageFormat, actualArrayToString, expectedArrayToString);
            throw new AssertionError(message);
        }
    }

    public static void assertEquals(int actual, int expected) {
        if (actual != expected) {
            String messageFormat = "\n\nActual does not equal to expected:\nActual = %d\nExpected = %d\n";
            String message = String.format(messageFormat, actual, expected);
            throw new AssertionError(message);
        }
    }

    public static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            String messageFormat = "\n\nActual does not equal to expected:\nActual = %s\nExpected = %s\n";
            String message = String.format(messageFormat, actual, expected);
            throw new AssertionError(message);
        }
    }

    public static void fail() {
        throw new AssertionError();
    }
}
