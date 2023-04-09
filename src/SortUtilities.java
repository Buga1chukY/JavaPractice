public class SortUtilities {
    public static void main(String[] args) {

        int[] array1 = {7, 26, 6, 8, 32, 18, 115, 9, 1, 21, 2};
        int[] array2 = {333, 26, 123, 8, 222, 18, 115, 777, 1, 21, 2};
        int[] array3 = {3, 26, 6, 464, 32, 555, 115, 9, 1, 78, 2};
        int[] array4 = {3, 26, 444, 464, 32, 26, 999, 115, 0, 666, 0, 2};

        int[] sortedArray1 = bubbleSort(array1);
        int[] sortedArray2 = selectionSort(array2);
        int[] sortedArray3 = insertionSort_v1(array3);
        int[] sortedArray4 = insertionSort(array4);

        printArray(sortedArray1);
        printArray(sortedArray2);
        printArray(sortedArray3);
        printArray(sortedArray4);
    }

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
        int plus = 0;

        for (int i = 0; i < unsortedArray.length; i++) {
            int counter = 0;

            for (int j = 0; j < unsortedArray.length; j++) {
                if (unsortedArray[i] > unsortedArray[j]) {
                    counter++;
                }
            }

            if (unsortedArray[i] != unsortedArray[counter]) {
                plus = unsortedArray[counter];
                unsortedArray[counter] = unsortedArray[i];
                unsortedArray[i] = plus;

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

        int plus = 0;
        for (int i = 1; i < unsortedArray.length; i++) {

            int previousDigit = i - 1;
            int currentFindDigit = unsortedArray[i];

            while ((previousDigit >= 0) && (currentFindDigit < unsortedArray[previousDigit])) {
                plus = unsortedArray[previousDigit];
                unsortedArray[previousDigit] = unsortedArray[previousDigit + 1];
                unsortedArray[previousDigit + 1] = plus;
                previousDigit--;
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
