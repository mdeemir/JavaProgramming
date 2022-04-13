/*
add new class AdaireApartments
 main method

 #### WELCOME TO ADAIRE APARTMENTS ####

 numberOfBedrooms = 0, 1, 2

 startingPrice = 0;

 when numberOfBedrooms 0:
 print: "Studio apartment selected"
 startingPrice -> 1454

 when numberOfBedrooms 1:
 print: "One bedroom apartment selected"
 startingPrice -> 1725

 when numberOfBedrooms 2:
 print: "Two bedroom apartment selected"
 startingPrice -> 2899

 default:
 print "5 bedroom currently unavailable"

 ------
 "Starting price $1454"
 */
package week04;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        byte numbersOfBedrooms=0;
        int startingPrice=0;

        switch (numbersOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice=1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice=1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice=2899;
                break;
            default:
                System.out.println(numbersOfBedrooms+ " bedroom currently unavailable");


        }

        System.out.println("startingPrice = " + startingPrice);

    }
}
