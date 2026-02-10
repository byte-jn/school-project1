package _4_Schleifen;
import java.util.Scanner;

public class StromanbieterTestKlassenarbeit {
    public static void main(String[] args) {
        // Stromkostenrechner für Privat- und Geschäftskunden
        Scanner scanner = new Scanner(System.in);

        // Endlosschleife, um mehrere Berechnungen durchzuführen
        while (true) {
            // Eingabe des Stromverbrauchs in kWh und intialisieren der Variablen
            System.out.println("Verbrauch in kWh: ");
            int verbrauchKWh = scanner.nextInt();
            double summe = 0;
            int freiKWh = 0;
            double kostenProKWh = 0;

            // Eingabe der Kundenart und Tarif
            System.out.println("Kundenart (p: privat, b: business): ");
            String kundenart = scanner.next();

            // Berechnung der Kosten basierend auf der Kundenart und Tarif
            if (kundenart.equals("p")) {
                // Eingabe des Tarifs für Privatkunden
                System.out.println("Tarif (öko: ÖkoStrom, pp: PowerPack): ");
                String tarif = scanner.next();

                // Berechnung der Kosten für Privatkunden basierend auf dem gewählten Tarif
                if (tarif.equals("öko")) {
                    summe = 165.50;
                    kostenProKWh = 37.15;
                } else if (tarif.equals("pp")) {
                    summe = 730;
                    freiKWh = 2000;
                    kostenProKWh = 34.40;
                } else {
                    System.out.println("Ungültiger Tarif für Privatkunden.");
                }
            } else if (kundenart.equals("b")) {
                summe = 131.5;
                kostenProKWh = 31.15;
            } else {
                System.out.println("Ungültige Kundenart.");
            }

            // Berechnung der Gesamtkosten basierend auf dem Verbrauch und den Kosten pro kWh
            if (summe > 0 && verbrauchKWh > freiKWh) {
                summe += (verbrauchKWh - freiKWh) * kostenProKWh;
                System.out.printf("Die Gesamtkosten betragen: %.2f EUR%n", summe);
            }

            // Abfrage, ob eine weitere Berechnung durchgeführt werden soll
            System.out.println("Möchten Sie eine weitere Berechnung durchführen? (j/n): ");
            String weitereBerechnung = scanner.next();
            if (weitereBerechnung.equals("n")) {
                break;
            }
            System.out.println("-----------------------------");
        }
        scanner.close();
    }
}
