package interviewOuestions.arrays;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        //kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        kelimeSayisi();


    }

    public static void kelimeSayisi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentences");
        String str = scan.nextLine();

        String arr[] = str.split(" ");

        System.out.println(arr.length);

    }
}
