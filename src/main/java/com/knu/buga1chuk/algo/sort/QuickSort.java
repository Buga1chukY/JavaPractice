package com.knu.buga1chuk.algo.sort;

public class QuickSort {
    private QuickSort() {
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

}
