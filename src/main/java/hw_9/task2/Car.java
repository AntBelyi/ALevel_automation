package hw_9.task2;

public class Car {

    private String model;
    private int price;
    private int speed;
    private int countOfWheels;

    public Car(Builder builder) {
        this.model = builder.model;
        this.price = builder.price;
        this.speed = builder.speed;
        this.countOfWheels = builder.countOfWheels;
    }

    public static class Builder {
        private String model;
        private int price;
        private int speed;
        private int countOfWheels;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
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
                ", speed=" + speed +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}
