public class BinarySearchTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();

    }

    public static void test1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 5;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = 4;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 1 is pass");
    }

    public static void test2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 20;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = 11;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 2 is pass");
    }

    public static void test3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 1;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = 0;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 3 is pass");
    }

    public static void test4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 2;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = 1;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 4 is pass");
    }

    public static void test5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 0;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = -1;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 5 is pass");
    }

    public static void test6() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 21;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = -1;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 6 is pass");
    }

    public static void test7() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 12;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = -1;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 7 is pass");
    }

    public static void test8() {
        int[] array = {};
        int numberToFind = 12;

        int actual = SearchUtilities.binarySearch(array, numberToFind);
        int expected = -1;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 8 is pass");
    }
}
