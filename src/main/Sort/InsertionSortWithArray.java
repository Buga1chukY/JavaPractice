package main.Sort;

import main.Sort.SortUtilities;

import java.util.Scanner;

public class InsertionSortWithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {7, 10, 6, 8, 3, 4, 5, 9, 1, 11, 2};
        int[] array2 = new int[array.length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    counter++;
                }
            }
            array2[counter] = array[i];
            counter = 0;
        }


        SortUtilities.printArray(array2);



    }

}
