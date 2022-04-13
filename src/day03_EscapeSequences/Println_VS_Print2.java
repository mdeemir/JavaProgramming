package day03_EscapeSequences; // its package name of the class

public class Println_VS_Print2 {

    public static void main(String[] args) {
        System.out.println("Knock Knock"); // first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("-------------------");
        System.out.print("Knock Knock"); // first it prints knock, knock
        System.out.print("Who is this?");
        System.out.print("This is Java");
        System.out.println();
        System.out.println("-------------------");

        System.out.println("Hello everyone how are you today? Today we will learn Escape Sequences, and next week we will learn Variables");
        System.out.println("-------------------");

        System.out.print("Hello everyone how are you today? ");
        System.out.print("Today we will learn Escape Sequences ");
        System.out.print(", and next week we will learn Variables");

    }
}
