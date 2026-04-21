package _OutOfContext;

public class RecusiveSum {
    final static int limit = 100;

    /**
     * Vergleich der drei Methoden zur Berechnung der Summe aller Zahlen von 1 bis n
     * @param args Kommandozeilenargumente, werden hier nicht verwendet
     */
    public static void main(String[] args) {
        int recSum = recSum(limit);
        System.out.println("RecSum = " + recSum);
        int intSum = intSum(limit);
        System.out.println("IntSum = " + intSum);
        int gausSum = gausSum(limit);
        System.out.println("GausSum = " + gausSum);

        if (recSum != intSum || intSum != gausSum) {
            System.out.println("Fehler: " + recSum + " != " + intSum + " != " + gausSum);
        }
    }

    /**
     * Rekursive Lösung: n + Summe aller Zahlen von 1 bis n-1
     * Aufwand steigt exponentiell, da für jede Zahl von n bis 1 eine neue Funktion aufgerufen wird
     * @param n Die Zahl, bis zu der die Summe berechnet werden soll
     * @return Summe aller Zahlen von 1 bis n
     */
    protected static int recSum(int n) {
        if (n <= 1) return 1;
        return recSum(n - 1) + n;
    }

    /**
     * Iterative Lösung: Alle Zahlen von 1 bis n durchgehen und aufsummieren
     * Aufwand steigt linear, da für jede Zahl von n bis 1 eine Addition durchgeführt wird
     * @param n Die Zahl, bis zu der die Summe berechnet werden soll
     * @return Summe aller Zahlen von 1 bis n
     */
    protected static int intSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    /**
     * Gaußsche Summenformel: n/2 * (n+1)
     * Immer gleicher technischer aufwand
     * @param n Die Zahl, bis zu der die Summe berechnet werden soll
     * @return Summe aller Zahlen von 1 bis n
     */
    protected static int gausSum(int n) {
        return n/2 * (n+1);
    }
}
