/*
Nested If:
We can put IF statement inside another If statement

add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

	when drinkItem is "tea":
		"tea is selected"
	when drinkItem is "coke":
		"coke is selected"
when selection is "snack"
"snack option is selected"

	when snackItem is "chips":
		"chips item is selected"
	when snackItem is "candy":
		"candy item is selected"
 */
package week04;

public class VendingNestedIF {
    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem = "coffee";
        String snackItem = "chips";

        // Notes on String equality: we will not use "==" sign for String equality, we will use equals() method


        if (selection == "drink"){
            System.out.println("drink option is selected");
            if(drinkItem == "tea"){
                System.out.println("Tea item selected");
            }else if(drinkItem == "coffee"){
                System.out.println("Coffee item selected");
            }

        }else if (selection == "snack"){
            System.out.println("Snack option is selected");
            if(snackItem == "chips"){
                System.out.println("Chips is selected");
            }else if(snackItem == "candy"){
                System.out.println("Candy is selected");
            }
        }else{
            System.err.println("INVALID ENTRY");
        }


        if(false)
            System.out.println("Hello");
        /*
        Sometimes we can skip using curly {} braces with if conditions
WHEN:
if you have only one statement in the IF block
ADVICE:
 ALWAYS use curly braces.
 burada false olduğu için hello yazdırmadı ama sadece bir satırı kabul etti çünkü parantez kullanmadık
 sonrasında kodu okumaya devam etti.
         */
        System.out.println("Running");
    }

}
