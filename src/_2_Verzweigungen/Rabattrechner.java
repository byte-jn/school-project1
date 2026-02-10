import java.util.Scanner;

public class Rabattrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib den Bestellwert in Euro ein:");
        double money = input.nextDouble();
        double rabatt = 0; // nix

        if (money > 500) rabatt = 0.1; // 10%
        else if (money > 100) rabatt = 0.05; // 5%

        System.out.println(
                "Bestellwert: " + money + "€\n" +
                "Rabatt: " + (int) (rabatt * 100) + "%\n" +
                "Gesamt: " + (money * (1 - rabatt)) + "€"
        );
    }
}
