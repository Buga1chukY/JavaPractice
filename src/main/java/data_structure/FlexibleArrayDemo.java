package main.java.data_structure;

import java.util.Arrays;

public class FlexibleArrayDemo {

    public static void main(String[] args) {

        FlexibleArray flexArray = new FlexibleArray();
        int elementsCount = 11;
        int[] inputArray = new int[elementsCount];

        for (int i = 0; i < elementsCount; i++) {
            inputArray[i] = i + 1;
        }

        String output = Arrays.toString(inputArray);
        System.out.println(output);

        for (int i = 0; i < inputArray.length; i++) {
            int currentElement = inputArray[i];
            flexArray.addElemnt(currentElement);
        }
        flexArray.print();

        int removedElement = flexArray.subtractElement();
        System.out.println(removedElement);
        flexArray.print();

        int removedFirstElement = flexArray.subtractFirstElement();
        System.out.println(removedFirstElement);
        flexArray.print();

    }

}


