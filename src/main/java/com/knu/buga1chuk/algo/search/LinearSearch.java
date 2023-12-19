package com.knu.buga1chuk.algo.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinearSearch {

    private static final Logger LOG = LoggerFactory.getLogger(LinearSearch.class);

    /**
     * PrintSearchResult
     */
    public static void printSearchResult(int numberToFind, int idx) {
        LOG.info("Element {} is located on index {}", numberToFind, idx);
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
