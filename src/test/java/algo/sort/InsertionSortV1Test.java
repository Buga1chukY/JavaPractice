package test.java.algo.sort;

import main.java.algo.sort.InsertionSortV1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortV1Test {

    @Test
    public void test1() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 10, 11, 4};

        int[] actualArray = InsertionSortV1.insertionSortV1(unsortedArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test2() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 6, 10, 11, 4};

        int[] actualArray = InsertionSortV1.insertionSortV1(unsortedArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 20};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test3() {
        int[] unsortedArray = {1, 6, 8, 9, 6, 10, 0};

        int[] actualArray = InsertionSortV1.insertionSortV1(unsortedArray);
        int[] expectedArray = {0, 1, 6, 6, 8, 9, 10};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test4() {
        int[] unsortedArray = {};

        int[] actualArray = InsertionSortV1.insertionSortV1(unsortedArray);
        int[] expectedArray = {};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test5() {
        int[] unsortedArray = {0, 0, 0, 0, 0, 0};

        int[] actualArray = InsertionSortV1.insertionSortV1(unsortedArray);
        int[] expectedArray = {0, 0, 0, 0, 0, 0};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test6() {
        int[] unsortedArray = {30, 45, 0, 45, 100, 45, 45};

        int[] actualArray = InsertionSortV1.insertionSortV1(unsortedArray);
        int[] expectedArray = {0, 30, 45, 45, 45, 45, 100};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }
}