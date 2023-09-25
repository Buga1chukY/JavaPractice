package main.LinkedList;

public class Main {
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
