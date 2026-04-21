package _OutOfContext;

public class DecBin {
    final static int limit = 97;

    /**
     * Vergleich der drei Methoden zur Berechnung der Binärdarstellung einer Dezimalzahl
     * @param args Kommandozeilenargumente, werden hier nicht verwendet
     */
    public static void main(String[] args) {
        System.out.println("DecToBin with while loop: " + decToBin(limit));
        System.out.println("RecDecToBin with rec loop:  " + recDecToBin(limit));
        System.out.println("Java Integer.toBinaryString Function: " + Integer.toBinaryString(limit));

        // Beste Lösung, ohne zwischen variable zu speichern, da die Ausgabe direkt in der Funktion erfolgt
        System.out.print("RecFaku with rec loop: ");
        recFaku(limit);
    }

    /**
     * Iterative Lösung: Rest der Division von n durch 2 + Binärdarstellung aller Zahlen von 1 bis n-1
     * Aufwand steigt linear, da für jede Zahl von n bis 1 eine Addition durchgeführt wird
     * @param dec Decimal Number
     * @return Binär Number
     */
    protected static String decToBin(int dec) {
        String bin = "";
        while (true) {
            int rest = dec % 2;
            dec /= 2;
            bin = rest + bin;
            if (dec == 0) return bin;
        }
    }

    /**
     * Rekursive Lösung: Binärdarstellung aller Zahlen von 1 bis n-1 + Rest der Division von n durch 2
     * Aufwand steigt exponentiell, da für jede Zahl von n bis 1 eine neue Funktion aufgerufen wird
     * @param dec Decimal Number
     * @return Binär Number
     */
    protected static String recDecToBin(int dec) {
        if (dec == 0) return "0";
        if (dec == 1) return "1";
        return recDecToBin(dec / 2) + (dec % 2);
    }

    protected static void recFaku(int n) {
        if (n == 0) return;
        int sum = n / 2;
        int rest = n % 2;
        recFaku(sum);
        System.out.print(rest);
    }
}
