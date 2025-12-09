import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Objekt erzeugt
        System.out.print("Gib Zahl 1 ein:"); // Info in der Konsole ausgeben
        int a = input.nextInt(); // Strecke definieren

        System.out.print("Gib Zahl 2 ein:"); // Info in der Konsole ausgeben
        var b = input.nextInt();

        System.out.print("\n");

        int erg = (a / b);
        //int rest = (int) Math.round( (double) (a / b - erg) * b); // Alternative
        int rest = a % b;

        System.out.print(erg + ", " + rest);
    }
}
