package com.knu.buga1chuk.algo.sort;

public class SelectionSort {
    private SelectionSort() {
    }

    /**
     * SelectionSort
     */
    public static int[] selectionSort(int[] unsortedArray) {

        if (unsortedArray.length == 0) {
            return unsortedArray;
        }

        int min = unsortedArray[0];

        for (int i = 0; i < unsortedArray.length; i++) {

            for (int j = i; j < unsortedArray.length; j++) {
                if (min > unsortedArray[j]) {
                    min = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[i];
                    unsortedArray[i] = min;
                }
            }

            if (i + 1 != unsortedArray.length) {
                min = unsortedArray[i + 1];
            }
        }

        return unsortedArray;
    }

}
