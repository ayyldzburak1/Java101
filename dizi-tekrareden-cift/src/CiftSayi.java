import java.util.Arrays;

public class CiftSayi {
    public static void main(String[] args) {

        int[] list ={2,3,4,5,3,6,12,7,8,2,5,7,8,6,12,4};
        Arrays.sort(list);

        for (int i=0;i<list.length;i++){

            if (list[i]%2==0){


                for (int j=0;j<list.length;j++){

                    if (( i!=j)&&(list[i]==list[j])){
                        System.out.print(list[i]+" ");
                        break;
                    }


                }
            }
        }
    }
}