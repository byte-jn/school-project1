package _5_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Berechnet die Durchschnittstemperatur aus dynamisch eingegebenen Werten
 */
public class DynamischDurchschnittsTemperatur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array zur Speicherung der Temperaturen
        ArrayList<Double> temperature = new ArrayList<>();

        // Eingabe der Temperaturen
        while (true) {
            System.out.println("Geben Sie bitte die Temperatur ein");
            temperature.add(scanner.nextDouble());

            System.out.println("Möchten Sie weitere Temperaturen eingeben? (ja/nein)");
            String antwort = scanner.next();
            if (antwort.equals("n")) {
                break;
            }
        }

        // Berechnung der Durchschnittstemperatur
        double summe = temperature.stream().mapToDouble(Double::doubleValue).sum();
        double durchschnitt = summe / temperature.toArray().length;

        // Ausgabe der Durchschnittstemperatur
        System.out.println("Die Durchschnittstemperatur ist: " + durchschnitt);

        scanner.close();
    }
}
