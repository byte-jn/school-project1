import java.util.ArrayList;
import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner Objekt erzeugt
        ArrayList<String> eingaben = new ArrayList<>();
        int i = 0;
        while (true) {
            i++;
            System.out.print("Gib Text " + i + " ein:"); // Info in der Konsole ausgeben
            String tempEingabe = input.nextLine();
            if (tempEingabe.isEmpty()) {
                break;
            } else {
                eingaben.add(tempEingabe);
            }
        }
//
//        while (true) {
//            System.out.print("Welche Zelle willst du bearbeiten? :"); // Info in der Konsole ausgeben
//            int i = input.nextInt();
//        }

        for (String s : eingaben) {
            System.out.println(s);
        }

    }
}
