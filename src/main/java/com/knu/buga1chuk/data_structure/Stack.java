package com.knu.buga1chuk.data_structure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stack {
    private static final Logger LOG = LoggerFactory.getLogger(Stack.class);

    private static final int INITIAL_SIZE = 10;

    private int countElement = 0;
    private int[] dynamicArray = new int[INITIAL_SIZE];

    /**
     * CreateStackFunction
     */
    public static Stack createStack(int initialSize) {
        Stack stack = new Stack();
        stack.dynamicArray = new int[initialSize];

        return stack;
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
    public int pop() {
        if (countElement - 1 < 0) {
            throw new IllegalStateException("Stack is empty");
        }

        int lastElementIndex = countElement - 1;
        int lastElement = dynamicArray[lastElementIndex];
        dynamicArray[lastElementIndex] = 0;
        countElement--;

        int arraySize = dynamicArray.length;
        int emptyPlaces = arraySize - countElement;
        int half = arraySize / 2;

        if (emptyPlaces > half) {
            int[] newArray = new int[half];

            System.arraycopy(dynamicArray, 0, newArray, 0, countElement);
            dynamicArray = newArray;
        }

        return lastElement;
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
        LOG.info("Output array: '{}'", output);
    }

    /**
     * PeekFunction
     */
    public int peek() {
        int lastElementIndex = countElement - 1;

        return dynamicArray[lastElementIndex];
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
