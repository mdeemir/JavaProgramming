package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;
    //tek adımda ayarlanmayan durumlarda static blok kullanılır


    //public static Sheet sheet ;

    public Circle(double radius) {
        this.radius = radius;
        //  pi = 3.14;
    }

    //constructor sadece instance değişkenler için
    //static değişkenler için static blok
    /*
    static{
    radius=5 yazarsan hata verir sadece static değişkenler için
    pi=3.14; //static değişken olur
    name="Circle";
    }
     */


    static {
        // radius = 5;
        pi = 3.14;
        name = "Circle";
//array listi 3 adımda tanımladık bu yüzden static blok kullandık
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


    /*

    static değişkenleri tanımlamak i,için main metod da kullanılabilir
    ama main metod sınıf dışında otomatik olarak çalışmaz.bunun için static kullanılır. sınıf ne zaman yüklenirse otomatik olarak static blok yüklenir
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
*/
}