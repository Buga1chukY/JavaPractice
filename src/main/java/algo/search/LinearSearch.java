package main.java.algo.search;

public class LinearSearch {

    /**
     * PrintSearchResult
     */
    public static void printSearchResult(int numberToFind, int idx) {
        String messagePattern = "Element %d is located on index %d";
        String result = String.format(messagePattern, numberToFind, idx);
        System.out.println(result);

    }

    /**
     * LinearSearch
     */
    public static int linearSearch(int[] array, int numberToFind) {

        int index = 0;
        int result = -1;
        if (array.length == 0) {
            return result;
        }

        while (numberToFind != array[index]) {

            index++;
            if (index == array.length) {
                return result;
            }
        }

        if (numberToFind == array[index]) {
            result = index;
        }

        return result;
    }
}
