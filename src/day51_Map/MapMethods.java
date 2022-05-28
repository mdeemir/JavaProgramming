package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        // student name & score:

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students);// en baştaboş iken {}gösterir  {Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=87}
        System.out.println(students.size());//en başta boşken 0 gösterir    7


        // display the score of Alex:
        System.out.println(students.get("Alex"));//96


        // replace Ali' score to 90

        students.replace("Ali", 90 );

        System.out.println(students); //{Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Alex");

        System.out.println(students); //{Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Ozan");

        System.out.println(students); //{Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}


        boolean r1 = students.containsKey("Muhtar");// key için contains metodu
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);//false
        System.out.println(r2);//true



        boolean r3 = students.containsValue(97); //// value  için contains metodu

        System.out.println(r3);//true


        System.out.println(students.isEmpty());//false


        System.out.println("-------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);


        System.out.println("map1 = " + map1);//map1 = {Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}
        System.out.println("map2 = " + map2);//map2 = {Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}

        System.out.println(map1 ==  map2); //false
        System.out.println(map1.equals(map2));//true   KARŞILAİTIRMA İÇİN EQUALS METOD

        map1.clear();// MAPI TEMİZLER
        map2.clear();

        System.out.println(map1);// {}
        System.out.println(map2); // {}





    }

}
