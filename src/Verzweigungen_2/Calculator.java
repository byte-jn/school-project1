package Verzweigungen_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gib die erste Zahl ein: ");
        double x = input.nextDouble();

        System.out.print("Gib den Operator ein (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Gib die zweite Zahl ein: ");
        double y = input.nextDouble();

        validateOperator(op);
        System.out.println("Ergebnis: " + calc(x, y, op));
    }

    public static void validateOperator(char op) {
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Fehler: Ungültiger Operator");
            System.exit(1);
        }
    }

    public static void validateDivision(double y) {
        if (y == 0) {
            System.out.println("Fehler: Division durch Null");
            System.exit(1);
        }
    }

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
