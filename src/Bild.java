import java.util.Scanner;

public class Bild {
    public static void main(String[] args) {

        int h = (int) getNumberInput("Gib die gewünschten Höhe ein:");

        int b = (int) getNumberInput("Gib die gewünschten Beite ein:");

        int bytePix = getByteSize();

        double anzahlBilder = getNumberInput("Anzahl Bilder:");

        System.out.println("Ihre Sammlung ist " + (((double) Math.round(h*b*bytePix*anzahlBilder/1024/1024/1024*100))/100) + "GB groß");
    }

    public static Integer colorCodeToByteSize(String colorCode) {
        return switch (colorCode) {
            case "sw" -> 1; // Schwarzweißbild
            case "g" -> 2; // Graustufen
            case "f" -> 3; // Farbbild
            case "c" -> 4; // CMYK
            default -> null;
        };
    }

    public static int getByteSize() {
        while (true) {
            String colorCode = getStringInput("Was für eine Farbvielfalt hat das Bild? Schwarzweißbild (sw), Graustufen (g), Farbbild (f), CMYK (c):");

            Integer size = colorCodeToByteSize(colorCode);
            if (size != null) return size;
        }
    }

    public static String getStringInput(String request) {
        while (true) {
            Scanner s = new Scanner(System.in);

            System.out.print(request);
            String input = s.nextLine();

            if (input != "") {
                return input;
            }
        }
    }

    public static double getNumberInput(String request) {
        Scanner s = new Scanner(System.in);

        System.out.print(request);
        return s.nextDouble();
    }
}