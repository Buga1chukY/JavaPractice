package main.FlexibleArray.Queue.Test;

import main.FlexibleArray.Queue.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test
    public void test1() {
        Queue queue = new Queue();

        int expect = 0;
        int actual = queue.getCountElement();

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test2() {
        Queue queue = new Queue();

        int actual = queue.getSize();
        int expect = 5;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test3() {
        Queue queue = Queue.createQueue(30);

        int actual = queue.getSize();
        int expect = 30;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test4() {
        Queue queue = Queue.createQueue(5);
        queue.addElemnt(7);

        int actual = queue.getSize();
        int expect = 5;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test5() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 6; i++) {
            queue.addElemnt(i);
        }

        int actual = queue.getSize();
        int expect = 10;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test6() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 5; i++) {
            queue.addElemnt(i + 1);
        }

        int actual = queue.poll();
        int expect = 1;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test7() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 5; i++) {
            queue.addElemnt(i + 1);
        }

        int actual = queue.peek();
        int expect = 1;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test8() {
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
    public void test9() {
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
    public void test10() {
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
