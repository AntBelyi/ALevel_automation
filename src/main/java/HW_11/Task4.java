package HW_11;

import java.util.Deque;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        Deque<Car> deque = new LinkedList<>();
        deque.offer(new Car("BMW"));
        deque.offer(new Car("Toyota"));
        deque.offer(new Car("Reno"));
        deque.offer(new Car("Ford"));
        deque.offer(new Car("Honda"));
        System.out.println(deque);
        System.out.println(deque.size());
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.element());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.pop());
        deque.push(new Car("Lada"));
        System.out.println(deque);
        deque.push(new Car("KIA"));
        System.out.println(deque);

    }
}