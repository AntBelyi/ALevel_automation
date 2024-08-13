package HW_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Person> person = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What operation do you want to do: getPerson/addPerson/exit?");
            String answer = scanner.nextLine();

            if (answer.equals("exit")) {
                break;
            } else if (answer.equals("getPerson")) {
                if (person.isEmpty()) {
                    System.out.println("There are no persons in the list. You should addPerson firstly");
                } else {
                    System.out.println("Enter surnmane of the person you want to get ");
                    String surname = scanner.nextLine();
                    if (person.containsKey(surname)) {
                        System.out.println("You choose" + " " + person.get(surname));
                    } else {
                        System.out.println("The person with surname" + " " + surname + " " + "doesn't exist");
                        System.out.println("The list of surnames available : " + person.keySet());
                    }
                }
            } else if (answer.equals("addPerson")) {
                System.out.println("Enter surname");
                String surname = scanner.nextLine();
                System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter age");
                int age = scanner.nextInt();
                Person persons = new Person(surname, name, age);
                person.put(surname, persons);
                System.out.println("You just add the person " + surname);
            } else {
                System.out.println("Enter addPerson/getPerson/exit");
            }
        }
        scanner.close();
    }
}