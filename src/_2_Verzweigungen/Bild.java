import java.util.Scanner;

public class Bild {
    public static void main(String[] args) {

        int h = getNumberInput("Gib die gewünschten Höhe ein:");

        int b = getNumberInput("Gib die gewünschten Beite ein:");

        int bytePix = getByteSize();

        int countPicture = getNumberInput("Anzahl Bilder:");

        // double gesamt = ((double) Math.round((h*b*bytePix*countPicture/1024/1024/1024*100))/100);
        System.out.println("Ihre Sammlung ist " + (((double) Math.round(h*b*bytePix*((double) countPicture)/1024/1024/1024*100))/100) + " GiB groß");
    }

    public static Integer colorCodeToByteSize(String colorCode) {
        return switch (colorCode) {
            case "sw" -> 1; // Schwarzweißbild
            case "g" -> 2; // Graustufen
            case "f" -> 3; // Farbbild
            case "c" -> 4; // CMYK
            default -> null; // Nichts
        };

//        Integer result;
//        switch (colorCode) {
//            case "sw":
//                result = 1; // Schwarzweißbild
//                break;
//            case "g":
//                result = 2; // Graustufen
//                break;
//            case "f":
//                result = 3; // Farbbild
//                break;
//            case "c":
//                result = 4; // CMYK
//                break;
//            default:
//                result = null; // Nichts
//                break;
//        };
//        return result;

//        Integer result;
//        if (colorCode.equals("sw")) {
//            result = 1; // Schwarzweißbild
//        } else if (colorCode.equals("g")) {
//            result = 2; // Graustufen
//        } else if (colorCode.equals("f")) {
//            result = 3; // Farbbild
//        } else if (colorCode.equals("c")) {
//            result = 4; // CMYK
//        } else {
//            result = null;
//        }
//        return result;
    }

    public static int getByteSize() {
        while (true) {
            String colorCode = getStringInput("Was für eine Farbvielfalt hat das Bild? Schwarzweißbild (sw), Graustufen (g), Farbbild (f), CMYK (c):");

            Integer size = colorCodeToByteSize(colorCode);
            if (size != null) return size;
        }
    }

    public static String getStringInput(String request) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print(request);
            String input = s.nextLine();

            if (input != "") {
                return input;
            }
        }
    }

    public static int getNumberInput(String request) {
        Scanner s = new Scanner(System.in);

        System.out.print(request);
        return s.nextInt();
    }
}