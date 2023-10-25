package com.knu.buga1chuk.algo.sort;

public class InsertionSortV1 {

    /**
     * InsertionSort_v1
     */
    public static int[] insertionSortV1(int[] unsortedArray) {

        for (int i = 0; i < unsortedArray.length; i++) {
            int counter = 0;

            for (int j = 0; j < unsortedArray.length; j++) {
                if (unsortedArray[i] > unsortedArray[j]) {
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
        }

        return unsortedArray;
    }

    /**
     * PrintSortResult
     */
    public static void printArray(int[] array) {

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
}
