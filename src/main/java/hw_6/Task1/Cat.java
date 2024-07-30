package hw_6.Task1;

public class Cat {

    private static int countOfLegs = 4;
    private static int countOfEyes = 2;

    private String breed;
    private int age;


    public Cat(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Count of Legs: " + countOfLegs);
        System.out.println("Count of Eyes: " + countOfEyes);
    }

    public static void displayStaticInfo() {
        System.out.println("Count of Legs: " + countOfLegs);
        System.out.println("Count of Eyes: " + countOfEyes);

       //System.out.println("Breed: " + breed);
       //System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
