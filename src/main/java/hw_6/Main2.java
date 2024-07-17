package hw_6;

public class Main2 {
    public static void main(String[] args) {
        Resident.age = 25;
        Resident.city = "Kyiv";

        Resident person = new Resident("Anna", "Yakiv");

        person.printInstanceInfo();
        Resident.printStaticInfo();
    }
}