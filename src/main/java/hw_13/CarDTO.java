package hw_13;

public class CarDTO {
    private String model;
    private int countOfWheels;
    private int maxSpeed;
    private int years;

    public CarDTO(String model, int countOfWheels, int maxSpeed, int years) {
        this.model = model;
        this.countOfWheels = countOfWheels;
        this.maxSpeed = maxSpeed;
        this.years = years;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        if (countOfWheels < 4) {
            throw new InvalidWheelCountException("The wheel count must be more than 3. Attempted to set: " + countOfWheels);
        }

        this.countOfWheels = countOfWheels;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "model='" + model + '\'' +
                ", countOfWheels=" + countOfWheels +
                ", maxSpeed=" + maxSpeed +
                ", years=" + years +
                '}';
    }
}
