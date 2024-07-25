package hw_7.Vehicle;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle engine with a vroom!");
    }
}