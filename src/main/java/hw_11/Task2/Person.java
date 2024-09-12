package hw_11.Task2;

public class Person {
    private String firstName;
    private String surname;
    private int age;

    public Person(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "You choose - Name: " + firstName + ", Surname: " + surname + ", Age: " + age;
    }
}