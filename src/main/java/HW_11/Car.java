package HW_11;

public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}