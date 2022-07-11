import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        int oncekiSayi = 0, simdikiSayi = 1, sonrakiSayi =0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elamanSayisi = sc.nextInt();

        for (int i = 0; i <= elamanSayisi; i++) {
            System.out.print(oncekiSayi + " ");

            sonrakiSayi=oncekiSayi + simdikiSayi;
            oncekiSayi=simdikiSayi;
            simdikiSayi=sonrakiSayi;

        }
    }
}