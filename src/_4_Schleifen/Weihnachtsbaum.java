package _4_Schleifen;

import java.util.Scanner;

public class Weihnachtsbaum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Breite des Weihnachtsbaums ein: ");
        int breite = (scanner.nextInt()+1)/2;

        System.out.print("Bitte geben Sie die Breite des Stamms ein: ");
        int stammbreite = scanner.nextInt();

        System.out.print("Bitte geben Sie die Höhe des Stamms ein: ");
        int stammhoehe = scanner.nextInt();

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

        for (int i = 1; i <= stammhoehe - 1; i++) {
            // Leerzeichen ausgeben
            for (int j = 1; j <= breite - (stammbreite / 2) - 1; j++) {
                System.out.print(" ");
            }
            // Stamm ausgeben
            for (int k = 1; k <= stammbreite; k++) {
                System.out.print("*");
            }
            // Neue Zeile
            System.out.println();
        }
    }
}
