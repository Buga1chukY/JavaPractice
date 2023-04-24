package main;

public class SortUtilities {

    /**
     * BabbleSort
     */
    public static int[] bubbleSort(int[] unsortedArray) {

        boolean isAll = false;

        while (isAll == false) {

            isAll = true;
            int firstDigit = 0;
            int secondDigit = 1;
            int plus = 0;

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
     * InsertionSort_v1
     */
    public static int[] insertionSort_v1(int[] unsortedArray) {

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

    /**
     * QuickSort
     */
    public static int[] quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return array;
        }

        int averageIndex = partition(array, left, right);
        quickSort(array, left, averageIndex - 1);
        quickSort(array, averageIndex, right);
        return array;
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[left];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }
        return left;
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
