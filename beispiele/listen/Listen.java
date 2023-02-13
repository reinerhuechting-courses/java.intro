package beispiele.listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listen {
    public static void main(String[] args) {
        // Eine Liste von Zahlen erzeugen:
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        // Über die Zahlen iterieren und sie ausgeben:
        for (var element : numbers) {
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();

        // ... oder per Funktion:
        printList(numbers);

        // Die Primzahlen aus numbers heraussammeln und ausgeben:
        printList(primes(numbers));

        // Eine Liste von Strings erzeugen und ein paar Werte hinzufügen:
        List<String> cities  = new ArrayList<>();
        cities.add("Mannheim");
        cities.add("Hamburg");
        cities.add("Frankfurt");
        cities.add("Berlin");
        cities.add("München");

        // Die Liste ausgeben:
        printList(cities);

        // Abfrage, ob die Liste bestimmte Städte enthält:
        boolean containsBerlin = cities.contains("Berlin");
        boolean containsBremen = cities.contains("Bremen");

        // Ausgabe der Abfrageergebnisse:
        System.out.printf("Die Städteliste enthält Berlin%s.\n", containsBerlin ? "" : " nicht");
        System.out.printf("Die Städteliste enthält Bremen%s.\n", containsBremen ? "" : " nicht");

    }

    /**
     * Generische Funktion zum Ausgeben einer Liste auf die Konsole.
     * Diese Funktion ist unabhängig vom konkreten Elementtyp.
     * @param <T> Typ der Elemente in der Liste.
     * @param list Die auszugebende Liste.
     */
    public static <T> void printList(List<T> list) {
        for (var element : list) {
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();
    }

    /**
     * primes liefert zu einer Liste aus Zahlen diejenigen davon, die Primzahlen sind.
     * @param numbers Die eingehende Liste der Zahlen.
     * @return Die Primzahlen, die in numbers vorkommen.
     */
    public static List<Integer> primes(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (var number : numbers) {
            if (isPrime(number)) {
                result.add(number);
            }
        }
        return result;
    }

    /**
     * isPrime prüft, ob eine Zahl eine Primzahl ist.
     * @param n Die zu prüfende Zahl.
     * @return true, falls n eine Primzahl ist, ansonsten false.
     */
    public static boolean isPrime(int n) {
        for (int i=2; i<n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
