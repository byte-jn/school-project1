import java.util.Scanner;

public class VerbrauchBenzin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Objekt erzeugt
        System.out.print("Gib die Strecke ein:"); // Info in der Konsole ausgeben
        double strecke = input.nextDouble(); // Strecke definieren
        System.out.print("Gib die verbrauchten Liter ein:"); // Info in der Konsole ausgeben
        double literBenzin = input.nextDouble();

        System.out.print("\n");

        double verbrauch = literBenzin * 100 / strecke;
        System.out.print("Dein Verbrauch liegt bei " + verbrauch + " l/100km");
    }
}
