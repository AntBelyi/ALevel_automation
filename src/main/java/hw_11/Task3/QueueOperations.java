package hw_11.Task3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

    private Queue<String> queue;

    public QueueOperations() {
        queue = new LinkedList<>();
    }

    public void addElements() {
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.add("Fourth");
        queue.add("Fifth");
    }

    public void displayQueue() {
        System.out.println("Current Queue: " + queue);
    }

    public void removeElement() {
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
    }

    public void viewHead() {
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);
    }

    public void checkIfEmpty() {
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }

    public void checkSize() {
        int size = queue.size();
        System.out.println("Size of the queue: " + size);
    }
}