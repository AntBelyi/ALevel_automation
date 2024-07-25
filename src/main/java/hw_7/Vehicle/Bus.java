package hw_7.Vehicle;

public class Bus extends Vehicle {
    private int numberOfSeats;

    public Bus(String brand, String model, int numberOfSeats) {
        super(brand, model);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the bus engine with a deep rumble!");
    }
}