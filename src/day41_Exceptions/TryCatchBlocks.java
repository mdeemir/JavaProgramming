package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try{

            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){// ArithmeticException bu ortaya çıkan hatanın yer aldığı sınıf. java.lanf çinde yer alır
            //program çalıştırıldıgında kırmızı ile konsolda yazan ayrıntılarda yazar. aynı sekilde yazman gerekir. "e" ise
            // nesne yi ifade eder, a, b,c ,dfdf, olabilir ismi farketmez.  "System.out.println(9/0);" bu bir hata nesnesi
            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");
/*
Test1 started
Catch Block ---> catch bloguna atladı
Arithmetic Exception was occurred
Test1 Completed
 */
        }




        System.out.println("Test1 Completed");

        System.out.println("------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){//RuntimeException ana parent class ı yazarsan hepsini çözer. hangi sınıfa ait oldugunu bilmiyorsan
//Throwable ı kesinlikle kullanma, uncheked için runtime exception classını kullan. cheched lar için zaten derleyici gösteriyor.
            e.printStackTrace();//hatayı vedatylarını  konsola yazdırır ama programı hatasız yürütür. rapor yazarken çok işimize yarar
// getMessaage ise özet olarak yazar hatayı sadece hata başlığını yazar konsola. bunun için rapor oluştururken printStackTrace() metodunu kullanırız
            // System.out.println( e.getMessage() );

        }


        System.out.println("Test2 Completed");

        System.out.println("--------------------------------------------------");

        System.out.println("Test3 started");


        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 started");


        System.out.println("--------------------------------------------------");


        System.out.println("Hello");


        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");


        System.out.println("------------------------------------------");


        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





    }

}
