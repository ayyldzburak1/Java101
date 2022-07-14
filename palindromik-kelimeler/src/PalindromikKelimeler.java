public class PalindromikKelimeler {

    static boolean IsPalindrome(String str){
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return false;
    }

    static boolean IsPanlindrome2(String str){
        String reverse = "";

        for (int i = str.length() -1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(IsPalindrome("test"));
        System.out.println("ey edip adanada pide ye");
        System.out.println(IsPanlindrome2("ey edip adanada pide ye"));
    }
}