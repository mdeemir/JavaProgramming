package day43_Abstraction;

import java.util.Scanner;

public class Throw_vs_Throws {

    public static void main(String[] args) {

        System.out.println("Enter your score:");
        int score = new Scanner(System.in).nextInt();

        //bu koşul true oldukça ikinci adıma geçmeyecek A,B,C vs.  çünkü exit metodu otomatik olarak çağırır status code 1 (bir hata olduğunu bildirir)
        if(score < 0 || score > 100){
            throw new RuntimeException("Invalid score: "+score); // exit(1)
            //throws anahtar kelimesini sadece metod syntax ında kullanıyoruz
        }


        if(score >= 90){
            System.out.println("A");
        }else if(score >= 80){
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("C");
        }else if(score >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

       // method1(); ---> throws ile oluşturduğumuz için yine metod cagrıldıgında hata veriyor

    }

// thorows sadece checked exceptionlar için kullanılır. geçici çözüüm. unexceptionlar için kullanılamaz
    public static void method1() throws InterruptedException {
        Thread.sleep(5000);
    }




}
