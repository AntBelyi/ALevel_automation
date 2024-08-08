package hw_9.task1;

public class Main {
    public static void main(String[] args) {
        Planet earth = PlanetFactory.getPlanet("Earth");
        Planet jupiter = PlanetFactory.getPlanet("Jupiter");
        Planet mars = PlanetFactory.getPlanet("Mars");
        Planet mercury = PlanetFactory.getPlanet("Mercury");
        Planet neptune = PlanetFactory.getPlanet("Neptune");
        Planet pluto = PlanetFactory.getPlanet("Pluto");
        Planet saturn = PlanetFactory.getPlanet("Saturn");
        Planet uranus = PlanetFactory.getPlanet("Uranus");
        Planet venus = PlanetFactory.getPlanet("Venus");

        earth.displayInfo();
        jupiter.displayInfo();
        mars.displayInfo();
        mercury.displayInfo();
        neptune.displayInfo();
        pluto.displayInfo();
        saturn.displayInfo();
        uranus.displayInfo();
        venus.displayInfo();

    }
}
