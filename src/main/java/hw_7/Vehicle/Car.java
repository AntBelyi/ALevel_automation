package hw_7.Vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the car engine with a roar!");
    }
}