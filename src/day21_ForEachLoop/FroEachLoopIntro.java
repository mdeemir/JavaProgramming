package day21_ForEachLoop;

public class FroEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};
        //                0  1  2  3  4  5  6

        for (int i = 0; i < numbers.length; i++) { // i: indexes of the array
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("---------------------------------");

        for(int each  : numbers ){ // each: elements of the array
            System.out.println(each);
        }
        //<<< : >>>>  bunu unutma

        // dizlerde for kullanırken each kullanmak daha kolay. each yani herbirini tek tek döngüye sokuyor
        // başlama noktası bitiş noktası vs. yazmana gerek yok for loop un normal yapısında olduğu gibi




    }

}
