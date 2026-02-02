package _4_Schleifen;
import java.util.Scanner;

public class StromanbieterTestKlassenarbeit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Verbrauch in kWh: ");
            int verbrauchKWh = scanner.nextInt();
            double summe = 0;
            int freiKWh = 0;
            double kostenProKWh = 0;

            System.out.println("Kundenart (p: privat, b: business): ");
            String kundenart = scanner.next();

            if (kundenart.equals("p")) {
                System.out.println("Tarif (öko: ÖkoStrom, pp: PowerPack): ");
                String tarif = scanner.next();

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

            if (summe > 0 && verbrauchKWh > freiKWh) {
                summe += (verbrauchKWh - freiKWh) * kostenProKWh;
                System.out.printf("Die Gesamtkosten betragen: %.2f EUR%n", summe);
            }

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
