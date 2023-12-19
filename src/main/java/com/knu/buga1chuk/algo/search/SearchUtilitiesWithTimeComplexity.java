package com.knu.buga1chuk.algo.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchUtilitiesWithTimeComplexity {

    private static final Logger LOG = LoggerFactory.getLogger(SearchUtilitiesWithTimeComplexity.class);


    static int counterBinarySearch = 0;
    static int counterLinearSearch = 0;


    public static void main(String[] args) {

        int[] array = new int[10000 + 1];
        for (int i = 1; i <= 10000; i++) {
            array[i] = i;
        }

        int numberToFind = 5548;

        int indexNumberBinarySearch = binarySearch(array, numberToFind);
        LOG.info("Index number: {}", indexNumberBinarySearch);
        LOG.info("Binary search took time: {}", counterBinarySearch);

        int indexNumberLinearSearch = linearSearch(array, numberToFind);
        LOG.info("Index number: {}", indexNumberLinearSearch);
        LOG.info("Linear search took time: {}", counterLinearSearch);


    }

    public static int linearSearch(int[] array, int numberToFind) {

        int index = 0;
        int result = -1;
        if (array.length == 0) {
            counterLinearSearch++;
            return result;
        }

        while (numberToFind != array[index]) {
            counterLinearSearch++;

            index++;
            if (index == array.length) {
                counterLinearSearch++;
                return result;
            }
        }

        if (numberToFind == array[index]) {
            counterLinearSearch++;
            result = index;
        }

        return result;
    }


    public static int binarySearch(int[] sortedArray, int numberToFind) {

        int result = -1;
        if (sortedArray.length == 0) {
            counterBinarySearch++;
            return result;
        }

        int minIdx = 0;
        int maxIdx = sortedArray.length - 1;
        int midIdx = (minIdx + maxIdx) / 2;

        while ((numberToFind != sortedArray[midIdx])) {
            counterBinarySearch++;
            if (minIdx == midIdx) {
                counterBinarySearch++;
                break;
            }

            if (numberToFind < sortedArray[midIdx]) {
                counterBinarySearch++;
                maxIdx = midIdx;
                midIdx = (minIdx + maxIdx) / 2;
            } else if (numberToFind > sortedArray[midIdx]) {
                counterBinarySearch++;
                minIdx = midIdx + 1;
                midIdx = (minIdx + maxIdx) / 2;
            }
        }

        if (numberToFind == sortedArray[midIdx]) {
            counterBinarySearch++;
            result = midIdx;
        }

        return result;
    }

}
