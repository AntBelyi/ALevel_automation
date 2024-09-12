package hw_9.Cars;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .setModel("BMW")
                .setPrice(59999.99)
                .setMaxSpeed(240)
                .setCountOfWheels(4)
                .build();

        Car car2 = new Car.Builder()
                .setModel("Audi")
                .setPrice(99999.99)
                .setMaxSpeed(230)
                .setCountOfWheels(4)
                .build();

        Car car3 = new Car.Builder()
                .setModel("Mersedes")
                .setPrice(89999.99)
                .setMaxSpeed(260)
                .setCountOfWheels(4)
                .build();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}