package main;

import java.util.Arrays;

public class FlexibleArray {

    static int countElement = 0;
    static int[] arrayS = new int[5];


    public static void main(String[] args) {

        int elementsCount = 10;
        int[] array10 = new int[elementsCount];
        for (int i = 0; i < elementsCount; i++) {
            array10[i] = i;
        }

        for (int i = 0; i < array10.length; i++) {
            int currentElement = array10[i];
            addElemnt(currentElement);
        }
        print();


        int currentElement = 0;
        subtractElement(currentElement);
        print();

    }

    /**
     * AddElementFunction
     */
    public static void addElemnt(int element) {

        int arraySize = arrayS.length;
        if (arraySize == countElement) {

            int newSize = arraySize * 2;
            int[] newArray = new int[newSize];

            for (int j = 0; j < arrayS.length; j++) {
                newArray[j] = arrayS[j];
            }
            arrayS = newArray;
            arrayS[countElement] = element;
            countElement++;
        } else {
            arrayS[countElement] = element;
            countElement++;
        }

    }

    /**
     * SubtractElementFunction
     */
    public static void subtractElement(int element) {
        int arraySize = arrayS.length;
        countElement--;

        for (int i = arrayS.length; i > 0; i--) {
            if (countElement + 1 == (double) arrayS.length / 2) {
                int newSize = arraySize / 2;
                int[] newArray = new int[newSize];

                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = arrayS[j];
                }
                arrayS = newArray;
                arrayS[countElement] = element;
            } else {
                arrayS[countElement] = element;
                countElement--;
            }
        }

    }

    /**
     * PrintArrayFunction
     */
    public static void print() {
        String array1 = Arrays.toString(arrayS);
        System.out.println(array1);
    }
}


