package hw_6.Task1;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Persian", 3);

        System.out.println(myCat);
        myCat.displayInfo();
        System.out.println("------------");
        Cat.displayStaticInfo();
    }
}