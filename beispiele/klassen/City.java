package beispiele.klassen;

/**
 * City enthält Daten über Städte wie den Namen und die Entfernung.
 */
public class City {
    String name;
    int distance;

    /**
     * Standardkonstruktor: Initialisiert den Namen mit einem leeren String und die Entfernung mit -1.
     */
    City() {
        this.name = "";
        this.distance = -1;
    }

    /**
     * Konstruktor: Erwartet einen Namen und eine Entfernung und speichert sie im neuen City-Objekt.
     * @param name
     * @param distance
     */
    City(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    /**
     * toString liefert einen menschenlesbaren String für dieses City-Objekt.
     */
    public String toString() {
        return String.format("%s: %d", name, distance);
    }
}
