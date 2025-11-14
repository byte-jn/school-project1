package _OutOfContext;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Objekt erzeugt
        ArrayList<String> eingaben = new ArrayList<>();
        int i = 0;
        String tempEingabe = "";
        while (true) {
            i++;
            System.out.print("Gib Text " + i + " ein:"); // Info in der Konsole ausgeben
            tempEingabe = input.nextLine();
            if (tempEingabe.isEmpty()) {
                break;
            }
            eingaben.add(tempEingabe);
        }

        while (true) {
            System.out.print("Welche Zelle willst du bearbeiten? :"); // Info in der Konsole ausgeben
            tempEingabe = input.nextLine();

            try {
                i = Integer.parseInt(tempEingabe);
                i--;
            }
            catch (Exception $e) {
                i = 0;
            }

            if (tempEingabe.isEmpty() || i == 0) {
                break;
            }

            System.out.print("Was willst du eintragen? :"); // Info in der Konsole ausgeben
            tempEingabe = input.nextLine();

            if (tempEingabe.isEmpty() || i == 0) {
                break;
            }

            eingaben.set(i, tempEingabe);

        }

        for (String s : eingaben) {
            System.out.println(s);
        }

    }
}
