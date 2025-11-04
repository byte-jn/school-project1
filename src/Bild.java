import java.util.Scanner;

public class Bild {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gib die gewünschten Höhe ein:");
        double h = input.nextInt();

        System.out.print("Gib die gewünschten Beite ein:");
        double b = input.nextInt();

        System.out.print("Bite pro Pixel:");
        double bytePix = input.nextInt();

        System.out.print("Anzahl Bilder:");
        double anzahlBilder = input.nextInt();

        System.out.println(((double) Math.round(h*b*bytePix*anzahlBilder/1024/1024/1024*100))/100);


    }
}
