package beispiele.klassen;

public class City {
    String name;
    int distance;

    City() {
        this.name = "";
        this.distance = -1;
    }

    City(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String toString() {
        return String.format("%s: %d", name, distance);
    }
}
