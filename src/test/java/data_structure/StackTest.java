package test.java.data_structure;

import main.java.data_structure.Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void test1() {
        Stack stack = new Stack();

        int expect = 0;
        int actual = stack.getCountElement();

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test2() {
        Stack stack = new Stack();

        int actual = stack.getSize();
        int expect = 10;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test3() {
        Stack stack = Stack.createStack(30);

        int actual = stack.getSize();
        int expect = 30;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test4() {
        Stack stack = Stack.createStack(5);
        stack.addElemnt(7);

        int actual = stack.getSize();
        int expect = 5;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test5() {
        Stack stack = Stack.createStack(5);

        for (int i = 0; i < 6; i++) {
            stack.addElemnt(i);
        }

        int actual = stack.getSize();
        int expect = 10;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test6() {
        Stack stack = Stack.createStack(5);

        for (int i = 0; i < 6; i++) {
            stack.addElemnt(i + 1);
        }

        int actual = stack.peek();
        int expect = 6;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test7() {
        Stack stack = Stack.createStack(5);

        for (int i = 0; i < 100; i++) {
            stack.addElemnt(i + 1);
        }
        for (int i = 100; i > 0; i--) {
            stack.pop();
        }

        int actual = stack.getSize();
        int expect = 1;

        Assertions.assertEquals(actual, expect);
    }

    @Test
    public void test8() {
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

        Assertions.assertEquals(actualSize, expectSize);
        Assertions.assertEquals(actualElementsCount, expectedElementsCount);
        Assertions.assertEquals(actualLastElement, expectedLastElement);
    }

    @Test
    public void test9() {
        Stack stack = Stack.createStack(5);

        String actual = "";
        String expect = "Stack is empty";

        try {
            stack.pop();
            Assertions.fail();
        } catch (IllegalStateException e) {
            actual = e.getMessage();
        }

        Assertions.assertEquals(actual, expect);
    }

}