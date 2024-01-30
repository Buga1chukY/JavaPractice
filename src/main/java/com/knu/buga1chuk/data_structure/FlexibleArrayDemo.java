package com.knu.buga1chuk.data_structure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlexibleArrayDemo {
    private static final Logger LOG = LoggerFactory.getLogger(FlexibleArrayDemo.class);

    public static void main(String[] args) {

        FlexibleArray flexArray = new FlexibleArray();
        int elementsCount = 11;
        int[] inputArray = new int[elementsCount];

        for (int i = 0; i < elementsCount; i++) {
            inputArray[i] = i + 1;
        }

        LOG.info("Input array: '{}'", inputArray);

        for (int number : inputArray) {
            flexArray.addElement(number);
        }
        flexArray.print();

        int removedElement = flexArray.subtractElement();
        LOG.info("Removed last element: '{}'", removedElement);
        flexArray.print();

        int removedFirstElement = flexArray.subtractFirstElement();
        LOG.info("Removed first element: '{}'", removedFirstElement);
        flexArray.print();

    }

}


