import java.util.Scanner;

public class VerbrauchBenzin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Objekt erzeugt
        System.out.print("Gib die Strecke ein:"); // Info in der Konsole ausgeben
        double strecke = input.nextDouble(); // Strecke definieren

        if (strecke == 0) { // Wenn Strecke 0 ist, dann...
            System.out.print("Du bist zu wenig gefahren");
        } else {
            // Wenn Strecke nicht 0 ist
            System.out.print("Gib die verbrauchten Liter ein:"); // Info in der Konsole ausgeben
            double literBenzin = input.nextDouble();

            // Wenn Liter Benzin 0 oder kleiner ist, dann...
            if (literBenzin <= 0) {
                System.out.print("Das ist unmöglich");
            }
            else {
                System.out.print("\n");

                // Wenn Strecke negativ ist, dann wird sie positiv gemacht
                if (strecke < 0) strecke *= -1;
                double verbrauch = literBenzin * 100 / strecke;
                verbrauch = ((double) Math.round(verbrauch * 100)) / 100;
                System.out.print("Dein Verbrauch liegt bei " + verbrauch + " l/100km");
            }
        }
    }
}
