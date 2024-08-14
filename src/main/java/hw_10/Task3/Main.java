package hw_10.Task3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Michael", "Jordan", 72, 5000.0);
        Person person2 = new Person("Emily", "Clark", 68, 4500.0);
        Person person3 = new Person("Sophia", "Williams", 30, 6000.0);
        Person person4 = new Person("Henry", "Thompson", 75, 5500.0);
        Person person5 = new Person("Olivia", "Johnson", 25, 4800.0);

        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        System.out.println("List of people:");
        people.forEach(System.out::println);

        List<String> namesUnder70 = people.stream()
                .filter(person -> person.getAge() < 70)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("\nNames of people under 70:");
        namesUnder70.forEach(System.out::println);
    }
}