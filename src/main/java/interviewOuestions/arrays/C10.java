package interviewOuestions.arrays;

public class C10 {
    public static void main(String[] args) {


        //Asagidaki multi dimensional arryin tum elemanlarinin carpimini ekrana yazdiran kodu yaziniz

        int mArr [][]= {{1,2}, {4,5,6}};

        int multiply =1;

        for (int i []: mArr ) {
            for (int z : i) {
                multiply*=z;
            }
        }
        System.out.println(multiply);


        //asagidaki multidimensional arrayin ic arraylerindeki son elemanlarinin
        // carpimini ekranayazdian kodu yaziniz {{1,2,3}, {4,5}, {6}}

        int arr [][]={{1,2,3}, {4,5}, {6}};


        int result =1;
        for (int w [] : arr){
            for (int z : w){
                if (z==w[w.length-1]){
                    result*=z;
                }
            }
        }
        System.out.println(result);



        // Asagidaki multi dimenasional arraying ic elamanlarindaki tum aelemanlarin
        // toplamini birer birer bulan ve herbir sonucu yeni bir arraying elemani yapan
        // ve yeni arrayi ekrana yazdirna bir program yazdiriniz. {{1,2,3{,{4,5},{6,7}}

        int arr1 [][]= {{1,2,3},{4,5},{6,7}};




        int arr11 [][]= {{1,2},{1,2,3},{6}} ;
        int arr22 [][]= {{7,8,9}, {10,11},{12}};

        int x=0;

        for (int i=0; i< arr11.length && i<arr22.length; i++) {

            for (int j = 0; j < arr11[i].length && j < arr22[i].length; j++) {

                x = (arr11[i][j] + arr22[i][j]);
                System.out.println(i+"'inci index'teki arraylerin "+j+"'inci index'teki elemanlarının toplamı: "+x+" eder");

            }

        }
        System.out.println("arr11 ve arr22 multidimentional array'lerinin aynı index'te bulunan başka elemanları yoktur.");

    }//main

}//class
