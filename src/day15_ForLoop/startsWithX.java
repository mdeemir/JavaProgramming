package day15_ForLoop;
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */
import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next(); //"xcodex"

        if(word.charAt(0) == 'x' ){
            word = word.replaceFirst("x", "a"); //"acodex"
        }

        System.out.println(word);




    }
}
