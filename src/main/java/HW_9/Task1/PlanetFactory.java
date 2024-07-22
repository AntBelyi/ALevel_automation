package HW_9.Task1;

public class PlanetFactory {
    public static Planet getPlanet(String planetName) {
        switch (planetName) {
            case "Mercury":
                return new Mercury();
            case "Venus":
                return new Venus();
            case "Earth":
                return new Earth();
            case "Mars":
                return new Mars();
            case "Jupiter":
                return new Jupiter();
            case "Saturn":
                return new Saturn();
            case "Uranus":
                return new Uranus();
            case "Neptune":
                return new Neptune();
            case "Pluto":
                return new Pluto();
            default:
                return null;
        }
    }
}
