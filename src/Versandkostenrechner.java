import java.util.Scanner;

public class Versandkostenrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib den Bestellwert in Euro ein:");
        double money = input.nextDouble();
        double moneyExtra = 0.00;

        if (money < 200) moneyExtra += 5.50; // Versandkosten hinzufügen ,fals genug geld

        System.out.println(
                "Bestellwert: " + money + "€\n" +
                "Versandkosten: " + moneyExtra + "€\n" +
                "Gesamt: " + (money + moneyExtra) + "€"
        );
    }
}
