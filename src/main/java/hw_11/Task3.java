package hw_11;

import java.util.LinkedList;
import java.util.Queue;

public class Task3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("English");
        queue.offer("German");
        queue.offer("Ukrainian");
        queue.offer("Polish");
        queue.offer("French");
        System.out.println(queue);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue);

        Queue<String> newqueue = new LinkedList<>();
        System.out.println(newqueue);
        System.out.println(newqueue.element());
        System.out.println(newqueue);
    }
}


