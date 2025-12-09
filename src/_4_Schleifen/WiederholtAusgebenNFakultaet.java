package _4_Schleifen;

import java.util.Scanner;

public class WiederholtAusgebenNFakultaet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Zahl ein: ");
        int zahl = scanner.nextInt();
        int fakultaet = 1;
        for (int i = 1; i <= zahl; i++) {
            fakultaet *= i;
        }
        System.out.println("Fakultät: " + fakultaet);
    }
}
