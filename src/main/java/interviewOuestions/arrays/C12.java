package interviewOuestions.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldıgınız tamsayılar !le b!r array olusturunuz ve bu arraydek! en küçük ve en
        büyük ögeler arasındak! farkı konsolda yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Sayılar giriniz. Çıkmak için q'ya basınız");
        String s="";
        String t="";
        int idx=0;
        do {
            t=input.next();
            if (t.equals("q")){
                break;
            }else {
                s+=t+" ";
                idx++;
            }
        }while (true);
        String arr[]=s.split(" ");
        int min=Integer.valueOf(arr[0]);
        int max=Integer.valueOf(arr[0]);


        for (int i = 0; i <arr.length; i++) {
            min=Math.min(min,Integer.valueOf(arr[i]));
            max=Math.max(max,Integer.valueOf(arr[i]));
        }
        System.out.println(max+"-"+min +"="+(max-min));

         */

        //2.way
        Scanner input = new Scanner(System.in);
        System.out.println("Sayılar giriniz. Çıkmak için q'ya basınız");
        String s = "";
        int t;
        int newElement = 0;
        int idx = 0;
        int arrMulti[][] = new int[1][idx + 1];
        do {

            try {
                newElement = input.nextInt();
                int arr[] = new int[arrMulti[0].length + 1];
                for (int i = 0; i < arrMulti[0].length; i++) {
                    arr[i] = arrMulti[0][i];
                }
                arr[idx] = newElement;
                idx++;

            } catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız! Lütfen yeniden deneyiniz.");
                break;
            }

        } while (true);

        int result[] = new int[arrMulti[0].length + 1];
        for (int i = 0; i < arrMulti[0].length; i++) {
            result[i] = arrMulti[0][i];
        }
        System.out.println(Arrays.toString(result));
        /*
        result[idx] = newElement;
        Arrays.sort(result);
        System.out.println(result[result.length - 1] - result[0]);

         */


    }

}
