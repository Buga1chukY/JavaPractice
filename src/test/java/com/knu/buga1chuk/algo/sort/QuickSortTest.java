package com.knu.buga1chuk.algo.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class QuickSortTest {

    @Test
    void test1() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 10, 11, 4};

        int[] actualArray = QuickSort.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    void test2() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 6, 10, 11, 4};

        int[] actualArray = QuickSort.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 20};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    void test3() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 6, 10, 0, 11, 4};

        int[] actualArray = QuickSort.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 20};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    void test4() {
        int[] unsortedArray = {};

        int[] actualArray = QuickSort.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    void test5() {
        int[] unsortedArray = {0, 0, 0, 0, 0, 0};

        int[] actualArray = QuickSort.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {0, 0, 0, 0, 0, 0};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    void test6() {
        int[] unsortedArray = {0, 1, 5, -4, 9, 7};

        int[] actualArray = QuickSort.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {-4, 0, 1, 5, 7, 9};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

}
