package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names
        //[] bu parantez veri tipinden önce yazılmaz [] String myGroup olmaz
        String[] myGroup = new String[5]; // 0 ~ 4   (array ler non-primitives veri tipini de destekler)
       //String[] myGroup = new String[5]; burada 5 i yazmazsan complier error verir çünkü boyutunu belirtmen lazım
        //String[] myGroup = new int [5]; olmaz çünkü  String tip ile int değişken olmaz aynı olmalı
        // bu şekildde array oluşturma dizdeki eleman sayısı bilinir ama elemanlar biinmez is sonradan atamak için kullanılır
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Mikael";
        myGroup[4] = "Hulya";
        // myGroup[3] mikael, myGroup[3] Hulya yazarsan sonraki yazdığın geçerli olur
        // myGroup[5] yazarsan hata verir oyutu aşar idex numarası boyuttan bir eksik olmalı en yüksek

        // myGroup[5] = "Muhtar";
        //   myGroup[-1] = "Adam"; sıfırdan küçük olamaz index numarası

        // System.out.println(myGroup); //hashcode yanlış olur bu şekilde.
        //Arrays sınıfı yüklenmeli. import java.util.Arrays; Arrays.toString(myGroup yazınca otomatik yükler
        // yazdırdığında null yazıyorsa default değişkeni gösterir
        /*
        default values:
	non-primiitives: null
	primitives:
		byte, short, int, long ===> 0
		float, double ===> 0.0
		boolean ==> false
         */
        System.out.println(Arrays.toString(myGroup)); //["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("-----------------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index:            0          1           2           3          4          5           6
// dizide kaç tane eleman ve elemanların ne olduğunu biliyorsan bu şekilde array oluşturman daha kolay
        //   days[7] = "JavaDay";

        System.out.println( Arrays.toString(days) );

        int number = 1;

        if(number <1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println( days[number-1] );


    }

}
