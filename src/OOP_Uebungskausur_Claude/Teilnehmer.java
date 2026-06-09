package OOP_Uebungskausur_Claude;

import java.util.ArrayList;

public class Teilnehmer {
    private String name;
    private ArrayList<Kurs> kurse;

    public Teilnehmer(String name) {
        this.name = name;
        this.kurse = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Kurs> getKurse() {
        return kurse;
    }

    public void hinzufuegenKurs(Kurs kurs) {
        kurse.add(kurs);
    }

    @Override
    public String toString() {
        return name;
    }
}
