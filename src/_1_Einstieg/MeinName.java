import java.util.Scanner;

/**
 * Begruessung des Nutzers und Verdopplung einer eingegebenen Zahl
 */
public class MeinName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Objekt erzeugt
        System.out.print("Gib deinen namen ein:"); // Info in der Konsole ausgeben
        String name = input.next(); // Text in der Variablen meinText

        System.out.print("Hallo " + name + "! \n"); // Product

        System.out.print("Gib eine Zahl ein:"); // Info in der Konsole ausgeben
        int x = input.nextInt();

        for (int i = 1; i < 8; i++) {
            x *= 2;
            System.out.println(x);
        }
    }
}
