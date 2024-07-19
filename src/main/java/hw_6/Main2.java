package hw_6;

public class Main2 {
    public static void main(String[] args) {
        Resident.setAge(25);
        Resident.setCity("Kyiv");

        Resident person = new Resident("Anna", "Yakiv");

        person.printInstanceInfo();
        Resident.printStaticInfo();
    }
}