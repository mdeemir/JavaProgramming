package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };

        // converting array to arraylist:
        ArrayList<String> list = new ArrayList<>( Arrays.asList(countries) );//String[] olduğu için (NON PRİMİTİVE) convert edebilidik

        list.removeIf( p -> p.length() >= 10 );

        //converting arraylist to array
        countries = list.toArray(new String[0]);
        //bunu kullanmazsan loop kullanman lazım tek yol bu
        //arrayın türü ve boyutu belirlenmeli  sıfırı bu yğzdne yazdık.
        // 1 2 de verebilirdin değer olarak. değişecek zaten herhangi bir numarayı verebilirsin.
        // çünkü listin boyutuna göe değişecek
        // ama  list in boyutundan büyük yazma 0 (sıfır yaz en iyisi)
        System.out.println(Arrays.toString(countries));//[Japan, Korea, Turkey, Canada]

    }
}
