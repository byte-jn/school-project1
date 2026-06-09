package OOP_Uebungsklausur;

public class Kurs {
    private int kursNr;
    private String titel;
    private int maxTeilnehmer;
    private int anzahlTeilnehmer;
    private double kursGebuehr;
    private int zaehler;

    public Kurs(String titel, int maxTeilnehmer) {
        this.titel = titel;
        this.maxTeilnehmer = maxTeilnehmer;
    }
}
