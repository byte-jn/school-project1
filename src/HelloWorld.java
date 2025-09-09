public class HelloWorld {
    public static void main(String[] args) {
        // Zeichenkette
        var name = "Jannis";
        //String name = "Jannis";

        // Gibt in Console aus
        System.out.print("Hello, " + name + "\n");

        // Weißt automatisch zu
        var gesamtalter = 5;
        //int gesamtalter = 5;

        // Wird in double converiter dann geteilt und gesetzt
        var durchschnitt = (double) gesamtalter/2;
        // double durchschnitt = (double) gesamtalter/2;

        System.out.println(gesamtalter + " " + durchschnitt);
    }
}