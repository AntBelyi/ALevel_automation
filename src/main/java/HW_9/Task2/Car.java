package HW_9.Task2;

public class Car {
    private String model;
    private int price;
    private int maxSpeed;
    private int countOfWheels;

    private Car(Builder builder) {
        this.model = builder.model;
        this.price = builder.price;
        this.maxSpeed = builder.maxSpeed;
        this.countOfWheels = builder.countOfWheels;
    }

    public static class Builder {
        private String model;
        private int price;
        private int maxSpeed;
        private int countOfWheels;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setCountOfWheels(int countOfWheels) {
            this.countOfWheels = countOfWheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}