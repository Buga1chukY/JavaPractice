package main.java.data_structure;

public class QueueDemo {

    public static void main(String[] args) {
        Queue queue = new Queue();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            queue.addElemnt(i + 1);
        }

        int removedFirstEl = queue.poll();
        System.out.println(removedFirstEl);
        queue.print();
    }

}
