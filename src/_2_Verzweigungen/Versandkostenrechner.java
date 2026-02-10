import java.util.Scanner;

public class Versandkostenrechner {
    public static void main(String[] args) {
        // Eingabe des Bestellwerts
        Scanner input = new Scanner(System.in);
        System.out.print("Gib den Bestellwert in Euro ein:");
        double money = input.nextDouble();
        double moneyExtra = 0.00;

        // Versandkosten 5.50€ wenn Bestellwert unter 200€
        if (money < 200) moneyExtra += 5.50; // Versandkosten hinzufügen ,fals genug geld

        // Versandkostenfrei ab 200€
        System.out.println(
                "Bestellwert: " + money + "€\n" +
                "Versandkosten: " + moneyExtra + "€\n" +
                "Gesamt: " + (money + moneyExtra) + "€"
        );
    }
}
