package hw_10.Task3;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Person(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Salary: " + salary;
    }
}