package main.java.algo.search;

public class BinerySearch {
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
}
