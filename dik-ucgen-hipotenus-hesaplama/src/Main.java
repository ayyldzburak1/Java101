import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;


        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen a kenarının ölçüsünü belirleyiniz : ");
        a = inp.nextInt();
        System.out.println("Lütfen b kenarının ölçüsünü belirleyiniz : ");
        b = inp.nextInt();
        System.out.println("Hipotenüs  c = " + Math.sqrt((a*a)+(b*b)));





    }
}
