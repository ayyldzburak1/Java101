import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


        double tutar, kdvTutar, kdvOran=0.18, kdvlitutar;

        Scanner inp = new Scanner(System.in);
        System.out.println("Tutar giriniz :");
        tutar = inp.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvlitutar = tutar + kdvTutar;
        System.out.println(
        "KDV'siz tutar : " + tutar+
        "\nKDV oranı : " + kdvOran+
        "\nKDV tutarı :" + kdvTutar+
        "\nKDV'li tutar" + kdvlitutar);


    }
        }
                      