import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, kimya, fizik, tarih, muzik, turkce;

        Scanner inp =  new Scanner(System.in);

        System.out.println("Matematik notunuz : "  );
         mat = inp.nextInt();
        System.out.println("Kimya notunuz : " );
        kimya = inp.nextInt();
        System.out.println("Fizik notunuz : "  );
        fizik = inp.nextInt();
        System.out.println("Tarih notunuz : "  );
        tarih = inp.nextInt();
        System.out.println("Müzik notunuz : " );
        muzik = inp.nextInt();
        System.out.println("Türkçe notunuz : " );
        turkce = inp.nextInt();

          int toplam = mat+kimya+fizik+tarih+muzik+turkce;

             double sonuc  = toplam / 6;
              String str = (sonuc) > 50 ? "Geçtiniz" : "Kaldınız";
               System.out.println("Ortalamanız : " + str );



    }
}
