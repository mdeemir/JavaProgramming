package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {

    /*
    static BiPredicate<Integer[], Integer> contains = (a, b) -> {
        boolean result = false;

        for (Integer each : a) {
            if(each == b){
                result = true;
                break;
            }
        }

        return result;
    };
*/

    public static void main(String[] args) {

        //Create a function that can check if the Integer is contained in an array of integer, return boolean
// BİPREDİCATE İKİ FARKLI VEYA AYNI VERİ TİPİNDE PARAMETRE KABUL EDER VE BOOLEAN DÖNDÜRÜR
        BiPredicate<Integer[], Integer> contains = (a, b) -> {
           //A---> INTEGER[], B---> INTEGER
            boolean result = false;

            for (Integer each : a) {
                if(each == b){
                    result = true;
                    break;
                }
            }

            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);//İKİ PARAMETRE KABUL EDİYOR
//TES DE BİPREDİCATE FUNCTİONALİNTERFACEDE BİR METOD
        System.out.println(r1);

        System.out.println("---------------------------------------------");
        // create a function that can check if two strings are anagram

        //                              a= bac,   b= cab
        BiPredicate<String, String> anagram = (a, b) -> {
            // (a, b) -> YAZARKEN PARANTEZ KULLNAMK ZORUNDASIN CÜNKÜ BİRDEN FAZLA PARAMETRE VAR
            String[] arr1 = a.split(""); //[b, a, c]
            String[] arr2 = b.split(""); //[c, a, b]
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println("---------------------------------------------");
        // create a function that can print the given string for given number of times
        //BİCONSUMER 2 PARAMETRE KABUL EDER AMA DEĞER DÖNDÜRMEZ. VOİD
        // metod detaylarını java kütüphanesinden öğrenmek için imleç BiConsumer üzerinde iken ctrl+click  bas
        BiConsumer<String, Integer>  printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };

        printMultipleTimes.accept("Java", 5);

        System.out.println("---------------------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : "+v);
        }
         */
// map te for each map kullanırken BiConsumer functional interface kullanılır. daha az code daha hızlı
        scrumTeam1.forEach(  (k, v) -> System.out.println(k+" : "+v) );


        System.out.println("---------------------------------------------");
//BiFunction interface de iki parametre kabul eder ve bir değer döndürür RETURN
        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> (a>b)?a:b;

        int max = maxNum.apply(100, 200);

        System.out.println(max);

        //2. create a function that can merge two integer arrays into a list

        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {
            List<Integer> result = new ArrayList<>();

            for (int each : x) result.add(each);// {} kaldırdı tek satır kod olduğundan

            for( int each: y) result.add(each);

            return result;
        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};

        List<Integer> nums = merge.apply(arr1, arr2);

        System.out.println("---------------------------------------");
        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}

        map ==> {Josh=100, Daniel=110}
         */
//                                                  return type map
        BiFunction<List<String>, List<Integer>, Map<String, Integer>>  merge2 = (j, k) ->{
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                map.put( j.get(i),  k.get(i));
            }
            return map;
        };


        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        Map<String, Integer> students = merge2.apply(names, scores);

        System.out.println(students);//{Kseniia=95, Aygun=98, Layan=90}




    }

}
