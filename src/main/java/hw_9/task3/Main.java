package hw_9.task3;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.setName("Natali");
        person.setSurname("Kupko");
        person.setAge(35);

        System.out.println(person);

    }
}
