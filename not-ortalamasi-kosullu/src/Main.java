import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, kimya, fizik, tarih, muzik, turkce;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = inp.nextInt();
        System.out.println("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.println("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.println("Tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.println("Müzik notunuz : ");
        muzik = inp.nextInt();
        System.out.println("Türkçe notunuz : ");
        turkce = inp.nextInt();
        if (mat > 100 || mat < 0) {
            mat = 0;
        }
        if (kimya > 100 || kimya < 0) {
            kimya = 0;
        }
        if (fizik > 100 || fizik < 0) {
            fizik = 0;
        }
        if (tarih > 100 || tarih < 0) {
            tarih = 0;
        }

        if (muzik > 100 || muzik < 0) {
            muzik = 0;
        }
        if (turkce > 100 || turkce < 0) {
            turkce = 0;
        }
        int toplam = mat + kimya + fizik + tarih + muzik + turkce;
        double sonuc = toplam / 6;
        if (sonuc < 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");

        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");

        }
        System.out.println("Ortalamanız :" + sonuc);


    }
}
