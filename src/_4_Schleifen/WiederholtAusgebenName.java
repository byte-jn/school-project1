package _4_Schleifen;

import java.util.Scanner;

public class WiederholtAusgebenName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hallo " + name + "!");
        }
    }
}
