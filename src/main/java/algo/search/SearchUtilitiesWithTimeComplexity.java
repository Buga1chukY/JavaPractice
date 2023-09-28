package main.java.algo.search;

public class SearchUtilitiesWithTimeComplexity {

    static int counterBinarySearch = 0;
    static int counterLinearSearch = 0;


    public static void main(String[] args) {

        int[] array = new int[10000 + 1];
        for (int i = 1; i <= 10000; i++) {
            //array[i] = (int) (Math.random() * 100);
            array[i] = i;
        }

        int numberTofind = 5548;

        int Indexnumber = binarySearch(array, numberTofind);
        System.out.println("Index number: " + Indexnumber);
        System.out.println("Time: " + counterBinarySearch);

        int Indexnumber1 = linearSearch(array, numberTofind);
        System.out.println("Index number: " + Indexnumber1);
        System.out.println("Time: " + counterLinearSearch);

    }

    public static int linearSearch(int[] array, int numberToFind) {

        int index = 0;
        int result = -1;
        if (array.length == 0) {
            counterLinearSearch++;
            return result;
        }

        while (numberToFind != array[index]) {
            counterLinearSearch++;

            index++;
            if (index == array.length) {
                counterLinearSearch++;
                return result;
            }
        }

        if (numberToFind == array[index]) {
            counterLinearSearch++;
            result = index;
        }

        return result;
    }


    public static int binarySearch(int[] sortedArray, int numberToFind) {

        int result = -1;
        if (sortedArray.length == 0) {
            counterBinarySearch++;
            return result;
        }

        int minIdx = 0;
        int maxIdx = sortedArray.length - 1;
        int midIdx = (minIdx + maxIdx) / 2;

        while ((numberToFind != sortedArray[midIdx])) {
            counterBinarySearch++;
            if (minIdx == midIdx) {
                counterBinarySearch++;
                break;
            }

            if (numberToFind < sortedArray[midIdx]) {
                counterBinarySearch++;
                maxIdx = midIdx;
                midIdx = (minIdx + maxIdx) / 2;
            } else if (numberToFind > sortedArray[midIdx]) {
                counterBinarySearch++;
                minIdx = midIdx + 1;
                midIdx = (minIdx + maxIdx) / 2;
            }
        }

        if (numberToFind == sortedArray[midIdx]) {
            counterBinarySearch++;
            result = midIdx;
        }

        return result;
    }

}
