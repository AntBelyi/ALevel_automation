package hw_12;

public class Main {
    public static void main(String[] args) {
        MySet<String> set = new MySet<>(5);

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println("Set: " + set);
        System.out.println("Element at index 2: " + set.get(2));
    }
}