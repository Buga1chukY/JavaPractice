package com.knu.buga1chuk.data_structure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackDemo {
    private static final Logger LOG = LoggerFactory.getLogger(StackDemo.class);

    public static void main(String[] args) {
        Stack stack = new Stack();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            stack.addElement(i + 1);
        }

        stack.addElement(8);
        stack.print();

        int pop = stack.pop();
        LOG.info("Last element is: '{}'", pop);

    }
}
