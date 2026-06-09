package OOP_Uebungskausur_Claude;

public class Trainer {
    private int personalNr;
    private String name;
    private String lizenz;
    private double stundenlohn;

    public Trainer(int personalNr, String name, String lizenz, double stundenlohn) {
        this.personalNr = personalNr;
        this.name = name;
        this.lizenz = lizenz;
        this.stundenlohn = stundenlohn;
    }

    public int getPersonalNr() {
        return personalNr;
    }

    public String getName() {
        return name;
    }

    public String getLizenz() {
        return lizenz;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    @Override
    public String toString() {
        return name;
    }
}
