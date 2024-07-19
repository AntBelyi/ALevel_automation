package hw_6;

public class Resident {
    private String name;
    private String surname;
    private static int age;
    private static String city;

    public Resident(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public static int getAge() {
        return age;
    }
    public static void setAge(int age) {
        Resident.age = age;
    }
    public static String getCity() {
        return city;
    }
    public static void setCity(String city) {
        Resident.city = city;
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