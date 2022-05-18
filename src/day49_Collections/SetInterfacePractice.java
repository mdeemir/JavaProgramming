package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));//TEKRARI KABUL EDER

        System.out.println("list = " + list);//list = [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        System.out.println( list.get(4) );//90
        

        Set<Integer> hashSet = new HashSet<>(); //PERFORMANS ÖNEMLİ VERİSIRASI ÖNEMLİDEĞİLSE EN İYİSİ HASHSET.
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));//COLLECTİONDA OLAN METODLARI KULLANIR. ARRAYLİSTTE GÖRMÜŞTÜK BU METODLARI
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));//AYNI ELEMANLARI EKLEMEMİZE RAĞMEN EKLEMEDİ. TEKRARI KABUL ETMİYOR
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null));//NULL DEĞERE İZİNVERİR

        System.out.println("hashSet = " + hashSet);//hashSet = [null, 200, 40, 10, 90, 300]
      //  System.out.println( hashSet.get(4) );//GET METODU İLE ELEMAN ALAMAZSIN ÇÜNKÜ SIRA ÖNEMSENMİYOR


        Set<Integer> linkedHashSet = new LinkedHashSet<>();//TEKRARA İZİNVERMEZ VERİ GİRİŞ SIRASINI KORUR. NULL DEĞERE İZİN VERİR
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);//linkedHashSet = [10, 200, 300, 40, 90, null]

        Set<Integer> treeSet = new TreeSet<>();//TEKRARA İZİNVERMEZ SIRAYA SOKAR KÜÇÜKTEN BÜYÜĞE NULL DEĞERE İZİNVERMEZ

        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
      //  treeSet.addAll(Arrays.asList(null,null,null));//NULLPOİNTEREXCEPTİON EXEPTİONU VERİR


        System.out.println("treeSet = " + treeSet);//treeSet = [10, 40, 90, 200, 300]


        //   String str = null;
       // System.out.println(str.charAt(0));


    }


}
