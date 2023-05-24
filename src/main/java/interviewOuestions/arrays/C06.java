package interviewOuestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06 {

    public static void main(String[] args) {

        // Veriilen array'den istenen degree esit olan elemanlari kaldirip,
        // kalanlari yeni bir Array olarak yazdiran bir method yaziniz.

        eraseElement();


        int arr[] = {1, 2, 3, 1, 5, 1, 6, 1};

        int wantedValues = 1;

        int idx = 0;
        List<Integer> abc = new ArrayList<>();
        for (int i : arr) {
            if (i != wantedValues) {
                abc.add(i);
            }
        }
        int newArr[] = new int[abc.size()];
        for (int w : abc) {
            newArr[idx] = w;
            idx++;
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void eraseElement() {
        Scanner input = new Scanner(System.in);
        System.out.println("Istedigin sayiyi gir");
        int num = input.nextInt();
        int arr[] = {1, 2, 3, 1, 5, 1, 6, 1};
        int arrLength = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                arrLength--;
            }
        }
        int arr2[] = new int[arrLength];
        int counter = 0;
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != num) {
                arr2[counter] = arr[j];
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

}
