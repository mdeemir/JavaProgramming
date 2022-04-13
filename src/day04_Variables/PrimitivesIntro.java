package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
       /*
       //age: 38 years old
        byte age=38;

        // weight: 160 pounds

       // byte weight=160; // hata verdi çünkü 160; 128 den büyük byte en yüksek 128 alabilir
      //  byte weight2=-129; // yine hata verdi çünkü -128 den küçük bir değer verdik
        //short weight=160; /// 160 shotr un aralığı içinde
        // salary: 100000 dolar

        // short salary=100000; // 100000 değeri shortun kapsadığı alanın dışında 32767 den büyük olamaz
        int salary=100000; // int tam sayılar için genellikle terçih edilen veri tipi
        // int salary=100_000 yazabilirsin. kolay okunması için virgül yerine alt tire kullanabilirsin

        long asset=3_333_333_333l; // int dışında ise long olmalı. long veri tipine sayının sonuna küçük veya büyük L eklenmeli yoksa hata verir çünkü compiler her zaman int olarak görür

        //tax: 0,26

        double tax=0.26;
        float taxx=0.26F; // yine float kullanırken sonuna küçük veya büyük F harfi konulmalı

        // compiler efault olarak double kullanır

        */

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        //  byte weight = 160;  // 160 is out of byte' range
        //  byte num = -129; // -129 is out of byte' range
        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        // short salary = 100000; // 100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;


        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';

        System.out.println(yesNo);

        //  char ch5 = 'AB';

        boolean isEmployeed =  true;
        boolean isMarried = false;

        boolean result =  100 > 300 ;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);



        String name =  "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        // String name = "John";

        System.out.println("name = " + name);
        System.out.println("city = " + city);

        String first_name$ = "Muhtar";
        int num1 =100;
        int num2 = 200;

        //int private = 300;

        double salaryAfterTax = 2.5;
        //int salaryAfterTax = 3.5;



    }
}
