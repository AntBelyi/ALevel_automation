package hw_7;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 4);
        Vehicle bus = new Bus("Mercedes", "Sprinter", 20);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", true);

        car.startEngine();
        bus.startEngine();
        motorcycle.startEngine();
    }
}