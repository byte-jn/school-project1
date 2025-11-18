package Verzweigungen_2;

import java.util.Scanner;

public class NumberToMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib eine Zahl von 1 bis 12 ein:");
        validateMonthNumber(input.nextInt());
        System.out.println(numberToMonth(input.nextInt()));
    }

    public static void validateMonthNumber(int number) {
        if (number < 1 || number > 12) {
            System.out.println("Fehler: Invaild month number");
            System.exit(1);
        }
    }

    public static String numberToMonth(int number) {
        return switch (number) {
            case 1 -> "Januar";
            case 2 -> "Februar";
            case 3 -> "März";
            case 4 -> "April";
            case 5 -> "Mai";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Dezember";
            default -> "Offset Error";
        };
    }
}
