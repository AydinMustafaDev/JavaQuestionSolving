package interviewOuestions.arraylists;

import java.util.ArrayList;
import java.util.List;

public class C06 {
    public static void main(String[] args) {
       //String bir listede ver!len tüm fiyatların toplamını bulunuz.
       //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double sum = 0;
        for(String w : myList){
            Double price = Double.valueOf(w.replace("$", ""));
            sum = sum + price;
        }
        System.out.println(sum);
    }
}
