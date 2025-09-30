import java.util.Scanner;

public class Umrechnen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib die Temperatur in Farenheit ein:");
        double farenheit = input.nextDouble();

        double celsius = ( farenheit - 32 ) * 5 / 9;

        System.out.print("Celsius: " + celsius);
    }
}
