import java.util.Scanner;
public class BspCharArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Endlosschleife für wiederholte Eingabe
        while (true) {
            // Eingabe eines Wortes
            System.out.print("Gib ein Wort ein: ");
            String wort = s.next();

            // Umwandlung des Wortes in ein char-Array und Überprüfung
            char[] zeichen = wort.toCharArray();
            boolean ok = check(zeichen);

            // Ausgabe des Ergebnisses der Überprüfung
            if (!ok) {
                System.out.println("Ungültige Zeichen im Wort enthalten.");
            } else {
                System.out.println("Alle Zeichen sind gültig.");
            }

            // Abfrage, ob ein weiteres Wort eingegeben werden soll
            System.out.print("Möchten Sie ein weiteres Wort eingeben? (j/n): ");
            String antwort = s.next();
            if (antwort.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    /**
     * Überprüft ein char-Array auf gültige Zeichen
     * @param zeichen das zu überprüfende char-Array
     * @return true, wenn alle Zeichen gültig sind, sonst false
     */
    private static boolean check(char[] zeichen) {
        for (char c : zeichen) {
            boolean valid = checkValid(c);
            if (!valid) {
                return false;
            }
        }
        return true;
    }

    /**
     * Überprüft, ob ein Zeichen gültig ist
     * @param c das zu überprüfende Zeichen
     * @return true, wenn das Zeichen gültig ist, sonst false
     */
    private static boolean checkValid(char c) {
        char[] validCharacters = {'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l'};
        for (char v : validCharacters) {
            if (c == v) {
                return true;
            }
        }

        return false;
    }
}