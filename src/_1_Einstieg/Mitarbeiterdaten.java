import java.util.Scanner;

/**
 * Ausgabe von Mitarbeiterdaten
 */
public class Mitarbeiterdaten {
    public static void main(String[] args) {
        int id = 3;
        String name = "Müller, Karl";
        int alter = 34;
        String adresse = "Mühlenweg 1A, 01069 Dresden";
        String telefonnummer = "0177 1234567";
        String beruf = "Fachinfomatiker";
        boolean verheiratet = true;
        int lohnklassen = 3;
        int kinder = 2;
        double gehalt = 2870.00;

        System.out.print("id: " + id + "\n" +
                "Name:" + name + "\n" +
                "Alter: " + alter + "\n" +
                "Adresse: " + adresse + "\n" +
                "Telefonnummer: " + telefonnummer + "\n" +
                "Beruf: " + beruf + "\n" +
                "Ist verheiratet: " + verheiratet + "\n" +
                "Lohnklasse: " + lohnklassen + "\n" +
                "Anzahl Kinder: " + kinder + "\n" +
                "Gehalt: " + gehalt
        );
    }
}
