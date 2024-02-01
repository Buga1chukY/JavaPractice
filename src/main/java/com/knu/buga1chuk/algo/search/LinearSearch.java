package com.knu.buga1chuk.algo.search;

public class LinearSearch {
    private LinearSearch() {
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
