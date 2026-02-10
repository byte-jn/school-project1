import java.util.Scanner;

/**
 * Berechnung von Flaeche und Umfang eines Rechtecks
 */
public class Rechteck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Objekt erzeugt
        System.out.print("Gib die Länge ein:"); // Info in der Konsole ausgeben
        var a = input.nextDouble(); // Strecke definieren

        System.out.print("Gib die Breite ein:"); // Info in der Konsole ausgeben
        var b = input.nextDouble();

        System.out.print("\n");

        double flaeche = a * b;
        double umfang = (a + b) * 2;

        System.out.print("Fläche = " + flaeche + "\nUmfang = " + umfang);
    }
}