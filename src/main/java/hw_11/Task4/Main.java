package hw_11.Task4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Car> carDeque = new ArrayDeque<>();

        carDeque.add(new Car("Skoda", "Octavia", 2022));
        carDeque.add(new Car("Volkswagen", "Golf", 2021));
        carDeque.add(new Car("Audi", "Q7", 2023));
        carDeque.add(new Car("Mercedes", "C-Class", 2020));
        carDeque.add(new Car("BMW", "3 Series", 2022));

        System.out.println("Current Deque: ");
        for (Car car : carDeque) {
            System.out.println(car);
        }

        carDeque.addFirst(new Car("Toyota", "Corolla", 2024));
        System.out.println("\nAfter adding a car at the beginning:");
        for (Car car : carDeque) {
            System.out.println(car);
        }

        carDeque.addLast(new Car("Honda", "Civic", 2021));
        System.out.println("\nAfter adding a car at the end:");
        for (Car car : carDeque) {
            System.out.println(car);
        }

        Car removedFirst = carDeque.removeFirst();
        System.out.println("\nRemoved first car: " + removedFirst);
        System.out.println("Deque after removing the first car:");
        for (Car car : carDeque) {
            System.out.println(car);
        }

        Car removedLast = carDeque.removeLast();
        System.out.println("\nRemoved last car: " + removedLast);
        System.out.println("Deque after removing the last car:");
        for (Car car : carDeque) {
            System.out.println(car);
        }

        Car firstCar = carDeque.peekFirst();
        System.out.println("\nFirst car in deque: " + firstCar);

        Car lastCar = carDeque.peekLast();
        System.out.println("Last car in deque: " + lastCar);
    }
}