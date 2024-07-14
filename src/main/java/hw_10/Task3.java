package hw_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.getName;

public class Task3 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bill", "Johnson", 45, 4500));
        persons.add(new Person("Donald", "Duck", 73, 8000));
        persons.add(new Person("Woodie", "Woodpecker", 50, 4700));
        persons.add(new Person("Richi", "Clock", 60,10000));
        persons.add(new Person("Chris", "Black", 85, 25000));
        for (Person person : persons){
            System.out.println(person);
        }
        List<String> names = persons.stream()
                .filter(person -> person.getAge() <70)
                .map(Person::getName)
                .toList();
        System.out.println(names);
    }
    }