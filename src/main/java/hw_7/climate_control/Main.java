package hw_7.climate_control;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan("First", "white", 4);
        Conditioner conditioner = new Conditioner("Hisense", "black", "R22");
        Humidifier humidifier = new Humidifier("Cool", "milk", 2);
        System.out.println(fan);
        System.out.println(conditioner);
        System.out.println(humidifier);

        fan.cool_down();
        conditioner.cool_down();
        humidifier.cool_down();
    }
}

