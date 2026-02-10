package _5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DurchschnittsTemperatur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Anzahl der Temperaturen
        System.out.println("Wie viele Temperaturen möchten Sie eingeben?");
        int anzahl = scanner.nextInt();

        // Array zur Speicherung der Temperaturen
        double[] temperature = new double[anzahl];

        // Eingabe der Temperaturen
        for (int i = 0; i < anzahl; i++) {
            System.out.println("Geben Sie bitte die " + (i + 1) + ". Temperatur ein");
            temperature[i] = scanner.nextDouble();
        }

        // Berechnung der Durchschnittstemperatur
        double durchschnitt = Arrays.stream(temperature).sum() / anzahl;

        // Ausgabe der Durchschnittstemperatur
        System.out.println("Die Durchschnittstemperatur ist: " + durchschnitt);
    }
}
