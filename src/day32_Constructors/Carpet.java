package day32_Constructors;
/*
1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)
				Add a constructor to set all the instances
                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitprice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */
public class Carpet {
    public double width, length, unitPrice;/// public projede ulaşılabilir demek.
    // public yazınca projede diğer package lar içindekilere ulşabiliryorsun . yazmazsan ulaşamazsın
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        //constructor class ismi ile aynı olmalı Carpet yazmalısın yazmazsan complier hata verir
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calcCost(){//static değil cünkü her object te değisecek
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice += 200;
        }

        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }

}
