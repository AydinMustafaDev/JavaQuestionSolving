package interviewOuestions.arraylists;

import java.util.ArrayList;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        //Bir tamsayı listesinde 13 ögesinden önceki tüm liste ögelerinin toplamını bulunuz.
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int sum1 = 0;
        for(Integer w : myList){
            if(w==13){
                break;
            }
            sum1 = sum1 + w;
        }
        System.out.println(sum1);

        //2. yol

        List<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(13);
        int idx=0;
        int sum=0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)==13){
                idx=i;
            }
            for (int j = 0; j < idx; j++) {
                sum+=arr.get(j);
            }

        }
        System.out.println(sum);


    }

}
