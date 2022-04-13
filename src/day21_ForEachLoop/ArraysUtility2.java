package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2); // ilk 3 ismi kopyalamak istiyorum
        //eleman numarası yazılıyor. () için önce array ismi sonra eleman numarası yazılır
        // eleman sayısından fazla yazılırsa diğerleri null olarak görülür.
        // arayın başından başlar kopylamaya

        System.out.println(Arrays.toString(earlyBirds));//[Elif, Sinem]

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 5); //{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1 );
        /* array içinden bir bölümü kopyalamak için kullanılır. kullanımı substing metodun kullanımına
        benziyor. ilk numara index numarasından başlar son index numarasındakini yazdırmaz bir öncesini yazdırır

        * */

        System.out.println(Arrays.toString(ch2));//[C, D, E, F, G]


        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //index:         0   1   2   3   4   5   6   7   8  9
        int[] result = Arrays.copyOfRange(scores, 3, 8);


        System.out.println(Arrays.toString(result));//[40, 50, 60, 70, 80]


        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);//son elemana kadar yazdırır
        System.out.println(Arrays.toString(result2)); //[60, 70, 80, 90, 100]






    }
}
