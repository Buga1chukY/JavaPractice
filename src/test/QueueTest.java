package test;

import main.AssertUtilities;
import main.Queue;

public class QueueTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
    }

    private static void test1() {
        Queue queue = new Queue();

        int expect = 0;
        int actual = queue.getCountElement();

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test2() {
        Queue queue = new Queue();

        int actual = queue.getSize();
        int expect = 5;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test3() {
        Queue queue = Queue.createQueue(30);

        int actual = queue.getSize();
        int expect = 30;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test4() {
        Queue queue = Queue.createQueue(5);
        queue.addElemnt(7);

        int actual = queue.getSize();
        int expect = 5;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test5() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 6; i++) {
            queue.addElemnt(i);
        }

        int actual = queue.getSize();
        int expect = 10;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test6() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 5; i++) {
            queue.addElemnt(i + 1);
        }

        int actual = queue.poll();
        int expect = 1;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test7() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 5; i++) {
            queue.addElemnt(i + 1);
        }

        int actual = queue.peek();
        int expect = 1;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test8() {
        Queue queue = Queue.createQueue(5);

        for (int i = 0; i < 100; i++) {
            queue.addElemnt(i + 1);
        }
        for (int i = 100; i > 0; i--) {
            queue.poll();
        }

        int actual = queue.getSize();
        int expect = 1;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test9() {
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

        AssertUtilities.assertEquals(actualSize, expectSize);
        AssertUtilities.assertEquals(actualElementsCount, expectedElementsCount);
        AssertUtilities.assertEquals(actualFirstElement, expectedFirstElement);
    }

    private static void test10() {
        Queue queue = Queue.createQueue(5);

        String actual = "";
        String expect = "Queue is empty";

        try {
            queue.poll();
            AssertUtilities.fail();
        } catch (IllegalStateException e) {
            actual = e.getMessage();
        }

        AssertUtilities.assertEquals(actual, expect);
    }

}
