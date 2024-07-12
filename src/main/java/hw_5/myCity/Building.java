package hw_5.myCity;

import hw_5.myClass.Person;

public class Building {
    Person[] residents;

    public Building(int numberOfResidents) {
        residents = new Person[numberOfResidents];
    }
    public static void main(String[] args) {
        Building building = new Building(2);

        building.residents[0] = new Person("Anna", "Koval", 25);
        building.residents[1] = new Person("Roman", "Ivanov", 30);

        for (Person resident : building.residents) {
            System.out.println("Name: " + resident.name + ", Surname: " + resident.surname + ", Age: " + resident.age);
        }
    }
}