package day30_CustomClass;
/*
1. write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]
3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"
				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0,  numbers.size()-1);//swap method yer değiştirmek için index no ile
//Collections utility class of collection
        System.out.println(numbers);//[8, 2, 3, 4, 5, 6, 7, 1]
        //System.out.println(numbers.toString()); yazılabilir arraylardeki gibi ama array listte bu otomatik olarak gerçekleşir

        //int[] arr = {1,2,3,4,5,6,7,8};
        // System.out.println( Arrays.toString(arr )  );

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);//[1, 0, 2, 0, 3, 0, 4, 0]

        int size = list.size();

        list.removeAll( Arrays.asList(0)  );

        System.out.println(list); //[1, 2, 3, 4]    0 lar kaldırıldı

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize; //  sıfırlar kaldırımadan önce ve sonraki
        // array boyutları çıkarılınca 0 sayısı bulunur

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);//totalNumberOfZeros = 4

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("-----------------------------------------------------------");
            //SECOND SOLUTİON
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }

        System.out.println(result);//[1, 2, 3, 4, 0, 0, 0, 0]  önce 1234 eklendi sıfıra eşit olmayanlar
        // sonra sıfıra eşit olanlar eklendi


        System.out.println("-----------------------------------------------------------");

        String str = "ABCD123$%#@&456EFG!";
        //toCharArray metodu olmaz PİRİMİTİVE döndürür

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add( str.charAt(i) );// str nin her karakterini chars array listine ekledik
        }

        ArrayList<Character> letters = new ArrayList<>( chars ); // add all the characters

        letters.removeIf( p -> !Character.isLetter(p)  ) ; //remove the characters that are not letters

        System.out.println("letters = " + letters);//letters = [A, B, C, D, E, F, G]


        ArrayList<Character> digits = new ArrayList<>( chars ); // add all the characters
        digits.removeIf( p -> !Character.isDigit(p)); //remove the characters that are not digits

        System.out.println("digits = " + digits);//digits = [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChar = new ArrayList<>( chars);
        // bu şekilde de olabilir
        // specialChar.removeAll( letters );
        //  specialChar.removeAll( digits );
        specialChar.removeIf( p ->  Character.isLetterOrDigit(p) );

        System.out.println("specialChar = " + specialChar);//specialChar = [$, %, #, @, &, !]



    }
}
