package _OutOfContext;

public class RecusiveFaku {
    final static long limit = 20;

    /**
     * Vergleich der zwei Methoden zur Berechnung der Fakultät aller Zahlen von 1 bis n
     * @param args Kommandozeilenargumente, werden hier nicht verwendet
     */
    public static void main(String[] args) {
        long recFaku = recFaku(limit);
        System.out.println("RecFaku = " + recFaku);
        long intFaku = intFaku(limit);
        System.out.println("IntFaku = " + intFaku);

        if (recFaku != intFaku) {
            System.out.println("Fehler: " + recFaku + " != " + intFaku);
        }
    }

    /**
     * Rekursive Lösung: n * Fakultät aller Zahlen von 1 bis n-1
     * Aufwand steigt exponentiell, da für jede Zahl von n bis 1 eine neue Funktion aufgerufen wird
     * @param n Die Zahl, bis zu der die Summe berechnet werden soll
     * @return Summe aller Zahlen von 1 bis n
     */
    protected static long recFaku(long n) {
        if (n <= 1) return 1;
        return recFaku(n - 1) * n;
    }

    /**
     * Iterative Lösung: Alle Zahlen von 1 bis n durchgehen und multiplizieren
     * Aufwand steigt linear, da für jede Zahl von n bis 1 eine Multiplikation durchgeführt wird
     * @param n Die Zahl, bis zu der die Summe berechnet werden soll
     * @return Summe aller Zahlen von 1 bis n
     */
    protected static long intFaku(long n) {
        long sum = 1;
        for (int i = 1; i <= n; i++) sum *= i;
        return sum;
    }
}
