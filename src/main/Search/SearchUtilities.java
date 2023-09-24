package main.Search;

public class SearchUtilities {

    /**
     * PrintSearchResult
     */
    public static void printSearchResult(int numberToFind, int idx) {
        String messagePattern = "Element %d is located on index %d";
        String result = String.format(messagePattern, numberToFind, idx);
        System.out.println(result);

    }

    /**
     * BinarySearch
     */
    public static int binarySearch(int[] sortedArray, int numberToFind) {

        int result = -1;
        if (sortedArray.length == 0) {
            return result;
        }

        int minIdx = 0;
        int maxIdx = sortedArray.length - 1;
        int midIdx = (minIdx + maxIdx) / 2;

        while ((numberToFind != sortedArray[midIdx])) {
            if (minIdx == midIdx) {
                break;
            }

            if (numberToFind < sortedArray[midIdx]) {
                maxIdx = midIdx;
                midIdx = (minIdx + maxIdx) / 2;
            } else if (numberToFind > sortedArray[midIdx]) {
                minIdx = midIdx + 1;
                midIdx = (minIdx + maxIdx) / 2;
            }
        }

        if (numberToFind == sortedArray[midIdx]) {
            result = midIdx;
        }

        return result;
    }

    /**
     * LinearSearch
     */
    public static int linearSearch(int[] array, int numberToFind) {

        int index = 0;
        int result = -1;
        if (array.length == 0) {
            return result;
        }

        while (numberToFind != array[index]) {

            index++;
            if (index == array.length) {
                return result;
            }
        }

        if (numberToFind == array[index]) {
            result = index;
        }

        return result;
    }
}
