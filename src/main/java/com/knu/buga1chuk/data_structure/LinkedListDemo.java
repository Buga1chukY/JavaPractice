package com.knu.buga1chuk.data_structure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedListDemo {
    private static final Logger LOG = LoggerFactory.getLogger(LinkedListDemo.class);

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }

        linkedList.addFirst(10);
        linkedList.removeElement(5);
        linkedList.print();
        int index = linkedList.getElementIndex(8);
        LOG.info("Element is located in index: '{}'", index);
    }
}
