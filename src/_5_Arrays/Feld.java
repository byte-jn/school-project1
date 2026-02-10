package _5_Arrays;

import java.util.Arrays;

public class Feld {
    /**
     * Anzeige aller Zahlen im Feld in der Reihenfolge, wie sie im Feld gespeichert sind
     */
    public static void anzeigen(int[] feld){
        for (int zahl : feld) {
            System.out.print(zahl + "  ");
        }
    }

    /**
     * Anzeige aller Zahlen im Feld in umgekehrter Reihenfolge, also von hinten nach vorne
     */
    public static void anzeigenVerkehrtHerum(int[] feld){
        for (int i = feld.length - 1; i >= 0; i--) {
            System.out.print(feld[i] + "  ");
        }
    }

    /**
     * Maximum berechnen: Alle Zahlen im Feld durchgehen und die größte Zahl merken
     */
    public static int maximum(int[] feld){
        int max = feld[0];
        for (int zahl : feld) {
            if (zahl > max) {
                max = zahl;
            }
        }

        return max;
    }

    /**
     * Minimum berechnen: Alle Zahlen im Feld durchgehen und die kleinste Zahl merken
     */
    public static int minimum(int[] feld){
        int min = feld[0];
        for (int zahl : feld) {
            if (zahl < min) {
                min = zahl;
            }
        }

        return min;
    }

    /**
     * Durchschnitt berechnen: Summe aller Zahlen im Feld durch die Anzahl der Elemente teilen
     */
    public static double durchschnitt(int[] feld){
        double summe = 0;
        for (int zahl : feld) {
            summe += zahl;
        }

        return summe / feld.length;
    }

    /**
     * Hauptmethode, die beim Starten des Programms ausgeführt wird
     */
    public static void main(String[] args) {
        int[] zahlenFeld  = new int[10]; //Deklaration und Erzeugung des Feldes
        //Feld mit Zufallszahlen von 0 bis 100 fuellen
        for(int i=0; i<10; i++){
            zahlenFeld[i] = (int)(Math.random()*100);
        }

        System.out.println("Durchschnitt: " + durchschnitt(zahlenFeld));
        System.out.println("Maximum: " + maximum(zahlenFeld));
        System.out.println("Minimum: " + minimum(zahlenFeld));

        anzeigenVerkehrtHerum(zahlenFeld);

        anzeigen(zahlenFeld);
    }
}