package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day32_Constructors.Car;
import java.util.ArrayList;
import java.util.Arrays;
import day31_Constructors.Student;



public class GarbageCollection {


    public static void main(String[] args) {
        /*
        //  int n = null;
       String str = null;
        System.out.println( str.toUpperCase() );
         */

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection. ve collector bunu collect edebiliri
        str = null;//null yazınca wooden spoon gri oldu çünkü str null a döndü

        //non primitive objectler için default değişken. primitive ler için değil dikkat sıfır demek değil.
        //str="" bu bir object ama null değil.null özel bir değer

        System.out.println( str );//null

        Car car1 = new Car("Toyota"); // car1 gri ye döndü. garbage collection ulaşabilir artıl

        car1 = null;

        System.out.println(car1);//null

        System.out.println("--------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy"; //altta dog1.name = "Max"; yazınca artık object yeni değerine geldi. bu griye döndü

        dog1  =     new Dog();
        dog1.name = "Max";

        System.out.println(dog1);//Dog{name='Max', breed='null', age=0, gender= , size='null', color='null'}

        String language = "Python";//ikinci atamadan sonra griye döndü renk collection artık erişebilir yani çöpe taşımaya müsait
        language    =   "Java";

        System.out.println(language);//Java

        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);//[100, 200, 300, 400]
        System.out.println(list2);//[100, 200, 300, 400]
        // list1 ve list2 aynı objecte atandığı için list2 değiştirince objecti list 1de değişti

        System.out.println(list1 == list2 );//true

        System.out.println("-----------------------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet"; //tahir devre dışı kaldı. aynı nesneye atandı

        System.out.println(student1);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
        System.out.println(student2);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;//burada nesneler aynı yaptık. aynı yapınca tek oda (list) ve 2 kapı (l1 ve l2) oldu
        //hangi kağıyı açarsa aç oda aynı yani sonuç aynı olur
        l2.add("Python");


        System.out.println("l1 = " + l1);//l1 = [Java, Python]
        System.out.println("l2 = " + l2);//l2 = [Java, Python]







    }
}
