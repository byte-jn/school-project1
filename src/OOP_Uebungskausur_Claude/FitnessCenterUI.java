package OOP_Uebungskausur_Claude;

public class FitnessCenterUI {
    public static void main(String[] args) {
        FitnessCenterVerwaltung verwaltung = new FitnessCenterVerwaltung();

        // Trainer anlegen
        Trainer willi = new Trainer(1, "Willi Stark", "A-Lizenz", 20.50);
        Trainer susi = new Trainer(2, "Susi Wendig", "B-Lizenz", 17.80);
        verwaltung.hinzufuegenTrainer(willi);
        verwaltung.hinzufuegenTrainer(susi);

        // Kurse anlegen
        Kurs karate = new Kurs("Karate", "23.05.2015", 16, 108.0, willi);
        Kurs pilates = new Kurs("Pilates", "10.06.2015", 14, 95.0, susi);
        verwaltung.hinzufuegenKurs(karate);
        verwaltung.hinzufuegenKurs(pilates);

        // Teilnehmer anmelden
        verwaltung.anmeldenKurs("Uwe Hackel", "Karate");
        verwaltung.anmeldenKurs("Lutz Klein", "Karate");
        verwaltung.anmeldenKurs("Lisa Fitz", "Pilates");

        // Ausgabe aller Kurse mit Teilnehmern
        for (Kurs k : verwaltung.getKurse()) {
            System.out.println(k);
            System.out.print("Teilnehmer: ");
            StringBuilder sb = new StringBuilder();
            for (Teilnehmer t : k.getTeilnehmer()) {
                if (sb.length() > 0) sb.append("; ");
                sb.append(t.getName());
            }
            System.out.println(sb + ";");
            System.out.println();
        }
    }
}
