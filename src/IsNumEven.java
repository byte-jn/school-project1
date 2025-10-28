import java.util.Scanner;

public class IsNumEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib die Zahl ein:");
        int num = input.nextInt();

        boolean isEven = ((num % 2) == 0);

        System.out.println(isEven);

        if (isEven) {
            num *= 2;
        } else {
            num += 1;
        }

        System.out.println(num); // true / false
    }
}
