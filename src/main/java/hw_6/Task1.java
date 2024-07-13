package hw_6;

public class Task1 {
    String name;
    String surname;

    static int age;
    static String city;

    public Task1(String name, String surname) {
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
    public static void main(String[] args) {
        age = 25;
        city = "Kyiv";

        Task1 person = new Task1 ("Anna", "Yakiv");

        person.printInstanceInfo();
        Task1.printStaticInfo();
    }
}