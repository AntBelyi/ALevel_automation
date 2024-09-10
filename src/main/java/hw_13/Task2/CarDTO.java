package hw_13.Task2;

public class CarDTO {
    private String model;
    private int countOfWheels;
    private int maxSpeed;
    private int years;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) throws WrongCountOfWheels {
        if (countOfWheels < 4) {
            throw new WrongCountOfWheels("The amount of wheels can't be less than 4", countOfWheels);
        }
        this.countOfWheels = countOfWheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
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