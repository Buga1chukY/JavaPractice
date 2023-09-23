package main.linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.print();

        int indexEl = linkedList.get(3);
        System.out.println(indexEl);

        linkedList.removeElement(3);
        linkedList.print();

    }
}
