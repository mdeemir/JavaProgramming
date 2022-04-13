/*
Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph space(tab)
    \\: single back slash
    \": double quote

 */

package day03_EscapeSequences;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java  \nPython \nC#");

        System.out.println("---------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("----------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("-------------------------------");

        System.out.println("/\\\\\\\\"); // in order to print pne backward slash we need to give two backward slahshes

        System.out.println("--------------------------------");

        System.out.println("My favorite TV show is \"Game of Throne\""); // in order to print double quote

    }
}
