package hw_5.myCity;

import hw_5.myClass.Person;

public class Building {
    public static void main(String[] args) {
        Person[] residents = new Person[2];

        residents[0] = new Person("Anna", "Koval", 25);
        residents[1] = new Person("Roman", "Ivanov", 30);

        for (Person resident : residents) {
            System.out.println("Name: " + resident.name + ", Surname: " + resident.surname + ", Age: " + resident.age);
        }
    }
}