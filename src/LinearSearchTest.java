public class LinearSearchTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();

    }


    public static void test1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 5;

        int actual = SearchUtilities.linearSearch(array, numberToFind);
        int expected = 4;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 1 is pass");
    }

    public static void test2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 20;

        int actual = SearchUtilities.linearSearch(array, numberToFind);
        int expected = 11;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 2 is pass");
    }

    public static void test3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 15;

        int actual = SearchUtilities.linearSearch(array, numberToFind);
        int expected = -1;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 3 is pass");
    }

    public static void test4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};
        int numberToFind = 0;

        int actual = SearchUtilities.linearSearch(array, numberToFind);
        int expected = -1;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 4 is pass");
    }

    public static void test5() {
        int[] array = {};
        int numberToFind = 15;

        int actual = SearchUtilities.linearSearch(array, numberToFind);
        int expected = -1;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 5 is pass");
    }

    public static void test6() {
        int[] array = {99, 55, 13, 18, 34, 15, 73, 89, 32, 47};
        int numberToFind = 15;

        int actual = SearchUtilities.linearSearch(array, numberToFind);
        int expected = 5;

        if (actual != expected) {
            throw new AssertionError("Algo does not work properly");
        }

        System.out.println("Test 6 is pass");
    }

}
