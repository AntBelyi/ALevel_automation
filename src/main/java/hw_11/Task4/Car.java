package hw_11.Task4;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [Brand: " + brand + ", Model: " + model + ", Year: " + year + "]";
    }
}