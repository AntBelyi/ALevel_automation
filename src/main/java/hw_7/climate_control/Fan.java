package hw_7.climate_control;

public class Fan extends Climate {
    private int number_of_speed;

    public Fan(String model, String color, int number_of_speed) {
        super(model, color);
        this.number_of_speed = number_of_speed;
    }

    public int getNumber_of_speed() {
        return number_of_speed;
    }

    public void setNumber_of_speed(int number_of_speed) {
        this.number_of_speed = number_of_speed;
    }

    @Override
    public void cool_down() {
        System.out.println("The fan can switch speed settings for cooling");
    }

    @Override
    public String toString() {
        return "Fan{" +
                "model=" + getModel() +
                ", color=" + getColor() +
                ", number_of_speed=" + number_of_speed +
                '}';
    }
}
