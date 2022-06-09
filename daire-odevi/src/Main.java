import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi=3.14,r,alan,cevre,a,dilimAlan;
        Scanner inp = new Scanner(System.in);

        System.out.println("Yarı çapı giriniz : ");

       r = inp.nextInt();
        System.out.println("Dairenin merkez açısının ölçüsü olan daire diliminin değerini giriniz : ");
        a = inp.nextInt();

       alan = pi*(r*r);
       cevre = 2*pi*r;
       dilimAlan = (pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı  = " +alan +"\nDairenin çevresi = " +cevre + "\nDaire diliminin alanı = " +dilimAlan);
    }
}
