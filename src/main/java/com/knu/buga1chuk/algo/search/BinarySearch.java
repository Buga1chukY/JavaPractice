package com.knu.buga1chuk.algo.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {

    private static final Logger LOG = LoggerFactory.getLogger(BinarySearch.class);

    /**
     * PrintSearchResult
     */
    public static void printSearchResult(int numberToFind, int idx) {
        LOG.info("Element '{}' is located on index '{}'", numberToFind, idx);
    }

    /**
     * BinarySearch
     */
    public static int binarySearch(int[] sortedArray, int numberToFind) {

        int result = -1;
        if (sortedArray.length == 0) {
            return result;
        }

        int minIdx = 0;
        int maxIdx = sortedArray.length - 1;
        int midIdx = (minIdx + maxIdx) / 2;

        while ((numberToFind != sortedArray[midIdx])) {
            if (minIdx == midIdx) {
                break;
            }

            if (numberToFind < sortedArray[midIdx]) {
                maxIdx = midIdx;
                midIdx = (minIdx + maxIdx) / 2;
            } else if (numberToFind > sortedArray[midIdx]) {
                minIdx = midIdx + 1;
                midIdx = (minIdx + maxIdx) / 2;
            }
        }

        if (numberToFind == sortedArray[midIdx]) {
            result = midIdx;
        }

        return result;
    }
}
