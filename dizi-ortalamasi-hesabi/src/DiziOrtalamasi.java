public class DiziOrtalamasi {
    public static void main(String[] args) {
        int[] arrayList={21,28,14,7,35,42,49};
        double arrayListAverage=0.0, arrayListSum=0;
        for (int i=0; i<arrayList.length; i++){
            arrayListSum=arrayList[i];
        }
        arrayListAverage=arrayListSum/arrayList.length;
        System.out.println(arrayListAverage);
    }
}