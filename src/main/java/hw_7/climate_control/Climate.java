package hw_7.climate_control;

public abstract class Climate {
    private String model;
    private String color;

    public Climate(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Climate() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void cool_down() {
        System.out.println("Climate is cool down the room");
    }
}
