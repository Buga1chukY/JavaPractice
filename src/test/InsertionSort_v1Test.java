package test;

import main.AssertUtilities;
import main.SortUtilities;

public class InsertionSort_v1Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    public static void test1() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 10, 11, 4};

        int[] actualArray = SortUtilities.insertionSort_v1(unsortedArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 1 is pass");
    }

    public static void test2() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 6, 10, 11, 4};

        int[] actualArray = SortUtilities.insertionSort_v1(unsortedArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 20};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 2 is pass");
    }

    public static void test3() {
        int[] unsortedArray = {1, 6, 8, 9, 6, 10, 0};

        int[] actualArray = SortUtilities.insertionSort_v1(unsortedArray);
        int[] expectedArray = {0, 1, 6, 6, 8, 9, 10};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 3 is pass");
    }

    public static void test4() {
        int[] unsortedArray = {};

        int[] actualArray = SortUtilities.insertionSort_v1(unsortedArray);
        int[] expectedArray = {};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 4 is pass");
    }

    public static void test5() {
        int[] unsortedArray = {0, 0, 0, 0, 0, 0};

        int[] actualArray = SortUtilities.insertionSort_v1(unsortedArray);
        int[] expectedArray = {0, 0, 0, 0, 0, 0};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 5 is pass");
    }

    public static void test6() {
        int[] unsortedArray = {30, 45, 0, 45, 100, 45, 45};

        int[] actualArray = SortUtilities.insertionSort_v1(unsortedArray);
        int[] expectedArray = {0, 30, 45, 45, 45, 45, 100};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 6 is pass");
    }
}
