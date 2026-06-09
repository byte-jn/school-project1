package OOP_Uebungskausur_Claude;

public class Datum {
    private String datum;

    public Datum(String datum) {
        this.datum = datum;
    }

    public String getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return datum;
    }
}
