package hw_9.SolarSystem;

public class Main {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};

        for (String planetName : planets) {
            Planet planet = PlanetFactory.getPlanet(planetName);
            planet.displayInfo();
        }
    }
}
