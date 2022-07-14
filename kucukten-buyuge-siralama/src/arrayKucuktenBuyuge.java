import java.util.Arrays;
import java.util.Scanner;

public class arrayKucuktenBuyuge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a =1 ;

        System.out.println("Dizinin boyutunu giriniz : ");
        int lenght = input.nextInt();
        System.out.println("Dizinin Boyutu :" + lenght);
        int [] list = new int [lenght] ;

        for (int i=0 ; i < lenght; i++) {
            System.out.println(". "+"Dizinin Elemanlarını Giriniz :");
            list[i] = input.nextInt();
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }

}