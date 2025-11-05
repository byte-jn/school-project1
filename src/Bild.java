import java.util.Scanner;

public class Bild {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gib die gewünschten Höhe ein:");
        double h = input.nextInt();

        System.out.print("Gib die gewünschten Beite ein:");
        double b = input.nextInt();

        System.out.print("Was für eine Farbvielfalt hat das Bild? Schwarzweißbild (sw), Graustufen (g), Farbbild (f), CMYK (c):");
        String colorType = input.next();

        double bytePix;
        switch (colorType){
            case "sw":
                bytePix = 1; // Schwarzweißbild
                break;
            case "g":
                bytePix = 2; // Graustufen
                break;
            case "c":
                bytePix = 4; // Farbbild
                break;
            default:
                bytePix = 3; // CMYK
                break;
        }

        System.out.println("Dass sind dann " + bytePix + " bit pro Pixel");

        System.out.print("Anzahl Bilder:");
        double anzahlBilder = input.nextInt();

        System.out.println("Ihre Sammlung ist " + (((double) Math.round(h*b*bytePix*anzahlBilder/1024/1024/1024*100))/100) + "GB groß");
    }
}