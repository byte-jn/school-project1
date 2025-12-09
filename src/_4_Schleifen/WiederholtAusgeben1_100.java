package _4_Schleifen;

public class WiederholtAusgeben1_100 {
    public static void main(String[] args) {
        int n = 100;
        int gau = (n+1)*n/2;
//        int gau = 0;
//        for (int i = 1; i <= n; i++) {
//            gau += i;
//        }
        System.out.println("Gaußsche Summenformel: " + gau);
    }
}
