package _4_Schleifen;

import java.util.Scanner;

public class DurchschnittsTemperatur {
    public static void main(String[] args) {
        // Vergleich mit dem langjährigen Mittelwert
        double durchschnitt = durchschnittRechnen();

        // Ausgabe der Durchschnittstemperatur
        System.out.println("Die Durchschnittstemperatur ist: " + durchschnitt);

        // Vergleichsergebnis speichern
        int verglichen = vergleicheTemperaturen(durchschnitt);

        // Ausgabe des Vergleichsergebnisses
        if (verglichen > 0) {
            System.out.println("Die Durchschnittstemperatur ist über dem langjährigen Mittelwert.");
        } else if (verglichen < 0) {
            System.out.println("Die Durchschnittstemperatur ist unter dem langjährigen Mittelwert.");
        } else {
            System.out.println("Die Durchschnittstemperatur entspricht dem langjährigen Mittelwert.");
        }
    }

    /**
     * Methode zur Berechnung der Durchschnittstemperatur
     * @return Durchschnittstemperatur
     */
    public static double durchschnittRechnen() {
        // Scanner zur Eingabe der Temperaturen
        Scanner scanner = new Scanner(System.in);
        double tempSum = 0;

        // Eingabe der Anzahl der Temperaturen
        System.out.println("Wie viele Temperaturen möchten Sie eingeben?");
        int anzahl = scanner.nextInt();

        // Schleife zur Eingabe der Temperaturen
        for (int i = 0; i < anzahl; i++) {
            // Eingabe der Temperatur
            System.out.println("Geben Sie bitte die " + (i+1) + ". Temperatur ein");

            // Einlesen der Temperatur
            tempSum += scanner.nextDouble();
        }

        scanner.close();

        // Berechnung und Rückgabe des Durchschnitts
        return tempSum / anzahl;
    }

    /**
     * Methode zum Vergleich der Durchschnittstemperatur mit dem langjährigen Mittelwert
     * @param temp Durchschnittstemperatur
     * @return 1 wenn über dem Mittelwert, -1 wenn unter dem Mittelwert, 0 wenn gleich dem Mittelwert
     */
    public static int vergleicheTemperaturen(double temp) {
        // Langjähriger Mittelwert
        double langwaerigerMittelwert = 20.0;

        // Vergleich der Temperaturen
        if (temp > langwaerigerMittelwert) {
            return 1;
        } else if (temp < langwaerigerMittelwert) {
            return -1;
        } else {
            return 0;
        }
    }
}
