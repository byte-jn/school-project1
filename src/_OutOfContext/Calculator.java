package _OutOfContext;

import java.util.Scanner;

public class Calculator { // Erweitertet Taschenrechner `Verzweigungen_2/Calculator.java`
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gib die erste Rechnung ein: ");
        double x = Double.parseDouble(input.next());
        String op = input.next();
        double y = Double.parseDouble(input.next());

        System.out.println("Ergebnis: " + calc(x, y, op));
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
