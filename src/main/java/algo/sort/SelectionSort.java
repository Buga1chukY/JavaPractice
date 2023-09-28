package main.java.algo.sort;

public class SelectionSort {

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
