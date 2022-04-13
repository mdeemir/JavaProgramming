package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        String word =  "Cydeo";
        //index:   01234

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);//d

        /*
        char tenthChar = word.charAt(9); ----index sınırları içinde olmalı numara burada enfazla 4 olabilir
        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("------------------------------");

        String s1 = "Batch 25 is the best batch. Java Programming Language";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);//totalChars = 53

        char lastChar = s1.charAt(  s1.length()-1  );  // last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();
        /*"WOODEN SPOON"  eğer str değişkenini büyük harfe çevirmek istiyorsan
        str değişkenine tekrar atama (=) operatörü ile atamalısın
* */
        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);




    }
}
