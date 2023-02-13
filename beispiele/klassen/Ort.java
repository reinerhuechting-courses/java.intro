package beispiele.klassen;

public class Ort {
    String name;
    int distance;

    Ort() {
        this.name = "";
        this.distance = -1;
    }

    Ort(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String toString() {
        return String.format("%s: %d", name, distance);
    }
}
