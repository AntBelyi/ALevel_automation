package HW_9.Task1;

public class App {
    public static void main(String[] args) {

        Planet mercury = PlanetFactory.getPlanet("Mercury");
        Planet venus = PlanetFactory.getPlanet("Venus");
        Planet earth = PlanetFactory.getPlanet("Earth");
        Planet jupiter = PlanetFactory.getPlanet("Jupiter");
        Planet saturn = PlanetFactory.getPlanet("Saturn");
        Planet mars = PlanetFactory.getPlanet("Mars");
        Planet neptune = PlanetFactory.getPlanet("Neptune");
        Planet pluto = PlanetFactory.getPlanet("Pluto");

        mercury.displayInfo();
        venus.displayInfo();
        earth.displayInfo();
        jupiter.displayInfo();
        saturn.displayInfo();
        mars.displayInfo();
        neptune.displayInfo();
        pluto.displayInfo();
    }
}