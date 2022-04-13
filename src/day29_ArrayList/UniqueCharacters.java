package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String[] arr = str.split("");//returns string array yani NON PRİMİTİVE
        //split ile character lere ayırdık ve bir array elde ettik
        // tochararray metodu kullanmadık çünkü char [] array PRİMİTİVE olurdu String [] arraya çevirdik NON PRİMİTİVE olması için

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );// Arrays.asList(arr) burdaki arr NON PRİMİTİVE olmalı array liste convert etmek için

        System.out.println("list = " + list);//list = [a, a, a, b, c, c, c, d, e, e, e, f, g, g, g, g, g, g, g, g, h, i, i, i, i, i, i, i, i, i, j, k, k, k, k, k, k, k, k, k, l]

        String unique = "";

        for (String each : list) {//list.fori yaz kısa yol

            int frequency =  Collections.frequency(list, each);//frequencey metodu çok kullanışlı
            if(frequency == 1){
                unique += each;
            }

        }


        System.out.println("unique = " + unique);//unique = bdfhjl

    }
}
