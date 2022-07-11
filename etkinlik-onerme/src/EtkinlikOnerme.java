import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklık giriniz : ");
        heat = ınput.nextInt();

        if (heat <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat > 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat > 15 && heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
    

