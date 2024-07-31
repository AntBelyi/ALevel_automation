package hw_7.climate_control;

public class Humidifier extends Climate {
    private int water_quantity;

    public Humidifier(String model, String color, int water_quantity) {
        super(model, color);
        this.water_quantity = water_quantity;
    }

    public int getWater_quantity() {
        return water_quantity;
    }

    @Override
    public void cool_down() {
        System.out.println("Works as a cooler and humidifier for water evaporation");
    }

    @Override
    public String toString() {
        return "Humidifier{" +
                "model=" + getModel() +
                ",color=" + getColor() +
                ",water_quantity=" + water_quantity +
                '}';
    }
}
