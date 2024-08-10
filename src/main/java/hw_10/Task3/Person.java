package hw_10.Task3;

public class Person {
    String name;
    String surname;
    int age;
    double salary;

    public Person(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Salary: " + salary;
    }
}