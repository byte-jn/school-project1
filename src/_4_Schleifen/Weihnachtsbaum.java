package _4_Schleifen;

import java.util.Scanner;

public class Weihnachtsbaum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Breite des Weihnachtsbaums ein: ");
        int breite = isEvenReturnOdd(scanner.nextInt()/2 + 1) ;

        printTree(breite);

        printStamm(breite);
    }

    /**
     * Gibt einen Weihnachtsbaum mit der angegebenen Breite aus.
     * @param breite
     * @return void
     */
    public static void printTree(int breite){
        for (int i = 1; i <= breite; i++) {
            // Leerzeichen ausgeben
            for (int j = breite; j > i; j--) {
                System.out.print(" ");
            }
            // Sterne ausgeben
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Neue Zeile
            System.out.println();
        }
    }

    /**
     * Gibt den Stamm des Weihnachtsbaums mit der angegebenen Breite aus.
     * @param breite
     * @return void
     */
    public static void printStamm(int breite) {
        int stammbreite = isEvenReturnOdd(breite / 2);
        int stammhoehe = isEvenReturnOdd(breite / 2 - 1);

        for (int i = 0; i <= stammhoehe - 1; i++) {
            // Leerzeichen ausgeben
            for (int j = 1; j <= breite - (stammbreite / 2) - 1; j++) {
                System.out.print(" ");
            }
            // Stamm ausgeben
            for (int k = 1; k <= stammbreite; k++) {
                System.out.print("I");
            }
            // Neue Zeile
            System.out.println();
        }
    }

    /**
     * Überprüft, ob die Zahl gerade ist. Wenn ja, gibt sie die nächste ungerade Zahl zurück, andernfalls gibt sie die Zahl selbst zurück.
     * @param number
     * @return int
     */
    public static int isEvenReturnOdd(int number) {
        return number % 2 == 0 ? number + 1 : number;
    }
}
