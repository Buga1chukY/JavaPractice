package com.knu.buga1chuk.data_structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueTest {

    @Test
    void test1() {
        Queue queue = new Queue();

        int expect = 0;
        int actual = queue.getCountElement();

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void test2() {
        Queue queue = new Queue();

        int actual = queue.getSize();
        int expect = 5;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void test3() {
        Queue queue = Queue.createQueue(30);

        int actual = queue.getSize();
        int expect = 30;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void test4() {
        Queue queue = Queue.createQueue(5);
        queue.addElemnt(7);

        int actual = queue.getSize();
        int expect = 5;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void test5() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 6; i++) {
            queue.addElemnt(i);
        }

        int actual = queue.getSize();
        int expect = 10;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void test6() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 5; i++) {
            queue.addElemnt(i + 1);
        }

        int actual = queue.poll();
        int expect = 1;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void test7() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 5; i++) {
            queue.addElemnt(i + 1);
        }

        int actual = queue.peek();
        int expect = 1;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void test8() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 100; i++) {
            queue.addElemnt(i + 1);
        }
        for (int i = 100; i > 0; i--) {
            queue.poll();
        }

        int actual = queue.getSize();
        int expect = 1;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void test9() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 100; i++) {
            queue.addElemnt(i + 1);
        }
        for (int i = 100; i > 0; i--) {
            queue.poll();
        }

        for (int i = 0; i < 100; i++) {
            queue.addElemnt(i + 1);
        }

        int actualSize = queue.getSize();
        int expectSize = 128;

        int actualElementsCount = queue.getCountElement();
        int expectedElementsCount = 100;

        int actualFirstElement = queue.peek();
        int expectedFirstElement = 1;

        Assertions.assertEquals(actualSize, expectSize);
        Assertions.assertEquals(actualElementsCount, expectedElementsCount);
        Assertions.assertEquals(actualFirstElement, expectedFirstElement);
    }

    @Test
    void test10() {
        Queue queue = Queue.createQueue(5);

        String actual = "";
        String expect = "Queue is empty";

        try {
            queue.poll();
            Assertions.fail();
        } catch (IllegalStateException e) {
            actual = e.getMessage();
        }

        Assertions.assertEquals(actual, expect);
    }

}
