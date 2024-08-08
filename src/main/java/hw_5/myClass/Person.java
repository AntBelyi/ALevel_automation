package hw_5.myClass;

public class Person {

    public String name;
    public String surname;
    public int age;
    public String countryOfBirth;
    public double weight;

    public Person(String name, String surname, int age, String countryOfBirth, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.countryOfBirth = countryOfBirth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", weight=" + weight +
                '}';
    }
}
