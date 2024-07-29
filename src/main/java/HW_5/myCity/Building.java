package HW_5.myCity;

import HW_5.myClass.Person;

public class Building {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Alice", "White", 25);
        persons[1] = new Person("Olga", "Furs", 32);
        persons[2] = new Person("Mark", "Johnson", 18);
        for (int i = 0; i < persons.length; i++) {

            System.out.println(persons[i]);
        }
    }
}