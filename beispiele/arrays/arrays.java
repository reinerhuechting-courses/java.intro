package beispiele.arrays;

class Arrays {
    public static void main(String[] args) {
        // Eine Liste von Zahlen anlegen.
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        // Die Zahlen alle ausgeben.
        for (int i = 0; i<numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
        
        // Das geht auch mit einer Range-Schleife:
        for (var element : numbers) {
            System.out.printf("%d ", element);
        }
        System.out.println();
        
        // Damit wir die Schleife nicht andauernd wieder hinschreiben müssen,
        // kann man auch eine selbstgeschriebene Funktion dafür nutzen:
        printIntArray(numbers);
        
        // Noch eine Schleife, dieses Mal geben wir nur die geraden Zahlen aus:
        for (var element : numbers) {
            if (element % 2 == 0) {
                System.out.printf("%d ", element);
            }
        }
        System.out.println();
    }
    
    public static  void printIntArray(int[] array) {
        for (var element : array) {
            System.out.printf("%d ", element);
        }
        System.out.println();
    }
}