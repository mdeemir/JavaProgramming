package day11_Switch_Scanner;
import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); // in anlamı getting  veri alma input vs. .out olursa output

        System.out.println("Enter an integer:");

        int num1 = input.nextInt();

        System.out.println("Enter a decimal:");

        double num2 = input.nextDouble();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+ (num1*num2));

        input.close(); // closes the scanner, after this scanner can not be used anymore
        /*scannner ı kapatmak için bu method kullanılır. hata vermez kapatmazsan ama hafızada yer kaplar
bu methodu yazdıktan sonra scannero kullanmazsın

/*


/*
        System.out.println("Enter an integer:");
        int num3 = input.nextInt();
        System.out.println(num3);
 */

    }
}
