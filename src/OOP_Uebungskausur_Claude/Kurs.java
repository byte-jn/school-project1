package OOP_Uebungskausur_Claude;

import java.util.ArrayList;

public class Kurs {
    private static int naechsteKursNr = 1;

    private int kursNr;
    private String titel;
    private int maxTeilnehmer;
    private int anzahlTeilnehmer;
    private double kursGebuehr;
    private Datum kursBeginn;
    private Trainer trainer;
    private ArrayList<Teilnehmer> teilnehmer;

    public Kurs(String titel, String beginn, int maxTeilnehmer, double kursGebuehr, Trainer trainer) {
        this.kursNr = naechsteKursNr++;
        this.titel = titel;
        this.kursBeginn = new Datum(beginn);
        this.maxTeilnehmer = maxTeilnehmer;
        this.kursGebuehr = kursGebuehr;
        this.trainer = trainer;
        this.anzahlTeilnehmer = 0;
        this.teilnehmer = new ArrayList<>();
    }

    public boolean anmelden(Teilnehmer neuerTeilnehmer) {
        if (anzahlTeilnehmer >= maxTeilnehmer) {
            return false;
        }
        anzahlTeilnehmer++;
        teilnehmer.add(neuerTeilnehmer);
        neuerTeilnehmer.hinzufuegenKurs(this);
        return true;
    }

    public int getKursNr() {
        return kursNr;
    }

    public String getTitel() {
        return titel;
    }

    public ArrayList<Teilnehmer> getTeilnehmer() {
        return teilnehmer;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    @Override
    public String toString() {
        return "Kurs " + kursNr + ": " + titel + " ab " + kursBeginn + " (Trainer " + trainer.getName() + ")";
    }
}
