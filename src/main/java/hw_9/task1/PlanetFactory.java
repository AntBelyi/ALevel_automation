package hw_9.task1;

public class PlanetFactory {

    public static Planet getPlanet(String planetName) {
        switch (planetName) {
            case "Earth":
                return new Earth();
            case "Jupiter":
                return new Jupiter();
            case "Mars":
                return new Mars();
            case "Mercury":
                return new Mercury();
            case "Neptune":
                return new Neptune();
            case "Pluto":
                return new Pluto();
            case "Saturn":
                return new Saturn();
            case "Uranus":
                return new Uranus();
            case "Venus":
                return new Venus();
            default:
                throw new IllegalArgumentException("Unknown planet" + planetName);
        }

    }
}
