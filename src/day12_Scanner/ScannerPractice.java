package day12_Scanner;

import java.util.Scanner; // class tan sonra olmalı
//import java.util.*   bu wild import demek util in hepsini import eder. ama bu çok hafıza harcar program kasar
// bu yüzden neye ihtiyacın varsa onu import et
////import java.util.*;  //wild import: imports everything from the package

public class ScannerPractice {
    public static void main(String[] args) {

          /*
        new Scanner(System.in).nextInt();// değişken atamadan bu şekilde yapabilirsi n ama her kullnımda bunu yapman lazım
        hafızada yer kaplar
        new Scanner(System.in).nextInt();
        ...
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7:");

        int num =scan.nextInt();

        String result = "" ; // temp


        if(num >= 1 && num <= 7){ //num: 1~7

            result =(num==1)?"Monday"  :(num==2)?"Tuesday"  :(num==3)?"Wednesday"
                    :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)?"Saturday" : "Sunday";

        }else{
            result = "Invalid Number";
        }


        System.out.println(result);

        scan.close();



    }

}
