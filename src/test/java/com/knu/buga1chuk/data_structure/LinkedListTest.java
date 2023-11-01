package com.knu.buga1chuk.data_structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void addFirst() {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(10);

        int expect = 10;
        int actual = linkedList.getElementByIndex(0);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void addLast() {
        LinkedList linkedList = new LinkedList();

        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }

        int expect = 4;
        int actual = linkedList.getElementByIndex(3);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void linkedListLength() {
        LinkedList linkedList = new LinkedList();

        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }

        int expect = 9;
        int actual = linkedList.getLinkedListLength();

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void linkedListLength2() {
        LinkedList linkedList = new LinkedList();

        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }
        linkedList.removeElement(5);

        int expect = 8;
        int actual = linkedList.getLinkedListLength();

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void removedFirstElement() {
        LinkedList linkedList = new LinkedList();

        for (int i = 1; i < 10; i++) {
            linkedList.addLast(i);
        }
        linkedList.removeElement(1);

        int expectFirstElement = 2;
        int actualFirstElement = linkedList.getElementByIndex(0);

        Assertions.assertEquals(expectFirstElement, actualFirstElement);
    }

    @Test
    void removedLastElement() {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }
        linkedList.removeElement(10);

        int expectLastElement = 9;

        int listLength = linkedList.getLinkedListLength();
        int actualLastElement = linkedList.getElementByIndex(listLength);

        Assertions.assertEquals(expectLastElement, actualLastElement);
    }

    @Test
    void removedTwoSameElementsFromList() {
        LinkedList linkedList = new LinkedList();

        String expect = "There is no such element in List";
        String actual = "";

        for (int i = 1; i < 10; i++) {
            linkedList.addLast(i);
        }
        linkedList.removeElement(5);


        try {
            linkedList.removeElement(5);
            Assertions.fail();
        } catch (IllegalStateException e) {
            actual = e.getMessage();
        }

        Assertions.assertEquals(actual, expect);
    }

    @Test
    void Add10ElementsAndRemove9_SouldStayOneElement() {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }

        for (int i = 10; i > 1; i--) {
            linkedList.removeElement(i);
        }

        int expectFirstElement = 1;
        int actualFirstElement = linkedList.getElementByIndex(0);

        Assertions.assertEquals(expectFirstElement, actualFirstElement);
    }

    @Test
    void Add10ElementAndRemove10Element_ShouldBeAException() {
        LinkedList linkedList = new LinkedList();

        String expectFirstElement = "The list is empty";
        String actualFirstElement = "";

        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }
        for (int i = 10; i > 0; i--) {
            linkedList.removeElement(i);
        }

        try {
            linkedList.getElementByIndex(0);
            Assertions.fail();
        } catch (IllegalStateException e) {
            actualFirstElement = e.getMessage();
        }

        Assertions.assertEquals(actualFirstElement, expectFirstElement);
    }

}
