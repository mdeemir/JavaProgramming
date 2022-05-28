package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key     value
            //int olmaz primitive desteklemez
        Map<Integer, String> hashMap = new HashMap<>(); //new ArrayList<> olmaz çünkü primitive içeremez.
        // polymorphizm için de is a relation olması lazım collectionlarla map in bu ilişkisi yok
        /*
        en hızlısı hashmaps aralarında. EN ÇOK KULLANILAN. RASTGELE SIRALAMAY SAHİP GİRİŞ SIRASI ÖNEMLİ DEĞİL
        KEY OLARAK NULL U KABUL EDER
        MAP OLUŞTURURKEN KEY VE VALUE İÇİN HANGİ VERİ TİPLERİNİ SECTİYSEN ONA GÖRE GİRİŞ YAPMALISIN YOKSA KABUL ETMEZ
        NON PRİMİTİVE TYPE IN DEFAULT VALUE Sİ NULL
         */
        hashMap.put(10, "Arthur");//PUT() METOD EKLEMEK İÇİN.
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");//KEY 5 İKİ KERE GİRDİK AMA SADECE EN SON GİRİLEN KABUL EDER. TEKRARLARSA SON GİRİLEN KABUL EDİLİR ÖNCEKİLER SİLİNİR
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);// VALUE NULL DA  TEKRARI KABUL EDER
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");// NULL KEYDE DE SADECE SON GİRİLEN NULL KEY KABUL EDİLİR.

        System.out.println("hashMap = " + hashMap);//hashMap = {null=Hulya, 3=Jack, 20=George, 5=Isabella, 6=null, 7=null, 40=Emma, 8=null, 10=Arthur}

       // System.out.println(hashMap.get()); --> İNDEX NOYOK BUNUN YERİNE (9 içine  key yazılır
        

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        /*
        GİRİŞ SIRASINI KORUR
        KEY TEKRARI KABUL EDİLMEZ EN SON GİRLEN KABUL EDİLİR
        NULL KABUL EDİLİR. KEY OLARAK BİR TANE NULL, VALUE OLARAK BİRDEN FAZLA NULL KABUL EDİLEBİLİR

         */
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);//linkedHashMap = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Isabella, null=Hulya}
        

        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        /*
        ARTAN SIRA İLE DEPOLAR KEYLERİ
        KEY VEYA VALUE OLARAK NULL KABUL EDİLMEZ

         */
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(7, null);

        System.out.println("treeMap = " + treeMap);//treeMap = {3=Jack, 5=Isabella, 7=null, 10=Arthur, 20=George, 40=Emma}


        Map<Integer, String> hashtable = new Hashtable<>(); // key and value both can not null
        /*
        RATGELE SIRA HASMAP İLE AYNI
        NULL KEY KABUL ETMEZ HASMAP KANUL EDİYORDU
        SYNCHRONİZED OLABİLİR DEZAVANTAJI YAVAŞTIR. BİRDEN ÇOK İŞLEMDEN SADECE BİRİ YAPILABİLİR. AVANTAJI İŞLEM GÜVENLİĞİ SAĞLAR
        SIRALAMA RASTGELEDİR
         */
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        //hashtable.put(6, null);

        System.out.println("hashtable = " + hashtable);//hashtable = {10=Arthur, 20=George, 40=Emma, 5=Isabella, 3=Jack}



     //   String str = null;
       // System.out.println(str.toUpperCase());---> NULPOİNTEREXCEPTİON


    }

}

/*
browser   chrome
url
username   cydeo
password  cydeo123



 */