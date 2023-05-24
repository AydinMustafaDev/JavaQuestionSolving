package interviewOuestions.arrays;

public class C08 {
    public static void main(String[] args) {

        //Str!ng’ lerden olusan b!r arrayde uzunlugu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Ang!e, Vel! ) ==> Output !s Mark, Vel!

        String arr[]={"Kemal", "Jonathan", "Mark", "Angle", "Veli" };

      // Arrays.sort(arr);
      // System.out.println(Arrays.toString(arr));
        int minLength =arr[0].length();

        for(String w : arr){
            minLength=Math.min(minLength, w.length());
        }
        for(String w : arr){
            if (w.length()==minLength){
                System.out.print(w + ",");
            }
        }

    }
}
