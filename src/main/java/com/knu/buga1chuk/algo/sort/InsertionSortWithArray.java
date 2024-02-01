package com.knu.buga1chuk.algo.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertionSortWithArray {
    private static final Logger LOG = LoggerFactory.getLogger(InsertionSortWithArray.class);

    public static void main(String[] args) {

        int[] array = {7, 10, 6, 8, 3, 4, 5, 9, 1, 11, 2};
        int[] array2 = new int[array.length];
        int counter = 0;

        for (int k : array) {

            for (int i : array) {
                if (k > i) {
                    counter++;
                }
            }
            array2[counter] = k;
            counter = 0;
        }

        LOG.info("{} ", array2);

    }

}
