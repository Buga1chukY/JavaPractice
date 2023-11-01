package com.knu.buga1chuk.data_structure;

public class Queue {

    private static final int INITIAL_SIZE = 5;

    private int countElement = 0;
    private int[] dynamicArray = new int[INITIAL_SIZE];

    public static Queue createQueue(int initialSize) {
        Queue queue = new Queue();
        queue.dynamicArray = new int[initialSize];

        return queue;
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
     * SubtractFirstElementFunction
     */
    public int poll() {
        int firstElement = dynamicArray[0];
        int arraySize = dynamicArray.length;
        int emptyPlaces = arraySize - countElement;
        int half = arraySize / 2;

        if (countElement - 1 < 0) {
            throw new IllegalStateException("Queue is empty");
        }

        if (emptyPlaces >= half) {
            int[] newArray = new int[half];

            System.arraycopy(dynamicArray, 1, newArray, 0, countElement - 1);
            dynamicArray = newArray;
        } else {
            int[] newArray = new int[dynamicArray.length];

            System.arraycopy(dynamicArray, 1, newArray, 0, countElement - 1);
            dynamicArray = newArray;
        }

        countElement--;
        return firstElement;
    }

    /**
     * PeekFunction
     */
    public int peek() {
        return dynamicArray[0];
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

    /**
     * GetCountElementFunction
     */
    public int getCountElement() {
        return countElement;
    }

    /**
     * GetArraySize
     */
    public int getSize() {
        return dynamicArray.length;
    }

}
