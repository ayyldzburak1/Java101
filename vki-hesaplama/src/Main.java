import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, vki;
        System.out.println("Lütfen boyunuzu (metre cinsinde, örneğin: 1,67) giriniz :");
        Scanner girdi = new Scanner(System.in);

        boy = girdi.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");

        kilo = girdi.nextDouble();

        vki = (kilo/(boy*boy));
        System.out.println("Girmiş olduğunuz boy : " +boy
        + " \n Girmiş olduğunuz kilo : " +kilo
        + "\n Vücut Kitle İndeksiniz : " +vki);


    }
}
