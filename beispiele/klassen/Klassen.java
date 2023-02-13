package beispiele.klassen;

import java.util.Arrays;
import java.util.List;

import beispiele.arrays.Listen;


public class Klassen {
    public static void main(String[] args) {
        // Ein neues Objekt vom Typ City erzeugen:
        City city1 = new City();

        // Die Attribute der Stadt mit Werten belegen:
        city1.name = "Mannheim";
        city1.distance = 0;

        // Ein weiteres Objekt erzeugen, dieses Mal mit dessen Konstruktor:
        City city2 = new City("Frankfurt", 80);

        // Noch ein paar Städte:
        City city3 = new City("Paris", 520);
        City city4 = new City("Hamburg", 565);
        City city5 = new City("Barcelona", 1250);
        City city6 = new City("Heidelberg", 19);

        // Alle Orte in eine Liste speichern:
        List<City> cities = Arrays.asList(city1, city2, city3, city4, city5, city6);

        // Alle Orte ausgeben:
        Listen.printList(cities);

        // Den Ort mit der weitesten Entfernung ausgeben:
        System.out.println(farthestCity(cities));

        // Den Ort mit der kürzesten Entfernung ausgeben:
        System.out.println(nearestCity(cities));
    }

    public static City farthestCity(List<City> cities) {
        City farthest = null;
        for (City city : cities) {
            if ((farthest == null) || (city.distance > farthest.distance)) {
                farthest = city;
            }
        }
        return farthest;
    }

    public static City nearestCity(List<City> cities) {
        City nearest = null;
        for (City city : cities) {
            if ((nearest == null) || (city.distance < nearest.distance)) {
                nearest = city;
            }
        }
        return nearest;
    }
}
