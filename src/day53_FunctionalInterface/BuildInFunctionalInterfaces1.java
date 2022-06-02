package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {
///predicate herhangş bir veri tipi kullanır boolean döndürür. tek parametre olacak
        // (p) veya herhangi birsey olabilir ama p kulanılı predicate olduğunu belli etmek için
        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);// booolean olan bi fonksiyon ekledik.
        };
//test java predicate içinde bir metod
        boolean result1 = isPalindrome.test("Java");

        System.out.println(result1);

        Predicate<Integer> isEven = p -> p % 2 == 0;// parantezleri kullanmadık tek parametre ve tek sıra işlem var
// result9 u ben ekledim
        boolean result9 = isEven.test(45);
        System.out.println("result9= " + result9);

        System.out.println("--------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));
        list.removeIf(p -> p % 2 == 0); //burada boolean döndüğü için yazdık  list.removeIf(isEven); da yazabilirdik

        System.out.println(list);

        System.out.println("------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);

        System.out.println(names); // [Java, Python]


        System.out.println("----------------------------------------");
//CONSUMER TEK PARAMETRE KULLANIR VE HERHANGİ BİR VERİ DÖNDÜRMEZ VOİD YANİ
        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
//accept de consumer functionalinterface nin birmetodu java içinde
        printEach.accept("Java");

        System.out.println("---------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));

        /*
        for (Integer each : list2) {
            if(each % 2 != 0){
                System.out.println(each);
            }
        }
    */
//foreach da bir metod
        list2.forEach(p -> {
            if (p % 2 != 0) System.out.println(p);
        });

        System.out.println("-------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("-------------------------------------------");
//FUNCTİON da veri tipi ve ruturn tipi farklı farklı veri tipi olabilir. return olacak void değil.
        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;// return tipi List<Integer>  return olmazsa hata verir program
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> l = convertToList.apply(arr);
//apply da bir metod function interface içinde
        System.out.println(l);


        System.out.println("-------------------------------------------");
        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                 result[i] = a.get(i);
            }

           return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

       int[] result2 = convertToArray.apply(numbers);

        System.out.println("-------------------------------------------");

        // create a function that can return the maximum number from an int array

        // create a function that can swap the first and last elements of an array

        // Create a function that can reverse an array and returns it

        // create a function that can reverse a List



    }

}
