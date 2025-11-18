package Verzweigungen_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gib die erste Zahl ein: ");
        double x = input.nextDouble();

        System.out.print("Gib den Operator ein (+, -, *, /): ");
        String op = input.next();
        input.nextLine(); // Puffer leeren

        System.out.print("Gib die zweite Zahl ein: ");
        double y = input.nextDouble();

        validateOperator(op);
        if (op.equals("/")) {
            validateDivision(y);
        }

        System.out.println("Ergebnis: " + calc(x, y, op));
    }

    public static void validateOperator(String op) {
        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            System.out.println("Fehler: Ungültiger Operator");
        }
    }

    public static void validateDivision(double y) {
        if (y == 0) {
            System.out.println("Fehler: Division durch Null");
        }
    }

    public static double calc(double x, double y, String op) {
        switch (op) {
            case "+":
                return (x + y);
            case "-":
                return (x - y);
            case "*":
                return (x * y);
            case "/":
                if (y != 0) {
                    return (x / y);
                } else {
                    System.out.println("Fehler: Division durch Null");
                    return 0;
                }
            default:
                System.out.println("Fehler: Ungültiger Operator");
                return 0;
        }
    }
}
