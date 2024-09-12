package hw_14;

public class Student {
    private String name;
    private int age;
    private String surname;

    public Student(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public void info() {
        System.out.println("Name: " + name + ", Age: " + age + ", Surname: " + surname);
    }

    private void privateDisplayMethod(String word) {
        System.out.println("The entered word is: " + word);
    }
}