package main.LinkedList;

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
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
    }

    public void removeElement(int removedElement) {

        boolean isTrue = false;
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

                isTrue = true;
                if (currentElement.next.next == null) {
                    currentElement.next = null;
                    return;
                }
                currentElement.next = currentElement.next.next;
            }
            currentElement = currentElement.next;
        }
        if (!isTrue) {
            throw new IllegalStateException("There is no such element in List");
        }

    }

    public int getElementIndex(int data) {
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

    public int getElementByIndex(int index) {

        int currentIndex = 0;
        Node currentElement = head;

        if (head == null) {
            throw new IllegalStateException("The list is empty");
        }

        while (currentElement != null) {
            if (index == currentIndex) {
                return currentElement.data;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }

        return -1;
    }

    public int getLinkedListLength() {

        Node currentNode = head;
        int countNode = 0;

        if (head == null) {
            return countNode;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            countNode++;
        }

        return countNode;
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
