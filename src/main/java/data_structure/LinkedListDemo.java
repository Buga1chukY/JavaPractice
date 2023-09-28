package main.java.data_structure;

import main.java.data_structure.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }

        linkedList.addFirst(10);
        linkedList.removeElement(5);
        linkedList.print();
    }
}
