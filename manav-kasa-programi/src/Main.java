import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam;
        System.out.println("Meyveler ve KG Fiyatları \nArmut : 2,14 TL \nElma : 3,67 TL " +
                "\nDomates : 1,11 TL \nMuz: 0,95 TL \nPatlıcan : 5,00 TL");
        Scanner girdi = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armut *= girdi.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma *= girdi.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates *= girdi.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz *= girdi.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican *= girdi.nextDouble();
        toplam = armut + elma + domates + muz + patlican;
        System.out.print("Toplam Tutar : " + toplam + " TL");
    }
}
