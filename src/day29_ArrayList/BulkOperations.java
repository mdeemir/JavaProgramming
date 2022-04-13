package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,3,5,5,5,5,8,8,8,8));
        //asLİst()---> metodu array list i collectiona dönüştürür. Arrays utility class içinde


        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 3, 3, 3, 5, 5, 5, 5, 8, 8, 8, 8]

        list.removeAll( Arrays.asList(3,5,8) );
        //birden fazla aynı eleman varsa hepsini kaldırır

        System.out.println(list);//[1, 2, 4, 6, 7, 9, 10]

        System.out.println("-------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900) );

        numbers.retainAll(Arrays.asList(100, 200, 300));
        //removes the UNMATCHING element

        System.out.println(numbers);//[100, 200, 300, 100, 200, 300]

        System.out.println("-------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll( Arrays.asList("QA", "SDET") );

        System.out.println(jobTitles);//[QA, SDET, QA, SDET]

        System.out.println("-------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        // tek tek yazmaktansa containsAll () metodu kullan
        boolean r3 = nums.containsAll( Arrays.asList(2, 5, 10, 1000) );
        // 1000 i çıkarırsan true olur sonuç
        System.out.println("r1 = " + r1);//r1 = true
        System.out.println("r2 = " + r2);//r2 = true
        System.out.println("r3 = " + r3);//r3 = false because 1000 is not contain. hespini içermeli true olması için


        System.out.println("-----------------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};
// bir array a eleman ekleme çıkarma vs. yapmak istiyorsan asList metodu ile collectiona cevirmelisim
        //SADECE NON PRİMİTİVE elemanlar için
        //2. yol
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));//<>(names) yazamazdın collectiona cevirmelisin

        /*
        1. yol
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        */

        System.out.println(namesList);//[Josh, Jack, Daniel, Shay, Breanna]

        System.out.println("------------------------------------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        // bu ınt[] arr olsaydı olmazdı çünkü PRİMİTİVE type da bunu NON PRİMİTİVE yapmak için Integer[] arr yazdık

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(arr));

        System.out.println(list2);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        //burada Integer[] arr2 yazmalıyız

// veya custom metod oluşturup collectiona cevirmeliyiz
        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);//list3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }

    // convert etmek için convertArrayToArrayList(arr2) metodu oluşturduk kendimiz int array için
    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }




   
}
