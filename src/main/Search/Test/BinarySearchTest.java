package main.Search.Test;

import main.Search.SearchUtilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 5;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 20;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = 11;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 1;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 2;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 0;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test6() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 21;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test7() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 12;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test8() {
        int[] array = {};
        int numberToFind = 12;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = -1;

        Assertions.assertEquals(actual, expected);
    }
}
