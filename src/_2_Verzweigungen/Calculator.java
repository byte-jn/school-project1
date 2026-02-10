package Verzweigungen_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Eingabe
        Scanner input = new Scanner(System.in);

        // Verzweigungen
        System.out.print("Gib die erste Zahl ein: ");
        double x = input.nextDouble();

        // Operator eingeben
        System.out.print("Gib den Operator ein (+, -, *, /): ");
        char op = input.next().charAt(0);

        // Zweite Zahl eingeben
        System.out.print("Gib die zweite Zahl ein: ");
        double y = input.nextDouble();

        // Operator validieren
        validateOperator(op);
        System.out.println("Ergebnis: " + calc(x, y, op));
    }

    /**
     * Validiert den Operator. Wenn der Operator ungültig ist, wird eine Fehlermeldung ausgegeben und das Programm wird mit einem Fehlercode von 1 beendet.
     * @param op
     * @return void
     */
    public static void validateOperator(char op) {
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Fehler: Ungültiger Operator");
            System.exit(1);
        }
    }

    /**
     * Validiert die Division. Wenn der Divisor 0 ist, wird eine Fehlermeldung ausgegeben und das Programm wird mit einem Fehlercode von 1 beendet.
     * @param y
     * @return void
     */
    public static void validateDivision(double y) {
        if (y == 0) {
            System.out.println("Fehler: Division durch Null");
            System.exit(1);
        }
    }

    /**
     * Berechnet das Ergebnis der Operation basierend auf den eingegebenen Zahlen und dem Operator.
     * @param x Erste Zahl
     * @param y Zweite Zahl
     * @param op Operator (+, -, *, /)
     * @return Ergebnis der Berechnung
     */
    public static double calc(double x, double y, char op) {
        switch (op) {
            case '+':
                return (x + y);
            case '-':
                return (x - y);
            case '*':
                return (x * y);
            case '/':
                validateDivision(y);
                return (x / y);
            default:
                System.out.println("Fehler: ?");
                System.exit(1);
                return 0; // Unreachable, but required for compilation
        }
    }
}
