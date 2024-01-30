package com.knu.buga1chuk.algo.sort;

public class BabbleSort {
    private BabbleSort() {
    }

    /**
     * BabbleSort
     */
    public static int[] bubbleSort(int[] unsortedArray) {

        boolean isAll = false;

        while (!isAll) {

            isAll = true;
            int firstDigit = 0;
            int secondDigit = 1;
            int plus;

            for (; ((secondDigit != unsortedArray.length) && (firstDigit != unsortedArray.length)); firstDigit++, secondDigit++) {

                if (unsortedArray[firstDigit] > unsortedArray[secondDigit]) {
                    plus = unsortedArray[firstDigit];
                    unsortedArray[firstDigit] = unsortedArray[secondDigit];
                    unsortedArray[secondDigit] = plus;
                    isAll = false;
                }
            }

        }

        return unsortedArray;
    }

}
