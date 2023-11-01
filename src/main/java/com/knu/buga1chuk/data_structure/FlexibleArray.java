package com.knu.buga1chuk.data_structure;

public class FlexibleArray {

    private static final int INITIAL_SIZE = 5;

    private int countElement = 0;
    private int[] dynamicArray = new int[INITIAL_SIZE];

    public int getCountElement() {
        return countElement;
    }

    /**
     * AddElementFunction
     */
    public void addElemnt(int element) {

        int arraySize = dynamicArray.length;
        if (arraySize == countElement) {

            int newSize = arraySize * 2;
            int[] newArray = new int[newSize];

            System.arraycopy(dynamicArray, 0, newArray, 0, dynamicArray.length);
            dynamicArray = newArray;
            dynamicArray[countElement] = element;
            countElement++;
        } else {
            dynamicArray[countElement] = element;
            countElement++;
        }
    }

    /**
     * SubtractElementFunction
     */
    public int subtractElement() {
        int lastElementIndex = countElement - 1;
        int lastElement = dynamicArray[lastElementIndex];
        dynamicArray[lastElementIndex] = 0;
        countElement--;

        int arraySize = dynamicArray.length;
        int emptyPlaces = arraySize - countElement;
        int half = arraySize / 2;

        if (emptyPlaces >= half) {
            int[] newArray = new int[half];

            if (countElement >= 0) System.arraycopy(dynamicArray, 0, newArray, 0, countElement);
            dynamicArray = newArray;
        }

        return lastElement;
    }

    /**
     * SubtractFirstElementFunction
     */
    public int subtractFirstElement() {
        int firstElement = dynamicArray[0];
        int arraySize = dynamicArray.length;
        int emptyPlaces = arraySize - countElement;
        int half = arraySize / 2;

        if (emptyPlaces >= half) {
            int[] newArray = new int[half];

            if (countElement - 1 >= 0) System.arraycopy(dynamicArray, 1, newArray, 0, countElement - 1);
            dynamicArray = newArray;
        } else {
            int[] newArray = new int[dynamicArray.length];

            if (countElement - 1 >= 0) System.arraycopy(dynamicArray, 1, newArray, 0, countElement - 1);
            dynamicArray = newArray;
        }

        countElement--;
        return firstElement;
    }

    /**
     * PrintArrayFunction
     */
    public void print() {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < countElement; i++) {
            output.append(dynamicArray[i]);

            if (i != countElement - 1) {
                output.append(", ");
            }
        }
        System.out.println(output);
    }

}
