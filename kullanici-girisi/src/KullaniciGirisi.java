import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password,choose;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.println("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.println("Şifre oluşturulamadı. Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("Seçiminizi harf olarak giriniz\nEvet için (E)\nHayır için (H) tuşlayınız.");
            choose = inp.nextLine();
            switch (choose) {
                case "E":
                    System.out.print("Yeni şifrenizi giriniz. (Eski şifreniz olmamasına dikkat ediniz)\nŞifreniz : ");
                    password = inp.nextLine();
                    if (password.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                    break;
                case "H":
                    System.out.println("Çıkış yapıldı");
                default:
                    System.out.println("Hatalı tuşlama! Çıkış yapıldı.");
                    break;
            }
        }

    }
}
