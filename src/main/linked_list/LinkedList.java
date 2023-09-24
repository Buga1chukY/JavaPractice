package main.linked_list;

public class LinkedList {
    Node head;

    public void addFirst(int data) {
        Node firstNode = new Node(data);
        firstNode.next = head;
        head = firstNode;
    }

    public void addLast(int data) {
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
    }

    public int get(int data) {
        if (head == null) {
            return -1;
        }
        if (head.data == data) {
            return 0;
        }

        int result = 0;
        Node currentNode = head;

        while (currentNode.next != null) {
            if (currentNode.data == data) {
                return result;
            }
            currentNode = currentNode.next;
            result++;
        }

        return -1;
    }

    public void removeElement(int removedElement) {

        if (head == null) {
            return;
        }
        if (head.data == removedElement) {
            head = head.next;
            return;
        }

        Node currentElement = head;

        while (currentElement.next != null) {
            if (currentElement.next.data == removedElement) {
                currentElement.next = currentElement.next.next;
            }
            currentElement = currentElement.next;
        }
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println(" ");
    }


}
