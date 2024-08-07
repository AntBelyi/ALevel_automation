package hw_9.SolarSystem;

public class PlanetFactory {
    public static Planet getPlanet(String planetName) {
        switch (planetName.toLowerCase()) {
            case "mercury":
                return new Mercury();
            case "venus":
                return new Venus();
            case "earth":
                return new Earth();
            case "mars":
                return new Mars();
            case "jupiter":
                return new Jupiter();
            default:
                throw new IllegalArgumentException("Unknown planet: " + planetName);
        }
    }
}