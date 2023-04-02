public class SearchUtilities {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20};

        int numberToFind = 10;
        int idx = binarySearch(array1, numberToFind);
        System.out.print("Binary Search Result: ");
        printSearchResult(numberToFind, idx);


        int linearNumberToFind = 20;
        int idxLinear = linearSearch(array1, linearNumberToFind);
        System.out.print("Linear Search Result: ");
        printSearchResult(linearNumberToFind, idxLinear);


    }

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

        while (numberToFind != array[index]) {
            index++;
            if (index == array.length) {
                break;
            }
        }

        int result = 0;

        if (index == array.length) {
            result = -1;
        } else {
            result = index;
        }

        return result;
    }
}
