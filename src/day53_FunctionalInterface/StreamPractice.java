package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
/*stream() yazdıktan sonra metodlarını çağırabilirsin
        //distinct tekrar ları kaldırır
        //list1.stream().distinct() ---> böyle yaparsan yine aynı arrayı verir yapısını değştirmez
        list1.stream().distinct().collect---> buda topluyor secilenleri list e.

        */
        list1 = list1.stream().distinct().collect( Collectors.toList());

        System.out.println(list1);//[1, 2, 3, 4, 5, 6]

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();// burada da array a döndürdü secilenleri
        /*
        Arrays.stream(arr1)--> ARrays utility class vasıtasıyla stream i çağırabilirsin
        Arrays.stream(arr1).distinct() --> bu da yapıyı değiştirmez
         */


        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4, 5, 6]
/*
skip long parametresini kullanıyor.
 */

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());
//ilk 5 elemanı attı
        System.out.println(list2);//[6, 7, 8, 9, 10]

        int[] nums2 =  {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();
//ilk 4 elemanı geçti diğerlerini yazdırdı
        System.out.println(Arrays.toString(nums2)); //[5, 6, 7, 8, 9, 10]


        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());
/*
ist3.stream().limit(7)--> ilk 7 elemanı aldı
list3 = list3.stream().limit(7).skip(3) sonra ilk 3 nü geçti/attı
 */
        System.out.println(list3);//[4, 5, 6, 7]



        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());
/*
elemanlarda DEĞİŞİKLİK yapmak istediğimizde map ı kullanırız
her elemanı 2 kata çıkarıyoruz

list4.stream().map( p -> p * 10 )---> bu halde hersey stream ın içinde geçici taşıyıcı gibi düşün bir data yapısı değil
collect veya to array kullanıyoruz
 */
        System.out.println(list4);//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]


        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
//MAP FUNCTİON FUNCTİONAL İNTERFACE KULLANIYOR
        days =  days.stream().map( p -> p.substring(0, 3) ).collect(Collectors.toList());

        System.out.println(days);//[Mon, Tue, Wed, Thu, Fri, Sat, Sun]

//FİLTER PREDİCATE FUNCTİONAL İNTERFACE KULLANIYOR
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());

        System.out.println(evens);//[2, 4, 6, 8, 10]


        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
//LONG dödürür count ya long değişkene ata yada cast it
        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();
//COUNT SAYMAK İÇİN
        System.out.println(countJava);//3

//FOREACH DİĞER FOREACHLERE BENZİYOR  -- CONSUMER FUNCTİONALİNTERFACE KULLANIYOR
        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p));
/*
Java
java
jAvA
 */
//ALLMATCH , anyMatch,noneMatch  BOOLEAN DÖNDÜRÜR   HEPSİ PREDİCATE FUNCTİONAL İNTERFACE KULLANIR
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,10));

        boolean r1 = list6.stream().allMatch(p -> p%2==0);

        System.out.println(r1);//FALSE  HEPSİ ÇİFT OLSAYDI TRUE
//ANYMATCH PREDİCATE KULLANIR
        boolean r2 = list6.stream().anyMatch(p -> p>20);

        System.out.println(r2);//TRUE. HERHANGİ BİRİ 20 DEN BÜYÜKSE

        boolean r3 = list6.stream().noneMatch(p -> p%3==0);

        System.out.println(r3);//FALSE 3 E BÖLÜNEBİLEN BİR SAYI OLMASAYDI TRUE OLURDU


    }


}
