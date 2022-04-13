package day15_ForLoop;
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "JOSH",
                lastName = "smITH";


        // firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        //C                        +       ydeo  ==>   "Cydeo"
        /*burada firstName.charAt(0).toUpperCase medodunu kullanmazsın çünkü charAt()
        metodunun döndürdüğü değer char. string metodu kullanabilmek için string değer olmalı
*/
        firstName =   (""+ firstName.charAt(0) ) .toUpperCase()  + firstName.substring(1).toLowerCase();
        //      "C"                                       +      "ydeo" ==> Cydeo
        /*
        burada charAt() metodunundan elde ettiğimiz char karakterini stirnge çevirmek için () kullnaıp içine
        ( "" + charAt(0) ) yazdığımız zaman artık bu string oldu ve string metodları kullanbiliriz.
        aksi halde stringe cevirmeden string methodlarını kullanmayız
         */

        lastName = lastName.substring(0,1).toUpperCase() +  lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName+" "+lastName;

        System.out.println("fullName = " + fullName);

    }

}
