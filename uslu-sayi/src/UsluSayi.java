import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Üssü Alınacak Sayı Giriniz");
        int sayi = sc.nextInt();
        System.out.println("Sayının Kuvvetini Giriniz");
        int kuvvet = sc.nextInt();

        int toplam = 1;

        for (int i = 1; i <= kuvvet; i++) {
            toplam *= sayi;
        }
        System.out.println(sayi + " sayısının " + kuvvet + " üssü = " + toplam);
    }
}