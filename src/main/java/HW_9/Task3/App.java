package HW_9.Task3;

public class App {
    public static void main(String[] args) {

        Person person1 = Person.getInstance();
        Person person2 = Person.getInstance();
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        person1.setName("Olga");
        person1.setAge(20);
        System.out.println(person1.getName() + person1.getAge());
        person2.setName("Boris");
        System.out.println(person2.getName() + person2.getAge());
    }
}