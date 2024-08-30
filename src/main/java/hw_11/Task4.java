package hw_11;

import java.util.Deque;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        Deque<Car> deque = new LinkedList<>();
        deque.offer(new Car("Honda", 2009, 250));
        deque.offer(new Car("BMW", 2011, 360));
        deque.offer(new Car("Toyota", 2022, 180));
        deque.offer(new Car("Kia", 2023, 280));
        deque.offer(new Car("Renault", 2010, 210));
        System.out.println(deque);

        deque.offerFirst(new Car("Volvo", 2015, 300));
        deque.offerLast(new Car("Subaru", 2007, 260));
        System.out.println(deque);

        deque.push(new Car("Citroen", 2007, 200));
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque);
        System.out.println(deque.peekLast());
        System.out.println(deque);
    }
}
