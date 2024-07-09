package hw_5.myCity;

import hw_5.myClass.Person;

public class Building {
    public static void main(String[] args) {

        Person dima = new Person("Dima", "Dimidov", 15, "Ukraine", 63.8);
        Person katya = new Person("Katya", "Moroz", 31, "Spain", 58.3);
        Person igor = new Person("Igor", "Kupko", 40, "Ukraine", 90.0);
        Person vita = new Person("Vita", "Lapko", 50, "Ukraine", 63.8);
        Person olga = new Person("Olga", "Baeva", 43, "Moldova", 57.3);

        Person[] persons = {dima, katya, igor, vita, olga};

        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            System.out.println(person.toString());
        }
    }
}
