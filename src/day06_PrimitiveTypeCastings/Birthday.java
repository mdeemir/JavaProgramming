/*
* 1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
	*/
package day06_PrimitiveTypeCastings;

public class Birthday {
    public static void main(String[] args) {
        String name="John",
               birthMonth="April";
        int birthday=25,
            birthYear=1995;
        System.out.println(name+" was born on "+birthMonth+"/"+birthday+"/"+birthYear+".");

    }
}
