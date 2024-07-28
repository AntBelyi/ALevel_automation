package hw_7.climate_control;

public class Conditioner extends Climate {
    private String freonName;

    public Conditioner(String model, String color, String freonName) {
        super(model, color);
        this.freonName = freonName;
    }

    public String getFreonName() {
        return freonName;
    }

    public void setFreonName(String freonName) {
        this.freonName = freonName;
    }

    @Override
    public void cool_down() {
        System.out.println("The conditioner can cool and heat the room");
    }

    @Override
    public String toString() {
        return "Conditioner{" +
                "model=" + getModel() +
                ",color=" + getColor() +
                ",freonName='" + freonName + '\'' +
                '}';
    }
}
