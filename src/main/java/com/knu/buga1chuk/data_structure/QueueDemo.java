package com.knu.buga1chuk.data_structure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueueDemo {

    private static final Logger LOG = LoggerFactory.getLogger(QueueDemo.class);


    public static void main(String[] args) {
        Queue queue = new Queue();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            queue.addElemnt(i + 1);
        }

        int removedFirstElement = queue.poll();
        LOG.info("Removed first element: '{}'", removedFirstElement);
        queue.print();
    }

}
