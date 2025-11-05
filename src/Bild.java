import java.util.Scanner;

public class Bild {
    public static void main(String[] args) {

        int h = (int) getNumberInput("Gib die gewünschten Höhe ein:");

        int b = (int) getNumberInput("Gib die gewünschten Beite ein:");

        int bytePix = colorCodeToByteSize(getStringInput("Was für eine Farbvielfalt hat das Bild? Schwarzweißbild (sw), Graustufen (g), Farbbild (f), CMYK (c):"));

        double anzahlBilder = getNumberInput("Anzahl Bilder:");

        System.out.println("Ihre Sammlung ist " + (((double) Math.round(h*b*bytePix*anzahlBilder/1024/1024/1024*100))/100) + "GB groß");
    }

    public static int colorCodeToByteSize(String colorCode) {
        int bytes = switch (colorCode) {
            case "sw" -> 1; // Schwarzweißbild
            case "g" -> 2; // Graustufen
            case "c" -> 4; // CMYK
            default -> 3; // Farbbild
        };

        System.out.println("Die größe eines Pixels beträgt jetzt " + bytes + " byte");

        return bytes;
    }

    public static String getStringInput(String request) {
        Scanner s = new Scanner(System.in);

        System.out.print(request);
        return s.next();
    }

    public static double getNumberInput(String request) {
        Scanner s = new Scanner(System.in);

        System.out.print(request);
        return s.nextDouble();
    }
}