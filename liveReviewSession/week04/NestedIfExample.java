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

public class NestedIfExample {
    public static void main(String[] args) {

        boolean isRushHour = false;
        int carType = 2; // 1, 2, 3 ... 6: motorcyles
        double price = 0.0;

        if(carType == 1){
            if(isRushHour){
                price = 30.0;
            }else{
                price = 5.0;
            }
        }else if(carType == 2){
            if (isRushHour){
                price = 55.30;
            }else{
                price = 15.99;
            }
        }
        System.out.println("price = " + price);
                

    }
}

