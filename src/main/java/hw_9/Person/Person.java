package hw_9.Person;

public class Person {
    private String name;
    private String surname;
    private int age;

    private static Person instance;

    private Person() {}

    public static Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}