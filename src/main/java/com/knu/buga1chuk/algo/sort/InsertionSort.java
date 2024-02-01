package com.knu.buga1chuk.algo.sort;

public class InsertionSort {
    private InsertionSort() {
    }

    /**
     * InsertionSort
     */
    public static int[] insertionSort(int[] unsortedArray) {

        for (int i = 1; i < unsortedArray.length; i++) {

            int previousDigit = i - 1;
            int currentFindDigit = unsortedArray[i];

            while ((previousDigit >= 0) && (currentFindDigit < unsortedArray[previousDigit])) {
                int temp = unsortedArray[previousDigit];
                unsortedArray[previousDigit] = unsortedArray[previousDigit + 1];
                unsortedArray[previousDigit + 1] = temp;
                previousDigit--;
            }
        }

        return unsortedArray;
    }

}
