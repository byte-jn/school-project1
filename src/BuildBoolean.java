import javax.naming.PartialResultException;
import java.util.*;

class Color {
    boolean red = false;
    boolean green = false;
    boolean blue = false;
    boolean yellow = false;
    boolean orange = false;
    boolean purple = false;
    boolean black = false;
    boolean white = false;

    public Color(String name) {
        switch(name.toLowerCase()) { // Ignoriert Groß-/Kleinschreibung
            case "red":
                red = true;
                break;
            case "green":
                green = true;
                break;
            case "blue":
                blue = true;
                break;
            case "yellow":
                yellow = true;
                break;
            case "orange":
                orange = true;
                break;
            case "purple":
                purple = true;
                break;
            case "black":
                black = true;
                break;
            case "white":
                white = true;
                break;
            default:
                System.out.println("Unbekannte Farbe: " + name);
        }
    }
}

class Pixel {
    String name;
    long id;
    int hNumber;
    int bNumber;
    boolean activ;
    int byteSize;
    Color color;

    Pixel(String name, long id, int hNumber, int bNumber, boolean activ, int byteSize, String colorN) {
        this.activ = activ;
        this.byteSize = byteSize;
        this.color = new Color(colorN);
    }
}

class Picture {
    long id;
    List<Pixel> pixel;
    long anzahlPixel;

    Picture(long id, List<Pixel> pixel, long anzahlPixel) {
        this.id = id;
        this.pixel = pixel;
        this.anzahlPixel = anzahlPixel;
    }
}

public class BuildBoolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gib die gewünschten Höhe ein:");
        double hmax = input.nextInt();

        System.out.print("Gib die gewünschten Beite ein:");
        double bmax = input.nextInt();

        System.out.print("Bite pro Pixel:");
        int bytePix = input.nextInt();

        System.out.print("Anzahl Bilder:");
        double anzahlBilder = input.nextInt();

        List<Pixel> pixel = new ArrayList<>();
        List<Picture> pictures = new ArrayList<>();

        int i = -1;
        for (int b = -1; b < bmax; b++) {
            for (int h = -1; h < hmax; h++) {
                i++;
                pixel.add(new Pixel("Pixel" + i + "h" + h + "b" + b, i, h, b, true, bytePix, "white"));
            }
        }

        System.out.println(pixel);

        for (int ab = 0; ab < anzahlBilder; ab++) {
            pictures.add(new Picture(ab, pixel, pixel.size()));
        }

        for (int ab = 0; ab < anzahlBilder; ab++) {
            System.out.println(pictures.get(ab));
            i = -1;
            for (int b = -1; b < bmax; b++) {
                for (int h = -1; h < hmax; h++) {
                    i++;
                    System.out.println(pictures.get(ab).pixel.get(i).name);
                }
            }
        }
        System.out.println(((double) Math.round(pixel.size()*bytePix*anzahlBilder/1024/1024/1024*100))/100);

    }
}
