package main;

import main.oop_practice.FlexArray;

import java.util.Arrays;

import main.Queue;

public class FlexibleArray {

    public static void main(String[] args) {

        FlexArray flexArray = new FlexArray();
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

        Queue queue = new Queue();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            queue.addElemnt(i + 1);
        }

        int removedFirstEl = queue.poll();
        System.out.println(removedFirstEl);
        queue.print();

    }

}


