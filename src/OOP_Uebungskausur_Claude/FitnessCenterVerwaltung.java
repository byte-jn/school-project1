package OOP_Uebungskausur_Claude;

import java.util.ArrayList;

public class FitnessCenterVerwaltung {
    private ArrayList<Teilnehmer> teilnehmer;
    private ArrayList<Kurs> kurse;
    private ArrayList<Trainer> trainer;

    public FitnessCenterVerwaltung() {
        this.teilnehmer = new ArrayList<>();
        this.kurse = new ArrayList<>();
        this.trainer = new ArrayList<>();
    }

    public void anlegenTeilnehmer(String name) {
        teilnehmer.add(new Teilnehmer(name));
    }

    public Teilnehmer suchenTeilnehmer(String name) {
        for (Teilnehmer t : teilnehmer) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    public Kurs suchenKurs(String titel) {
        for (Kurs k : kurse) {
            if (k.getTitel().equals(titel)) {
                return k;
            }
        }
        return null;
    }

    public void hinzufuegenKurs(Kurs kurs) {
        kurse.add(kurs);
    }

    public void hinzufuegenTrainer(Trainer t) {
        trainer.add(t);
    }

    public ArrayList<Kurs> getKurse() {
        return kurse;
    }

    public boolean anmeldenKurs(String teilnehmerName, String kursTitel) {
        Kurs kurs = suchenKurs(kursTitel);
        if (kurs == null) {
            return false;
        }
        Teilnehmer t = suchenTeilnehmer(teilnehmerName);
        if (t == null) {
            t = new Teilnehmer(teilnehmerName);
            teilnehmer.add(t);
        }
        return kurs.anmelden(t);
    }
}
