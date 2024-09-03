package hw_10;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Person> employee = new ArrayList<>();
        employee.add(new Person("Jack", "Smith", 30, 5000));
        employee.add(new Person("Maria", "Thomson", 45, 7500));
        employee.add(new Person("Tom", "Gray", 73, 8000));
        employee.add(new Person("Valery", "Nelson", 78, 8300));
        employee.add(new Person("Katerine", "Duck", 56, 4600));
        for (Person person : employee) {
            System.out.println(person);
        }
        List<String> names = employee.stream()
                .filter(person -> person.getAge() < 70)
                .map(Person::getName)
                .toList();
        System.out.println(names);
    }
}
