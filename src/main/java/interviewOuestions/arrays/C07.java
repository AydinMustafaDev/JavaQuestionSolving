package interviewOuestions.arrays;

import java.util.Arrays;

public class C07 {

    public static void main(String[] args) {

        //Tamsayılardan olusan b!r arrayde ortadak! elemanı bulunuz.
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

        int arr[] = {12, 5, 8, 13,9};

        int elemansayisi = arr.length;



        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        if ((arr.length%2!=0)){
            int result = arr[elemansayisi/2];
            System.out.println(result);
        }else {
            int result = (arr[elemansayisi/2] + arr[elemansayisi/2-1])/2;
            System.out.println(result);

        }




    }
}
