package com.knu.buga1chuk.algo.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void test1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 5;

        int actual = BinarySearch.binarySearch(array, numberToFind);
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 20;

        int actual = BinarySearch.binarySearch(array, numberToFind);
        int expected = 11;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 1;

        int actual = BinarySearch.binarySearch(array, numberToFind);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 2;

        int actual = BinarySearch.binarySearch(array, numberToFind);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 0;

        int actual = BinarySearch.binarySearch(array, numberToFind);
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test6() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 21;

        int actual = BinarySearch.binarySearch(array, numberToFind);
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test7() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 12;

        int actual = BinarySearch.binarySearch(array, numberToFind);
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void test8() {
        int[] array = {};
        int numberToFind = 12;

        int actual = BinarySearch.binarySearch(array, numberToFind);
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }
}
