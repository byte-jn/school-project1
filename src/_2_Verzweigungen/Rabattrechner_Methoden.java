import java.util.Scanner;

public class Rabattrechner_Methoden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib den Bestellwert in Euro ein:");
        double money = input.nextDouble();
        double rabatt = getRabatt(money);

        System.out.println(
                "Bestellwert: " + money + "€\n" +
                "Rabatt: " + (rabatt * 100) + "%\n" +
                "Gesamt: " + (money * (1 - rabatt)) + "€"
        );
    }

    /**
     * Berechnet den Rabatt basierend auf dem Bestellwert.
     * @param money Bestellwert in Euro
     * @return Rabatt als Dezimalzahl (z.B. 0.1 für 10%)
     */
    private static double getRabatt(double money) {
        double rabatt = 0;
        if (money > 500) rabatt = 0.1; // 10%
        else if (money > 100) rabatt = 0.05; // 5%
        return rabatt;
    }
}
