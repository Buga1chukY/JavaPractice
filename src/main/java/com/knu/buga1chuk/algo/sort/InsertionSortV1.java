package com.knu.buga1chuk.algo.sort;

public class InsertionSortV1 {
    private InsertionSortV1() {
    }

    /**
     * InsertionSort_v1
     */
    public static int[] insertionSortV1(int[] unsortedArray) {

        int i = 0;
        while (i < unsortedArray.length) {
            int counter = 0;

            for (int j : unsortedArray) {
                if (unsortedArray[i] > j) {
                    counter++;
                }
            }

            if (unsortedArray[i] != unsortedArray[counter]) {
                int temp = unsortedArray[counter];
                unsortedArray[counter] = unsortedArray[i];
                unsortedArray[i] = temp;

                if (i != counter) {
                    i--;
                }
            }
            i++;
        }

        return unsortedArray;
    }

}
