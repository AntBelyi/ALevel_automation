package hw_5.Task1.MyCity;

import hw_5.Task1.MyClass.Person;

public class Building {
    public Person[] persons;

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Maria", "Nechiporenko", 25);
        persons[1] = new Person("Stepan", "Bondarenko", 30);
        persons[2] = new Person("Viktoria", "Sergienko", 22);

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}