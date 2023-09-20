package test;

import main.AssertUtilities;
import main.Stack;

public class StackTest {
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
    }

    private static void test1() {
        Stack stack = new Stack();

        int expect = 0;
        int actual = stack.getCountElement();

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test2() {
        Stack stack = new Stack();

        int actual = stack.getSize();
        int expect = 10;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test3() {
        Stack stack = Stack.createStack(30);

        int actual = stack.getSize();
        int expect = 30;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test4() {
        Stack stack = Stack.createStack(5);
        stack.addElemnt(7);

        int actual = stack.getSize();
        int expect = 5;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test5() {
        Stack stack = Stack.createStack(5);

        for (int i = 0; i < 6; i++) {
            stack.addElemnt(i);
        }

        int actual = stack.getSize();
        int expect = 10;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test6() {
        Stack stack = Stack.createStack(5);

        for (int i = 0; i < 6; i++) {
            stack.addElemnt(i + 1);
        }

        int actual = stack.peek();
        int expect = 6;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test7() {
        Stack stack = Stack.createStack(5);

        for (int i = 0; i < 100; i++) {
            stack.addElemnt(i + 1);
        }
        for (int i = 100; i > 0; i--) {
            stack.pop();
        }

        int actual = stack.getSize();
        int expect = 1;

        AssertUtilities.assertEquals(actual, expect);
    }

    private static void test8() {
        Stack stack = Stack.createStack(5);

        for (int i = 0; i < 100; i++) {
            stack.addElemnt(i + 1);
        }
        for (int i = 100; i > 0; i--) {
            stack.pop();
        }

        for (int i = 0; i < 100; i++) {
            stack.addElemnt(i + 1);
        }

        int actualSize = stack.getSize();
        int expectSize = 128;

        int actualElementsCount = stack.getCountElement();
        int expectedElementsCount = 100;

        int actualLastElement = stack.peek();
        int expectedLastElement = 100;

        AssertUtilities.assertEquals(actualSize, expectSize);
        AssertUtilities.assertEquals(actualElementsCount, expectedElementsCount);
        AssertUtilities.assertEquals(actualLastElement, expectedLastElement);
    }

    private static void test9() {
        Stack stack = Stack.createStack(5);

        String actual = "";
        String expect = "Stack is empty";

        try {
            stack.pop();
            AssertUtilities.fail();
        } catch (IllegalStateException e) {
            actual = e.getMessage();
        }

        AssertUtilities.assertEquals(actual, expect);
    }

}
