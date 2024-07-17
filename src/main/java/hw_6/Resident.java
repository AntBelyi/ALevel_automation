package hw_6;

public class Resident {
    public String name;
    public String surname;

    public static int age;
    public static String city;

    public Resident(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInstanceInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void printStaticInfo() {
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}