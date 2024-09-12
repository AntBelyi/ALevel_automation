package hw_11.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> personMap = new HashMap<>();

        while (true) {
            System.out.print("What do you want: getPerson/addPerson/exit? ");
            String operation = scanner.nextLine().trim().toLowerCase();

            if (operation.equals("exit")) {
                System.out.println("The program is over.");
                break;
            }

            switch (operation) {
                case "getperson":
                    if (personMap.isEmpty()) {
                        System.out.println("There aren't people in the list. Add at least one person.");
                        break;
                    }
                    System.out.print("Enter the surname of the person you want to get: ");
                    String surname = scanner.nextLine().trim();
                    Person person = personMap.get(surname);

                    if (person != null) {
                        System.out.println(person);
                    } else {
                        System.out.println("There isn't such person. You can choose from next surnames: " + personMap.keySet());
                    }
                    break;

                case "addperson":
                    System.out.print("Enter name: ");
                    String firstName = scanner.nextLine().trim();
                    System.out.print("Enter surname: ");
                    String newSurname = scanner.nextLine().trim();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(scanner.nextLine().trim());

                    Person newPerson = new Person(firstName, newSurname, age);
                    personMap.put(newSurname, newPerson);
                    System.out.println("You have just added: " + newPerson);
                    break;

                default:
                    System.out.println("Error. Enter getPerson, addPerson or exit.");
                    break;
            }
        }
    }
}