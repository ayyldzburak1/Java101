import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, tripType;
        double perKm = 0.10;
        double amount;
        boolean isError = false;

        System.out.print("Kilometreyi Giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
        System.out.print("Yolculuk Tipini Seçiniz: ");
        tripType = input.nextInt();

        amount = km * perKm;

        if (km <= 0 || age < 0 || ((tripType != 1) && (tripType != 2))) {
            isError = true;
        } else {
            if (age < 12) {
                amount = amount * 0.5;
            } else if (age >= 12 && age <= 24) {
                amount = amount * 0.9;
            } else if (age >= 65) {
                amount = amount * 0.7;
            }

            switch (tripType) {
                case 1:
                    break;
                case 2:
                    amount = amount * 0.8;
                    amount = amount * 2;
                    break;
            }
        }

        if (!(isError)) {
            System.out.println("Toplam Tutar : " + amount);
        } else {
            System.out.println("Hatali Veri Girişi Yaptiniz!");
        }

    }
}