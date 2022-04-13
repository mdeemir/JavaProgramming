package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {


        public static void main(String[] args) {

            String str = "Java";
            char[] chars = str.toCharArray(); // toCharArray() metodu yeni bir dizi oluşturur

            System.out.println(Arrays.toString(chars));//[J, a, v, a]

            for(char each  : chars ){
                System.out.println(each);
                //J
                //a
                //v
                //a
            }

            System.out.println("-------------------------------------");

            String sentence = "Wooden Spoon";

            String[] words =  sentence.split(" ");

            System.out.println(Arrays.toString(words));

            System.out.println("------------------------------------");

            String email = "WoodenSpoon@cydeo.com";

            String[] arr = email.split("@");

            System.out.println(Arrays.toString(arr));

            System.out.println("------------------------------------------------");

            String s = "Today is nice day. Today is Monday. Today we learn Java";

            String[] sentences =s.split("\\. "); // sadece noktayı (.) bölerken özel işater koymalısın

            System.out.println(Arrays.toString(sentences));


        }
}
