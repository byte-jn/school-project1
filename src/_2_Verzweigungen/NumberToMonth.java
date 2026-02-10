package Verzweigungen_2;

import java.util.Scanner;

public class NumberToMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib eine Zahl von 1 bis 12 ein:");
        validateMonthNumber(input.nextInt());
        System.out.println(numberToMonth(input.nextInt()));
    }

    /**
     * Validates if the given number is between 1 and 12 (inclusive).
     * If the number is invalid, it prints an error message and exits the program.
     * @param number the month number to validate
     * @throws IllegalArgumentException if the number is not between 1 and 12
     * @return void
     */
    public static void validateMonthNumber(int number) {
        if (number < 1 || number > 12) {
            System.out.println("Fehler: Invaild month number");
            System.exit(1);
        }
    }

    /**
     * Converts a month number (1-12) to its corresponding month name in German.
     * @param number
     * @return String the name of the month corresponding to the given number, or "Offset Error" if the number is invalid
     */
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
