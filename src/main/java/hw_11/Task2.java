package hw_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task2 {

    private static Map<String, Person> people = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String command;

        while (true) {
            System.out.println("Which will be your choice: getPerson/addPerson/exit?");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "exit":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                case "addperson":
                    addPerson();
                    break;
                case "getperson":
                    getPerson();
                    break;
                default:
                    System.out.println("Unknown operation.");
            }
        }
    }

    private static void addPerson() {
        System.out.println("Enter surname:");
        String surname = scanner.nextLine().trim();

        System.out.println("Enter name:");
        String name = scanner.nextLine().trim();

        System.out.println("Enter age:");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Age must be a number.");
            return;
        }

        Person person = new Person(name, surname, age);
        people.put(surname, person);
        System.out.println("You have just added: " + person);
    }

    private static void getPerson() {
        if (people.isEmpty()) {
            System.out.println("No people in the list. Please add at least one person first.");
            return;
        }

        System.out.println("Enter surname:");
        String surname = scanner.nextLine().trim();

        if (people.containsKey(surname)) {
            Person person = people.get(surname);
            System.out.println("You have selected: " + person);
        } else {
            System.out.println("No such person exists.");
            System.out.println("Available surnames:");
            Set<String> availablesurname = people.keySet();
            if (availablesurname.isEmpty()) {
                System.out.println("No surnames available.");
            } else {
                for (String name : availablesurname) {
                    System.out.println(name);
                }
            }
        }
    }
}

