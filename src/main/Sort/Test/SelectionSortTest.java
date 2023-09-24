package main.Sort.Test;

import main.Sort.SortUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void test1() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 10, 11, 4};

        int[] actualArray = SortUtilities.selectionSort(unsortedArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test2() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 6, 10, 11, 4};

        int[] actualArray = SortUtilities.selectionSort(unsortedArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 20};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test3() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 6, 10, 0, 11, 4};

        int[] actualArray = SortUtilities.selectionSort(unsortedArray);
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 20};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test4() {
        int[] unsortedArray = {};

        int[] actualArray = SortUtilities.selectionSort(unsortedArray);
        int[] expectedArray = {};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void test5() {
        int[] unsortedArray = {0, 0, 0, 0, 0, 0};

        int[] actualArray = SortUtilities.selectionSort(unsortedArray);
        int[] expectedArray = {0, 0, 0, 0, 0, 0};

        Assertions.assertArrayEquals(actualArray, expectedArray);
    }
}
