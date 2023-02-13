package beispiele.klassen;

import java.util.Arrays;
import java.util.List;

import beispiele.arrays.Listen;


public class Klassen {
    public static void main(String[] args) {
        // Ein neues Objekt vom Typ City erzeugen:
        Ort ort1 = new Ort();

        // Die Attribute der Stadt mit Werten belegen:
        ort1.name = "Mannheim";
        ort1.distance = 0;

        // Ein weiteres Objekt erzeugen, dieses Mal mit dessen Konstruktor:
        Ort ort2 = new Ort("Frankfurt", 80);

        // Noch ein paar Städte:
        Ort ort3 = new Ort("Paris", 520);
        Ort ort4 = new Ort("Hamburg", 565);
        Ort ort5 = new Ort("Barcelona", 1250);
        Ort ort6 = new Ort("Heidelberg", 19);

        // Alle Orte in eine Liste speichern:
        List<Ort> orte = Arrays.asList(ort1, ort2, ort3, ort4, ort5, ort6);

        // Alle Orte ausgeben:
        Listen.printList(orte);

        // Den Ort mit der weitesten Entfernung ausgeben:
        System.out.println(farthestCity(orte));

        // Den Ort mit der kürzesten Entfernung ausgeben:
        System.out.println(nearestCity(orte));
    }

    public static Ort farthestCity(List<Ort> cities) {
        Ort farthest = null;
        for (Ort city : cities) {
            if ((farthest == null) || (city.distance > farthest.distance)) {
                farthest = city;
            }
        }
        return farthest;
    }

    public static Ort nearestCity(List<Ort> cities) {
        Ort nearest = null;
        for (Ort city : cities) {
            if ((nearest == null) || (city.distance < nearest.distance)) {
                nearest = city;
            }
        }
        return nearest;
    }
}
