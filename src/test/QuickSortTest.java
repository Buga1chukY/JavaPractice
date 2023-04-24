package test;

import main.AssertUtilities;
import main.SortUtilities;

public class QuickSortTest {
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

        int[] actualArray = SortUtilities.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 1 is pass");
    }

    public static void test2() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 6, 10, 11, 4};

        int[] actualArray = SortUtilities.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 20};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 2 is pass");
    }

    public static void test3() {
        int[] unsortedArray = {1, 3, 2, 20, 5, 7, 6, 8, 9, 6, 10, 0, 11, 4};

        int[] actualArray = SortUtilities.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 20};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 3 is pass");
    }

    public static void test4() {
        int[] unsortedArray = {};

        int[] actualArray = SortUtilities.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 4 is pass");
    }

    public static void test5() {
        int[] unsortedArray = {0, 0, 0, 0, 0, 0};

        int[] actualArray = SortUtilities.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {0, 0, 0, 0, 0, 0};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 5 is pass");
    }

    public static void test6() {
        int[] unsortedArray = {0, 1, 5, -4, 9, 7};

        int[] actualArray = SortUtilities.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        int[] expectedArray = {-4, 0, 1, 5, 7, 9};

        AssertUtilities.assertEquals(actualArray, expectedArray);

        System.out.println("Test 6 is pass");
    }

}
