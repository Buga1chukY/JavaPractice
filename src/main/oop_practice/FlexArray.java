package main.oop_practice;

public class FlexArray {

    private final static int INITIAL_SIZE = 5;

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

            for (int j = 0; j < dynamicArray.length; j++) {
                newArray[j] = dynamicArray[j];
            }
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

            for (int i = 0; i < countElement; i++) {
                newArray[i] = dynamicArray[i];
            }

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
        System.out.println(output);
    }

    //Сделать функцию, которая удаляет элементы с начала массива.
}
