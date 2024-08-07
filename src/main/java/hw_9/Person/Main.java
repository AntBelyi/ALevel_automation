package hw_9.Person;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.setName("Anna");
        person.setSurname("Smith");
        person.setAge(28);

        System.out.println(person);

        Person anotherPerson = Person.getInstance();
        System.out.println(anotherPerson);
    }
}