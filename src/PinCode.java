import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib den Pin ein:");
        int pin = input.nextInt();

        if (pin != 4711) {
            System.out.println("Falscher Pin");
            return;
        } // false

        System.out.println("Richtig"); // true
    }
}
